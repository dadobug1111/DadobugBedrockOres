package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import no.dadobug.EntryModule;

public class ExtractionEnchant extends Enchantment{

    private final boolean doEnchant;
    public ExtractionEnchant(boolean doEnchant) {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        this.doEnchant = doEnchant;
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
        return this != other && other != EntryModule.CURSE_OF_FRACTURING.get() && other != EntryModule.SHATTERING.get() && other != EntryModule.CURSE_OF_SHATTERING.get();
    }
}
