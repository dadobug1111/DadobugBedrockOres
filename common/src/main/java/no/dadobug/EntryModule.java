package no.dadobug;


import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.minecraft.block.*;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.TagKey;
import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import no.dadobug.configs.BlockConfigLambda;
import no.dadobug.configs.BlocksConfig;
import no.dadobug.configs.GenConfig;
import no.dadobug.configs.OreGenConfig;
import no.dadobug.enchantments.ExtractionEnchant;
import no.dadobug.enchantments.FracturingEnchant;
import no.dadobug.enchantments.ShatteringEnchantment;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class EntryModule {
    public static final String modid = "dadobugbedrockores";
    public static final BlocksConfig CONFIG = AutoConfig.register(BlocksConfig.class, GsonConfigSerializer::new).getConfig();
    // We can use this if we don't want to use DeferredRegister
    //public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final ItemGroup ITEMGROUP = CreativeTabRegistry.create(new Identifier(modid, "item_group"), () ->
            new ItemStack(EntryModule.BEDROCK_DIAMOND_ORE.get()));



    public static final AbstractBlock.Settings DefaultBlockSettings = AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(50.0f, 0f).requiresTool();
    public static final AbstractBlock.Settings LightBlockSettings = AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(50.0f, 0f).requiresTool().luminance((state) -> 15);
    public static final AbstractBlock.Settings LowLightBlockSettings = AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(50.0f, 0f).requiresTool().luminance((state) -> 1);
    public static final BlockConfigLambda<AbstractBlock.Settings> DynamicBlockSettings = (cfg) -> AbstractBlock.Settings.of(Material.STONE, MapColor.STONE_GRAY).strength(cfg.hardness, cfg.resistance).requiresTool().luminance((state) -> cfg.luminance);
    public static final  Item.Settings DefaultItemSettings = new Item.Settings().group(EntryModule.ITEMGROUP);
    public static final  Item.Settings CloakedItemSettings = new Item.Settings();
    public static final BlockConfigLambda<Item.Settings> vanillaItemSettings = (cfg) -> cfg.showOre?DefaultItemSettings:CloakedItemSettings;
    public static final BlockConfigLambda<Item.Settings> techrebornItemSettings = (cfg) -> {if(Platform.isModLoaded("techreborn") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> tconstructItemSettings = (cfg) -> {if(Platform.isModLoaded("tconstruct") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> ae2ItemSettings = (cfg) -> {if(Platform.isModLoaded("ae2") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> bigreactorsItemSettings = (cfg) -> {if(Platform.isModLoaded("bigreactors") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> biggerreactorsItemSettings = (cfg) -> {if(Platform.isModLoaded("biggerreactors") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> immersiveengineeringItemSettings = (cfg) -> {if(Platform.isModLoaded("immersiveengineering") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};
    public static final BlockConfigLambda<Item.Settings> mythicmetalsItemSettings = (cfg) -> {if(Platform.isModLoaded("mythicmetals") && cfg.showOre){return DefaultItemSettings;}else return CloakedItemSettings;};



    public static TagKey<Block> REGEN_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "regenerative_block"));
    public static TagKey<Block> FRACTURE_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "fracture-able_block"));
    public static TagKey<Block> CORE_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "contains_core"));
    public static TagKey<Block> HOLLOW_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "can_accept_core"));
    public static TagKey<Block> INDESTRUCTABLE_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "no_break"));
    public static TagKey<Block> ENCHANT_ONLY_TAG = TagKey.of(Registry.BLOCK_KEY, new Identifier("dadobugbedrockores", "enchant_break"));



    public static MutableText DEFAULT_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_power.tooltip").formatted(Formatting.GREEN);
    public static MutableText FRACTURED_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_broken.tooltip").formatted(Formatting.RED);
    public static MutableText FLUID_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_fluid.tooltip").formatted(Formatting.GREEN);
    public static MutableText JOKE_FLUID_ONE_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_joke_fluid_one.tooltip").formatted(Formatting.GOLD);
    public static MutableText JOKE_ITEM_ONE_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_joke_item_one.tooltip").formatted(Formatting.GOLD);



    public static final DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(modid, Registry.ENCHANTMENT_KEY);
    public static final RegistrySupplier<Enchantment> SHATTERING = ENCHANTS.register("shattering", ShatteringEnchantment::new);
    public static final RegistrySupplier<Enchantment> CURSE_OF_FRACTURING = ENCHANTS.register("curse_of_fracturing", FracturingEnchant::new);
    public static final RegistrySupplier<Enchantment> EXTRACTION = ENCHANTS.register("extraction", ExtractionEnchant::new);



    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(modid, Registry.BLOCK_KEY);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(modid, Registry.ITEM_KEY);


    public static final BedrockStack BEDROCK_FRACTURED = BedrockStack.BedrockStackAlteredBedrock("fractured", CONFIG.BEDROCK_FRACTURED, vanillaItemSettings, DynamicBlockSettings, true, FRACTURED_TOOLTIP);
    public static final RegistrySupplier<Block> BEDROCK_HOLLOW = BLOCKS.register("bedrock_hollow",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_HOLLOW), true));
    public static final RegistrySupplier<Item> BEDROCK_HOLLOW_ITEM = ITEMS.register("bedrock_hollow",() -> new BlockItem(BEDROCK_HOLLOW.get(), vanillaItemSettings.get(CONFIG.BEDROCK_HOLLOW)));

    //easter egg
    public static final RegistrySupplier<Block> BEDROCK_MILK_ORE = BLOCKS.register("bedrock_milk_ore",() -> ExpectPlatformBox.newBedrockFluid(DynamicBlockSettings.get(CONFIG.BEDROCK_MILK_ORE), true, Items.MILK_BUCKET.getDefaultStack(), java.util.Optional.ofNullable(SoundEvents.ENTITY_COW_MILK)));
    public static final RegistrySupplier<Item> BEDROCK_MILK_ORE_ITEM = ITEMS.register("bedrock_milk_ore",() -> new BlockItem(BEDROCK_MILK_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_MILK_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_MILK = ITEMS.register("regenerative_milk",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_MILK_ORE), BEDROCK_MILK_ORE.get(), JOKE_FLUID_ONE_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_COOKIE_ORE = BLOCKS.register("bedrock_cookie_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_COOKIE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_COOKIE_ORE_ITEM = ITEMS.register("bedrock_cookie_ore",() -> new BlockItem(BEDROCK_COOKIE_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_COOKIE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_COOKIE = ITEMS.register("regenerative_cookie",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_COOKIE_ORE), BEDROCK_COOKIE_ORE.get(), JOKE_ITEM_ONE_TOOLTIP));

    //overworld
    public static final RegistrySupplier<Block> BEDROCK_COAL_ORE = BLOCKS.register("bedrock_coal_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_COAL_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_COAL_ORE_ITEM = ITEMS.register("bedrock_coal_ore",() -> new BlockItem(BEDROCK_COAL_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_COAL_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_COAL = ITEMS.register("regenerative_coal",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_COAL_ORE), BEDROCK_COAL_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IRON_ORE = BLOCKS.register("bedrock_iron_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IRON_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IRON_ORE_ITEM = ITEMS.register("bedrock_iron_ore",() -> new BlockItem(BEDROCK_IRON_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_IRON_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IRON = ITEMS.register("regenerative_iron",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_IRON_ORE), BEDROCK_IRON_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_GOLD_ORE = BLOCKS.register("bedrock_gold_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_GOLD_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_GOLD_ORE_ITEM = ITEMS.register("bedrock_gold_ore",() -> new BlockItem(BEDROCK_GOLD_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_GOLD_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_GOLD = ITEMS.register("regenerative_gold",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_GOLD_ORE), BEDROCK_GOLD_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_DIAMOND_ORE = BLOCKS.register("bedrock_diamond_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_DIAMOND_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_DIAMOND_ORE_ITEM = ITEMS.register("bedrock_diamond_ore",() -> new BlockItem(BEDROCK_DIAMOND_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_DIAMOND_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_DIAMOND = ITEMS.register("regenerative_diamond",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_DIAMOND_ORE), BEDROCK_DIAMOND_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_REDSTONE_ORE = BLOCKS.register("bedrock_redstone_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_REDSTONE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_REDSTONE_ORE_ITEM = ITEMS.register("bedrock_redstone_ore",() -> new BlockItem(BEDROCK_REDSTONE_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_REDSTONE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_REDSTONE = ITEMS.register("regenerative_redstone",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_REDSTONE_ORE), BEDROCK_REDSTONE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_COPPER_ORE = BLOCKS.register("bedrock_copper_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_COPPER_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_COPPER_ORE_ITEM = ITEMS.register("bedrock_copper_ore",() -> new BlockItem(BEDROCK_COPPER_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_COPPER_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_COPPER = ITEMS.register("regenerative_copper",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_COPPER_ORE), BEDROCK_COPPER_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_LAPIS_ORE = BLOCKS.register("bedrock_lapis_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_LAPIS_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_LAPIS_ORE_ITEM = ITEMS.register("bedrock_lapis_ore",() -> new BlockItem(BEDROCK_LAPIS_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_LAPIS_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_LAPIS = ITEMS.register("regenerative_lapis",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_LAPIS_ORE), BEDROCK_LAPIS_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_EMERALD_ORE = BLOCKS.register("bedrock_emerald_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_EMERALD_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_EMERALD_ORE_ITEM = ITEMS.register("bedrock_emerald_ore",() -> new BlockItem(BEDROCK_EMERALD_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_EMERALD_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_EMERALD = ITEMS.register("regenerative_emerald",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_EMERALD_ORE), BEDROCK_EMERALD_ORE.get(), DEFAULT_TOOLTIP));

    //fluid
    public static final RegistrySupplier<Block> BEDROCK_WATER_ORE = BLOCKS.register("bedrock_water_ore",() -> ExpectPlatformBox.newBedrockFluid(DynamicBlockSettings.get(CONFIG.BEDROCK_WATER_ORE), true, Fluids.WATER));
    public static final RegistrySupplier<Item> BEDROCK_WATER_ORE_ITEM = ITEMS.register("bedrock_water_ore",() -> new BlockItem(BEDROCK_WATER_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_WATER_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_WATER = ITEMS.register("regenerative_water",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_WATER_ORE), BEDROCK_WATER_ORE.get(), FLUID_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_LAVA_ORE = BLOCKS.register("bedrock_lava_ore",() -> ExpectPlatformBox.newBedrockFluid(DynamicBlockSettings.get(CONFIG.BEDROCK_LAVA_ORE), true, Fluids.LAVA));
    public static final RegistrySupplier<Item> BEDROCK_LAVA_ORE_ITEM = ITEMS.register("bedrock_lava_ore",() -> new BlockItem(BEDROCK_LAVA_ORE.get(), vanillaItemSettings.get(CONFIG.BEDROCK_HOLLOW)));
    public static final RegistrySupplier<Item> REGENERATIVE_LAVA = ITEMS.register("regenerative_lava",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_HOLLOW), BEDROCK_LAVA_ORE.get(), FLUID_TOOLTIP));

    //nether
    public static final RegistrySupplier<Block> BEDROCK_NETHER_GOLD = BLOCKS.register("bedrock_nether_gold_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_NETHER_GOLD), true));
    public static final RegistrySupplier<Item> BEDROCK_NETHER_GOLD_ITEM = ITEMS.register("bedrock_nether_gold_ore",() -> new BlockItem(BEDROCK_NETHER_GOLD.get(), vanillaItemSettings.get(CONFIG.BEDROCK_NETHER_GOLD)));
    public static final RegistrySupplier<Item> REGENERATIVE_NETHER_GOLD = ITEMS.register("regenerative_nether_gold",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_NETHER_GOLD), BEDROCK_NETHER_GOLD.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_NETHER_QUARTZ = BLOCKS.register("bedrock_nether_quartz_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_NETHER_QUARTZ), true));
    public static final RegistrySupplier<Item> BEDROCK_NETHER_QUARTZ_ITEM = ITEMS.register("bedrock_nether_quartz_ore",() -> new BlockItem(BEDROCK_NETHER_QUARTZ.get(), vanillaItemSettings.get(CONFIG.BEDROCK_NETHER_QUARTZ)));
    public static final RegistrySupplier<Item> REGENERATIVE_NETHER_QUARTZ = ITEMS.register("regenerative_nether_quartz",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_NETHER_QUARTZ), BEDROCK_NETHER_QUARTZ.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_ANCIENT_DEBRIS = BLOCKS.register("bedrock_ancient_debris_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_ANCIENT_DEBRIS), true));
    public static final RegistrySupplier<Item> BEDROCK_ANCIENT_DEBRIS_ITEM = ITEMS.register("bedrock_ancient_debris_ore",() -> new BlockItem(BEDROCK_ANCIENT_DEBRIS.get(), vanillaItemSettings.get(CONFIG.BEDROCK_ANCIENT_DEBRIS)));
    public static final RegistrySupplier<Item> REGENERATIVE_ANCIENT_DEBRIS = ITEMS.register("regenerative_ancient_debris",() -> new RegenerativeCore(vanillaItemSettings.get(CONFIG.BEDROCK_ANCIENT_DEBRIS), BEDROCK_ANCIENT_DEBRIS.get(), DEFAULT_TOOLTIP));


    //techreborn overworld
    public static final RegistrySupplier<Block> BEDROCK_BAUXITE_ORE = BLOCKS.register("bedrock_bauxite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_BAUXITE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_BAUXITE_ORE_ITEM = ITEMS.register("bedrock_bauxite_ore",() -> new BlockItem(BEDROCK_BAUXITE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_BAUXITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_BAUXITE = ITEMS.register("regenerative_bauxite",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_BAUXITE_ORE), BEDROCK_BAUXITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_GALENA_ORE = BLOCKS.register("bedrock_galena_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_GALENA_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_GALENA_ORE_ITEM = ITEMS.register("bedrock_galena_ore",() -> new BlockItem(BEDROCK_GALENA_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_GALENA_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_GALENA = ITEMS.register("regenerative_galena",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_GALENA_ORE), BEDROCK_GALENA_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IRIDIUM_ORE = BLOCKS.register("bedrock_iridium_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IRIDIUM_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IRIDIUM_ORE_ITEM = ITEMS.register("bedrock_iridium_ore",() -> new BlockItem(BEDROCK_IRIDIUM_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_IRIDIUM_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IRIDIUM = ITEMS.register("regenerative_iridium",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_IRIDIUM_ORE), BEDROCK_IRIDIUM_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_LEAD_ORE = BLOCKS.register("bedrock_lead_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_LEAD_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_LEAD_ORE_ITEM = ITEMS.register("bedrock_lead_ore",() -> new BlockItem(BEDROCK_LEAD_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_LEAD_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_LEAD = ITEMS.register("regenerative_lead",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_LEAD_ORE), BEDROCK_LEAD_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_RUBY_ORE = BLOCKS.register("bedrock_ruby_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_RUBY_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_RUBY_ORE_ITEM = ITEMS.register("bedrock_ruby_ore",() -> new BlockItem(BEDROCK_RUBY_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_RUBY_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_RUBY = ITEMS.register("regenerative_ruby",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_RUBY_ORE), BEDROCK_RUBY_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_SAPPHIRE_ORE = BLOCKS.register("bedrock_sapphire_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_SAPPHIRE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_SAPPHIRE_ORE_ITEM = ITEMS.register("bedrock_sapphire_ore",() -> new BlockItem(BEDROCK_SAPPHIRE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_SAPPHIRE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_SAPPHIRE = ITEMS.register("regenerative_sapphire",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_SAPPHIRE_ORE), BEDROCK_SAPPHIRE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_SILVER_ORE = BLOCKS.register("bedrock_silver_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_SILVER_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_SILVER_ORE_ITEM = ITEMS.register("bedrock_silver_ore",() -> new BlockItem(BEDROCK_SILVER_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_SILVER_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_SILVER = ITEMS.register("regenerative_silver",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_SILVER_ORE), BEDROCK_SILVER_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_TIN_ORE = BLOCKS.register("bedrock_tin_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_TIN_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_TIN_ORE_ITEM = ITEMS.register("bedrock_tin_ore",() -> new BlockItem(BEDROCK_TIN_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_TIN_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_TIN = ITEMS.register("regenerative_tin",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_TIN_ORE), BEDROCK_TIN_ORE.get(), DEFAULT_TOOLTIP));

    //techreborn nether
    public static final RegistrySupplier<Block> BEDROCK_CINNABAR_ORE = BLOCKS.register("bedrock_cinnabar_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_CINNABAR_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_CINNABAR_ORE_ITEM = ITEMS.register("bedrock_cinnabar_ore",() -> new BlockItem(BEDROCK_CINNABAR_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_CINNABAR_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_CINNABAR = ITEMS.register("regenerative_cinnabar",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_CINNABAR_ORE), BEDROCK_CINNABAR_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_PYRITE_ORE = BLOCKS.register("bedrock_pyrite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_PYRITE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_PYRITE_ORE_ITEM = ITEMS.register("bedrock_pyrite_ore",() -> new BlockItem(BEDROCK_PYRITE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_PYRITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_PYRITE = ITEMS.register("regenerative_pyrite",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_PYRITE_ORE), BEDROCK_PYRITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_SPHALERITE_ORE = BLOCKS.register("bedrock_sphalerite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_SPHALERITE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_SPHALERITE_ORE_ITEM = ITEMS.register("bedrock_sphalerite_ore",() -> new BlockItem(BEDROCK_SPHALERITE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_SPHALERITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_SPHALERITE = ITEMS.register("regenerative_sphalerite",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_SPHALERITE_ORE), BEDROCK_SPHALERITE_ORE.get(), DEFAULT_TOOLTIP));

    //techreborn end
    public static final RegistrySupplier<Block> BEDROCK_PERIDOT_ORE = BLOCKS.register("bedrock_peridot_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_PERIDOT_ORE), false));
    public static final RegistrySupplier<Item> BEDROCK_PERIDOT_ORE_ITEM = ITEMS.register("bedrock_peridot_ore",() -> new BlockItem(BEDROCK_PERIDOT_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_PERIDOT_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_PERIDOT = ITEMS.register("regenerative_peridot",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_PERIDOT_ORE), BEDROCK_PERIDOT_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_SHELDONITE_ORE = BLOCKS.register("bedrock_sheldonite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_SHELDONITE_ORE), false));
    public static final RegistrySupplier<Item> BEDROCK_SHELDONITE_ORE_ITEM = ITEMS.register("bedrock_sheldonite_ore",() -> new BlockItem(BEDROCK_SHELDONITE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_SHELDONITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_SHELDONITE = ITEMS.register("regenerative_sheldonite",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_SHELDONITE_ORE), BEDROCK_SHELDONITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_SODALITE_ORE = BLOCKS.register("bedrock_sodalite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_SODALITE_ORE), false));
    public static final RegistrySupplier<Item> BEDROCK_SODALITE_ORE_ITEM = ITEMS.register("bedrock_sodalite_ore",() -> new BlockItem(BEDROCK_SODALITE_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_SODALITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_SODALITE = ITEMS.register("regenerative_sodalite",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_SODALITE_ORE), BEDROCK_SODALITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_TUNGSTEN_ORE = BLOCKS.register("bedrock_tungsten_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_TUNGSTEN_ORE), false));
    public static final RegistrySupplier<Item> BEDROCK_TUNGSTEN_ORE_ITEM = ITEMS.register("bedrock_tungsten_ore",() -> new BlockItem(BEDROCK_TUNGSTEN_ORE.get(), techrebornItemSettings.get(CONFIG.BEDROCK_TUNGSTEN_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_TUNGSTEN = ITEMS.register("regenerative_tungsten",() -> new RegenerativeCore(techrebornItemSettings.get(CONFIG.BEDROCK_TUNGSTEN_ORE), BEDROCK_TUNGSTEN_ORE.get(), DEFAULT_TOOLTIP));


    //tconstruct
    public static final RegistrySupplier<Block> BEDROCK_TC_COBALT_ORE = BLOCKS.register("bedrock_tc_cobalt_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_TC_COBALT_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_TC_COBALT_ORE_ITEM = ITEMS.register("bedrock_tc_cobalt_ore",() -> new BlockItem(BEDROCK_TC_COBALT_ORE.get(), tconstructItemSettings.get(CONFIG.BEDROCK_TC_COBALT_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_TC_COBALT = ITEMS.register("regenerative_tc_cobalt",() -> new RegenerativeCore(tconstructItemSettings.get(CONFIG.BEDROCK_TC_COBALT_ORE), BEDROCK_TC_COBALT_ORE.get(), DEFAULT_TOOLTIP));


    //ae2
    public static final RegistrySupplier<Block> BEDROCK_AE_CERTUS_QUARTZ_ORE = BLOCKS.register("bedrock_ae_certus_quartz_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_AE_CERTUS_QUARTZ_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_AE_CERTUS_QUARTZ_ORE_ITEM = ITEMS.register("bedrock_ae_certus_quartz_ore",() -> new BlockItem(BEDROCK_AE_CERTUS_QUARTZ_ORE.get(), ae2ItemSettings.get(CONFIG.BEDROCK_AE_CERTUS_QUARTZ_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_AE_CERTUS_QUARTZ = ITEMS.register("regenerative_ae_certus_quartz",() -> new RegenerativeCore(ae2ItemSettings.get(CONFIG.BEDROCK_AE_CERTUS_QUARTZ_ORE), BEDROCK_AE_CERTUS_QUARTZ_ORE.get(), DEFAULT_TOOLTIP));


    //bigreactors (Extreme Reactors)
    public static final RegistrySupplier<Block> BEDROCK_ER_YELLORITE_ORE = BLOCKS.register("bedrock_er_yellorite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_ER_YELLORITE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_ER_YELLORITE_ORE_ITEM = ITEMS.register("bedrock_er_yellorite_ore",() -> new BlockItem(BEDROCK_ER_YELLORITE_ORE.get(), bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_YELLORITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_YELLORIUM = ITEMS.register("regenerative_er_yellorium",() -> new RegenerativeCore(bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_YELLORITE_ORE), BEDROCK_ER_YELLORITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_ER_ANGLESITE_ORE = BLOCKS.register("bedrock_er_anglesite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_ER_ANGLESITE_ORE), false));
    public static final RegistrySupplier<Item> BEDROCK_ER_ANGLESITE_ORE_ITEM = ITEMS.register("bedrock_er_anglesite_ore",() -> new BlockItem(BEDROCK_ER_ANGLESITE_ORE.get(), bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_ANGLESITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_ANGLESITE = ITEMS.register("regenerative_er_anglesite",() -> new RegenerativeCore(bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_ANGLESITE_ORE), BEDROCK_ER_ANGLESITE_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_ER_BENITOITE_ORE = BLOCKS.register("bedrock_er_benitoite_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_ER_BENITOITE_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_ER_BENITOITE_ORE_ITEM = ITEMS.register("bedrock_er_benitoite_ore",() -> new BlockItem(BEDROCK_ER_BENITOITE_ORE.get(), bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_BENITOITE_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_ER_BENITOITE = ITEMS.register("regenerative_er_benitoite",() -> new RegenerativeCore(bigreactorsItemSettings.get(CONFIG.BEDROCK_ER_BENITOITE_ORE), BEDROCK_ER_BENITOITE_ORE.get(), DEFAULT_TOOLTIP));


    //biggerreactors
    public static final RegistrySupplier<Block> BEDROCK_BR_URANIUM_ORE = BLOCKS.register("bedrock_br_uranium_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_BR_URANIUM_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_BR_URANIUM_ORE_ITEM = ITEMS.register("bedrock_br_uranium_ore",() -> new BlockItem(BEDROCK_BR_URANIUM_ORE.get(), biggerreactorsItemSettings.get(CONFIG.BEDROCK_BR_URANIUM_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_BR_URANIUM = ITEMS.register("regenerative_br_uranium",() -> new RegenerativeCore(biggerreactorsItemSettings.get(CONFIG.BEDROCK_BR_URANIUM_ORE), BEDROCK_BR_URANIUM_ORE.get(), DEFAULT_TOOLTIP));


    //immersiveengineering
    public static final RegistrySupplier<Block> BEDROCK_IE_ALUMINUM_ORE = BLOCKS.register("bedrock_ie_aluminum_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IE_ALUMINUM_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IE_ALUMINUM_ORE_ITEM = ITEMS.register("bedrock_ie_aluminum_ore",() -> new BlockItem(BEDROCK_IE_ALUMINUM_ORE.get(), immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_ALUMINUM_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_ALUMINUM = ITEMS.register("regenerative_ie_aluminum",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_ALUMINUM_ORE), BEDROCK_IE_ALUMINUM_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IE_LEAD_ORE = BLOCKS.register("bedrock_ie_lead_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IE_LEAD_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IE_LEAD_ORE_ITEM = ITEMS.register("bedrock_ie_lead_ore",() -> new BlockItem(BEDROCK_IE_LEAD_ORE.get(), immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_LEAD_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_LEAD = ITEMS.register("regenerative_ie_lead",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_LEAD_ORE), BEDROCK_IE_LEAD_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IE_SILVER_ORE = BLOCKS.register("bedrock_ie_silver_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IE_SILVER_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IE_SILVER_ORE_ITEM = ITEMS.register("bedrock_ie_silver_ore",() -> new BlockItem(BEDROCK_IE_SILVER_ORE.get(), immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_SILVER_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_SILVER = ITEMS.register("regenerative_ie_silver",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_SILVER_ORE), BEDROCK_IE_SILVER_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IE_NICKEL_ORE = BLOCKS.register("bedrock_ie_nickel_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IE_NICKEL_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IE_NICKEL_ORE_ITEM = ITEMS.register("bedrock_ie_nickel_ore",() -> new BlockItem(BEDROCK_IE_NICKEL_ORE.get(), immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_NICKEL_ORE)));
    public static final RegistrySupplier<Item> NICKEL_IE_URANIUM = ITEMS.register("regenerative_ie_nickel",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_NICKEL_ORE), BEDROCK_IE_NICKEL_ORE.get(), DEFAULT_TOOLTIP));

    public static final RegistrySupplier<Block> BEDROCK_IE_URANIUM_ORE = BLOCKS.register("bedrock_ie_uranium_ore",() -> ExpectPlatformBox.newBedrockOre(DynamicBlockSettings.get(CONFIG.BEDROCK_IE_URANIUM_ORE), true));
    public static final RegistrySupplier<Item> BEDROCK_IE_URANIUM_ORE_ITEM = ITEMS.register("bedrock_ie_uranium_ore",() -> new BlockItem(BEDROCK_IE_URANIUM_ORE.get(), immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_URANIUM_ORE)));
    public static final RegistrySupplier<Item> REGENERATIVE_IE_URANIUM = ITEMS.register("regenerative_ie_uranium",() -> new RegenerativeCore(immersiveengineeringItemSettings.get(CONFIG.BEDROCK_IE_URANIUM_ORE), BEDROCK_IE_URANIUM_ORE.get(), DEFAULT_TOOLTIP));


    //mythicmetals overworld
    public static final BedrockStack BEDROCK_MM_ADAMANTITE_ORE = BedrockStack.BedrockStackStandardOre("mm_adamantite", CONFIG.BEDROCK_MM_ADAMANTITE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_AQUARIUM_ORE = BedrockStack.BedrockStackStandardOre("mm_aquarium", CONFIG.BEDROCK_MM_AQUARIUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_BANGLUM_ORE = BedrockStack.BedrockStackStandardOre("mm_banglum", CONFIG.BEDROCK_MM_BANGLUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_CARMOT_ORE = BedrockStack.BedrockStackStandardOre("mm_carmot", CONFIG.BEDROCK_MM_CARMOT_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_KYBER_ORE = BedrockStack.BedrockStackStandardOre("mm_kyber", CONFIG.BEDROCK_MM_KYBER_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_MANGANESE_ORE = BedrockStack.BedrockStackStandardOre("mm_maganese", CONFIG.BEDROCK_MM_MANGANESE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_MORKITE_ORE = BedrockStack.BedrockStackStandardOre("mm_morkite", CONFIG.BEDROCK_MM_MORKITE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_MYTHRIL_ORE = BedrockStack.BedrockStackStandardOre("mm_mythril", CONFIG.BEDROCK_MM_MYTHRIL_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_ORICHALCUM_ORE = BedrockStack.BedrockStackStandardOre("mm_orichalcum", CONFIG.BEDROCK_MM_ORICHALCUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_OSMIUM_ORE = BedrockStack.BedrockStackStandardOre("mm_osmium", CONFIG.BEDROCK_MM_OSMIUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_PLATINUM_ORE = BedrockStack.BedrockStackStandardOre("mm_platinum", CONFIG.BEDROCK_MM_PLATINUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_PROMETHEUM_ORE = BedrockStack.BedrockStackStandardOre("mm_prometheum", CONFIG.BEDROCK_MM_PROMETHEUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_QUADRILLUM_ORE = BedrockStack.BedrockStackStandardOre("mm_quadrillum", CONFIG.BEDROCK_MM_QUADRILLUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_RUNITE_ORE = BedrockStack.BedrockStackStandardOre("mm_runite", CONFIG.BEDROCK_MM_RUNITE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_SILVER_ORE = BedrockStack.BedrockStackStandardOre("mm_silver", CONFIG.BEDROCK_MM_SILVER_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_STARRITE_ORE = BedrockStack.BedrockStackStandardOre("mm_starrite", CONFIG.BEDROCK_MM_STARRITE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_TIN_ORE = BedrockStack.BedrockStackStandardOre("mm_tin", CONFIG.BEDROCK_MM_TIN_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_UNOBTAINIUM_ORE = BedrockStack.BedrockStackStandardOre("mm_unobtainium", CONFIG.BEDROCK_MM_UNOBTAINIUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);

    //mythicmetals nether
    public static final BedrockStack BEDROCK_MM_NETHER_BANGLUM_ORE = BedrockStack.BedrockStackStandardOre("mm_nether_banglum", CONFIG.BEDROCK_MM_NETHER_BANGLUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_MIDAS_GOLD_ORE = BedrockStack.BedrockStackStandardOre("mm_midas_gold", CONFIG.BEDROCK_MM_MIDAS_GOLD_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_PALLADIUM_ORE = BedrockStack.BedrockStackStandardOre("mm_palladium", CONFIG.BEDROCK_MM_PALLADIUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_STORMYX_ORE = BedrockStack.BedrockStackStandardOre("mm_stormyx", CONFIG.BEDROCK_MM_STORMYX_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    public static void init() {
        ENCHANTS.register();
        BLOCKS.register();
        ITEMS.register();
    }

    public static void initLate(boolean isClient) {
        OreGenConfig.init();
        if(isClient) {
            ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return 0x3f76e4;
                }
                return BiomeColors.getWaterColor(world, pos);
            }, BEDROCK_WATER_ORE.get());
            ColorHandlerRegistry.registerItemColors((state, tintIndex) -> 0x3f76e4, BEDROCK_WATER_ORE.get());
            RenderTypeRegistry.register(RenderLayer.getTranslucent(), BEDROCK_WATER_ORE.get());
            RenderTypeRegistry.register(RenderLayer.getTranslucent(), BEDROCK_MILK_ORE.get());
        }
    }

}
