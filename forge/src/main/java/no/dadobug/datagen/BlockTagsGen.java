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

            // Vanilla
            .add(EntryModule.BEDROCK_FRACTURED.ore().get())
            .add(EntryModule.BEDROCK_HOLLOW.get())
            .add(EntryModule.XP_LEAK.ore().get())
            .add(EntryModule.BEDROCK_COAL_ORE.ore().get())
            .add(EntryModule.BEDROCK_IRON_ORE.ore().get())
            .add(EntryModule.BEDROCK_GOLD_ORE.ore().get())
            .add(EntryModule.BEDROCK_DIAMOND_ORE.ore().get())
            .add(EntryModule.BEDROCK_REDSTONE_ORE.ore().get())
            .add(EntryModule.BEDROCK_COPPER_ORE.ore().get())
            .add(EntryModule.BEDROCK_LAPIS_ORE.ore().get())
            .add(EntryModule.BEDROCK_EMERALD_ORE.ore().get())
            .add(EntryModule.BEDROCK_WATER_ORE.ore().get())
            .add(EntryModule.BEDROCK_LAVA_ORE.ore().get())
            .add(EntryModule.BEDROCK_NETHER_GOLD.ore().get())
            .add(EntryModule.BEDROCK_NETHER_QUARTZ.ore().get())
            .add(EntryModule.BEDROCK_ANCIENT_DEBRIS.ore().get())

            // Vanilla funny
            .add(EntryModule.BEDROCK_MILK_ORE.ore().get())
            .add(EntryModule.BEDROCK_COOKIE_ORE.ore().get())

            // Techreborn
            .add(EntryModule.BEDROCK_BAUXITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_GALENA_ORE.ore().get())
            .add(EntryModule.BEDROCK_IRIDIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_LEAD_ORE.ore().get())
            .add(EntryModule.BEDROCK_RUBY_ORE.ore().get())
            .add(EntryModule.BEDROCK_SAPPHIRE_ORE.ore().get())
            .add(EntryModule.BEDROCK_SILVER_ORE.ore().get())
            .add(EntryModule.BEDROCK_TIN_ORE.ore().get())
            .add(EntryModule.BEDROCK_CINNABAR_ORE.ore().get())
            .add(EntryModule.BEDROCK_PYRITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_SPHALERITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_PERIDOT_ORE.ore().get())
            .add(EntryModule.BEDROCK_SHELDONITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_SODALITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_TUNGSTEN_ORE.ore().get())

            // TConstruct
            .add(EntryModule.BEDROCK_TC_COBALT_ORE.ore().get())

            // AE2
            .add(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.ore().get())

            // Big reactors
            .add(EntryModule.BEDROCK_ER_YELLORITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_ER_ANGLESITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_ER_BENITOITE_ORE.ore().get())

            // Bigger reactors
            .add(EntryModule.BEDROCK_BR_URANIUM_ORE.ore().get())

            // Immersive Engineering
            .add(EntryModule.BEDROCK_IE_ALUMINUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_IE_LEAD_ORE.ore().get())
            .add(EntryModule.BEDROCK_IE_SILVER_ORE.ore().get())
            .add(EntryModule.BEDROCK_IE_NICKEL_ORE.ore().get())
            .add(EntryModule.BEDROCK_IE_URANIUM_ORE.ore().get())

            // Mythic metals
            .add(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_BANGLUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_CARMOT_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_KYBER_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_MANGANESE_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_MORKITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_OSMIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_PLATINUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_RUNITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_SILVER_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_TIN_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MM_STORMYX_ORE.ore().get())

            // Create
            .add(EntryModule.BEDROCK_CR_ZINC_ORE.ore().get())

            // Mekanism
            .add(EntryModule.BEDROCK_MK_OSMIUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_MK_FLUORITE_ORE.ore().get())

            // Undergarden
            .add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get())
            .add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get())
            .add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get());
    }

    @Override
    public String getName() {
        return "Dadobugbedrockores Block Tags";
    }
}
