package no.dadobug;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import dev.architectury.platform.Platform;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.condition.LootConditionTypes;
import net.minecraft.loot.condition.WeatherCheckLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;
import org.jetbrains.annotations.Nullable;

public class ModLoadedLootCondition implements LootCondition {
    final String mod_id;
    ModLoadedLootCondition(String mod_id) {
        this.mod_id = mod_id;
    }

    public LootConditionType getType() {
        return EntryModule.MOD_LOOT_CONDITION_TYPE;
    }

    public boolean test(LootContext lootContext) {
        return Platform.isModLoaded(this.mod_id);
    }

    public static Builder create() {
        return new ModLoadedLootCondition.Builder();
    }

    public static class Builder implements LootCondition.Builder {
        private String mod_id;
        public Builder() {
        }

        public Builder mod_id(String modID) {
            this.mod_id = modID;
            return this;
        }

        public ModLoadedLootCondition build() {
            return new ModLoadedLootCondition(this.mod_id);
        }
    }

    public static class Serializer implements JsonSerializer<ModLoadedLootCondition> {
        public Serializer() {
        }

        public void toJson(JsonObject jsonObject, ModLoadedLootCondition ModLoadedLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("mod_id", ModLoadedLootCondition.mod_id);
        }

        public ModLoadedLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            String mod_id = JsonHelper.getString(jsonObject, "mod_id");
            return new ModLoadedLootCondition(mod_id);
        }
    }
}
