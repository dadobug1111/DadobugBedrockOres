package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.tag.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

public class BlockTagsGen extends BlockTagProvider {

    public BlockTagsGen(DataGenerator arg, ExistingFileHelper existingFileHelper) {
        super(arg, EntryModule.modid, existingFileHelper);
    }

    @Override
    protected void configure() {
        // TODO: Check that this actually works
        this.getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
            .addTag(BlockTags.PICKAXE_MINEABLE)
            .addTag(EntryModule.CORE_TAG)
            .addTag(EntryModule.FRACTURE_TAG)
            .addTag(EntryModule.REGEN_TAG)
            .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
            .add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get())
            .add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get());
    }

    @Override
    public String getName() {
        return "Dadobugbedrockores Block Tags";
    }
}
