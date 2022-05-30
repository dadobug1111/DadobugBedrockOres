package no.dadobug.blocks.forge;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import no.dadobug.EntryModule;
import no.dadobug.blocks.BedrockStates;

public class BedrockOre extends RegenerativeBlock {
    public BedrockOre(Settings settings, Boolean ReplaceWithBedrock) {

        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, ReplaceWithBedrock));
    }


    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        if(!player.canHarvest(state))return 0.0f;
        if(state.isIn(EntryModule.INDESTRUCTABLE_TAG))return 0.0f;
        if(state.isIn(EntryModule.ENCHANT_ONLY_TAG) && !(EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player)>0 || EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player)>0))return 0.0f;
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
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

}
