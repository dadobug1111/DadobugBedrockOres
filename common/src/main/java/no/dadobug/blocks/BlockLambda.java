package no.dadobug.blocks;

import net.minecraft.block.AbstractBlock;
import no.dadobug.configs.BlockConfig;
import no.dadobug.configs.BlockConfigLambda;

public interface BlockLambda<T> {

    T get(BlockConfig cfg, BlockConfigLambda<AbstractBlock.Settings> blockSettings, boolean replaceWithBedrock);
}
