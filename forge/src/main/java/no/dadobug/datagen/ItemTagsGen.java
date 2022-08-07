package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.data.server.ItemTagProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

public class ItemTagsGen extends ItemTagProvider{

    public ItemTagsGen(DataGenerator gen, BlockTagProvider blockTag, ExistingFileHelper existingFileHelper) {
        super(gen, blockTag, EntryModule.modid, existingFileHelper);
    }

    @Override
    protected void configure() {
        this.getOrCreateTagBuilder(EntryModule.IS_CORE_TAG)
            .add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core().get())
            .add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core().get())
            .add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core().get());
    }

    @Override
    public String getName() {
        return "Dadobugbedrockores Item Tags";
    }
    
}
