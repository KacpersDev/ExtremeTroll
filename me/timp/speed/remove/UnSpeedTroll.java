package me.timp.speed.remove;

import files.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class UnSpeedTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("extremetroll.command.unspeedtroll")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /unspeedtroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.removePotionEffect(PotionEffectType.SPEED);
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("OfflinePlayer")));
                    }
                }
            }

            return false;
        }
        return false;
    }
}
