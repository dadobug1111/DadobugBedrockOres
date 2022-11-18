package no.dadobug.datagen;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import net.minecraft.data.DataWriter;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import no.dadobug.ModLoadedLootCondition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.block.Block;
import net.minecraft.data.DataCache;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.server.LootTableProvider;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.InvertedLootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.CopyNbtLootFunction;
import net.minecraft.loot.provider.nbt.ContextLootNbtProvider;
import net.minecraft.predicate.NumberRange.IntRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;
import no.dadobug.BedrockStack;
import no.dadobug.EntryModule;
import net.minecraft.loot.*;

/*
 * A base loot table generator that provides helpful methods to create
 * the required bedrock ore loot tables
 */
//blockdrops now conditional on if the host mod is present (Ex: modded coal ores will not drop from bedrock coal ore if said mod is not loaded)
public abstract class BaseBedrockLootTableGen extends LootTableProvider{

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;
    
    public BaseBedrockLootTableGen(DataGenerator generator) {
        super(generator);
        this.generator = generator;
    }

    protected abstract void addTables();

    /*
     * Creates a loot pool that drops the same items as the given block
     * after checking that the tool doesn't have several enchantments
     */
    private LootPool.Builder bedrockOreRegularLootPool(String tableName, Identifier... blockDropTable) {
        LootPool.Builder builder = LootPool.builder()
            .name(tableName)
            .conditionally(
                InvertedLootCondition.builder(
                    MatchToolLootCondition.builder(
                        ItemPredicate.Builder.create().enchantment(
                            new EnchantmentPredicate(EntryModule.CURSE_OF_FRACTURING.get(), IntRange.atLeast(1))))))
            .conditionally(
                InvertedLootCondition.builder(
                    MatchToolLootCondition.builder(
                        ItemPredicate.Builder.create().enchantment(
                            new EnchantmentPredicate(EntryModule.EXTRACTION.get(), IntRange.atLeast(1))))))
            .conditionally(
                InvertedLootCondition.builder(
                    MatchToolLootCondition.builder(
                        ItemPredicate.Builder.create().enchantment(
                            new EnchantmentPredicate(EntryModule.CURSE_OF_SHATTERING.get(), IntRange.atLeast(1))))))
            .conditionally(
                InvertedLootCondition.builder(
                    MatchToolLootCondition.builder(
                        ItemPredicate.Builder.create().enchantment(
                            new EnchantmentPredicate(EntryModule.ARCANE_EXTRACTION.get(), IntRange.atLeast(1))))));
        //adds conditions here
        //also adds multi-ore drops here
        Arrays.stream(blockDropTable).forEach((id) -> {
            if(Objects.equals(id.getNamespace(), "minecraft")) {
                builder.with(LootTableEntry.builder(id));
            } else {
                builder.with(LootTableEntry.builder(id)
                        .conditionally(new ModLoadedLootCondition.Builder().mod_id(id.getNamespace())));
            }
        });

        return builder;
    }

    /*
     * Creates a loot pool that drops the given item
     * after checking that the tool has the Extraction enchantment
     */
    private LootPool.Builder bedrockOreExtractionLootPool(String tableName, Item core) {
        return LootPool.builder()
            .name(tableName)
            .conditionally(
                MatchToolLootCondition.builder(
                    ItemPredicate.Builder.create().enchantment(
                        new EnchantmentPredicate(EntryModule.EXTRACTION.get(), IntRange.atLeast(1)))))
            .with(
                ItemEntry.builder(core).apply(
                    CopyNbtLootFunction.builder(ContextLootNbtProvider.BLOCK_ENTITY)
                        .withOperation("durability", "BlockEntityTag.durability")));
    }

    /*
     * Creates a loot pool that drops the given item
     * after checking that the tool has the Arcane Extraction enchantment
     */
    private LootPool.Builder bedrockOreArcaneExtractionLootPool(String tableName, Item oreItem) {
        return LootPool.builder()
            .name(tableName)
            .conditionally(
                MatchToolLootCondition.builder(
                    ItemPredicate.Builder.create().enchantment(
                        new EnchantmentPredicate(EntryModule.ARCANE_EXTRACTION.get(), IntRange.atLeast(1)))))
            .with(
                ItemEntry.builder(oreItem).apply(
                    CopyNbtLootFunction.builder(ContextLootNbtProvider.BLOCK_ENTITY)
                        .withOperation("durability", "BlockEntityTag.durability")));
    }

