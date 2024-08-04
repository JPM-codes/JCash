package me.jp.jcash.data.shop;

import lombok.RequiredArgsConstructor;
import me.jp.api.api.ConfigAPI;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

@RequiredArgsConstructor
public class ShopFactory {
    private final ShopCache shopCache;
    private final ConfigAPI shopConfig;

    public void load(ConfigurationSection configuration) {
        ConfigurationSection section = configuration.getConfigurationSection("items");
        for (String key : section.getKeys(false)) {
            Shop shop = new Shop();
            if (section.contains(key + "display")) {
                String sec = key + "display.";
                Object material = section.get(sec + "material");
                int data = section.getInt(sec + "data");
                String name = section.getString(sec + "name");
                List<String> lore = section.getStringList(sec + "lore");
                boolean glow = section.getBoolean(sec + "glow");
                item = new
            }
        }
    }
}