package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import no.dadobug.EntryModule;

public class ExtractionEnchant extends Enchantment{

    public ExtractionEnchant() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
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
    protected boolean canAccept(Enchantment other) {
        return this != other && other != EntryModule.CURSE_OF_FRACTURING && other != EntryModule.SHATTERING;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof PickaxeItem;
    }
}
