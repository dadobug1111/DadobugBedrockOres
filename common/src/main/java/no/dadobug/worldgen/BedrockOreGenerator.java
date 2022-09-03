package no.dadobug.worldgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.mojang.serialization.Codec;
import net.minecraft.block.*;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class BedrockOreGenerator extends Feature<BedrockOreFeatureConfig> {

    public BedrockOreGenerator(Codec<BedrockOreFeatureConfig> config) {

        super(config);
    }

    @Override
    public boolean generate(FeatureContext<BedrockOreFeatureConfig> context) {
        BlockPos origin = context.getOrigin();
        BedrockOreFeatureConfig config = context.getConfig();
        byte maxDistanceFromOrigin = config.maxDistanceFromOrigin;
        BlockPos.Mutable mutable = new BlockPos.Mutable(origin.getX() - maxDistanceFromOrigin, origin.getY(), origin.getZ() - maxDistanceFromOrigin);
        boolean isBottomOfWorld = config.isBottomOfWorld;
        StructureWorldAccess world = context.getWorld();
        Random random = context.getRandom();
        List<BedrockOreFeatureConfig.Target> targets = config.targets;

        int x = origin.getX();
        int y = origin.getY();
        int z = origin.getZ();
        ArrayList<BlockPos>[] foundBlocks = new ArrayList[]{new ArrayList<BlockPos>(), new ArrayList<BlockPos>(), new ArrayList<BlockPos>(), new ArrayList<BlockPos>(), new ArrayList<BlockPos>()};

        //find the bedrock
        for(byte yIndex = 0; yIndex < 5; yIndex++) {
            for(int xIndex = 0; xIndex < 1 + (maxDistanceFromOrigin*2); xIndex++) {
                for(int zIndex = 0; zIndex < 1 + (maxDistanceFromOrigin*2); zIndex++) {
                    mutable.set(x - 1 - maxDistanceFromOrigin + xIndex, isBottomOfWorld?y + 5 - yIndex:y - 5 + yIndex, z - 1 - maxDistanceFromOrigin + zIndex);
                    if(targets.stream().anyMatch((rule) -> rule.target.test(world.getBlockState(mutable), random))){
                        foundBlocks[yIndex].add(mutable.toImmutable());
                    }
                }
            }
        }

        //choose new origin - terminate if none
        ArrayList<BlockPos> newOriginCandidates = new ArrayList<>();
        byte successfulLayers = 0;
        for(byte yIndex = 0; yIndex < 5 && successfulLayers < 3; yIndex++) {
            ArrayList<BlockPos> currentList = foundBlocks[yIndex];
            if(!currentList.isEmpty()){
                for(byte i = 0; i < 3 - successfulLayers; i++) {
                    newOriginCandidates.addAll(currentList);
                }
                successfulLayers++;
            }
        }
        if(successfulLayers == 0)return false;
        BlockPos newOrigin = newOriginCandidates.get(random.nextInt(newOriginCandidates.size() - 1));
        ArrayList<Pair<RuleTest, BlockState>> targetsArrayList = new ArrayList<>();
        if(targets.stream().noneMatch((target) -> {
            targetsArrayList.add(new Pair<>(target.target, target.state));
            if (target.target.test(world.getBlockState(newOrigin), random)) {
                world.setBlockState(newOrigin, target.state, 3);
                return true;
            }
            return false;
        })){
            return false;
        }


        //propagate through all remaining ores
        Propagator[] propagators = new Propagator[config.propagatorCount];
        boolean[] propsDead = new boolean[config.propagatorCount];
        int size = random.nextInt(config.minSize, config.maxSize) - 1;
        byte propagatorsRemaining = config.propagatorCount;
        for(byte i = 0; i < config.propagatorCount; i++){
            propagators[i] = new Propagator(newOrigin);
            propsDead[i] = false;
        }
        for(byte i = 0; i < size && propagatorsRemaining > 0;) {
            for(byte j = 0;j < propagators.length && i < size; j++){
                Propagator p = propagators[j];
                if(!propsDead[j]) {
                    if (p.propagate((ChunkRegion) world, random, targetsArrayList)) {
                        size--;
                    } else {
                        propsDead[j] = true;
                        propagatorsRemaining--;
                    }
                }
            }
        }

        return true;
    }

}

