package me.timp.author;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Author implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        Player player = (Player) sender;
        player.sendMessage(ChatColor.AQUA + "---" + ChatColor.WHITE + "-----------------" + ChatColor.AQUA + "---");
        player.sendMessage(ChatColor.WHITE + "UltimateTroll has been made by " + ChatColor.AQUA + "Timp");
        player.sendMessage(ChatColor.AQUA + "---" + ChatColor.WHITE + "-----------------" + ChatColor.AQUA + "---");
        return false;
    }
}
