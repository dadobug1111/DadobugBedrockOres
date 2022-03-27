package no.dadobug;


import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.*;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import no.dadobug.blocks.BedrockStates;
import no.dadobug.configs.OreConfig;
import no.dadobug.enchantments.ExtractionEnchant;
import no.dadobug.enchantments.FracturingEnchant;
import no.dadobug.enchantments.ShatteringEnchantment;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class EntryModule {
    public static final String modid = "dadobugbedrockores";
    // We can use this if we don't want to use DeferredRegister
    //public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final ItemGroup ITEMGROUP = CreativeTabRegistry.create(new Identifier(modid, "item_group"), () ->
            new ItemStack(EntryModule.BEDROCK_DIAMOND_ORE.get()));



    public static final AbstractBlock.Settings DefaultBlockSettings = AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(50.0f, 0f).requiresTool();
    public static final AbstractBlock.Settings LightBlockSettings = AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(50.0f, 0f).requiresTool().luminance((state) -> 15);
    public static final  Item.Settings DefaultItemSettings = new Item.Settings().group(EntryModule.ITEMGROUP);
    public static final  Item.Settings CloakedItemSettings = new Item.Settings();
    public static final Supplier<Item.Settings> techrebornItemSettings = () -> {if(Platform.isModLoaded("techreborn")){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final Supplier<Item.Settings> tconstructItemSettings = () -> {if(Platform.isModLoaded("tconstruct")){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final Supplier<Item.Settings> ae2ItemSettings = () -> {if(Platform.isModLoaded("ae2")){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final Supplier<Item.Settings> bigreactorsItemSettings = () -> {if(Platform.isModLoaded("bigreactors")){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final Supplier<Item.Settings> biggerreactorsItemSettings = () -> {if(Platform.isModLoaded("biggerreactors")){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final Supplier<Item.Settings> immersiveengineeringItemSettings = () -> {if(Platform.isModLoaded("immersiveengineering")){return DefaultItemSettings;}else return CloakedItemSettings;};



    public static TagKey<Block> REGEN_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "regenerative_block"));
    public static TagKey<Block> FRACTURE_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "fracture-able_block"));
    public static TagKey<Block> CORE_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "contains_core"));
    public static TagKey<Block> HOLLOW_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "can_accept_core"));



    public static final DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(modid, Registry.ENCHANTMENT_KEY);
    public static final RegistrySupplier<Enchantment> SHATTERING = ENCHANTS.register("shattering", ShatteringEnchantment::new);
    public static final RegistrySupplier<Enchantment> CURSE_OF_FRACTURING = ENCHANTS.register("curse_of_fracturing", FracturingEnchant::new);
    public static final RegistrySupplier<Enchantment> EXTRACTION = ENCHANTS.register("extraction", ExtractionEnchant::new);



    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(modid, Registry.BLOCK_KEY);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(modid, Registry.ITEM_KEY);



    public static final RegistrySupplier<Block> BEDROCK_FRACTURED = BLOCKS.register("bedrock_fractured",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_FRACTURED_ITEM = ITEMS.register("bedrock_fractured",() -> new BlockItem(BEDROCK_FRACTURED.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_FRACTURED = ITEMS.register("regenerative_fractured",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_FRACTURED.get(), BedrockStates.CoreType.FRACTURED));

    public static final RegistrySupplier<Block> BEDROCK_HOLLOW = BLOCKS.register("bedrock_hollow",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_HOLLOW_ITEM = ITEMS.register("bedrock_hollow",() -> new BlockItem(BEDROCK_HOLLOW.get(), DefaultItemSettings));

    //easter egg
    public static final RegistrySupplier<Block> BEDROCK_MILK_ORE = BLOCKS.register("bedrock_milk_ore",() -> ExpectPlatformBox.newBedrockFluid(DefaultBlockSettings, true, Items.MILK_BUCKET.getDefaultStack(), java.util.Optional.ofNullable(SoundEvents.ENTITY_COW_MILK)));
    public static final RegistrySupplier<Item> BEDROCK_MILK_ORE_ITEM = ITEMS.register("bedrock_milk_ore",() -> new BlockItem(BEDROCK_MILK_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_MILK = ITEMS.register("regenerative_milk",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_MILK_ORE.get(), BedrockStates.CoreType.JOKE_FLUID_ONE));

    public static final RegistrySupplier<Block> BEDROCK_COOKIE_ORE = BLOCKS.register("bedrock_cookie_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_COOKIE_ORE_ITEM = ITEMS.register("bedrock_cookie_ore",() -> new BlockItem(BEDROCK_COOKIE_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_COOKIE = ITEMS.register("regenerative_cookie",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_COOKIE_ORE.get(), BedrockStates.CoreType.JOKE_ITEM_ONE));

    //overworld
    public static final RegistrySupplier<Block> BEDROCK_COAL_ORE = BLOCKS.register("bedrock_coal_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_COAL_ORE_ITEM = ITEMS.register("bedrock_coal_ore",() -> new BlockItem(BEDROCK_COAL_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_COAL = ITEMS.register("regenerative_coal",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_COAL_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IRON_ORE = BLOCKS.register("bedrock_iron_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IRON_ORE_ITEM = ITEMS.register("bedrock_iron_ore",() -> new BlockItem(BEDROCK_IRON_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_IRON = ITEMS.register("regenerative_iron",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_IRON_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_GOLD_ORE = BLOCKS.register("bedrock_gold_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_GOLD_ORE_ITEM = ITEMS.register("bedrock_gold_ore",() -> new BlockItem(BEDROCK_GOLD_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_GOLD = ITEMS.register("regenerative_gold",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_GOLD_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_DIAMOND_ORE = BLOCKS.register("bedrock_diamond_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_DIAMOND_ORE_ITEM = ITEMS.register("bedrock_diamond_ore",() -> new BlockItem(BEDROCK_DIAMOND_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_DIAMOND = ITEMS.register("regenerative_diamond",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_DIAMOND_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_REDSTONE_ORE = BLOCKS.register("bedrock_redstone_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_REDSTONE_ORE_ITEM = ITEMS.register("bedrock_redstone_ore",() -> new BlockItem(BEDROCK_REDSTONE_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_REDSTONE = ITEMS.register("regenerative_redstone",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_REDSTONE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_COPPER_ORE = BLOCKS.register("bedrock_copper_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_COPPER_ORE_ITEM = ITEMS.register("bedrock_copper_ore",() -> new BlockItem(BEDROCK_COPPER_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_COPPER = ITEMS.register("regenerative_copper",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_COPPER_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_LAPIS_ORE = BLOCKS.register("bedrock_lapis_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_LAPIS_ORE_ITEM = ITEMS.register("bedrock_lapis_ore",() -> new BlockItem(BEDROCK_LAPIS_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_LAPIS = ITEMS.register("regenerative_lapis",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_LAPIS_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_EMERALD_ORE = BLOCKS.register("bedrock_emerald_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_EMERALD_ORE_ITEM = ITEMS.register("bedrock_emerald_ore",() -> new BlockItem(BEDROCK_EMERALD_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_EMERALD = ITEMS.register("regenerative_emerald",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_EMERALD_ORE.get(), BedrockStates.CoreType.NORMAL));

    //fluid
    public static final RegistrySupplier<Block> BEDROCK_WATER_ORE = BLOCKS.register("bedrock_water_ore",() -> ExpectPlatformBox.newBedrockFluid(DefaultBlockSettings, true, Fluids.WATER));
    public static final RegistrySupplier<Item> BEDROCK_WATER_ORE_ITEM = ITEMS.register("bedrock_water_ore",() -> new BlockItem(BEDROCK_WATER_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_WATER = ITEMS.register("regenerative_water",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_WATER_ORE.get(), BedrockStates.CoreType.FLUID));

    public static final RegistrySupplier<Block> BEDROCK_LAVA_ORE = BLOCKS.register("bedrock_lava_ore",() -> ExpectPlatformBox.newBedrockFluid(LightBlockSettings, true, Fluids.LAVA));
    public static final RegistrySupplier<Item> BEDROCK_LAVA_ORE_ITEM = ITEMS.register("bedrock_lava_ore",() -> new BlockItem(BEDROCK_LAVA_ORE.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_LAVA = ITEMS.register("regenerative_lava",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_LAVA_ORE.get(), BedrockStates.CoreType.FLUID));

    //nether
    public static final RegistrySupplier<Block> BEDROCK_NETHER_GOLD = BLOCKS.register("bedrock_nether_gold_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_NETHER_GOLD_ITEM = ITEMS.register("bedrock_nether_gold_ore",() -> new BlockItem(BEDROCK_NETHER_GOLD.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_NETHER_GOLD = ITEMS.register("regenerative_nether_gold",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_NETHER_GOLD.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_NETHER_QUARTZ = BLOCKS.register("bedrock_nether_quartz_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_NETHER_QUARTZ_ITEM = ITEMS.register("bedrock_nether_quartz_ore",() -> new BlockItem(BEDROCK_NETHER_QUARTZ.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_NETHER_QUARTZ = ITEMS.register("regenerative_nether_quartz",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_NETHER_QUARTZ.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_ANCIENT_DEBRIS = BLOCKS.register("bedrock_ancient_debris_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_ANCIENT_DEBRIS_ITEM = ITEMS.register("bedrock_ancient_debris_ore",() -> new BlockItem(BEDROCK_ANCIENT_DEBRIS.get(), DefaultItemSettings));
    public static final RegistrySupplier<Item> REGENERATIVE_ANCIENT_DEBRIS = ITEMS.register("regenerative_ancient_debris",() -> new RegenerativeCore(DefaultItemSettings, BEDROCK_ANCIENT_DEBRIS.get(), BedrockStates.CoreType.NORMAL));


    //techreborn overworld
    public static final RegistrySupplier<Block> BEDROCK_BAUXITE_ORE = BLOCKS.register("bedrock_bauxite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_BAUXITE_ORE_ITEM = ITEMS.register("bedrock_bauxite_ore",() -> new BlockItem(BEDROCK_BAUXITE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_BAUXITE = ITEMS.register("regenerative_bauxite",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_BAUXITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_GALENA_ORE = BLOCKS.register("bedrock_galena_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_GALENA_ORE_ITEM = ITEMS.register("bedrock_galena_ore",() -> new BlockItem(BEDROCK_GALENA_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_GALENA = ITEMS.register("regenerative_galena",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_GALENA_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IRIDIUM_ORE = BLOCKS.register("bedrock_iridium_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IRIDIUM_ORE_ITEM = ITEMS.register("bedrock_iridium_ore",() -> new BlockItem(BEDROCK_IRIDIUM_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_IRIDIUM = ITEMS.register("regenerative_iridium",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_IRIDIUM_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_LEAD_ORE = BLOCKS.register("bedrock_lead_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_LEAD_ORE_ITEM = ITEMS.register("bedrock_lead_ore",() -> new BlockItem(BEDROCK_LEAD_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_LEAD = ITEMS.register("regenerative_lead",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_LEAD_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_RUBY_ORE = BLOCKS.register("bedrock_ruby_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_RUBY_ORE_ITEM = ITEMS.register("bedrock_ruby_ore",() -> new BlockItem(BEDROCK_RUBY_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_RUBY = ITEMS.register("regenerative_ruby",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_RUBY_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_SAPPHIRE_ORE = BLOCKS.register("bedrock_sapphire_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_SAPPHIRE_ORE_ITEM = ITEMS.register("bedrock_sapphire_ore",() -> new BlockItem(BEDROCK_SAPPHIRE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_SAPPHIRE = ITEMS.register("regenerative_sapphire",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_SAPPHIRE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_SILVER_ORE = BLOCKS.register("bedrock_silver_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_SILVER_ORE_ITEM = ITEMS.register("bedrock_silver_ore",() -> new BlockItem(BEDROCK_SILVER_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_SILVER = ITEMS.register("regenerative_silver",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_SILVER_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_TIN_ORE = BLOCKS.register("bedrock_tin_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_TIN_ORE_ITEM = ITEMS.register("bedrock_tin_ore",() -> new BlockItem(BEDROCK_TIN_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_TIN = ITEMS.register("regenerative_tin",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_TIN_ORE.get(), BedrockStates.CoreType.NORMAL));

    //techreborn nether
    public static final RegistrySupplier<Block> BEDROCK_CINNABAR_ORE = BLOCKS.register("bedrock_cinnabar_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_CINNABAR_ORE_ITEM = ITEMS.register("bedrock_cinnabar_ore",() -> new BlockItem(BEDROCK_CINNABAR_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_CINNABAR = ITEMS.register("regenerative_cinnabar",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_CINNABAR_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_PYRITE_ORE = BLOCKS.register("bedrock_pyrite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_PYRITE_ORE_ITEM = ITEMS.register("bedrock_pyrite_ore",() -> new BlockItem(BEDROCK_PYRITE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_PYRITE = ITEMS.register("regenerative_pyrite",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_PYRITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_SPHALERITE_ORE = BLOCKS.register("bedrock_sphalerite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_SPHALERITE_ORE_ITEM = ITEMS.register("bedrock_sphalerite_ore",() -> new BlockItem(BEDROCK_SPHALERITE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_SPHALERITE = ITEMS.register("regenerative_sphalerite",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_SPHALERITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    //techreborn end
    public static final RegistrySupplier<Block> BEDROCK_PERIDOT_ORE = BLOCKS.register("bedrock_peridot_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, false));
    public static final RegistrySupplier<Item> BEDROCK_PERIDOT_ORE_ITEM = ITEMS.register("bedrock_peridot_ore",() -> new BlockItem(BEDROCK_PERIDOT_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_PERIDOT = ITEMS.register("regenerative_peridot",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_PERIDOT_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_SHELDONITE_ORE = BLOCKS.register("bedrock_sheldonite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, false));
    public static final RegistrySupplier<Item> BEDROCK_SHELDONITE_ORE_ITEM = ITEMS.register("bedrock_sheldonite_ore",() -> new BlockItem(BEDROCK_SHELDONITE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_SHELDONITE = ITEMS.register("regenerative_sheldonite",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_SHELDONITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_SODALITE_ORE = BLOCKS.register("bedrock_sodalite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, false));
    public static final RegistrySupplier<Item> BEDROCK_SODALITE_ORE_ITEM = ITEMS.register("bedrock_sodalite_ore",() -> new BlockItem(BEDROCK_SODALITE_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_SODALITE = ITEMS.register("regenerative_sodalite",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_SODALITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_TUNGSTEN_ORE = BLOCKS.register("bedrock_tungsten_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, false));
    public static final RegistrySupplier<Item> BEDROCK_TUNGSTEN_ORE_ITEM = ITEMS.register("bedrock_tungsten_ore",() -> new BlockItem(BEDROCK_TUNGSTEN_ORE.get(), techrebornItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_TUNGSTEN = ITEMS.register("regenerative_tungsten",() -> new RegenerativeCore(techrebornItemSettings.get(), BEDROCK_TUNGSTEN_ORE.get(), BedrockStates.CoreType.NORMAL));


    //tconstruct
    public static final RegistrySupplier<Block> BEDROCK_TC_COBALT_ORE = BLOCKS.register("bedrock_tc_cobalt_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_TC_COBALT_ORE_ITEM = ITEMS.register("bedrock_tc_cobalt_ore",() -> new BlockItem(BEDROCK_TC_COBALT_ORE.get(), tconstructItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_TC_COBALT = ITEMS.register("regenerative_tc_cobalt",() -> new RegenerativeCore(tconstructItemSettings.get(), BEDROCK_TC_COBALT_ORE.get(), BedrockStates.CoreType.NORMAL));


    //ae2
    public static final RegistrySupplier<Block> BEDROCK_AE_CERTUS_QUARTZ_ORE = BLOCKS.register("bedrock_ae_certus_quartz_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_AE_CERTUS_QUARTZ_ORE_ITEM = ITEMS.register("bedrock_ae_certus_quartz_ore",() -> new BlockItem(BEDROCK_AE_CERTUS_QUARTZ_ORE.get(), ae2ItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_AE_CERTUS_QUARTZ = ITEMS.register("regenerative_ae_certus_quartz",() -> new RegenerativeCore(ae2ItemSettings.get(), BEDROCK_AE_CERTUS_QUARTZ_ORE.get(), BedrockStates.CoreType.NORMAL));


    //bigreactors (Extreme Reactors)
    public static final RegistrySupplier<Block> BEDROCK_ER_YELLORITE_ORE = BLOCKS.register("bedrock_er_yellorite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_ER_YELLORITE_ORE_ITEM = ITEMS.register("bedrock_er_yellorite_ore",() -> new BlockItem(BEDROCK_ER_YELLORITE_ORE.get(), bigreactorsItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_YELLORIUM = ITEMS.register("regenerative_er_yellorium",() -> new RegenerativeCore(bigreactorsItemSettings.get(), BEDROCK_ER_YELLORITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_ER_ANGLESITE_ORE = BLOCKS.register("bedrock_er_anglesite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, false));
    public static final RegistrySupplier<Item> BEDROCK_ER_ANGLESITE_ORE_ITEM = ITEMS.register("bedrock_er_anglesite_ore",() -> new BlockItem(BEDROCK_ER_ANGLESITE_ORE.get(), bigreactorsItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_ANGLESITE = ITEMS.register("regenerative_er_anglesite",() -> new RegenerativeCore(bigreactorsItemSettings.get(), BEDROCK_ER_ANGLESITE_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_ER_BENITOITE_ORE = BLOCKS.register("bedrock_er_benitoite_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_ER_BENITOITE_ORE_ITEM = ITEMS.register("bedrock_er_benitoite_ore",() -> new BlockItem(BEDROCK_ER_BENITOITE_ORE.get(), bigreactorsItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_BENITOITE = ITEMS.register("regenerative_er_benitoite",() -> new RegenerativeCore(bigreactorsItemSettings.get(), BEDROCK_ER_BENITOITE_ORE.get(), BedrockStates.CoreType.NORMAL));


    //biggerreactors
    public static final RegistrySupplier<Block> BEDROCK_BR_URANIUM_ORE = BLOCKS.register("bedrock_br_uranium_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_BR_URANIUM_ORE_ITEM = ITEMS.register("bedrock_br_uranium_ore",() -> new BlockItem(BEDROCK_BR_URANIUM_ORE.get(), biggerreactorsItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_BR_URANIUM = ITEMS.register("regenerative_br_uranium",() -> new RegenerativeCore(biggerreactorsItemSettings.get(), BEDROCK_BR_URANIUM_ORE.get(), BedrockStates.CoreType.NORMAL));


    //immersiveengineering
    public static final RegistrySupplier<Block> BEDROCK_IE_ALUMINUM_ORE = BLOCKS.register("bedrock_ie_aluminum_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IE_ALUMINUM_ORE_ITEM = ITEMS.register("bedrock_ie_aluminum_ore",() -> new BlockItem(BEDROCK_IE_ALUMINUM_ORE.get(), immersiveengineeringItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_ALUMINUM = ITEMS.register("regenerative_ie_aluminum",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(), BEDROCK_IE_ALUMINUM_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IE_LEAD_ORE = BLOCKS.register("bedrock_ie_lead_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IE_LEAD_ORE_ITEM = ITEMS.register("bedrock_ie_lead_ore",() -> new BlockItem(BEDROCK_IE_LEAD_ORE.get(), immersiveengineeringItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_LEAD = ITEMS.register("regenerative_ie_lead",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(), BEDROCK_IE_LEAD_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IE_SILVER_ORE = BLOCKS.register("bedrock_ie_silver_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IE_SILVER_ORE_ITEM = ITEMS.register("bedrock_ie_silver_ore",() -> new BlockItem(BEDROCK_IE_SILVER_ORE.get(), immersiveengineeringItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_SILVER = ITEMS.register("regenerative_ie_silver",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(), BEDROCK_IE_SILVER_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IE_NICKEL_ORE = BLOCKS.register("bedrock_ie_nickel_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IE_NICKEL_ORE_ITEM = ITEMS.register("bedrock_ie_nickel_ore",() -> new BlockItem(BEDROCK_IE_NICKEL_ORE.get(), immersiveengineeringItemSettings.get()));
    public static final RegistrySupplier<Item> NICKEL_IE_URANIUM = ITEMS.register("regenerative_ie_nickel",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(), BEDROCK_IE_NICKEL_ORE.get(), BedrockStates.CoreType.NORMAL));

    public static final RegistrySupplier<Block> BEDROCK_IE_URANIUM_ORE = BLOCKS.register("bedrock_ie_uranium_ore",() -> ExpectPlatformBox.newBedrockOre(DefaultBlockSettings, true));
    public static final RegistrySupplier<Item> BEDROCK_IE_URANIUM_ORE_ITEM = ITEMS.register("bedrock_ie_uranium_ore",() -> new BlockItem(BEDROCK_IE_URANIUM_ORE.get(), immersiveengineeringItemSettings.get()));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_URANIUM = ITEMS.register("regenerative_ie_uranium",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(), BEDROCK_IE_URANIUM_ORE.get(), BedrockStates.CoreType.NORMAL));




    public static void init() {
        ENCHANTS.register();
        BLOCKS.register();
        ITEMS.register();
    }

    public static void initLate() {
        OreConfig.init();
        ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return 0x3f76e4;
            }
            return BiomeColors.getWaterColor(world, pos);
        }, BEDROCK_WATER_ORE.get() );
        ColorHandlerRegistry.registerItemColors((state, tintIndex) -> 0x3f76e4, BEDROCK_WATER_ORE.get() );
        RenderTypeRegistry.register(RenderLayer.getTranslucent(), BEDROCK_WATER_ORE.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(), BEDROCK_MILK_ORE.get());
    }

}
