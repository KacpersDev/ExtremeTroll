package me.timp.speed;

import files.Language;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedTroll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String stringr, String[] args) {

        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (player.hasPermission("extremetroll.command.speed")) {
                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "usage /speedtroll <player>");
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target instanceof Player) {
                        target.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 5));
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Language.get().getString("OfflinePlayer")));
                    }
                }
            }
        }


        return false;
    }
}
