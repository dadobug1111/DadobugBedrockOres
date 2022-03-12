package no.dadobug.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import no.dadobug.EntryModule;

import java.util.Optional;


@Mod("dadobugbedrockores")
public class dadobugbedrockoresForge {
    public dadobugbedrockoresForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus("dadobugbedrockores", FMLJavaModLoadingContext.get().getModEventBus());
        EntryModule.init();
        IEventBus bus = EventBuses.getModEventBus("dadobugbedrockores").get();
        bus.addListener(this::registerLate);


    }


    private void registerLate(FMLCommonSetupEvent event) {
        EntryModule.initLate();
    }
}
