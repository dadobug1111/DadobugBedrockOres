package no.dadobug.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import no.dadobug.EntryModule;
import no.dadobug.ModLoadedLootCondition;


@Mod("dadobugbedrockores")
public class dadobugbedrockoresForge {
    public dadobugbedrockoresForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus("dadobugbedrockores", FMLJavaModLoadingContext.get().getModEventBus());
        EntryModule.init();
        IEventBus bus = EventBuses.getModEventBus("dadobugbedrockores").get();
        bus.addListener(this::registerData);
        bus.addListener(this::registerLateClient);
        bus.addListener(this::registerLateServer);


    }


    private void registerData(GatherDataEvent event) {
        EntryModule.MOD_LOOT_CONDITION_TYPE = Registry.register(Registry.LOOT_CONDITION_TYPE, new Identifier(EntryModule.modid, "modloaded"), new LootConditionType(new ModLoadedLootCondition.Serializer()));
    }
    private void registerLateClient(FMLClientSetupEvent event) {
        EntryModule.initLate(true);
    }
    private void registerLateServer(FMLDedicatedServerSetupEvent event) {
        EntryModule.initLate(false);
    }
}
