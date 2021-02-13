package me.timp.chattroll;

import files.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("extremetroll.command.chattroll")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /chattroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("ChatTroll-Message") + args[0]));
                    } else {
                        player.sendMessage(ChatColor.RED + "This player is offline or doesn't exists!");
                    }
                }
            }
        }



        return false;
    }
}
