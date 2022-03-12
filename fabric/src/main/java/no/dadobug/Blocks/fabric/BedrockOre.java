package no.dadobug.Blocks.fabric;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TransparentBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import no.dadobug.blocks.BedrockStates;

public class BedrockOre extends TransparentBlock {
    public BedrockOre(Settings settings, Boolean ReplaceWithBedrock) {

        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, ReplaceWithBedrock));
    }

    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        if(!player.canHarvest(state))return 0.0f;
        return super.calcBlockBreakingDelta(state, player, world, pos);
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(BedrockStates.REPLACE_WITH_BEDROCK);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.BLOCK;
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (!world.isClient) {
            world.setBlockState(pos, super.asBlock().getDefaultState());
        }
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

}
