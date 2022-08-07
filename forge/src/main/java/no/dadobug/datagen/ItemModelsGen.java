package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

public class ItemModelsGen extends ItemModelProvider{

    public ItemModelsGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EntryModule.modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        String itemName = EntryModule.BEDROCK_UG_CLOGGRUM_ORE.oreItem().getId().getPath();
        withExistingParent(itemName, modLoc("block/" + itemName));
        itemName = EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.oreItem().getId().getPath();
        withExistingParent(itemName, modLoc("block/" + itemName));
        itemName = EntryModule.BEDROCK_UG_UTHERIUM_ORE.oreItem().getId().getPath();
        withExistingParent(itemName, modLoc("block/" + itemName));

        // Can't create the regen core's models due to not having the item texture during generation
        // TODO: Find a way around this, it's only a JSON file; there must be a way

        // itemName = EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core().getId().getPath();
        // withExistingParent(itemName, "item/generated")
        //     .texture("layer0", "undergarden:item/raw_cloggrum");
        // itemName = EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core().getId().getPath();
        // withExistingParent(itemName, "item/generated")
        //     .texture("layer0", "undergarden:item/raw_froststeel");
        // itemName = EntryModule.BEDROCK_UG_UTHERIUM_ORE.core().getId().getPath();
        // withExistingParent(itemName, "item/generated")
        //     .texture("layer0", "undergarden:item/utherium_crystal");
    }
    
}
