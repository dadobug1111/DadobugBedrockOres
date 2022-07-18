package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import no.dadobug.EntryModule;
import no.dadobug.configs.EnchantConfig;

public class ArcaneExtractionEnchant extends Enchantment{


    private boolean doTableEnchant;
    private boolean doVillagerEnchant;
    private boolean doLootEnchant;
    public ArcaneExtractionEnchant(EnchantConfig config) {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        this.doTableEnchant = config.doTableEnchant;
        this.doVillagerEnchant = config.doVillagerEnchant;
        this.doLootEnchant = config.doLootEnchant;
    }

    @Override
    public int getMinPower(int level) {
        return 20;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean isTreasure() {
        return !doTableEnchant;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return this.doVillagerEnchant;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return this.doLootEnchant;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return this != other && other != EntryModule.CURSE_OF_FRACTURING.get() && other != EntryModule.SHATTERING.get() && other != EntryModule.CURSE_OF_SHATTERING.get() && other != EntryModule.EXTRACTION.get();
    }
}
