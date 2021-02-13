package me.timp.ranktroll;

import files.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("extremetroll.command.rank")) {

                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /ranktroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("RankTrollMessage")));
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("OfflinePlayer")));
                    }
                }
            }
        }





        return true;
    }
}
