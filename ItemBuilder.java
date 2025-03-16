import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemRarity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemBuilder {

    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    public ItemBuilder(@NotNull Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder(@NotNull Material material, int amount) {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder(@NotNull ItemStack stack) {
        this.itemStack = new ItemStack(stack);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return itemStack;
    }

    public ItemBuilder setDisplayName(@NotNull String displayName) {
        this.itemMeta.displayName(Component.text(displayName));
        return this;
    }

    public ItemBuilder getDisplayName() {
        this.itemMeta.displayName();
        return this;
    }

    public ItemBuilder setEnchant(@NotNull Enchantment ench, int level, boolean ignoreLevelRestriction) {
        this.itemMeta.addEnchant(ench, level, ignoreLevelRestriction);
        return this;
    }

    public ItemBuilder getEnchants() {
        this.itemMeta.getEnchants();
        return this;
    }

    public ItemBuilder getEnchants(Enchantment ench) {
        this.itemMeta.getEnchantLevel(ench);
        return this;
    }

    public ItemBuilder setLore(@NotNull String lore) {
        this.itemMeta.lore(List.of(Component.text(lore)));
        return this;
    }

    public ItemBuilder getLore() {
        this.itemMeta.lore();
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        this.itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    public ItemBuilder setItemName(@NotNull String itemName) {
        this.itemMeta.itemName(Component.text(itemName));
        return this;
    }

    public ItemBuilder getItemName() {
        this.itemMeta.itemName();
        return this;
    }

    public ItemBuilder setCustomModelData(@NotNull Integer data) {
        this.itemMeta.setCustomModelData(data);
        return this;
    }

    public ItemBuilder setRarity(@NotNull ItemRarity rarity) {
        this.itemMeta.setRarity(rarity);
        return this;
    }

    public ItemBuilder setFireResistant(boolean fireResistant) {
        this.itemMeta.setFireResistant(fireResistant);
        return this;
    }

    public ItemBuilder setHideTooltip(boolean hideTooltip) {
        this.itemMeta.setHideTooltip(hideTooltip);
        return this;
    }
}
