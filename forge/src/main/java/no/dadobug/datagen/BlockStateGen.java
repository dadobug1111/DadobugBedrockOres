package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;

/*
 * Class that generates block state json files for this mod's blocks
 */
public class BlockStateGen extends BlockStateProvider{

    public BlockStateGen(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, EntryModule.modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Vanilla
        simpleBlock(EntryModule.BEDROCK_FRACTURED.ore().get());
        simpleBlock(EntryModule.BEDROCK_HOLLOW.get());
        simpleBlock(EntryModule.XP_LEAK.ore().get());
        simpleBlock(EntryModule.BEDROCK_COAL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IRON_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_GOLD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_DIAMOND_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_REDSTONE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_COPPER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_LAPIS_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_EMERALD_ORE.ore().get());
        // Doesn't work as the block's texture isn't the same as its name
        // Could code an exception but as it's the only block like this
        // I just skipped it and use the existing block state

        // simpleBlock(EntryModule.BEDROCK_WATER_ORE.ore().get());

        simpleBlock(EntryModule.BEDROCK_LAVA_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_NETHER_GOLD.ore().get());
        simpleBlock(EntryModule.BEDROCK_NETHER_QUARTZ.ore().get());
        simpleBlock(EntryModule.BEDROCK_ANCIENT_DEBRIS.ore().get());

        // Vanilla funny
        simpleBlock(EntryModule.BEDROCK_MILK_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_COOKIE_ORE.ore().get());

        // Techreborn
        simpleBlock(EntryModule.BEDROCK_BAUXITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_GALENA_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IRIDIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_LEAD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_RUBY_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_SAPPHIRE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_SILVER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TIN_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_CINNABAR_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_PYRITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_SPHALERITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_PERIDOT_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_SHELDONITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_SODALITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TUNGSTEN_ORE.ore().get());

        // TConstruct
        simpleBlock(EntryModule.BEDROCK_TC_COBALT_ORE.ore().get());

        // AE2
        // Similar to the water block but because it has multiple textures
        // simpleBlock(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.ore().get());

        // Big reactors
        simpleBlock(EntryModule.BEDROCK_ER_YELLORITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_ER_ANGLESITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_ER_BENITOITE_ORE.ore().get());

        // Bigger reactors
        simpleBlock(EntryModule.BEDROCK_BR_URANIUM_ORE.ore().get());

        // Immersive Engineering
        simpleBlock(EntryModule.BEDROCK_IE_ALUMINUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IE_LEAD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IE_SILVER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IE_NICKEL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IE_URANIUM_ORE.ore().get());

        // Mythic metals
        simpleBlock(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_BANGLUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_CARMOT_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_KYBER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_MANGANESE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_MORKITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_OSMIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_PLATINUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_RUNITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_SILVER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_TIN_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MM_STORMYX_ORE.ore().get());

        // Create
        simpleBlock(EntryModule.BEDROCK_CR_ZINC_ORE.ore().get());

        // Mekanism
        simpleBlock(EntryModule.BEDROCK_MK_OSMIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MK_FLUORITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MK_LEAD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MK_TIN_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MK_URANIUM_ORE.ore().get());

        // Undergarden
        simpleBlock(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_UG_REGALIUM_ORE.ore().get());

        // Beyond Earth
        simpleBlock(EntryModule.BEDROCK_BE_DESH_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_BE_CHEESE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_BE_OSTRUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_BE_CALORITE_ORE.ore().get());

        // FTB IC
        simpleBlock(EntryModule.BEDROCK_IC_TIN_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IC_LEAD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IC_ALUMINUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IC_IRIDIUM_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_IC_URANIUM_ORE.ore().get());

        // Malum
        simpleBlock(EntryModule.BEDROCK_MA_SOULSTONE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.ore().get());

        // Thermal
        simpleBlock(EntryModule.BEDROCK_TH_NITER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_SULFUR_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_TIN_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_LEAD_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_SILVER_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_NICKEL_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_APATITE_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_CINNABAR_ORE.ore().get());
        simpleBlock(EntryModule.BEDROCK_TH_OIL_ORE.ore().get());

        // Powah
        simpleBlock(EntryModule.BEDROCK_PW_URANINITE_ORE.ore().get());
    }
    
}
