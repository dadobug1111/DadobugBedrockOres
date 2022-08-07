package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

public class BlockStateGen extends BlockStateProvider{

    public BlockStateGen(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, EntryModule.modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get());
    }
    
}
