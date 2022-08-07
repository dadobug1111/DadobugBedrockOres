package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import no.dadobug.EntryModule;

public class LanguageGen extends LanguageProvider{

    public LanguageGen(DataGenerator gen, String locale) {
        super(gen, EntryModule.modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get(), "Bedrock Cloggrum Ore");
        add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get(), "Bedrock Froststeel Ore");
        add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get(), "Bedrock Utherium Ore");
        
        add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core().get(), "Regenerative Cloggrum Cluster");
        add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core().get(), "Regenerative Froststeel Cluster");
        add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core().get(), "Regenerative Utherium Cluster");
    }
    
}
