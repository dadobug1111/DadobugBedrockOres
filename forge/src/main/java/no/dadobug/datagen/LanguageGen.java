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
        addBlockTranslations();
        addBlockItemTranslations();
        addTooltipTranslations();
        addEnchantmentTranslations();

        // Add Creative item group
        add("itemGroup.dadobugbedrockores.item_group", "Bedrock Ores");
    }

    private void addBlockTranslations() {
        // Vanilla
        addBlock(EntryModule.BEDROCK_FRACTURED.ore(), "Fractured Bedrock");
        addBlock(EntryModule.BEDROCK_HOLLOW, "Hollow Bedrock");
        addBlock(EntryModule.XP_LEAK.ore(), "XP Leak");
        addBlock(EntryModule.BEDROCK_COAL_ORE.ore(), "Bedrock Coal Ore");
        addBlock(EntryModule.BEDROCK_IRON_ORE.ore(), "Bedrock Iron Ore");
        addBlock(EntryModule.BEDROCK_GOLD_ORE.ore(), "Bedrock Gold Ore");
        addBlock(EntryModule.BEDROCK_DIAMOND_ORE.ore(), "Bedrock Diamond Ore");
        addBlock(EntryModule.BEDROCK_REDSTONE_ORE.ore(), "Bedrock Redstone Ore");
        addBlock(EntryModule.BEDROCK_COPPER_ORE.ore(), "Bedrock Copper Ore");
        addBlock(EntryModule.BEDROCK_LAPIS_ORE.ore(), "Bedrock Lapis Ore");
        addBlock(EntryModule.BEDROCK_EMERALD_ORE.ore(), "Bedrock Emerald Ore");
        addBlock(EntryModule.BEDROCK_WATER_ORE.ore(), "Water Seep");
        addBlock(EntryModule.BEDROCK_LAVA_ORE.ore(), "Lava Seep");
        addBlock(EntryModule.BEDROCK_NETHER_GOLD.ore(), "Bedrock Nether Gold Ore");
        addBlock(EntryModule.BEDROCK_NETHER_QUARTZ.ore(), "Bedrock Nether Quartz Ore");
        addBlock(EntryModule.BEDROCK_ANCIENT_DEBRIS.ore(), "Bedrock Ancient Debris Ore");

        // Vanilla funny
        addBlock(EntryModule.BEDROCK_MILK_ORE.ore(), "Milk Seep");
        addBlock(EntryModule.BEDROCK_COOKIE_ORE.ore(), "Bedrock Cookie Ore");

        // Techreborn
        addBlock(EntryModule.BEDROCK_BAUXITE_ORE.ore(), "Bedrock Bauxite Ore");
        addBlock(EntryModule.BEDROCK_GALENA_ORE.ore(), "Bedrock Galena Ore");
        addBlock(EntryModule.BEDROCK_IRIDIUM_ORE.ore(), "Bedrock Iridium Ore");
        addBlock(EntryModule.BEDROCK_LEAD_ORE.ore(), "Bedrock Lead Ore");
        addBlock(EntryModule.BEDROCK_RUBY_ORE.ore(), "Bedrock Ruby Ore");
        addBlock(EntryModule.BEDROCK_SAPPHIRE_ORE.ore(), "Bedrock Sapphire Ore");
        addBlock(EntryModule.BEDROCK_SILVER_ORE.ore(), "Bedrock Silver Ore");
        addBlock(EntryModule.BEDROCK_TIN_ORE.ore(), "Bedrock Tin Ore");
        addBlock(EntryModule.BEDROCK_CINNABAR_ORE.ore(), "Bedrock Cinnabar Ore");
        addBlock(EntryModule.BEDROCK_PYRITE_ORE.ore(), "Bedrock Pyrite Ore");
        addBlock(EntryModule.BEDROCK_SPHALERITE_ORE.ore(), "Bedrock Sphalerite Ore");
        addBlock(EntryModule.BEDROCK_PERIDOT_ORE.ore(), "Bedrock Peridot Ore");
        addBlock(EntryModule.BEDROCK_SHELDONITE_ORE.ore(), "Bedrock Sheldonite Ore");
        addBlock(EntryModule.BEDROCK_SODALITE_ORE.ore(), "Bedrock Sodalite Ore");
        addBlock(EntryModule.BEDROCK_TUNGSTEN_ORE.ore(), "Bedrock Tungsten Ore");

        // TConstruct
        addBlock(EntryModule.BEDROCK_TC_COBALT_ORE.ore(), "Bedrock Cobalt Ore");

        // AE2
        addBlock(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.ore(), "Bedrock Certus Quartz Ore");

        // Big reactors
        addBlock(EntryModule.BEDROCK_ER_YELLORITE_ORE.ore(), "Bedrock Yellorite Ore");
        addBlock(EntryModule.BEDROCK_ER_ANGLESITE_ORE.ore(), "Bedrock Anglesite Ore");
        addBlock(EntryModule.BEDROCK_ER_BENITOITE_ORE.ore(), "Bedrock Benitoite Ore");

        // Bigger reactors
        addBlock(EntryModule.BEDROCK_BR_URANIUM_ORE.ore(), "Bedrock Uranium Ore");

        // Immersive Engineering
        addBlock(EntryModule.BEDROCK_IE_ALUMINUM_ORE.ore(), "Bedrock Aluminum Ore");
        addBlock(EntryModule.BEDROCK_IE_LEAD_ORE.ore(), "Bedrock Lead Ore");
        addBlock(EntryModule.BEDROCK_IE_SILVER_ORE.ore(), "Bedrock Silver Ore");
        addBlock(EntryModule.BEDROCK_IE_NICKEL_ORE.ore(), "Bedrock Nickel Ore");
        addBlock(EntryModule.BEDROCK_IE_URANIUM_ORE.ore(), "Bedrock Uranium Ore");

        // Mythic metals
        addBlock(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.ore(), "Bedrock Adamantite Ore");
        addBlock(EntryModule.BEDROCK_MM_AQUARIUM_ORE.ore(), "Bedrock Aquarium Ore");
        addBlock(EntryModule.BEDROCK_MM_BANGLUM_ORE.ore(), "Bedrock Banglum Ore");
        addBlock(EntryModule.BEDROCK_MM_CARMOT_ORE.ore(), "Bedrock Carmot Ore");
        addBlock(EntryModule.BEDROCK_MM_KYBER_ORE.ore(), "Bedrock Kyber Ore");
        addBlock(EntryModule.BEDROCK_MM_MANGANESE_ORE.ore(), "Bedrock Manganese Ore");
        addBlock(EntryModule.BEDROCK_MM_MORKITE_ORE.ore(), "Bedrock Morkite Ore");
        addBlock(EntryModule.BEDROCK_MM_MYTHRIL_ORE.ore(), "Bedrock Mythril Ore");
        addBlock(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.ore(), "Bedrock Orichalcum Ore");
        addBlock(EntryModule.BEDROCK_MM_OSMIUM_ORE.ore(), "Bedrock Osmium Ore");
        addBlock(EntryModule.BEDROCK_MM_PLATINUM_ORE.ore(), "Bedrock Platinum Ore");
        addBlock(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.ore(), "Bedrock Prometheum Ore");
        addBlock(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.ore(), "Bedrock Quadrillum Ore");
        addBlock(EntryModule.BEDROCK_MM_RUNITE_ORE.ore(), "Bedrock Runite Ore");
        addBlock(EntryModule.BEDROCK_MM_SILVER_ORE.ore(), "Bedrock Silver Ore");
        addBlock(EntryModule.BEDROCK_MM_STARRITE_ORE.ore(), "Bedrock Starrite Ore");
        addBlock(EntryModule.BEDROCK_MM_TIN_ORE.ore(), "Bedrock Tin Ore");
        addBlock(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.ore(), "Bedrock Unobtainium Ore");
        addBlock(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.ore(), "Bedrock Nether Banglum Ore");
        addBlock(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.ore(), "Bedrock Midas Gold Ore");
        addBlock(EntryModule.BEDROCK_MM_PALLADIUM_ORE.ore(), "Bedrock Palladium Ore");
        addBlock(EntryModule.BEDROCK_MM_STORMYX_ORE.ore(), "Bedrock Stormyx Ore");

        // Create
        addBlock(EntryModule.BEDROCK_CR_ZINC_ORE.ore(), "Bedrock Zinc Ore");

        // Mekanism
        addBlock(EntryModule.BEDROCK_MK_OSMIUM_ORE.ore(), "Bedrock Osmium Ore");
        addBlock(EntryModule.BEDROCK_MK_FLUORITE_ORE.ore(), "Bedrock Fluorite Ore");

        // Undergarden
        addBlock(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.ore(), "Bedrock Cloggrum Ore");
        addBlock(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.ore(), "Bedrock Froststeel Ore");
        addBlock(EntryModule.BEDROCK_UG_UTHERIUM_ORE.ore(), "Bedrock Utherium Ore");

        // Beyond Earth
        addBlock(EntryModule.BEDROCK_BE_DESH_ORE.ore(), "Bedrock Desh Ore");
        addBlock(EntryModule.BEDROCK_BE_CHEESE_ORE.ore(), "Bedrock Cheese Ore");
        addBlock(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.ore(), "Bedrock Ice Shard Ore");
        addBlock(EntryModule.BEDROCK_BE_OSTRUM_ORE.ore(), "Bedrock Ostrum Ore");
        addBlock(EntryModule.BEDROCK_BE_CALORITE_ORE.ore(), "Bedrock Calorite Ore");

        // FTB IC
        addBlock(EntryModule.BEDROCK_IC_TIN_ORE.ore(), "Bedrock Tin Ore");
        addBlock(EntryModule.BEDROCK_IC_LEAD_ORE.ore(), "Bedrock Lead Ore");
        addBlock(EntryModule.BEDROCK_IC_ALUMINUM_ORE.ore(), "Bedrock Aluminum Ore");
        addBlock(EntryModule.BEDROCK_IC_IRIDIUM_ORE.ore(), "Bedrock Iridium Ore");

        // Malum
        addBlock(EntryModule.BEDROCK_MA_SOULSTONE_ORE.ore(), "Bedrock Soulstone Ore");
        addBlock(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.ore(), "Bedrock Brilliance Ore");
        addBlock(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.ore(), "Bedrock Blazin Quartz Ore");
    }

    private void addBlockItemTranslations() {
        // Vanilla
        addItem(EntryModule.BEDROCK_FRACTURED.core(), "Fractured Regenerative Cluster");
        addItem(EntryModule.XP_LEAK.core(), "Leaky XP Conduit");
        addItem(EntryModule.BEDROCK_COAL_ORE.core(), "Regenerative Coal Cluster");
        addItem(EntryModule.BEDROCK_IRON_ORE.core(), "Regenerative Iron Cluster");
        addItem(EntryModule.BEDROCK_GOLD_ORE.core(), "Regenerative Gold Cluster");
        addItem(EntryModule.BEDROCK_DIAMOND_ORE.core(), "Regenerative Diamond Cluster");
        addItem(EntryModule.BEDROCK_REDSTONE_ORE.core(), "Regenerative Redstone Cluster");
        addItem(EntryModule.BEDROCK_COPPER_ORE.core(), "Regenerative Copper Cluster");
        addItem(EntryModule.BEDROCK_LAPIS_ORE.core(), "Regenerative Lapis Cluster");
        addItem(EntryModule.BEDROCK_EMERALD_ORE.core(), "Regenerative Emerald Cluster");
        addItem(EntryModule.BEDROCK_WATER_ORE.core(), "Regenerative Water Shale");
        addItem(EntryModule.BEDROCK_LAVA_ORE.core(), "Regenerative Lava Shale");
        addItem(EntryModule.BEDROCK_NETHER_GOLD.core(), "Regenerative Nether Gold Cluster");
        addItem(EntryModule.BEDROCK_NETHER_QUARTZ.core(), "Regenerative Nether Quartz Cluster");
        addItem(EntryModule.BEDROCK_ANCIENT_DEBRIS.core(), "Regenerative Ancient Debris Cluster");

        // Vanilla funny
        addItem(EntryModule.BEDROCK_MILK_ORE.core(), "Regenerative Milk Shake");
        addItem(EntryModule.BEDROCK_COOKIE_ORE.core(), "Regenerative Cookie Cluster");

        // Techreborn
        addItem(EntryModule.BEDROCK_BAUXITE_ORE.core(), "Regenerative Bauxite Cluster");
        addItem(EntryModule.BEDROCK_GALENA_ORE.core(), "Regenerative Galena Cluster");
        addItem(EntryModule.BEDROCK_IRIDIUM_ORE.core(), "Regenerative Iridium Cluster");
        addItem(EntryModule.BEDROCK_LEAD_ORE.core(), "Regenerative Lead Cluster");
        addItem(EntryModule.BEDROCK_RUBY_ORE.core(), "Regenerative Ruby Cluster");
        addItem(EntryModule.BEDROCK_SAPPHIRE_ORE.core(), "Regenerative Sapphire Cluster");
        addItem(EntryModule.BEDROCK_SILVER_ORE.core(), "Regenerative Silver Cluster");
        addItem(EntryModule.BEDROCK_TIN_ORE.core(), "Regenerative Tin Cluster");
        addItem(EntryModule.BEDROCK_CINNABAR_ORE.core(), "Regenerative Cinnabar Cluster");
        addItem(EntryModule.BEDROCK_PYRITE_ORE.core(), "Regenerative Pyrite Cluster");
        addItem(EntryModule.BEDROCK_SPHALERITE_ORE.core(), "Regenerative Sphalerite Cluster");
        addItem(EntryModule.BEDROCK_PERIDOT_ORE.core(), "Regenerative Peridot Cluster");
        addItem(EntryModule.BEDROCK_SHELDONITE_ORE.core(), "Regenerative Sheldonite Cluster");
        addItem(EntryModule.BEDROCK_SODALITE_ORE.core(), "Regenerative Sodalite Cluster");
        addItem(EntryModule.BEDROCK_TUNGSTEN_ORE.core(), "Regenerative Tungsten Cluster");

        // TConstruct
        addItem(EntryModule.BEDROCK_TC_COBALT_ORE.core(), "Regenerative Cobalt Cluster");

        // AE2
        addItem(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.core(), "Regenerative Certus Quartz Cluster");

        // Big reactors
        addItem(EntryModule.BEDROCK_ER_YELLORITE_ORE.core(), "Regenerative Yellorite Cluster");
        addItem(EntryModule.BEDROCK_ER_ANGLESITE_ORE.core(), "Regenerative Anglesite Cluster");
        addItem(EntryModule.BEDROCK_ER_BENITOITE_ORE.core(), "Regenerative Benitoite Cluster");

        // Bigger reactors
        addItem(EntryModule.BEDROCK_BR_URANIUM_ORE.core(), "Regenerative Uranium Cluster");

        // Immersive Engineering
        addItem(EntryModule.BEDROCK_IE_ALUMINUM_ORE.core(), "Regenerative Aluminum Cluster");
        addItem(EntryModule.BEDROCK_IE_LEAD_ORE.core(), "Regenerative Lead Cluster");
        addItem(EntryModule.BEDROCK_IE_SILVER_ORE.core(), "Regenerative Silver Cluster");
        addItem(EntryModule.BEDROCK_IE_NICKEL_ORE.core(), "Regenerative Nickel Cluster");
        addItem(EntryModule.BEDROCK_IE_URANIUM_ORE.core(), "Regenerative Uranium Cluster");

        // Mythic metals
        addItem(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.core(), "Regenerative Adamantite Cluster");
        addItem(EntryModule.BEDROCK_MM_AQUARIUM_ORE.core(), "Regenerative Aquarium Cluster");
        addItem(EntryModule.BEDROCK_MM_BANGLUM_ORE.core(), "Regenerative Banglum Cluster");
        addItem(EntryModule.BEDROCK_MM_CARMOT_ORE.core(), "Regenerative Carmot Cluster");
        addItem(EntryModule.BEDROCK_MM_KYBER_ORE.core(), "Regenerative Kyber Cluster");
        addItem(EntryModule.BEDROCK_MM_MANGANESE_ORE.core(), "Regenerative Manganese Cluster");
        addItem(EntryModule.BEDROCK_MM_MORKITE_ORE.core(), "Regenerative Morkite Cluster");
        addItem(EntryModule.BEDROCK_MM_MYTHRIL_ORE.core(), "Regenerative Mythril Cluster");
        addItem(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.core(), "Regenerative TEOrichalcumMP Cluster");
        addItem(EntryModule.BEDROCK_MM_OSMIUM_ORE.core(), "Regenerative Osmium Cluster");
        addItem(EntryModule.BEDROCK_MM_PLATINUM_ORE.core(), "Regenerative Platinum Cluster");
        addItem(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.core(), "Regenerative Prometheum Cluster");
        addItem(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.core(), "Regenerative Quadrillum Cluster");
        addItem(EntryModule.BEDROCK_MM_RUNITE_ORE.core(), "Regenerative Runite Cluster");
        addItem(EntryModule.BEDROCK_MM_SILVER_ORE.core(), "Regenerative Silver Cluster");
        addItem(EntryModule.BEDROCK_MM_STARRITE_ORE.core(), "Regenerative Starrite Cluster");
        addItem(EntryModule.BEDROCK_MM_TIN_ORE.core(), "Regenerative Tin Cluster");
        addItem(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.core(), "Regenerative Unobtainium Cluster");
        addItem(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.core(), "Regenerative Nether Banglum Cluster");
        addItem(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.core(), "Regenerative Midas Gold Cluster");
        addItem(EntryModule.BEDROCK_MM_PALLADIUM_ORE.core(), "Regenerative Palladium Cluster");
        addItem(EntryModule.BEDROCK_MM_STORMYX_ORE.core(), "Regenerative Stormyx Cluster");

        // Create
        addItem(EntryModule.BEDROCK_CR_ZINC_ORE.core(), "Regenerative Zinc Cluster");

        // Mekanism
        addItem(EntryModule.BEDROCK_MK_OSMIUM_ORE.core(), "Regenerative Osmium Cluster");
        addItem(EntryModule.BEDROCK_MK_FLUORITE_ORE.core(), "Regenerative Fluorite Cluster");

        // Undergarden
        addItem(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core(), "Regenerative Cloggrum Cluster");
        addItem(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core(), "Regenerative Froststeel Cluster");
        addItem(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core(), "Regenerative Utherium Cluster");

        // Beyond Earth
        addItem(EntryModule.BEDROCK_BE_DESH_ORE.core(), "Regenerative Desh Cluster");
        addItem(EntryModule.BEDROCK_BE_CHEESE_ORE.core(), "Regenerative Cheese Cluster");
        addItem(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.core(), "Regenerative Ice Shard Cluster");
        addItem(EntryModule.BEDROCK_BE_OSTRUM_ORE.core(), "Regenerative Ostrum Cluster");
        addItem(EntryModule.BEDROCK_BE_CALORITE_ORE.core(), "Regenerative Calorite Cluster");

        // FTB IC
        addItem(EntryModule.BEDROCK_IC_TIN_ORE.core(), "Regenerative Tin Cluster");
        addItem(EntryModule.BEDROCK_IC_LEAD_ORE.core(), "Regenerative Lead Cluster");
        addItem(EntryModule.BEDROCK_IC_ALUMINUM_ORE.core(), "Regenerative Aluminum Cluster");
        addItem(EntryModule.BEDROCK_IC_IRIDIUM_ORE.core(), "Regenerative Iridium Cluster");

        // Malum
        addItem(EntryModule.BEDROCK_MA_SOULSTONE_ORE.core(), "Regenerative Soulstone Cluster");
        addItem(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.core(), "Regenerative Brilliance Cluster");
        addItem(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.core(), "Regenerative Blazin Quartz Cluster");
    }

    private void addTooltipTranslations() {
        add("item.dadobugbedrockores.regen_broken.tooltip", "It hums with uncontained power, and lightly burns to the touch");
        add("item.dadobugbedrockores.regen_power.tooltip", "It hums with great power");
        add("item.dadobugbedrockores.regen_need_host.tooltip", "Place in Hollow Bedrock to activate");
        add("item.dadobugbedrockores.regen_fluid.tooltip", "It hums with great power, slowly dripping");
        add("item.dadobugbedrockores.regen_joke_fluid_one.tooltip", "If only you had some cookies to go with this...");
        add("item.dadobugbedrockores.regen_joke_item_one.tooltip", "If only you had some milk to go with this...");
        add("item.dadobugbedrockores.regen_xp.tooltip", "It hums with great magical potential");
        add("item.dadobugbedrockores.durability.tooltip", "Remaining ore durability: ");
    }
    
    private void addEnchantmentTranslations() {
        add("enchantment.dadobugbedrockores.shattering", "Shattering");
        add("enchantment.dadobugbedrockores.curse_of_fracturing", "Curse of Fracturing");
        add("enchantment.dadobugbedrockores.extraction", "Extraction");
        add("enchantment.dadobugbedrockores.gentle_mining", "Gentle Mining");
        add("enchantment.dadobugbedrockores.curse_of_shattering", "Curse of Shattering");
        add("enchantment.dadobugbedrockores.arcane_extraction", "Arcane Extraction");
    }
}
