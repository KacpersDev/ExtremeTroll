package me.timp.hacked;

import files.Language;
import net.minecraft.server.v1_16_R3.Schedule;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ServerHacked implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("extremetroll.command.hacked")) {

                Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("HackedMessage1")));
                Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("HackedMessage2")));
                Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("HackedMessage3")));

            }
        }
        return false;
    }
}
