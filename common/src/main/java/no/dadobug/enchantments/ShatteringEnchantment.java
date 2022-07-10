package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import no.dadobug.EntryModule;

public class ShatteringEnchantment extends Enchantment {

    private final boolean doEnchant;
    public ShatteringEnchantment(boolean doEnchant) {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        this.doEnchant = doEnchant;
    }

    @Override
    public int getMinPower(int level) {
        return 20;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return this.doEnchant;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return this.doEnchant;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return this != other && other != EntryModule.CURSE_OF_FRACTURING.get() && other != EntryModule.EXTRACTION.get() && other != EntryModule.CURSE_OF_SHATTERING.get();
    }
}
