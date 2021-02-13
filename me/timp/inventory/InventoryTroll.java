package me.timp.inventory;

import files.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InventoryTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {



        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory troll = Bukkit.createInventory(player, 54, ChatColor.translateAlternateColorCodes('&', Language.get().getString("TrollInventory-Name")));
            if (player.hasPermission("extremetroll.command.inventory")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /inventorytroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.openInventory(troll);
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("OfflinePlayer")));
                    }
                }
            }
        }

        return false;
    }
}
