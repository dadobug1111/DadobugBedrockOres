package no.dadobug.datagen;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

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

    protected LootTable.Builder createSimpleTable(String name, Block block) {
        LootPool.Builder builder = LootPool.builder()
                .name(name)
                .with(LootTableEntry.builder(block.getRegistryName()));
        return LootTable.builder().pool(builder);
    }

    private LootPool.Builder bedrockOreRegularLootPool(String tableName, Identifier blockDropTable) {
        return LootPool.builder()
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
                            new EnchantmentPredicate(EntryModule.ARCANE_EXTRACTION.get(), IntRange.atLeast(1))))))
            .with(
                LootTableEntry.builder(blockDropTable));
    }

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

    protected void createBedrockOreTable(String tableName, Identifier blockDropTable, BedrockStack bedrock) {
        lootTables.put(bedrock.ore().get(), createBedrockOreTableHelper(tableName, blockDropTable, bedrock.core().get(), bedrock.oreItem().get()));
    }

    private LootTable.Builder createBedrockOreTableHelper(String tableName, Identifier blockDropTable, Item core, Item oreItem) {
        LootPool.Builder regularLoot = bedrockOreRegularLootPool(tableName, blockDropTable);
            
        LootPool.Builder extractionLoot = bedrockOreExtractionLootPool(tableName, core);
        
        LootPool.Builder arcaneExtractionLoot = bedrockOreArcaneExtractionLootPool(tableName, oreItem);
                
        return LootTable.builder().pool(regularLoot).pool(extractionLoot).pool(arcaneExtractionLoot);
    }

    protected void createBedrockLiquidTable(String tableName, BedrockStack bedrock) {
        lootTables.put(bedrock.ore().get(), createBedrockLiquidTableHelper(tableName, bedrock.core().get(), bedrock.oreItem().get()));
    }

    private LootTable.Builder createBedrockLiquidTableHelper(String tableName, Item core, Item oreItem) {
        LootPool.Builder extractionLoot = bedrockOreExtractionLootPool(tableName, core);
        
        LootPool.Builder arcaneExtractionLoot = bedrockOreArcaneExtractionLootPool(tableName, oreItem);

        return LootTable.builder().pool(extractionLoot).pool(arcaneExtractionLoot);
    }

    protected void createFracturedBedrockTable(String tableName, BedrockStack bedrock) {
        lootTables.put(bedrock.ore().get(), LootTable.builder().pool(bedrockOreExtractionLootPool(tableName, bedrock.core().get())));
    }

    protected void createHollowBedrockTable(String tableName, Block hollowBedrock, Item hollowBedrockItem) {
        lootTables.put(hollowBedrock, LootTable.builder().pool(bedrockOreArcaneExtractionLootPool(tableName, hollowBedrockItem)));
    }
    
    @Override
    public void run(DataCache cache) {
        addTables();

        Map<Identifier, LootTable> tables = new HashMap<>();
        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
            tables.put(entry.getKey().getLootTableId(), entry.getValue().build());
        }
        writeTables(cache, tables);
    }

    private void writeTables(DataCache cache, Map<Identifier, LootTable> tables) {
        Path outputFolder = this.generator.getOutput();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                DataProvider.writeToPath(GSON, cache, LootManager.toJson(lootTable), path);
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
