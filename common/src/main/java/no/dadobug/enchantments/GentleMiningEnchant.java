package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import no.dadobug.configs.EnchantConfig;


public class GentleMiningEnchant extends Enchantment {

    private boolean doTableEnchant;
    private boolean doVillagerEnchant;
    private boolean doLootEnchant;
    public GentleMiningEnchant(EnchantConfig config) {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        this.doTableEnchant = config.doTableEnchant;
        this.doVillagerEnchant = config.doVillagerEnchant;
        this.doLootEnchant = config.doLootEnchant;
    }

    @Override
    public int getMinPower(int level) {
            return 13;
        }

    @Override
    public int getMaxLevel() {
            return 5;
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

}

