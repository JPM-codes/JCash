package me.jp.jcash.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.jp.jcash.data.shop.Shop;
import org.bukkit.entity.Player;

@Getter
@Setter
@RequiredArgsConstructor
public class CashAccount {
    private final Player player;
    private double amount;
    private boolean toggle;
    private Shop shop;
}