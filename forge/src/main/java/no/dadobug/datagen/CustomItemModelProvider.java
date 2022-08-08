package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class CustomItemModelProvider extends ModelProvider<CustomItemModelBuilder>{

    public CustomItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, "item", CustomItemModelBuilder::new, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Item Models: " + this.modid;
    }

}
