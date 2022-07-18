package no.dadobug;


import com.google.gson.JsonObject;
import dev.architectury.core.AbstractRecipeSerializer;
import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.TagKey;
import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import no.dadobug.blocks.HollowBedrock;
import no.dadobug.blocks.RegenerativeBlock;
import no.dadobug.blocks.RegenerativeBlockEntity;
import no.dadobug.configs.BlockConfigLambda;
import no.dadobug.configs.BlocksConfig;
import no.dadobug.configs.EnchantmentsConfig;
import no.dadobug.configs.OreGenConfig;
import no.dadobug.enchantments.*;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class EntryModule {
    public static final String modid = "dadobugbedrockores";
    public static final BlocksConfig CONFIG = AutoConfig.register(BlocksConfig.class, GsonConfigSerializer::new).getConfig();
    public static final EnchantmentsConfig ENCHANT_CONFIG = AutoConfig.register(EnchantmentsConfig.class, GsonConfigSerializer::new).getConfig();
    public static final Logger LOGGER = LoggerFactory.getLogger(modid);

    // We can use this if we don't want to use DeferredRegister
    //public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final ItemGroup ITEMGROUP = CreativeTabRegistry.create(new Identifier(modid, "item_group"), () ->
            new ItemStack(EntryModule.BEDROCK_DIAMOND_ORE.ore().get()));



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

    public static TagKey<Item> IS_CORE_TAG = TagKey.of(Registry.ITEM_KEY, new Identifier("dadobugbedrockores", "is_core"));



    public static MutableText DEFAULT_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_power.tooltip").formatted(Formatting.GREEN);
    public static MutableText FRACTURED_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_broken.tooltip").formatted(Formatting.RED);
    public static MutableText FLUID_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_fluid.tooltip").formatted(Formatting.GREEN);
    public static MutableText JOKE_FLUID_ONE_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_joke_fluid_one.tooltip").formatted(Formatting.GOLD);
    public static MutableText JOKE_ITEM_ONE_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_joke_item_one.tooltip").formatted(Formatting.GOLD);
    public static MutableText XP_TOOLTIP = new TranslatableText("item.dadobugbedrockores.regen_xp.tooltip").formatted(Formatting.AQUA);



    public static final DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(modid, Registry.ENCHANTMENT_KEY);
    public static final RegistrySupplier<Enchantment> SHATTERING = ENCHANTS.register("shattering", () -> new ShatteringEnchantment(ENCHANT_CONFIG.SHATTERING));
    public static final RegistrySupplier<Enchantment> CURSE_OF_FRACTURING = ENCHANTS.register("curse_of_fracturing", () -> new FracturingEnchant(ENCHANT_CONFIG.CURSE_OF_FRACTURING));
    public static final RegistrySupplier<Enchantment> EXTRACTION = ENCHANTS.register("extraction", () -> new ExtractionEnchant(ENCHANT_CONFIG.EXTRACTION));
    public static final RegistrySupplier<Enchantment> GENTLE_MINING = ENCHANTS.register("gentle_mining", () -> new GentleMiningEnchant(ENCHANT_CONFIG.GENTLE_MINING));
    public static final RegistrySupplier<Enchantment> CURSE_OF_SHATTERING = ENCHANTS.register("curse_of_shattering", () -> new CursedShatteringEnchant(ENCHANT_CONFIG.CURSE_OF_SHATTERING));
    public static final RegistrySupplier<Enchantment> ARCANE_EXTRACTION = ENCHANTS.register("arcane_extraction", () -> new ArcaneExtractionEnchant(ENCHANT_CONFIG.ARCANE_EXTRACTION));



    public static final DeferredRegister<Block> REGENERATIVE_BLOCKS = DeferredRegister.create(modid, Registry.BLOCK_KEY);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(modid, Registry.ITEM_KEY);
    //public static final DeferredRegister<RecipeSerializer<?>> RECIPES = DeferredRegister.create(modid, Registry.RECIPE_SERIALIZER_KEY)
    //public static final ShapedRecipeJsonBuilder builder = new ShapedRecipeJsonBuilder(Items.ACACIA_BOAT, 2);


    //public static final RegistrySupplier<RecipeSerializer<?>> TEST_RECIPE = RECIPES.register("test",() -> );



    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(modid, Registry.BLOCK_ENTITY_TYPE_KEY);
    public static RegistrySupplier<BlockEntityType<RegenerativeBlockEntity>> REGENERATIVEBLOCKTYPE = BLOCK_ENTITY_TYPES.register("", () -> {
        ArrayList<Block> RegenerativeBlockList = new ArrayList<>();
        REGENERATIVE_BLOCKS.iterator().forEachRemaining((supplier) -> RegenerativeBlockList.add(supplier.get()));
        return BlockEntityType.Builder.create(RegenerativeBlockEntity::new, RegenerativeBlockList.toArray(new Block[0])).build(null);
    });




    public static final BedrockStack BEDROCK_FRACTURED = BedrockStack.BedrockStackAlteredBedrock("fractured", CONFIG.BEDROCK_FRACTURED, vanillaItemSettings, DynamicBlockSettings, true, FRACTURED_TOOLTIP);
    public static final RegistrySupplier<Block> BEDROCK_HOLLOW = REGENERATIVE_BLOCKS.register("bedrock_hollow",() -> new HollowBedrock(DynamicBlockSettings.get(CONFIG.BEDROCK_HOLLOW), true, CONFIG.BEDROCK_HOLLOW.XPmin, CONFIG.BEDROCK_HOLLOW.XPmax, CONFIG.BEDROCK_HOLLOW.DurabilityMin, CONFIG.BEDROCK_HOLLOW.DurabilityMax, CONFIG.BEDROCK_HOLLOW.infinite, false, Blocks.BEDROCK.getDefaultState()));
    public static final RegistrySupplier<Item> BEDROCK_HOLLOW_ITEM = ITEMS.register("bedrock_hollow",() -> new BlockItem(BEDROCK_HOLLOW.get(), vanillaItemSettings.get(CONFIG.BEDROCK_HOLLOW)));
    public static final BedrockStack XP_LEAK = BedrockStack.BedrockStackXPLeak("xp_leak", CONFIG.XP_LEAK, vanillaItemSettings, DynamicBlockSettings, true, XP_TOOLTIP);

    //easter egg
    public static final BedrockStack BEDROCK_MILK_ORE = BedrockStack.BedrockStackFluidOre("milk", CONFIG.BEDROCK_MILK_ORE, vanillaItemSettings, DynamicBlockSettings, true, JOKE_FLUID_ONE_TOOLTIP, Items.MILK_BUCKET.getDefaultStack(), java.util.Optional.ofNullable(SoundEvents.ENTITY_COW_MILK));
    public static final BedrockStack BEDROCK_COOKIE_ORE = BedrockStack.BedrockStackStandardOre("cookie", CONFIG.BEDROCK_COOKIE_ORE, vanillaItemSettings, DynamicBlockSettings, true, JOKE_ITEM_ONE_TOOLTIP);

    //overworld
    public static final BedrockStack BEDROCK_COAL_ORE = BedrockStack.BedrockStackStandardOre("coal", CONFIG.BEDROCK_COAL_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IRON_ORE = BedrockStack.BedrockStackStandardOre("iron", CONFIG.BEDROCK_IRON_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_GOLD_ORE = BedrockStack.BedrockStackStandardOre("gold", CONFIG.BEDROCK_GOLD_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_DIAMOND_ORE = BedrockStack.BedrockStackStandardOre("diamond", CONFIG.BEDROCK_DIAMOND_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_REDSTONE_ORE = BedrockStack.BedrockStackStandardOre("redstone", CONFIG.BEDROCK_REDSTONE_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_COPPER_ORE = BedrockStack.BedrockStackStandardOre("copper", CONFIG.BEDROCK_COPPER_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_LAPIS_ORE = BedrockStack.BedrockStackStandardOre("lapis", CONFIG.BEDROCK_LAPIS_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_EMERALD_ORE = BedrockStack.BedrockStackStandardOre("emerald", CONFIG.BEDROCK_EMERALD_ORE, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);

    //fluid
    public static final BedrockStack BEDROCK_WATER_ORE = BedrockStack.BedrockStackFluidOre("water", CONFIG.BEDROCK_WATER_ORE, vanillaItemSettings, DynamicBlockSettings, true, FLUID_TOOLTIP, Fluids.WATER);
    public static final BedrockStack BEDROCK_LAVA_ORE = BedrockStack.BedrockStackFluidOre("lava", CONFIG.BEDROCK_LAVA_ORE, vanillaItemSettings, DynamicBlockSettings, true, FLUID_TOOLTIP, Fluids.LAVA);

    //nether
    public static final BedrockStack BEDROCK_NETHER_GOLD = BedrockStack.BedrockStackStandardOre("nether_gold", CONFIG.BEDROCK_NETHER_GOLD, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_NETHER_QUARTZ = BedrockStack.BedrockStackStandardOre("nether_quartz", CONFIG.BEDROCK_NETHER_QUARTZ, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_ANCIENT_DEBRIS = BedrockStack.BedrockStackStandardOre("ancient_debris", CONFIG.BEDROCK_ANCIENT_DEBRIS, vanillaItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //techreborn overworld
    public static final BedrockStack BEDROCK_BAUXITE_ORE = BedrockStack.BedrockStackStandardOre("bauxite", CONFIG.BEDROCK_BAUXITE_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_GALENA_ORE = BedrockStack.BedrockStackStandardOre("galena", CONFIG.BEDROCK_GALENA_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IRIDIUM_ORE = BedrockStack.BedrockStackStandardOre("iridium", CONFIG.BEDROCK_IRIDIUM_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_LEAD_ORE = BedrockStack.BedrockStackStandardOre("lead", CONFIG.BEDROCK_LEAD_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_RUBY_ORE = BedrockStack.BedrockStackStandardOre("ruby", CONFIG.BEDROCK_RUBY_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_SAPPHIRE_ORE = BedrockStack.BedrockStackStandardOre("sapphire", CONFIG.BEDROCK_SAPPHIRE_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_SILVER_ORE = BedrockStack.BedrockStackStandardOre("silver", CONFIG.BEDROCK_SILVER_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_TIN_ORE = BedrockStack.BedrockStackStandardOre("tin", CONFIG.BEDROCK_TIN_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);

    //techreborn nether
    public static final BedrockStack BEDROCK_CINNABAR_ORE = BedrockStack.BedrockStackStandardOre("cinnabar", CONFIG.BEDROCK_CINNABAR_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_PYRITE_ORE = BedrockStack.BedrockStackStandardOre("pyrite", CONFIG.BEDROCK_PYRITE_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_SPHALERITE_ORE = BedrockStack.BedrockStackStandardOre("sphalerite", CONFIG.BEDROCK_SPHALERITE_ORE, techrebornItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);

    //techreborn end
    public static final BedrockStack BEDROCK_PERIDOT_ORE = BedrockStack.BedrockStackStandardOre("peridot", CONFIG.BEDROCK_PERIDOT_ORE, techrebornItemSettings, DynamicBlockSettings, false, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_SHELDONITE_ORE = BedrockStack.BedrockStackStandardOre("sheldonite", CONFIG.BEDROCK_SHELDONITE_ORE, techrebornItemSettings, DynamicBlockSettings, false, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_SODALITE_ORE = BedrockStack.BedrockStackStandardOre("sodalite", CONFIG.BEDROCK_SODALITE_ORE, techrebornItemSettings, DynamicBlockSettings, false, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_TUNGSTEN_ORE = BedrockStack.BedrockStackStandardOre("tungsten", CONFIG.BEDROCK_TUNGSTEN_ORE, techrebornItemSettings, DynamicBlockSettings, false, DEFAULT_TOOLTIP);


    //tconstruct
    public static final BedrockStack BEDROCK_TC_COBALT_ORE = BedrockStack.BedrockStackStandardOre("tc_cobalt", CONFIG.BEDROCK_TC_COBALT_ORE, tconstructItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //ae2
    public static final BedrockStack BEDROCK_AE_CERTUS_QUARTZ_ORE = BedrockStack.BedrockStackStandardOre("ae_certus_quartz", CONFIG.BEDROCK_AE_CERTUS_QUARTZ_ORE, ae2ItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //bigreactors (Extreme Reactors)
    public static final BedrockStack BEDROCK_ER_YELLORITE_ORE = BedrockStack.BedrockStackStandardOre("er_yellorite", CONFIG.BEDROCK_ER_YELLORITE_ORE, bigreactorsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_ER_ANGLESITE_ORE = BedrockStack.BedrockStackStandardOre("er_anglesite", CONFIG.BEDROCK_ER_ANGLESITE_ORE, bigreactorsItemSettings, DynamicBlockSettings, false, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_ER_BENITOITE_ORE = BedrockStack.BedrockStackStandardOre("er_benitoite", CONFIG.BEDROCK_ER_BENITOITE_ORE, bigreactorsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //biggerreactors
    public static final BedrockStack BEDROCK_BR_URANIUM_ORE = BedrockStack.BedrockStackStandardOre("br_uranium", CONFIG.BEDROCK_BR_URANIUM_ORE, biggerreactorsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //immersiveengineering
    public static final BedrockStack BEDROCK_IE_ALUMINUM_ORE = BedrockStack.BedrockStackStandardOre("ie_aluminum", CONFIG.BEDROCK_IE_ALUMINUM_ORE, immersiveengineeringItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IE_LEAD_ORE = BedrockStack.BedrockStackStandardOre("ie_lead", CONFIG.BEDROCK_IE_LEAD_ORE, immersiveengineeringItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IE_SILVER_ORE = BedrockStack.BedrockStackStandardOre("ie_silver", CONFIG.BEDROCK_IE_SILVER_ORE, immersiveengineeringItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IE_NICKEL_ORE = BedrockStack.BedrockStackStandardOre("ie_nickel", CONFIG.BEDROCK_IE_NICKEL_ORE, immersiveengineeringItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_IE_URANIUM_ORE = BedrockStack.BedrockStackStandardOre("ie_uranium", CONFIG.BEDROCK_IE_URANIUM_ORE, immersiveengineeringItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);


    //mythicmetals overworld
    public static final BedrockStack BEDROCK_MM_ADAMANTITE_ORE = BedrockStack.BedrockStackStandardOre("mm_adamantite", CONFIG.BEDROCK_MM_ADAMANTITE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_AQUARIUM_ORE = BedrockStack.BedrockStackStandardOre("mm_aquarium", CONFIG.BEDROCK_MM_AQUARIUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_BANGLUM_ORE = BedrockStack.BedrockStackStandardOre("mm_banglum", CONFIG.BEDROCK_MM_BANGLUM_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_CARMOT_ORE = BedrockStack.BedrockStackStandardOre("mm_carmot", CONFIG.BEDROCK_MM_CARMOT_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_KYBER_ORE = BedrockStack.BedrockStackStandardOre("mm_kyber", CONFIG.BEDROCK_MM_KYBER_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
    public static final BedrockStack BEDROCK_MM_MANGANESE_ORE = BedrockStack.BedrockStackStandardOre("mm_manganese", CONFIG.BEDROCK_MM_MANGANESE_ORE, mythicmetalsItemSettings, DynamicBlockSettings, true, DEFAULT_TOOLTIP);
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
        REGENERATIVE_BLOCKS.register();
        ITEMS.register();
        BLOCK_ENTITY_TYPES.register();
    }

    public static void initLate(boolean isClient) {
        //ArrayList<JsonObject> object = new ArrayList<>();
        //builder.offerTo((RecipeJsonProviderA) -> object.add(RecipeJsonProviderA.toJson()));
        OreGenConfig.init();
        if(isClient) {
            ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return 0x3f76e4;
                }
                return BiomeColors.getWaterColor(world, pos);
            }, BEDROCK_WATER_ORE.ore().get());
            ColorHandlerRegistry.registerItemColors((state, tintIndex) -> 0x3f76e4, BEDROCK_WATER_ORE.ore().get());
            RenderTypeRegistry.register(RenderLayer.getCutout(), BEDROCK_WATER_ORE.ore().get());
            RenderTypeRegistry.register(RenderLayer.getCutout(), BEDROCK_MILK_ORE.ore().get());
        }
    }

}
