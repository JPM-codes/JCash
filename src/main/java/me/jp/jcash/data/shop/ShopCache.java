package me.jp.jcash.data.shop;

import me.jp.api.utils.Cache;

public class ShopCache extends Cache<Shop> {
    public Shop getByKey(String key) {
        return getCached($ -> $.getKey().equalsIgnoreCase(key));
    }
}
