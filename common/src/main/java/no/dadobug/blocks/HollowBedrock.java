package no.dadobug.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import no.dadobug.EntryModule;
import org.jetbrains.annotations.Nullable;

public class HollowBedrock extends RegenerativeBlock{
    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, infinite, silk_able, replaceBlock);
    }

    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, experienceDropped, infinite, silk_able, replaceBlock);
    }

    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, int DurabilityMin, int DurabilityMax, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, XPmin, XPmax, DurabilityMin, DurabilityMax, infinite, silk_able, replaceBlock);
    }

    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, int XPmin, int XPmax, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, XPmin, XPmax, durabilityProvider, infinite, silk_able, replaceBlock);
    }

    public HollowBedrock(Settings settings, boolean ReplaceWithBlock, UniformIntProvider experienceDropped, IntProvider durabilityProvider, boolean infinite, boolean silk_able, BlockState replaceBlock) {
        super(settings, ReplaceWithBlock, experienceDropped, durabilityProvider, infinite, silk_able, replaceBlock);
    }


    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        if(context.getStack().isIn(EntryModule.IS_CORE_TAG))return true;
        return super.canReplace(state, context);
    }


}
