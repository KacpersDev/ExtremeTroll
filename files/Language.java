package files;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Language {

    private static File file;
    private static FileConfiguration Language;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("ExtremeTroll").getDataFolder(), "language.yml");


        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {

            }
        }

        Language = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get() {
        return Language;
    }

    public static void save(){
        try {
            Language.save(file);
        } catch (IOException e) {
            System.out.println("Could NOT save the file!");
        }
    }

    public static void reload(){
        Language = YamlConfiguration.loadConfiguration(file);
    }

}
