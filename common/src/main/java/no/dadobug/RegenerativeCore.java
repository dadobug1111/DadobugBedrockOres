package no.dadobug;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import no.dadobug.blocks.OresBlockStates;

import java.util.List;


public class RegenerativeCore extends Item {
    private final MutableText toolTip;
    private final Block coreblock;
    public RegenerativeCore(Settings settings, Block coreblock, MutableText toolTip) {
        super(settings);
        this.coreblock = coreblock;
        this.toolTip = toolTip;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState state = world.getBlockState(blockPos);
        if(state.isIn(EntryModule.HOLLOW_TAG)){
            if(coreblock.getDefaultState().contains(OresBlockStates.REPLACE_WITH_BEDROCK) && state.contains(OresBlockStates.REPLACE_WITH_BEDROCK)) {
                world.setBlockState(blockPos, coreblock.getDefaultState().with(OresBlockStates.REPLACE_WITH_BEDROCK, state.get(OresBlockStates.REPLACE_WITH_BEDROCK)));
            } else {
                world.setBlockState(blockPos, coreblock.getDefaultState());
            }
            context.getPlayer().playSound(SoundEvents.BLOCK_END_PORTAL_FRAME_FILL, 1.0F, 1.0F);
            context.getStack().decrement(1);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {


        tooltip.add(this.toolTip);
        tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_need_host.tooltip").formatted(Formatting.LIGHT_PURPLE) );



    }

    public Block getCoreBlock(){
        return this.coreblock;
    }
}
