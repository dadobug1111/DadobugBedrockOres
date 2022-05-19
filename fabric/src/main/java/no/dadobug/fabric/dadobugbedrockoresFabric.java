package no.dadobug.fabric;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import no.dadobug.EntryModule;

public class dadobugbedrockoresFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    @Override
    public void onInitializeClient() {
        EntryModule.init();
        EntryModule.initLate(true);
    }

    @Override
    public void onInitializeServer() {
        EntryModule.init();
        EntryModule.initLate(false);
    }

    @Override
    public void onInitialize() {

    }
}
