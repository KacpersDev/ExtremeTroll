package me.timp.blacklist;

import files.Language;
import net.minecraft.server.v1_16_R3.Schedule;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class BlacklistTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("extremetroll.command.blacklist")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /blacklisttroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.kickPlayer(ChatColor.translateAlternateColorCodes('&', Language.get().getString("BlacklistTroll")));
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("OfflinePlayer")));
                    }
                }
            }
        }
        return false;
    }
}
