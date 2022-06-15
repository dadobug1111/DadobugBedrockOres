package no.dadobug.Blocks.fabric;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicBoolean;

public class XPLeak extends BedrockOre{
    public XPLeak(Settings settings, Boolean ReplaceWithBedrock) {
        super(settings, ReplaceWithBedrock);
    }

    public XPLeak(Settings settings, Boolean ReplaceWithBedrock, int XPmin, int XPmax) {
        super(settings, ReplaceWithBedrock, XPmin, XPmax);
    }

    public XPLeak(Settings settings, Boolean ReplaceWithBedrock, UniformIntProvider experienceDropped) {
        super(settings, ReplaceWithBedrock, experienceDropped);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        AtomicBoolean used = new AtomicBoolean(false);
        player.getItemsHand().forEach((stack) -> {
            if(stack.getItem() instanceof GlassBottleItem && !used.get()) {
                stack.decrement(1);
                used.set(true);
                player.getInventory().insertStack(Items.EXPERIENCE_BOTTLE.getDefaultStack());
            }
        });
        if(used.get())return ActionResult.SUCCESS;
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
