package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraft.data.server.ItemTagProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

public class ItemTagsGen extends ItemTagProvider{

    public ItemTagsGen(DataGenerator gen, BlockTagProvider blockTag, ExistingFileHelper existingFileHelper) {
        super(gen, blockTag, EntryModule.modid, existingFileHelper);
    }

    @Override
    protected void configure() {
        this.getOrCreateTagBuilder(EntryModule.IS_CORE_TAG)
            // Vanilla
            .add(EntryModule.BEDROCK_FRACTURED.core().get())
            .add(EntryModule.XP_LEAK.core().get())
            .add(EntryModule.BEDROCK_COAL_ORE.core().get())
            .add(EntryModule.BEDROCK_IRON_ORE.core().get())
            .add(EntryModule.BEDROCK_GOLD_ORE.core().get())
            .add(EntryModule.BEDROCK_DIAMOND_ORE.core().get())
            .add(EntryModule.BEDROCK_REDSTONE_ORE.core().get())
            .add(EntryModule.BEDROCK_COPPER_ORE.core().get())
            .add(EntryModule.BEDROCK_LAPIS_ORE.core().get())
            .add(EntryModule.BEDROCK_EMERALD_ORE.core().get())
            .add(EntryModule.BEDROCK_WATER_ORE.core().get())
            .add(EntryModule.BEDROCK_LAVA_ORE.core().get())
            .add(EntryModule.BEDROCK_NETHER_GOLD.core().get())
            .add(EntryModule.BEDROCK_NETHER_QUARTZ.core().get())
            .add(EntryModule.BEDROCK_ANCIENT_DEBRIS.core().get())

            // Vanilla funny
            .add(EntryModule.BEDROCK_MILK_ORE.core().get())
            .add(EntryModule.BEDROCK_COOKIE_ORE.core().get())

            // Techreborn
            .add(EntryModule.BEDROCK_BAUXITE_ORE.core().get())
            .add(EntryModule.BEDROCK_GALENA_ORE.core().get())
            .add(EntryModule.BEDROCK_IRIDIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_LEAD_ORE.core().get())
            .add(EntryModule.BEDROCK_RUBY_ORE.core().get())
            .add(EntryModule.BEDROCK_SAPPHIRE_ORE.core().get())
            .add(EntryModule.BEDROCK_SILVER_ORE.core().get())
            .add(EntryModule.BEDROCK_TIN_ORE.core().get())
            .add(EntryModule.BEDROCK_CINNABAR_ORE.core().get())
            .add(EntryModule.BEDROCK_PYRITE_ORE.core().get())
            .add(EntryModule.BEDROCK_SPHALERITE_ORE.core().get())
            .add(EntryModule.BEDROCK_PERIDOT_ORE.core().get())
            .add(EntryModule.BEDROCK_SHELDONITE_ORE.core().get())
            .add(EntryModule.BEDROCK_SODALITE_ORE.core().get())
            .add(EntryModule.BEDROCK_TUNGSTEN_ORE.core().get())

            // TConstruct
            .add(EntryModule.BEDROCK_TC_COBALT_ORE.core().get())

            // AE2
            .add(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.core().get())

            // Big reactors
            .add(EntryModule.BEDROCK_ER_YELLORITE_ORE.core().get())
            .add(EntryModule.BEDROCK_ER_ANGLESITE_ORE.core().get())
            .add(EntryModule.BEDROCK_ER_BENITOITE_ORE.core().get())

            // Bigger reactors
            .add(EntryModule.BEDROCK_BR_URANIUM_ORE.core().get())

            // Immersive Engineering
            .add(EntryModule.BEDROCK_IE_ALUMINUM_ORE.core().get())
            .add(EntryModule.BEDROCK_IE_LEAD_ORE.core().get())
            .add(EntryModule.BEDROCK_IE_SILVER_ORE.core().get())
            .add(EntryModule.BEDROCK_IE_NICKEL_ORE.core().get())
            .add(EntryModule.BEDROCK_IE_URANIUM_ORE.core().get())

            // Mythic metals
            .add(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_AQUARIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_BANGLUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_CARMOT_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_KYBER_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_MANGANESE_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_MORKITE_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_MYTHRIL_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_OSMIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_PLATINUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_RUNITE_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_SILVER_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_STARRITE_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_TIN_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_PALLADIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MM_STORMYX_ORE.core().get())

            // Create
            .add(EntryModule.BEDROCK_CR_ZINC_ORE.core().get())

            // Mekanism
            .add(EntryModule.BEDROCK_MK_OSMIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_MK_FLUORITE_ORE.core().get())
            .add(EntryModule.BEDROCK_MK_LEAD_ORE.core().get())
            .add(EntryModule.BEDROCK_MK_TIN_ORE.core().get())
            .add(EntryModule.BEDROCK_MK_URANIUM_ORE.core().get())

            // Undergarden
            .add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core().get())
            .add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core().get())
            .add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_UG_REGALIUM_ORE.core().get())

            // Beyond Earth
            .add(EntryModule.BEDROCK_BE_DESH_ORE.core().get())
            .add(EntryModule.BEDROCK_BE_CHEESE_ORE.core().get())
            .add(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.core().get())
            .add(EntryModule.BEDROCK_BE_OSTRUM_ORE.core().get())
            .add(EntryModule.BEDROCK_BE_CALORITE_ORE.core().get())

            // FTB IC
            .add(EntryModule.BEDROCK_IC_TIN_ORE.core().get())
            .add(EntryModule.BEDROCK_IC_LEAD_ORE.core().get())
            .add(EntryModule.BEDROCK_IC_ALUMINUM_ORE.core().get())
            .add(EntryModule.BEDROCK_IC_IRIDIUM_ORE.core().get())
            .add(EntryModule.BEDROCK_IC_URANIUM_ORE.core().get())

            // Malum
            .add(EntryModule.BEDROCK_MA_SOULSTONE_ORE.core().get())
            .add(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.core().get())
            .add(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.core().get())

            // Thermal
            .add(EntryModule.BEDROCK_TH_NITER_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_SULFUR_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_TIN_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_LEAD_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_SILVER_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_NICKEL_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_APATITE_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_CINNABAR_ORE.core().get())
            .add(EntryModule.BEDROCK_TH_OIL_ORE.core().get());
        }

    @Override
    public String getName() {
        return "Dadobugbedrockores Item Tags";
    }
    
}
