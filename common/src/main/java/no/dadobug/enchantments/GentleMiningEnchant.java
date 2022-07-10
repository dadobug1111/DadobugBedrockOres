package no.dadobug.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;


public class GentleMiningEnchant extends Enchantment {

    private final boolean doEnchant;
    public GentleMiningEnchant(boolean doEnchant) {
        super(Rarity.RARE, EnchantmentTarget.DIGGER, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
        this.doEnchant = doEnchant;
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
    public boolean isTreasure() { return this.doEnchant; }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
            return this.doEnchant;
        }

    @Override
    public boolean isAvailableForRandomSelection() {
            return this.doEnchant;
        }

}

