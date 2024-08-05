package me.jp.jcash.command;

import lombok.RequiredArgsConstructor;
import lombok.val;
import me.jp.jcash.data.CashAccount;
import me.jp.jcash.data.CashAccountCache;
import me.saiintbrisson.minecraft.command.annotation.Command;
import me.saiintbrisson.minecraft.command.command.Context;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
public class CashCommand {

    private final CashAccountCache cashAccountCache;

    @Command(
            name = "cash"
    )
    public void execute(Context<CommandSender> context) {
        val player = (Player) context.getSender();
        CashAccount userAccount = cashAccountCache.getByUUID(player.getUniqueId());
        player.sendMessage("§aCash: §f" + userAccount.getAmount());
    }

}
