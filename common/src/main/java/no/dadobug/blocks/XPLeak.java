package no.dadobug.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicBoolean;

public class XPLeak extends RegenerativeBlock{


    public XPLeak(Settings settings, boolean ReplaceWithBlock, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, infinite, silk_able, replaceBlock);
    }

    public XPLeak(Settings settings, boolean ReplaceWithBlock, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public XPLeak(Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, experienceDropped, infinite, silk_able, replaceBlock);
    }

    public XPLeak(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, int DurabilityMin, int DurabilityMax, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, XPmin, XPmax, DurabilityMin, DurabilityMax, infinite, silk_able, replaceBlock);
    }

    public XPLeak(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, XPmin, XPmax, durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public XPLeak(Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, experienceDropped, durabilityProvider, infinite, silk_able, replaceBlock);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        AtomicBoolean used = new AtomicBoolean(false);
        player.getHandItems().forEach((stack) -> {
            if(stack.getItem() instanceof GlassBottleItem && !used.get()) {
                if(!player.isCreative())stack.decrement(1);
                used.set(true);
                player.getInventory().insertStack(Items.EXPERIENCE_BOTTLE.getDefaultStack());
            }
        });
        if(used.get()){
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof RegenerativeBlockEntity entity && !world.isClient()) {
                entity.damageBlock(state, false);
                if(entity.getDurability() < 1){
                    world.setBlockState(pos, Blocks.AIR.getDefaultState());
                }
            }
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
