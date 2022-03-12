package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import no.dadobug.EntryModule;

public class ShatteringEnchantment extends Enchantment {

    public ShatteringEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
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
    protected boolean canAccept(Enchantment other) {
        return this != other && other != EntryModule.CURSE_OF_FRACTURING && other != EntryModule.EXTRACTION;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof PickaxeItem;
    }
}
