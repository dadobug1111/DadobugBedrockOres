package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import no.dadobug.EntryModule;

/*
 * Main dataGen class that subscribes to the gatherData event and 
 * adds all the providers to the data generator
 */
@Mod.EventBusSubscriber(modid = "dadobugbedrockores", bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeClient()) {
            EntryModule.LOGGER.info("Started client data generation");
            generator.addProvider(new BlockStateGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new ItemModelsGen(generator, event.getExistingFileHelper()));
            generator.addProvider(new LanguageGen(generator, "en_us"));
        }
        if (event.includeServer()) {
            EntryModule.LOGGER.info("Started server data generation");
            generator.addProvider(new LootTableGen(generator));
            BlockTagsGen blockTagsGen = new BlockTagsGen(generator, event.getExistingFileHelper());
            generator.addProvider(blockTagsGen);
            generator.addProvider(new ItemTagsGen(generator, blockTagsGen, event.getExistingFileHelper()));
        }
        
    }
}
