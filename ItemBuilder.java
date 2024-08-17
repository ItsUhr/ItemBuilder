package de.itsuhr.teamCastle.builder;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemBuilder {

    private ItemStack itemStack;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder(Material material, int amount) {
        itemStack = new ItemStack(material, amount);
        itemMeta = itemStack.getItemMeta();
    }


    public ItemBuilder(Material material, int amount, short damage) {
        itemStack = new ItemStack(material, amount, damage);
        itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder(Material material, int amount, short damage, Byte data) {
        itemStack = new ItemStack(material, amount, damage, data);
        itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder setDisplayName(String displayName) {
        itemMeta.setDisplayName(displayName);
        return this;
    }

    public ItemBuilder setVersion(int version) {
        itemMeta.setVersion(version);
        return this;
    }

    public ItemBuilder setItemName(String itemName) {
        itemMeta.setItemName(itemName);
        return this;
    }

    public ItemBuilder setLore(ArrayList<String> lore) {
        itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder setLore(String lore) {
        itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    public ItemBuilder setEnchant(Enchantment enchant, int level, boolean ignoreLevelRestriction) {
        itemMeta.addEnchant(enchant, level, ignoreLevelRestriction);
        return this;
    }

    public ItemBuilder removeEnchant(Enchantment enchantment) {
        itemMeta.removeEnchant(enchantment);
        return this;
    }

    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

}
