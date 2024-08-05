package me.jp.jcash.command;

import lombok.val;
import me.saiintbrisson.minecraft.command.annotation.Command;
import me.saiintbrisson.minecraft.command.command.Context;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CashCommand {

    @Command(
            name = "cash"
    )
    public void execute(Context<CommandSender> context) {
        val player = (Player) context.getSender();
    }

}
