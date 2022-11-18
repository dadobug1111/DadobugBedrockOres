package no.dadobug.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.data.ExistingFileHelper;
import no.dadobug.EntryModule;


public class ItemModelsGen extends CustomItemModelProvider{

    public ItemModelsGen(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EntryModule.modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Vanilla
        registerBlockItem(EntryModule.BEDROCK_FRACTURED.oreItem());
        registerBlockItem(EntryModule.BEDROCK_HOLLOW_ITEM);
        registerBlockItem(EntryModule.XP_LEAK.oreItem());
        registerBlockItem(EntryModule.BEDROCK_COAL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IRON_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_GOLD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_DIAMOND_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_REDSTONE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_COPPER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_LAPIS_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_EMERALD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_WATER_ORE.oreItem());
        // Couldn't figure out how to get this to work so just using the existing model
        // withExistingParent(EntryModule.BEDROCK_WATER_ORE.oreItem().getId().getPath(), modLoc("block/bedrock_fluid_general_ore"));
        registerBlockItem(EntryModule.BEDROCK_LAVA_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_NETHER_GOLD.oreItem());
        registerBlockItem(EntryModule.BEDROCK_NETHER_QUARTZ.oreItem());
        registerBlockItem(EntryModule.BEDROCK_ANCIENT_DEBRIS.oreItem());

        // Vanilla funny
        registerBlockItem(EntryModule.BEDROCK_MILK_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_COOKIE_ORE.oreItem());

        // Techreborn
        registerBlockItem(EntryModule.BEDROCK_BAUXITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_GALENA_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IRIDIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_LEAD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_RUBY_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_SAPPHIRE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_SILVER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TIN_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_CINNABAR_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_PYRITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_SPHALERITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_PERIDOT_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_SHELDONITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_SODALITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TUNGSTEN_ORE.oreItem());

        // TConstruct
        registerBlockItem(EntryModule.BEDROCK_TC_COBALT_ORE.oreItem());

        // AE2
        // Same as the water block
        // registerBlockItem(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.oreItem());

        // Big reactors
        registerBlockItem(EntryModule.BEDROCK_ER_YELLORITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_ER_ANGLESITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_ER_BENITOITE_ORE.oreItem());

        // Bigger reactors
        registerBlockItem(EntryModule.BEDROCK_BR_URANIUM_ORE.oreItem());

        // Immersive Engineering
        registerBlockItem(EntryModule.BEDROCK_IE_ALUMINUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IE_LEAD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IE_SILVER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IE_NICKEL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IE_URANIUM_ORE.oreItem());

        // Mythic metals
        registerBlockItem(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_AQUARIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_BANGLUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_CARMOT_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_KYBER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_MANGANESE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_MORKITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_MYTHRIL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_OSMIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_PLATINUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_RUNITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_SILVER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_STARRITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_TIN_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_PALLADIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MM_STORMYX_ORE.oreItem());

        // Create
        registerBlockItem(EntryModule.BEDROCK_CR_ZINC_ORE.oreItem());

        // Mekanism
        registerBlockItem(EntryModule.BEDROCK_MK_OSMIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MK_FLUORITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MK_LEAD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MK_TIN_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MK_URANIUM_ORE.oreItem());

        // Undergarden
        registerBlockItem(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_UG_UTHERIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_UG_REGALIUM_ORE.oreItem());

        // Beyond Earth
        registerBlockItem(EntryModule.BEDROCK_BE_DESH_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_CHEESE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_OSTRUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_CALORITE_ORE.oreItem());

        // FTB IC
        registerBlockItem(EntryModule.BEDROCK_IC_TIN_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IC_LEAD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IC_ALUMINUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IC_IRIDIUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_IC_URANIUM_ORE.oreItem());

        // Malum
        registerBlockItem(EntryModule.BEDROCK_MA_SOULSTONE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.oreItem());

        // Thermal
        registerBlockItem(EntryModule.BEDROCK_TH_NITER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_SULFUR_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_TIN_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_LEAD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_SILVER_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_NICKEL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_APATITE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_CINNABAR_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_TH_OIL_ORE.oreItem());

        // Powah
        registerBlockItem(EntryModule.BEDROCK_PW_URANINITE_ORE.oreItem());




        // Vanilla
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_FRACTURED.core(), getItemTextureName(EntryModule.BEDROCK_FRACTURED.core().getId()));
        registerItemWithUncheckedTexture(EntryModule.XP_LEAK.core(), getItemTextureName(EntryModule.XP_LEAK.core().getId()));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_COAL_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.COAL)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IRON_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.RAW_IRON)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_GOLD_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.RAW_GOLD)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_DIAMOND_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.DIAMOND)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_REDSTONE_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.REDSTONE)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_COPPER_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.RAW_COPPER)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_LAPIS_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.LAPIS_LAZULI)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_EMERALD_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.EMERALD)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_WATER_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.WATER_BUCKET)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_LAVA_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.LAVA_BUCKET)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_NETHER_GOLD.core(), getItemTextureName(Registry.ITEM.getId(Items.GOLD_NUGGET)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_NETHER_QUARTZ.core(), getItemTextureName(Registry.ITEM.getId(Items.QUARTZ)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_ANCIENT_DEBRIS.core(), getItemTextureName(Registry.ITEM.getId(Items.NETHERITE_SCRAP)));

        // Vanilla funny
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MILK_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.MILK_BUCKET)));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_COOKIE_ORE.core(), getItemTextureName(Registry.ITEM.getId(Items.COOKIE)));

        // Techreborn
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BAUXITE_ORE.core(), getItemTextureName("techreborn", "dust/aluminum_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_GALENA_ORE.core(), getItemTextureName("techreborn", "dust/galena_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IRIDIUM_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_iridium"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_LEAD_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_lead"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_RUBY_ORE.core(), getItemTextureName("techreborn", "gem/ruby_gem"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_SAPPHIRE_ORE.core(), getItemTextureName("techreborn", "gem/sapphire_gem"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_SILVER_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_silver"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TIN_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_tin"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_CINNABAR_ORE.core(), getItemTextureName("techreborn", "dust/cinnabar_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_PYRITE_ORE.core(), getItemTextureName("techreborn", "dust/pyrite_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_SPHALERITE_ORE.core(), getItemTextureName("techreborn", "dust/sphalerite_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_PERIDOT_ORE.core(), getItemTextureName("techreborn", "gem/peridot_gem"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_SHELDONITE_ORE.core(), getItemTextureName("techreborn", "dust/nickel_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_SODALITE_ORE.core(), getItemTextureName("techreborn", "dust/sodalite_dust"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TUNGSTEN_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_tungsten"));

        // TConstruct
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TC_COBALT_ORE.core(), getItemTextureName("tconstruct", "materials/raw_cobalt"));

        // AE2
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.core(), getItemTextureName("ae2", "certus_quartz_crystal"));

        // Big reactors
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_ER_YELLORITE_ORE.core(), getItemTextureName("bigreactors", "yellorium_ingot"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_ER_ANGLESITE_ORE.core(), getItemTextureName("bigreactors", "anglesite_crystal"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_ER_BENITOITE_ORE.core(), getItemTextureName("bigreactors", "benitoite_crystal"));

        // Bigger reactors
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BR_URANIUM_ORE.core(), getItemTextureName("biggerreactors", "uranium_ingot"));

        // Immersive Engineering
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IE_ALUMINUM_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_aluminum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IE_LEAD_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_lead"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IE_SILVER_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_silver"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IE_NICKEL_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_nickel"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IE_URANIUM_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_uranium"));

        // Mythic metals
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_adamantite"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_AQUARIUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_aquarium"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_BANGLUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_banglum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_CARMOT_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_carmot"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_KYBER_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_kyber"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_MANGANESE_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_manganese"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_midas_gold"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_MORKITE_ORE.core(), getItemTextureName("mythicmetals","items/", "morkite"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_MYTHRIL_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_mythril"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.core(), getItemTextureName("mythicmetals","items/", "banglum_chunk"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_orichalcum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_OSMIUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_osmium"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_PALLADIUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_palladium"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_PLATINUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_platinum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_prometheum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_quadrillum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_RUNITE_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_runite"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_SILVER_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_silver"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_STARRITE_ORE.core(), getItemTextureName("mythicmetals","items/", "starrite"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_STORMYX_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_stormyx"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_TIN_ORE.core(), getItemTextureName("mythicmetals","items/", "raw_ore/raw_tin"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.core(), getItemTextureName("mythicmetals","items/", "unobtainium"));

        // Create
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_CR_ZINC_ORE.core(), getItemTextureName("create", "raw_zinc"));

        // Mekanism
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MK_FLUORITE_ORE.core(), getItemTextureName("mekanism", "fluorite_gem"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MK_OSMIUM_ORE.core(), getItemTextureName("mekanism", "raw_osmium"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MK_LEAD_ORE.core(), getItemTextureName("mekanism", "raw_lead"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MK_TIN_ORE.core(), getItemTextureName("mekanism", "raw_tin"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MK_URANIUM_ORE.core(), getItemTextureName("mekanism", "raw_uranium"));

        // Undergarden      
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core(), getItemTextureName("undergarden", "raw_cloggrum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core(), getItemTextureName("undergarden", "raw_froststeel"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core(), getItemTextureName("undergarden", "utherium_crystal"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_UG_REGALIUM_ORE.core(), getItemTextureName("undergarden", "regalium_crystal"));

        // Beyond Earth
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BE_DESH_ORE.core(), getItemTextureName("beyond_earth", "items/", "raw_desh"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BE_CHEESE_ORE.core(), getItemTextureName("beyond_earth","items/", "item_cheese"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.core(), getItemTextureName("beyond_earth","items/", "ice_shard"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BE_OSTRUM_ORE.core(), getItemTextureName("beyond_earth","items/", "raw_ostrum"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_BE_CALORITE_ORE.core(), getItemTextureName("beyond_earth","items/", "raw_calorite"));
    
        // FTB IC
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IC_TIN_ORE.core(), getItemTextureName("ftbic", "tin_chunk"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IC_LEAD_ORE.core(), getItemTextureName("ftbic", "lead_chunk"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IC_ALUMINUM_ORE.core(), getItemTextureName("ftbic", "aluminum_chunk"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IC_IRIDIUM_ORE.core(), getItemTextureName("ftbic", "iridium_chunk"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_IC_URANIUM_ORE.core(), getItemTextureName("ftbic", "uranium_chunk"));

        // Malum
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MA_SOULSTONE_ORE.core(), getItemTextureName("malum", "raw_soulstone"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MA_BRILLIANCE_ORE.core(), getItemTextureName("malum", "cluster_of_brilliance"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_MA_BLAZING_QUARTZ_ORE.core(), getItemTextureName("malum", "blazing_quartz"));

        // Thermal
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_NITER_ORE.core(), getItemTextureName("thermal", "niter"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_SULFUR_ORE.core(), getItemTextureName("thermal", "sulfur"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_TIN_ORE.core(), getItemTextureName("thermal", "raw_tin"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_LEAD_ORE.core(), getItemTextureName("thermal", "raw_lead"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_SILVER_ORE.core(), getItemTextureName("thermal", "raw_silver"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_NICKEL_ORE.core(), getItemTextureName("thermal", "raw_nickel"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_APATITE_ORE.core(), getItemTextureName("thermal", "apatite"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_CINNABAR_ORE.core(), getItemTextureName("thermal", "cinnabar"));
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_TH_OIL_ORE.core(), getItemTextureName("thermal", "bitumen"));

        // Powah
        registerItemWithUncheckedTexture(EntryModule.BEDROCK_PW_URANINITE_ORE.core(), getItemTextureName("powah", "uraninite_raw"));
    }

    private void registerBlockItem(RegistrySupplier<Item> itemSupplier) {
        String itemName = itemSupplier.getId().getPath();
        withExistingParent(itemName, modLoc("block/" + itemName));
    }

    private void registerItemWithUncheckedTexture(RegistrySupplier<Item> itemSupplier, String texture) {
        String itemName = itemSupplier.getId().getPath();
        withExistingParent(itemName, "item/generated")
            .uncheckedTexture("layer0", texture);
    }

    private String getItemTextureName(String modID, String itemName) {
        return getItemTextureName(modID, "item/", itemName);
    }

    private String getItemTextureName(Identifier identifier) {
        return getItemTextureName(identifier.getNamespace(), "item/", identifier.getPath());
    }

    private String getItemTextureName(String modID,  String subPath, String itemName) {
        return modID + ":" + subPath + itemName;
    }
    
}
