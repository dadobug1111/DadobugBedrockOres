package no.dadobug.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import no.dadobug.EntryModule;

public class LanguageGen extends LanguageProvider{

    public LanguageGen(DataGenerator gen, String locale) {
        super(gen, EntryModule.modid, locale);
    }

    @Override
    protected void addTranslations() {
        // BLOCKS
        
        // Vanilla
        add(EntryModule.BEDROCK_FRACTURED.ore().get(), "Fractured Bedrock");
        add(EntryModule.BEDROCK_HOLLOW.get(), "Hollow Bedrock");
        add(EntryModule.XP_LEAK.ore().get(), "XP Leak");
        add(EntryModule.BEDROCK_COAL_ORE.ore().get(), "Bedrock Coal Ore");
        add(EntryModule.BEDROCK_IRON_ORE.ore().get(), "Bedrock Iron Ore");
        add(EntryModule.BEDROCK_GOLD_ORE.ore().get(), "Bedrock Gold Ore");
        add(EntryModule.BEDROCK_DIAMOND_ORE.ore().get(), "Bedrock Diamond Ore");
        add(EntryModule.BEDROCK_REDSTONE_ORE.ore().get(), "Bedrock Redstone Ore");
        add(EntryModule.BEDROCK_COPPER_ORE.ore().get(), "Bedrock Copper Ore");
        add(EntryModule.BEDROCK_LAPIS_ORE.ore().get(), "Bedrock Lapis Ore");
        add(EntryModule.BEDROCK_EMERALD_ORE.ore().get(), "Bedrock Emerald Ore");
        add(EntryModule.BEDROCK_WATER_ORE.ore().get(), "Water Seep");
        add(EntryModule.BEDROCK_LAVA_ORE.ore().get(), "Lava Seep");
        add(EntryModule.BEDROCK_NETHER_GOLD.ore().get(), "Bedrock Nether Gold Ore");
        add(EntryModule.BEDROCK_NETHER_QUARTZ.ore().get(), "Bedrock Nether Quartz Ore");
        add(EntryModule.BEDROCK_ANCIENT_DEBRIS.ore().get(), "Bedrock Ancient Debris Ore");

        // Vanilla funny
        add(EntryModule.BEDROCK_MILK_ORE.ore().get(), "Milk Seep");
        add(EntryModule.BEDROCK_COOKIE_ORE.ore().get(), "Bedrock Cookie Ore");

        // Techreborn
        add(EntryModule.BEDROCK_BAUXITE_ORE.ore().get(), "Bedrock Bauxite Ore");
        add(EntryModule.BEDROCK_GALENA_ORE.ore().get(), "Bedrock Galena Ore");
        add(EntryModule.BEDROCK_IRIDIUM_ORE.ore().get(), "Bedrock Iridium Ore");
        add(EntryModule.BEDROCK_LEAD_ORE.ore().get(), "Bedrock Lead Ore");
        add(EntryModule.BEDROCK_RUBY_ORE.ore().get(), "Bedrock Ruby Ore");
        add(EntryModule.BEDROCK_SAPPHIRE_ORE.ore().get(), "Bedrock Sapphire Ore");
        add(EntryModule.BEDROCK_SILVER_ORE.ore().get(), "Bedrock Silver Ore");
        add(EntryModule.BEDROCK_TIN_ORE.ore().get(), "Bedrock Tin Ore");
        add(EntryModule.BEDROCK_CINNABAR_ORE.ore().get(), "Bedrock Cinnabar Ore");
        add(EntryModule.BEDROCK_PYRITE_ORE.ore().get(), "Bedrock Pyrite Ore");
        add(EntryModule.BEDROCK_SPHALERITE_ORE.ore().get(), "Bedrock Sphalerite Ore");
        add(EntryModule.BEDROCK_PERIDOT_ORE.ore().get(), "Bedrock Peridot Ore");
        add(EntryModule.BEDROCK_SHELDONITE_ORE.ore().get(), "Bedrock Sheldonite Ore");
        add(EntryModule.BEDROCK_SODALITE_ORE.ore().get(), "Bedrock Sodalite Ore");
        add(EntryModule.BEDROCK_TUNGSTEN_ORE.ore().get(), "Bedrock Tungsten Ore");

        // TConstruct
        add(EntryModule.BEDROCK_TC_COBALT_ORE.ore().get(), "Bedrock Cobalt Ore");

        // AE2
        add(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.ore().get(), "Bedrock Certus Quartz Ore");

        // Big reactors
        add(EntryModule.BEDROCK_ER_YELLORITE_ORE.ore().get(), "Bedrock Yellorite Ore");
        add(EntryModule.BEDROCK_ER_ANGLESITE_ORE.ore().get(), "Bedrock Anglesite Ore");
        add(EntryModule.BEDROCK_ER_BENITOITE_ORE.ore().get(), "Bedrock Benitoite Ore");

        // Bigger reactors
        add(EntryModule.BEDROCK_BR_URANIUM_ORE.ore().get(), "Bedrock Uranium Ore");

        // Immersive Engineering
        add(EntryModule.BEDROCK_IE_ALUMINUM_ORE.ore().get(), "Bedrock Aluminum Ore");
        add(EntryModule.BEDROCK_IE_LEAD_ORE.ore().get(), "Bedrock Lead Ore");
        add(EntryModule.BEDROCK_IE_SILVER_ORE.ore().get(), "Bedrock Silver Ore");
        add(EntryModule.BEDROCK_IE_NICKEL_ORE.ore().get(), "Bedrock Nickel Ore");
        add(EntryModule.BEDROCK_IE_URANIUM_ORE.ore().get(), "Bedrock Uranium Ore");

        // Mythic metals
        add(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore().get(), "Bedrock Adamantite Ore");
        add(EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore().get(), "Bedrock Aquarium Ore");
        add(EntryModule.BEDROCK_MM_BANGLUM_ORE.ore().get(), "Bedrock Banglum Ore");
        add(EntryModule.BEDROCK_MM_CARMOT_ORE.ore().get(), "Bedrock Carmot Ore");
        add(EntryModule.BEDROCK_MM_KYBER_ORE.ore().get(), "Bedrock Kyber Ore");
        add(EntryModule.BEDROCK_MM_MANGANESE_ORE.ore().get(), "Bedrock Manganese Ore");
        add(EntryModule.BEDROCK_MM_MORKITE_ORE.ore().get(), "Bedrock Morkite Ore");
        add(EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore().get(), "Bedrock Mythril Ore");
        add(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore().get(), "Bedrock Orichalcum Ore");
        add(EntryModule.BEDROCK_MM_OSMIUM_ORE.ore().get(), "Bedrock Osmium Ore");
        add(EntryModule.BEDROCK_MM_PLATINUM_ORE.ore().get(), "Bedrock Platinum Ore");
        add(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore().get(), "Bedrock Prometheum Ore");
        add(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore().get(), "Bedrock Quadrillum Ore");
        add(EntryModule.BEDROCK_MM_RUNITE_ORE.ore().get(), "Bedrock Runite Ore");
        add(EntryModule.BEDROCK_MM_SILVER_ORE.ore().get(), "Bedrock Silver Ore");
        add(EntryModule.BEDROCK_MM_STARRITE_ORE.ore().get(), "Bedrock Starrite Ore");
        add(EntryModule.BEDROCK_MM_TIN_ORE.ore().get(), "Bedrock Tin Ore");
        add(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore().get(), "Bedrock Unobtainium Ore");
        add(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore().get(), "Bedrock Nether Banglum Ore");
        add(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore().get(), "Bedrock Midas Gold Ore");
        add(EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore().get(), "Bedrock Palladium Ore");
        add(EntryModule.BEDROCK_MM_STORMYX_ORE.ore().get(), "Bedrock Stormyx Ore");

        // Create
        add(EntryModule.BEDROCK_CR_ZINC_ORE.ore().get(), "Bedrock Zinc Ore");

        // Mekanism
        add(EntryModule.BEDROCK_MK_OSMIUM_ORE.ore().get(), "Bedrock Osmium Ore");
        add(EntryModule.BEDROCK_MK_FLUORITE_ORE.ore().get(), "Bedrock Fluorite Ore");

        // Undergarden
        add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore().get(), "Bedrock Cloggrum Ore");
        add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore().get(), "Bedrock Froststeel Ore");
        add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore().get(), "Bedrock Utherium Ore");
        
        // CORES

        // Vanilla
        add(EntryModule.BEDROCK_FRACTURED.core().get(), "Fractured Regenerative Cluster");
        add(EntryModule.XP_LEAK.core().get(), "Leaky XP Conduit");
        add(EntryModule.BEDROCK_COAL_ORE.core().get(), "Regenerative Coal Cluster");
        add(EntryModule.BEDROCK_IRON_ORE.core().get(), "Regenerative Iron Cluster");
        add(EntryModule.BEDROCK_GOLD_ORE.core().get(), "Regenerative Gold Cluster");
        add(EntryModule.BEDROCK_DIAMOND_ORE.core().get(), "Regenerative Diamond Cluster");
        add(EntryModule.BEDROCK_REDSTONE_ORE.core().get(), "Regenerative Redstone Cluster");
        add(EntryModule.BEDROCK_COPPER_ORE.core().get(), "Regenerative Copper Cluster");
        add(EntryModule.BEDROCK_LAPIS_ORE.core().get(), "Regenerative Lapis Cluster");
        add(EntryModule.BEDROCK_EMERALD_ORE.core().get(), "Regenerative Emerald Cluster");
        add(EntryModule.BEDROCK_WATER_ORE.core().get(), "Regenerative Water Shale");
        add(EntryModule.BEDROCK_LAVA_ORE.core().get(), "Regenerative Lava Shale");
        add(EntryModule.BEDROCK_NETHER_GOLD.core().get(), "Regenerative Nether Gold Cluster");
        add(EntryModule.BEDROCK_NETHER_QUARTZ.core().get(), "Regenerative Nether Quartz Cluster");
        add(EntryModule.BEDROCK_ANCIENT_DEBRIS.core().get(), "Regenerative Ancient Debris Cluster");

        // Vanilla funny
        add(EntryModule.BEDROCK_MILK_ORE.core().get(), "Regenerative Milk Shake");
        add(EntryModule.BEDROCK_COOKIE_ORE.core().get(), "Regenerative Cookie Cluster");

        // Techreborn
        add(EntryModule.BEDROCK_BAUXITE_ORE.core().get(), "Regenerative Bauxite Cluster");
        add(EntryModule.BEDROCK_GALENA_ORE.core().get(), "Regenerative Galena Cluster");
        add(EntryModule.BEDROCK_IRIDIUM_ORE.core().get(), "Regenerative Iridium Cluster");
        add(EntryModule.BEDROCK_LEAD_ORE.core().get(), "Regenerative Lead Cluster");
        add(EntryModule.BEDROCK_RUBY_ORE.core().get(), "Regenerative Ruby Cluster");
        add(EntryModule.BEDROCK_SAPPHIRE_ORE.core().get(), "Regenerative Sapphire Cluster");
        add(EntryModule.BEDROCK_SILVER_ORE.core().get(), "Regenerative Silver Cluster");
        add(EntryModule.BEDROCK_TIN_ORE.core().get(), "Regenerative Tin Cluster");
        add(EntryModule.BEDROCK_CINNABAR_ORE.core().get(), "Regenerative Cinnabar Cluster");
        add(EntryModule.BEDROCK_PYRITE_ORE.core().get(), "Regenerative Pyrite Cluster");
        add(EntryModule.BEDROCK_SPHALERITE_ORE.core().get(), "Regenerative Sphalerite Cluster");
        add(EntryModule.BEDROCK_PERIDOT_ORE.core().get(), "Regenerative Peridot Cluster");
        add(EntryModule.BEDROCK_SHELDONITE_ORE.core().get(), "Regenerative Sheldonite Cluster");
        add(EntryModule.BEDROCK_SODALITE_ORE.core().get(), "Regenerative Sodalite Cluster");
        add(EntryModule.BEDROCK_TUNGSTEN_ORE.core().get(), "Regenerative Tungsten Cluster");

        // TConstruct
        add(EntryModule.BEDROCK_TC_COBALT_ORE.core().get(), "Regenerative Cobalt Cluster");

        // AE2
        add(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.core().get(), "Regenerative Certus Quartz Cluster");

        // Big reactors
        add(EntryModule.BEDROCK_ER_YELLORITE_ORE.core().get(), "Regenerative Yellorite Cluster");
        add(EntryModule.BEDROCK_ER_ANGLESITE_ORE.core().get(), "Regenerative Anglesite Cluster");
        add(EntryModule.BEDROCK_ER_BENITOITE_ORE.core().get(), "Regenerative Benitoite Cluster");

        // Bigger reactors
        add(EntryModule.BEDROCK_BR_URANIUM_ORE.core().get(), "Regenerative Uranium Cluster");

        // Immersive Engineering
        add(EntryModule.BEDROCK_IE_ALUMINUM_ORE.core().get(), "Regenerative Aluminum Cluster");
        add(EntryModule.BEDROCK_IE_LEAD_ORE.core().get(), "Regenerative Lead Cluster");
        add(EntryModule.BEDROCK_IE_SILVER_ORE.core().get(), "Regenerative Silver Cluster");
        add(EntryModule.BEDROCK_IE_NICKEL_ORE.core().get(), "Regenerative Nickel Cluster");
        add(EntryModule.BEDROCK_IE_URANIUM_ORE.core().get(), "Regenerative Uranium Cluster");

        // Mythic metals
        add(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.core().get(), "Regenerative Adamantite Cluster");
        add(EntryModule.BEDROCK_MM_AQUARIUM_ORE.core().get(), "Regenerative Aquarium Cluster");
        add(EntryModule.BEDROCK_MM_BANGLUM_ORE.core().get(), "Regenerative Banglum Cluster");
        add(EntryModule.BEDROCK_MM_CARMOT_ORE.core().get(), "Regenerative Carmot Cluster");
        add(EntryModule.BEDROCK_MM_KYBER_ORE.core().get(), "Regenerative Kyber Cluster");
        add(EntryModule.BEDROCK_MM_MANGANESE_ORE.core().get(), "Regenerative Manganese Cluster");
        add(EntryModule.BEDROCK_MM_MORKITE_ORE.core().get(), "Regenerative Morkite Cluster");
        add(EntryModule.BEDROCK_MM_MYTHRIL_ORE.core().get(), "Regenerative Mythril Cluster");
        add(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.core().get(), "Regenerative TEOrichalcumMP Cluster");
        add(EntryModule.BEDROCK_MM_OSMIUM_ORE.core().get(), "Regenerative Osmium Cluster");
        add(EntryModule.BEDROCK_MM_PLATINUM_ORE.core().get(), "Regenerative Platinum Cluster");
        add(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.core().get(), "Regenerative Prometheum Cluster");
        add(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.core().get(), "Regenerative Quadrillum Cluster");
        add(EntryModule.BEDROCK_MM_RUNITE_ORE.core().get(), "Regenerative Runite Cluster");
        add(EntryModule.BEDROCK_MM_SILVER_ORE.core().get(), "Regenerative Silver Cluster");
        add(EntryModule.BEDROCK_MM_STARRITE_ORE.core().get(), "Regenerative Starrite Cluster");
        add(EntryModule.BEDROCK_MM_TIN_ORE.core().get(), "Regenerative Tin Cluster");
        add(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.core().get(), "Regenerative Unobtainium Cluster");
        add(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.core().get(), "Regenerative Nether Banglum Cluster");
        add(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.core().get(), "Regenerative Midas Gold Cluster");
        add(EntryModule.BEDROCK_MM_PALLADIUM_ORE.core().get(), "Regenerative Palladium Cluster");
        add(EntryModule.BEDROCK_MM_STORMYX_ORE.core().get(), "Regenerative Stormyx Cluster");

        // Create
        add(EntryModule.BEDROCK_CR_ZINC_ORE.core().get(), "Regenerative Zinc Cluster");

        // Mekanism
        add(EntryModule.BEDROCK_MK_OSMIUM_ORE.core().get(), "Regenerative Osmium Cluster");
        add(EntryModule.BEDROCK_MK_FLUORITE_ORE.core().get(), "Regenerative Fluorite Cluster");

        // Undergarden
        add(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core().get(), "Regenerative Cloggrum Cluster");
        add(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core().get(), "Regenerative Froststeel Cluster");
        add(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core().get(), "Regenerative Utherium Cluster");
    }
    
}
