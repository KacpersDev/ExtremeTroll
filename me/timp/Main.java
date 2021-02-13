package me.timp;

import files.Language;
import files.Permission;
import me.timp.author.Author;
import me.timp.blacklist.BlacklistTroll;
import me.timp.chattroll.ChatTroll;
import me.timp.chattroll.ChatTroll2;
import me.timp.chattroll.ChatTroll3;
import me.timp.damage.DamageTroll;
import me.timp.hacked.ServerHacked;
import me.timp.inventory.InventoryTroll;
import me.timp.money.MoneyRemoveTroll;
import me.timp.money.MoneyTroll;
import me.timp.ranktroll.OpTrolll;
import me.timp.ranktroll.RankTroll;
import me.timp.ranktroll.remove.RemoveOpTroll;
import me.timp.ranktroll.remove.RemoveRankTroll;
import me.timp.slowness.SlownessTroll;
import me.timp.slowness.remove.UnSlownessTroll;
import me.timp.speed.SpeedTroll;
import me.timp.speed.remove.UnSpeedTroll;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main langInstance;

    private static Main mainInstance;

    public void onEnable(){
        mainInstance = this;
        langInstance = this;

        // ChatTroll-Message2

        Language.setup();
        Language.get().addDefault("BlacklistTroll", "&7You has been &4&lBLACKLISTED");
        Language.get().addDefault("OfflinePlayer", "&cThis player is offline or doesn't exist");
        Language.get().addDefault("TrollInventory-Name", "&cYou got trolled :)");
        Language.get().addDefault("RankTrollMessage", "&7Your &aRANK &7has been &agranted");
        Language.get().addDefault("RankRemoveTrollMessage", "&7Your &cRANK &7has been &cremoved");
        Language.get().addDefault("OpTrollMessage", "&7Your &aOP &7has been &aADDED");
        Language.get().addDefault("OpRemoveTrollMessage", "&7Your &cOP &7has been &cREMOVED");
        Language.get().addDefault("HackedMessage1", "&9-----&f------------&9-----");
        Language.get().addDefault("HackedMessage2", "&7Server has been &9&lHACKED");
        Language.get().addDefault("HackedMessage3", "&9-----&f------------&9-----");
        Language.get().addDefault("MoneyTroll-Message", "&a500T &7Has been added to your account");
        Language.get().addDefault("MoneyTrollRemove-Message", "&7Your &aMONEY &7has been removed from your account");
        Language.get().addDefault("ChatTroll-Message", "&7I am weird but this server is good ~&a ");
        Language.get().addDefault("ChatTroll-Message2", "&7I really like the staff team ~&a ");
        Language.get().addDefault("ChatTroll-Message3", "&7I really like playing minecraft. ~&a ");
        Language.get().options().copyDefaults(true);
        Language.save();

        Permission.setup();
        Permission.get().addDefault("BlacklistTroll", "extremetroll.command.blacklist");
        Permission.get().addDefault("TrollInventory", "extremetroll.command.inventory");
        Permission.get().addDefault("RankTrollMessage", "extremetroll.command.rank");
        Permission.get().addDefault("RankRemoveTrollMessage", "extremetroll.command.rank.remove");
        Permission.get().addDefault("OpTrollMessage", "extremetroll.command.op");
        Permission.get().addDefault("OpRemoveTrollMessage", "extremetroll.command.op.remove");
        Permission.get().addDefault("SpeedTroll", "extremetroll.command.speed");
        Permission.get().addDefault("UnSpeedTroll", "extremetroll.command.unspeedtroll");
        Permission.get().addDefault("SlownessTroll", "extremetroll.command.slowness");
        Permission.get().addDefault("UnSlownessTroll", "extremetroll.command.unslowness");
        Permission.get().addDefault("HackedTroll", "extremetroll.command.hacked");
        Permission.get().addDefault("MoneyTroll", "extremetroll.command.moneytroll");
        Permission.get().addDefault("MoneyRemoveTroll", "extremetroll.command.moneytroll.remove");
        Permission.get().addDefault("ChatTroll", "extremetroll.command.chattroll");

        Permission.get().options().copyDefaults(true);
        Permission.save();

        this.getConfig().options().copyDefaults();
        saveDefaultConfig();

        this.getCommand("RankTroll").setExecutor((CommandExecutor) new RankTroll());
        this.getCommand("RemoveOpTroll").setExecutor((CommandExecutor) new RemoveOpTroll());
        this.getCommand("RemoveRankTroll").setExecutor((CommandExecutor) new RemoveRankTroll());
        this.getCommand("OpTroll").setExecutor((CommandExecutor) new OpTrolll());
        this.getCommand("ChatTroll").setExecutor((CommandExecutor) new ChatTroll());
        this.getCommand("InventoryTroll").setExecutor((CommandExecutor) new InventoryTroll());
        this.getCommand("Author").setExecutor((CommandExecutor) new Author());
        this.getCommand("BlacklistTroll").setExecutor((CommandExecutor) new BlacklistTroll());
        this.getCommand("SpeedTroll").setExecutor((CommandExecutor) new SpeedTroll());
        this.getCommand("UnSlownessTroll").setExecutor((CommandExecutor) new UnSlownessTroll());
        this.getCommand("SlownessTroll").setExecutor((CommandExecutor) new SlownessTroll());
        this.getCommand("DamageTroll").setExecutor((CommandExecutor) new DamageTroll());
        this.getCommand("UnSpeedTroll").setExecutor((CommandExecutor) new UnSpeedTroll());
        this.getCommand("HackedTroll").setExecutor((CommandExecutor) new ServerHacked());
        this.getCommand("MoneyTroll").setExecutor((CommandExecutor) new MoneyTroll());
        this.getCommand("MoneyRemoveTroll").setExecutor((CommandExecutor) new MoneyRemoveTroll());
        this.getCommand("ChatTroll2").setExecutor((CommandExecutor) new ChatTroll2());
        this.getCommand("ChatTroll3").setExecutor((CommandExecutor) new ChatTroll3());
    }

    public static Main getMainInstance(){
        return mainInstance;
    }

    public static Main getLangInstance(){
        return langInstance;
    }

    public void onDisable(){

    }
}
