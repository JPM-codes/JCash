package me.jp.jcash.data.shop;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@Getter
@Setter
public class Shop {
    private String key;
    private ItemStack display;
    private List<ItemStack> items;
    private double price;
}