    /*
     * Creates and stores a loot table for the drops of a regular bedrock ore.
     * 
     * The blockDropTable should either be the identifier of the loot table you
     * want called or a new identifier with format ("modID", "pathToLootTable")
     * where pathToLootTable is from data/modID/loot_tables.
     */
    //Added Multi-ore drops (regular and deepslate, etc.)
    protected void createBedrockOreTable(String tableName, BedrockStack bedrock, Identifier... blockDropTable) {
        lootTables.put(bedrock.ore().get(), createBedrockOreTableHelper(tableName, bedrock.core().get(), bedrock.oreItem().get(), blockDropTable));
    }
    private LootTable.Builder createBedrockOreTableHelper(String tableName, Item core, Item oreItem, Identifier... blockDropTable) {
        LootPool.Builder regularLoot = bedrockOreRegularLootPool(tableName, blockDropTable);

        LootPool.Builder extractionLoot = bedrockOreExtractionLootPool(tableName, core);

        LootPool.Builder arcaneExtractionLoot = bedrockOreArcaneExtractionLootPool(tableName, oreItem);

        return LootTable.builder().pool(regularLoot).pool(extractionLoot).pool(arcaneExtractionLoot);
    }

    /*
     * Creates and stores a loot table for the drops of a liquid bedrock ore
     */
    protected void createBedrockLiquidTable(String tableName, BedrockStack bedrock) {
        lootTables.put(bedrock.ore().get(), createBedrockLiquidTableHelper(tableName, bedrock.core().get(), bedrock.oreItem().get()));
    }

    private LootTable.Builder createBedrockLiquidTableHelper(String tableName, Item core, Item oreItem) {
        LootPool.Builder extractionLoot = bedrockOreExtractionLootPool(tableName, core);
        
        LootPool.Builder arcaneExtractionLoot = bedrockOreArcaneExtractionLootPool(tableName, oreItem);

        return LootTable.builder().pool(extractionLoot).pool(arcaneExtractionLoot);
    }

    /*
     * Creates and stores a loot table for the drops of the fractured bedrock block
     */
    protected void createFracturedBedrockTable(String tableName, BedrockStack bedrock) {
        lootTables.put(bedrock.ore().get(), LootTable.builder().pool(bedrockOreExtractionLootPool(tableName, bedrock.core().get())));
    }

    /*
     * Creates and stores a loot table for the drops of the hollow bedrock block
     */
    protected void createHollowBedrockTable(String tableName, Block hollowBedrock, Item hollowBedrockItem) {
        lootTables.put(hollowBedrock, LootTable.builder().pool(bedrockOreArcaneExtractionLootPool(tableName, hollowBedrockItem)));
    }

    /*
     * Creates and stores a loot table for the drops of the hollow bedrock block
     */
    protected void createCookieBedrockTable(String tableName, BedrockStack bedrock) {
        LootPool.Builder extractionLoot = bedrockOreExtractionLootPool(tableName, bedrock.core().get());
        LootPool.Builder arcaneExtractionLoot = bedrockOreArcaneExtractionLootPool(tableName, bedrock.oreItem().get());
        LootPool.Builder cookieLoot = bedrockOreCookieLootPool(tableName);
        lootTables.put(bedrock.ore().get(), LootTable.builder().pool(extractionLoot).pool(arcaneExtractionLoot).pool(cookieLoot));
    }

    private LootPool.Builder bedrockOreCookieLootPool(String tableName) {
        LootPool.Builder builder = LootPool.builder()
                .name(tableName)
                .conditionally(
                        InvertedLootCondition.builder(
                                MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().enchantment(
                                                new EnchantmentPredicate(EntryModule.CURSE_OF_FRACTURING.get(), IntRange.atLeast(1))))))
                .conditionally(
                        InvertedLootCondition.builder(
                                MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().enchantment(
                                                new EnchantmentPredicate(EntryModule.EXTRACTION.get(), IntRange.atLeast(1))))))
                .conditionally(
                        InvertedLootCondition.builder(
                                MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().enchantment(
                                                new EnchantmentPredicate(EntryModule.CURSE_OF_SHATTERING.get(), IntRange.atLeast(1))))))
                .conditionally(
                        InvertedLootCondition.builder(
                                MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().enchantment(
                                                new EnchantmentPredicate(EntryModule.ARCANE_EXTRACTION.get(), IntRange.atLeast(1))))));
        builder.with(ItemEntry.builder(Items.COOKIE).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)));
        return builder;
    }
    
    @Override
    public void run(DataWriter writer) {
        addTables();

        Map<Identifier, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
            tables.put(entry.getKey().getLootTableId(), entry.getValue().build());
        }
        writeTables(writer, tables);
    }

    private void writeTables(DataWriter writer, Map<Identifier, LootTable> tables) {
        Path outputFolder = this.generator.getOutput();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                DataProvider.writeToPath(writer, LootManager.toJson(lootTable), path);
            } catch (IOException e) {
                LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }

    @Override
    public String getName() {
        return "Dadobugbedrockores LootTables";
    }
    
}
