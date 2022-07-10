package no.dadobug.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import no.dadobug.EntryModule;


@Mod("dadobugbedrockores")
public class dadobugbedrockoresForge {
    public dadobugbedrockoresForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus("dadobugbedrockores", FMLJavaModLoadingContext.get().getModEventBus());
        EntryModule.init();
        IEventBus bus = EventBuses.getModEventBus("dadobugbedrockores").get();
        bus.addListener(this::registerLateClient);
        bus.addListener(this::registerLateServer);


    }


    private void registerLateClient(FMLClientSetupEvent event) {
        EntryModule.initLate(true);
    }
    private void registerLateServer(FMLDedicatedServerSetupEvent event) {
        EntryModule.initLate(false);
    }
}
