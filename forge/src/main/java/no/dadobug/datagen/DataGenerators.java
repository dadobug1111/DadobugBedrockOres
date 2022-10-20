package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
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
            generator.addProvider(true, new BlockStateGen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new ItemModelsGen(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new LanguageGen(generator, "en_us"));
        }
        if (event.includeServer()) {
            EntryModule.LOGGER.info("Started server data generation");
            generator.addProvider(true, new LootTableGen(generator));
            BlockTagsGen blockTagsGen = new BlockTagsGen(generator, event.getExistingFileHelper());
            generator.addProvider(true, blockTagsGen);
            generator.addProvider(true, new ItemTagsGen(generator, blockTagsGen, event.getExistingFileHelper()));
        }
        
    }
}
