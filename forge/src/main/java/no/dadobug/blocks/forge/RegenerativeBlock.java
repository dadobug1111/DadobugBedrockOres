package no.dadobug.blocks.forge;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TransparentBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import no.dadobug.EntryModule;
import no.dadobug.blocks.BedrockStates;

public class RegenerativeBlock extends TransparentBlock {
    public RegenerativeBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockExploded(BlockState state, World world, BlockPos pos, Explosion explosion)
    {
        this.onDestroyedByExplosion(world, pos, explosion);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid)
    {
        this.onBreak(world, pos, state, player);
        if(!player.isCreative()) {
            if (state.isIn(EntryModule.REGEN_TAG) && !(EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player) > 0) && (!(EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player) > 0) || !state.isIn(EntryModule.FRACTURE_TAG)) && (!(EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player) > 0) || !state.isIn(EntryModule.CORE_TAG))) {
                return true;
            } else if (state.isIn(EntryModule.FRACTURE_TAG) && (EnchantmentHelper.getEquipmentLevel(EntryModule.CURSE_OF_FRACTURING.get(), player) > 0)) {
                if (state.contains(BedrockStates.REPLACE_WITH_BEDROCK))
                    return world.setBlockState(pos, EntryModule.BEDROCK_FRACTURED.ore().get().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, state.get(BedrockStates.REPLACE_WITH_BEDROCK)), world.isClient ? 11 : 3);
                else
                    return world.setBlockState(pos, EntryModule.BEDROCK_FRACTURED.ore().get().getDefaultState(), world.isClient ? 11 : 3);
            } else if (state.isIn(EntryModule.CORE_TAG) && (EnchantmentHelper.getEquipmentLevel(EntryModule.EXTRACTION.get(), player) > 0)) {
                if (state.contains(BedrockStates.REPLACE_WITH_BEDROCK))
                    return world.setBlockState(pos, EntryModule.BEDROCK_HOLLOW.get().getDefaultState().with(BedrockStates.REPLACE_WITH_BEDROCK, state.get(BedrockStates.REPLACE_WITH_BEDROCK)), world.isClient ? 11 : 3);
                else
                    return world.setBlockState(pos, EntryModule.BEDROCK_HOLLOW.get().getDefaultState(), world.isClient ? 11 : 3);
            } else if (state.contains(BedrockStates.REPLACE_WITH_BEDROCK) && (EnchantmentHelper.getEquipmentLevel(EntryModule.SHATTERING.get(), player) > 0)) {
                if (state.get(BedrockStates.REPLACE_WITH_BEDROCK))
                    return world.setBlockState(pos, Blocks.BEDROCK.getDefaultState(), world.isClient ? 11 : 3);
            }
        }
        return world.setBlockState(pos, fluid.getBlockState(), world.isClient ? 11 : 3);
    }
}
