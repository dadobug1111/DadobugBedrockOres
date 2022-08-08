package no.dadobug.datagen;

import net.minecraft.util.Identifier;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.google.common.base.Preconditions;

public class CustomItemModelBuilder extends ModelBuilder<CustomItemModelBuilder>{

    public CustomItemModelBuilder(Identifier outputLocation, ExistingFileHelper existingFileHelper) {
        super(outputLocation, existingFileHelper);
    }

    private CustomItemModelBuilder self() {
        return (CustomItemModelBuilder)this;
    }

    public CustomItemModelBuilder uncheckedTexture(String key, String texture) {
        Preconditions.checkNotNull(key, "Key must not be null");
        Preconditions.checkNotNull(texture, "Texture must not be null");
        this.textures.put(key, texture);
        return this.self();
    }
}
