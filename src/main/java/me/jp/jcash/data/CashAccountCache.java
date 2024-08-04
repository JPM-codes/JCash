package me.jp.jcash.data;

import me.jp.api.utils.Cache;
import org.bukkit.entity.Player;

import java.util.UUID;

public class CashAccountCache extends Cache<CashAccount> {
    public CashAccount getByPlayer(Player player) {
        return getCached($ -> $.getPlayer().equals(player));
    }
    public CashAccount getByUUID(UUID player) {
        return getCached($ -> $.getPlayer().getUniqueId().equals(player));
    }
}
