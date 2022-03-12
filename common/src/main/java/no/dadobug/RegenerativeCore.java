package no.dadobug;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import no.dadobug.blocks.BedrockStates;

import java.util.List;


public class RegenerativeCore extends Item {
    private final Block coreblock;
    private final BedrockStates.CoreType coreType;
    public RegenerativeCore(Settings settings, Block coreblock, BedrockStates.CoreType coreType) {
        super(settings);
        this.coreblock = coreblock;
        this.coreType = coreType;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState state = world.getBlockState(blockPos);
        if(state.isIn(EntryModule.HOLLOW_TAG)){
            if(coreblock.getDefaultState().contains(BedrockStates.REPLACE_WITH_BEDROCK) && state.contains(BedrockStates.REPLACE_WITH_BEDROCK)) {
                world.setBlockState(blockPos, coreblock.getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, state.get(BedrockStates.REPLACE_WITH_BEDROCK)));
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


        if(this.coreType == BedrockStates.CoreType.FRACTURED)tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_broken.tooltip").formatted(Formatting.RED) );
        else if(this.coreType == BedrockStates.CoreType.FLUID)tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_fluid.tooltip").formatted(Formatting.GREEN) );
        else if(this.coreType == BedrockStates.CoreType.JOKE_FLUID_ONE)tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_joke_fluid_one.tooltip").formatted(Formatting.GOLD) );
        else if(this.coreType == BedrockStates.CoreType.JOKE_ITEM_ONE)tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_joke_item_one.tooltip").formatted(Formatting.GOLD) );
        else tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_power.tooltip").formatted(Formatting.GREEN) );

        tooltip.add( new TranslatableText("item.dadobugbedrockores.regen_need_host.tooltip").formatted(Formatting.LIGHT_PURPLE) );

        // formatted red text

    }

    public Block getCoreBlock(){
        return this.coreblock;
    }
}
