package no.dadobug.fabric;


import net.fabricmc.api.ModInitializer;
import no.dadobug.EntryModule;

public class dadobugbedrockoresFabric implements ModInitializer{
    @Override
    public void onInitialize() {
        EntryModule.init();
        EntryModule.initLate();
    }



}
