package no.dadobug.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
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

        // Undergarden
        registerBlockItem(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_UG_UTHERIUM_ORE.oreItem());

        // Beyond Earth
        registerBlockItem(EntryModule.BEDROCK_BE_DESH_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_CHEESE_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_OSTRUM_ORE.oreItem());
        registerBlockItem(EntryModule.BEDROCK_BE_CALORITE_ORE.oreItem());

        // Vanilla
        registerSimpleItem(EntryModule.BEDROCK_FRACTURED.core(), getItemTextureName(EntryModule.BEDROCK_FRACTURED.core().getId()));
        registerSimpleItem(EntryModule.XP_LEAK.core(), getItemTextureName(EntryModule.XP_LEAK.core().getId()));
        registerSimpleItem(EntryModule.BEDROCK_COAL_ORE.core(), getItemTextureName(Items.COAL.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_IRON_ORE.core(), getItemTextureName(Items.RAW_IRON.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_GOLD_ORE.core(), getItemTextureName(Items.RAW_GOLD.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_DIAMOND_ORE.core(), getItemTextureName(Items.DIAMOND.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_REDSTONE_ORE.core(), getItemTextureName(Items.REDSTONE.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_COPPER_ORE.core(), getItemTextureName(Items.RAW_COPPER.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_LAPIS_ORE.core(), getItemTextureName(Items.LAPIS_LAZULI.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_EMERALD_ORE.core(), getItemTextureName(Items.EMERALD.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_WATER_ORE.core(), getItemTextureName(Items.WATER_BUCKET.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_LAVA_ORE.core(), getItemTextureName(Items.LAVA_BUCKET.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_NETHER_GOLD.core(), getItemTextureName(Items.GOLD_NUGGET.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_NETHER_QUARTZ.core(), getItemTextureName(Items.QUARTZ.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_ANCIENT_DEBRIS.core(), getItemTextureName(Items.NETHERITE_SCRAP.getRegistryName()));

        // Vanilla funny
        registerSimpleItem(EntryModule.BEDROCK_MILK_ORE.core(), getItemTextureName(Items.MILK_BUCKET.getRegistryName()));
        registerSimpleItem(EntryModule.BEDROCK_COOKIE_ORE.core(), getItemTextureName(Items.COOKIE.getRegistryName()));

        // Techreborn
        registerSimpleItem(EntryModule.BEDROCK_BAUXITE_ORE.core(), getItemTextureName("techreborn", "dust/aluminum_dust"));
        registerSimpleItem(EntryModule.BEDROCK_GALENA_ORE.core(), getItemTextureName("techreborn", "dust/galena_dust"));
        registerSimpleItem(EntryModule.BEDROCK_IRIDIUM_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_iridium"));
        registerSimpleItem(EntryModule.BEDROCK_LEAD_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_lead"));
        registerSimpleItem(EntryModule.BEDROCK_RUBY_ORE.core(), getItemTextureName("techreborn", "gem/ruby_gem"));
        registerSimpleItem(EntryModule.BEDROCK_SAPPHIRE_ORE.core(), getItemTextureName("techreborn", "gem/sapphire_gem"));
        registerSimpleItem(EntryModule.BEDROCK_SILVER_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_silver"));
        registerSimpleItem(EntryModule.BEDROCK_TIN_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_tin"));
        registerSimpleItem(EntryModule.BEDROCK_CINNABAR_ORE.core(), getItemTextureName("techreborn", "dust/cinnabar_dust"));
        registerSimpleItem(EntryModule.BEDROCK_PYRITE_ORE.core(), getItemTextureName("techreborn", "dust/pyrite_dust"));
        registerSimpleItem(EntryModule.BEDROCK_SPHALERITE_ORE.core(), getItemTextureName("techreborn", "dust/sphalerite_dust"));
        registerSimpleItem(EntryModule.BEDROCK_PERIDOT_ORE.core(), getItemTextureName("techreborn", "gem/peridot_gem"));
        registerSimpleItem(EntryModule.BEDROCK_SHELDONITE_ORE.core(), getItemTextureName("techreborn", "dust/nickel_dust"));
        registerSimpleItem(EntryModule.BEDROCK_SODALITE_ORE.core(), getItemTextureName("techreborn", "dust/sodalite_dust"));
        registerSimpleItem(EntryModule.BEDROCK_TUNGSTEN_ORE.core(), getItemTextureName("techreborn", "rawmetal/raw_tungsten"));

        // TConstruct
        registerSimpleItem(EntryModule.BEDROCK_TC_COBALT_ORE.core(), getItemTextureName("tconstruct", "materials/raw_cobalt"));

        // AE2
        registerSimpleItem(EntryModule.BEDROCK_AE_CERTUS_QUARTZ_ORE.core(), getItemTextureName("ae2", "certus_quartz_crystal"));

        // Big reactors
        registerSimpleItem(EntryModule.BEDROCK_ER_YELLORITE_ORE.core(), getItemTextureName("bigreactors", "yellorium_ingot"));
        registerSimpleItem(EntryModule.BEDROCK_ER_ANGLESITE_ORE.core(), getItemTextureName("bigreactors", "anglesite_crystal"));
        registerSimpleItem(EntryModule.BEDROCK_ER_BENITOITE_ORE.core(), getItemTextureName("bigreactors", "benitoite_crystal"));

        // Bigger reactors
        registerSimpleItem(EntryModule.BEDROCK_BR_URANIUM_ORE.core(), getItemTextureName("biggerreactors", "uranium_ingot"));

        // Immersive Engineering
        registerSimpleItem(EntryModule.BEDROCK_IE_ALUMINUM_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_aluminum"));
        registerSimpleItem(EntryModule.BEDROCK_IE_LEAD_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_lead"));
        registerSimpleItem(EntryModule.BEDROCK_IE_SILVER_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_silver"));
        registerSimpleItem(EntryModule.BEDROCK_IE_NICKEL_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_nickel"));
        registerSimpleItem(EntryModule.BEDROCK_IE_URANIUM_ORE.core(), getItemTextureName("immersiveengineering", "metal_raw_uranium"));

        // Mythic metals
        registerSimpleItem(EntryModule.BEDROCK_MM_ADAMANTITE_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_adamantite"));
        registerSimpleItem(EntryModule.BEDROCK_MM_AQUARIUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_aquarium"));
        registerSimpleItem(EntryModule.BEDROCK_MM_BANGLUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_banglum"));
        registerSimpleItem(EntryModule.BEDROCK_MM_CARMOT_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_carmot"));
        registerSimpleItem(EntryModule.BEDROCK_MM_KYBER_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_kyber"));
        registerSimpleItem(EntryModule.BEDROCK_MM_MANGANESE_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_manganese"));
        registerSimpleItem(EntryModule.BEDROCK_MM_MIDAS_GOLD_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_midas_gold"));
        registerSimpleItem(EntryModule.BEDROCK_MM_MORKITE_ORE.core(), getItemTextureName("mythicmetals", "morkite"));
        registerSimpleItem(EntryModule.BEDROCK_MM_MYTHRIL_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_mythril"));
        registerSimpleItem(EntryModule.BEDROCK_MM_NETHER_BANGLUM_ORE.core(), getItemTextureName("mythicmetals", "banglum_chunk"));
        registerSimpleItem(EntryModule.BEDROCK_MM_ORICHALCUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_orichalcum"));
        registerSimpleItem(EntryModule.BEDROCK_MM_OSMIUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_osmium"));
        registerSimpleItem(EntryModule.BEDROCK_MM_PALLADIUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_palladium"));
        registerSimpleItem(EntryModule.BEDROCK_MM_PLATINUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_platinum"));
        registerSimpleItem(EntryModule.BEDROCK_MM_PROMETHEUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_prometheum"));
        registerSimpleItem(EntryModule.BEDROCK_MM_QUADRILLUM_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_quadrillum"));
        registerSimpleItem(EntryModule.BEDROCK_MM_RUNITE_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_runite"));
        registerSimpleItem(EntryModule.BEDROCK_MM_SILVER_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_silver"));
        registerSimpleItem(EntryModule.BEDROCK_MM_STARRITE_ORE.core(), getItemTextureName("mythicmetals", "starrite"));
        registerSimpleItem(EntryModule.BEDROCK_MM_STORMYX_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_stormyx"));
        registerSimpleItem(EntryModule.BEDROCK_MM_TIN_ORE.core(), getItemTextureName("mythicmetals", "raw_ore/raw_tin"));
        registerSimpleItem(EntryModule.BEDROCK_MM_UNOBTAINIUM_ORE.core(), getItemTextureName("mythicmetals", "unobtainium"));

        // Create
        registerSimpleItem(EntryModule.BEDROCK_CR_ZINC_ORE.core(), getItemTextureName("create", "raw_zinc"));

        // Mekanism
        registerSimpleItem(EntryModule.BEDROCK_MK_FLUORITE_ORE.core(), getItemTextureName("mekanism", "fluorite_gem"));
        registerSimpleItem(EntryModule.BEDROCK_MK_OSMIUM_ORE.core(), getItemTextureName("mekanism", "raw_osmium"));

        // Undergarden      
        registerSimpleItem(EntryModule.BEDROCK_UG_CLOGGRUM_ORE.core(), getItemTextureName("undergarden", "raw_cloggrum"));
        registerSimpleItem(EntryModule.BEDROCK_UG_FROSTSTEEL_ORE.core(), getItemTextureName("undergarden", "raw_froststeel"));
        registerSimpleItem(EntryModule.BEDROCK_UG_UTHERIUM_ORE.core(), getItemTextureName("undergarden", "utherium_crystal"));

        // Beyond Earth
        registerSimpleItem(EntryModule.BEDROCK_BE_DESH_ORE.core(), getItemTextureName("beyond_earth", "items/", "raw_desh"));
        registerSimpleItem(EntryModule.BEDROCK_BE_CHEESE_ORE.core(), getItemTextureName("beyond_earth","items/", "item_cheese"));
        registerSimpleItem(EntryModule.BEDROCK_BE_ICE_SHARD_ORE.core(), getItemTextureName("beyond_earth","items/", "ice_shard"));
        registerSimpleItem(EntryModule.BEDROCK_BE_OSTRUM_ORE.core(), getItemTextureName("beyond_earth","items/", "raw_ostrum"));
        registerSimpleItem(EntryModule.BEDROCK_BE_CALORITE_ORE.core(), getItemTextureName("beyond_earth","items/", "raw_calorite"));
    }

    private void registerBlockItem(RegistrySupplier<Item> itemSupplier) {
        String itemName = itemSupplier.getId().getPath();
        withExistingParent(itemName, modLoc("block/" + itemName));
    }

    private void registerSimpleItem(RegistrySupplier<Item> itemSupplier, String texture) {
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
