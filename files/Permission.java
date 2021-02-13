package files;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Permission {

    private static File file;
    private static FileConfiguration Permissions;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("ExtremeTroll").getDataFolder(), "permissions.yml");


        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {

            }
        }

        Permissions = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get() {
        return Permissions;
    }

    public static void save(){
        try {
            Permissions.save(file);
        } catch (IOException e) {
            System.out.println("Could NOT save the file!");
        }
    }

    public static void reload(){
        Permissions = YamlConfiguration.loadConfiguration(file);
    }

}
