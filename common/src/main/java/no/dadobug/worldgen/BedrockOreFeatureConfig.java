package no.dadobug.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class BedrockOreFeatureConfig implements FeatureConfig {
    public static final Codec<BedrockOreFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(Codec.list(BedrockOreFeatureConfig.Target.CODEC).fieldOf("targets").forGetter((config) -> {
            return config.targets;
        }), Codec.intRange(0, 64).fieldOf("max_size").forGetter((config) -> {
            return config.maxSize;
        }), Codec.intRange(0, 64).fieldOf("min_size").forGetter((config) -> {
            return config.minSize;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter((config) -> {
            return config.discardOnAirChance;
        }), Codec.BOOL.fieldOf("is_bottom_of_world").forGetter((config) -> {
            return config.isBottomOfWorld;
        }), Codec.BYTE.fieldOf("max_distance_from_origin").forGetter((config) -> {
            return config.maxDistanceFromOrigin;
        }), Codec.BYTE.fieldOf("propagator_count").forGetter((config) -> {
            return config.propagatorCount;
        })).apply(instance, BedrockOreFeatureConfig::new);
    });
    public final List<BedrockOreFeatureConfig.Target> targets;
    public final int maxSize;
    public final int minSize;
    public final float discardOnAirChance;
    public final boolean isBottomOfWorld;
    public final byte maxDistanceFromOrigin;
    public final byte propagatorCount;

    public BedrockOreFeatureConfig(List<BedrockOreFeatureConfig.Target> targets, int maxSize, int minSize, float discardOnAirChance, boolean isBottomOfWorld, byte maxDistanceFromOrigin, byte propagatorCount) {
        this.maxSize = maxSize;
        this.minSize = minSize;
        this.targets = targets;
        this.discardOnAirChance = discardOnAirChance;
        this.isBottomOfWorld = isBottomOfWorld;
        this.maxDistanceFromOrigin = maxDistanceFromOrigin;
        this.propagatorCount = propagatorCount;
    }

    public BedrockOreFeatureConfig(List<BedrockOreFeatureConfig.Target> targets, int maxSize, int minSize, boolean isBottomOfWorld, byte maxDistanceFromOrigin, byte propagatorCount) {
        this(targets, maxSize, minSize, 0.0F, isBottomOfWorld, maxDistanceFromOrigin, propagatorCount);
    }

    public BedrockOreFeatureConfig(RuleTest test, BlockState state, int maxSize, int minSize, float discardOnAirChance, boolean isBottomOfWorld, byte maxDistanceFromOrigin, byte propagatorCount) {
        this(ImmutableList.of(new BedrockOreFeatureConfig.Target(test, state)), maxSize, minSize, discardOnAirChance, isBottomOfWorld, maxDistanceFromOrigin, propagatorCount);
    }

    public BedrockOreFeatureConfig(RuleTest test, BlockState state, int maxSize, int minSize, boolean isBottomOfWorld, byte maxDistanceFromOrigin, byte propagatorCount) {
        this(ImmutableList.of(new BedrockOreFeatureConfig.Target(test, state)), maxSize, minSize, 0.0F, isBottomOfWorld, maxDistanceFromOrigin, propagatorCount);
    }

    public BedrockOreFeatureConfig(RuleTest test, BlockState state, int maxSize, int minSize, boolean isBottomOfWorld, byte propagatorCount) {
        this(ImmutableList.of(new BedrockOreFeatureConfig.Target(test, state)), maxSize, minSize, 0.0F, isBottomOfWorld, (byte)3, propagatorCount);
    }

    public BedrockOreFeatureConfig(RuleTest test, BlockState state, int maxSize, int minSize, boolean isBottomOfWorld) {
        this(ImmutableList.of(new BedrockOreFeatureConfig.Target(test, state)), maxSize, minSize, 0.0F, isBottomOfWorld, (byte)3, (byte)5);
    }


    public static BedrockOreFeatureConfig.Target createTarget(RuleTest test, BlockState state) {
        return new BedrockOreFeatureConfig.Target(test, state);
    }

    public static class Target {
        public static final Codec<BedrockOreFeatureConfig.Target> CODEC = RecordCodecBuilder.create((instance) -> {
            return instance.group(RuleTest.TYPE_CODEC.fieldOf("target").forGetter((target) -> {
                return target.target;
            }), BlockState.CODEC.fieldOf("state").forGetter((target) -> {
                return target.state;
            })).apply(instance, BedrockOreFeatureConfig.Target::new);
        });
        public final RuleTest target;
        public final BlockState state;

        Target(RuleTest target, BlockState state) {
            this.target = target;
            this.state = state;
        }
    }
}
