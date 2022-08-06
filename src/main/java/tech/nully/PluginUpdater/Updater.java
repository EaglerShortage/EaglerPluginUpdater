package tech.nully.PluginUpdater;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import tech.nully.PluginInstaller.Main;

import static org.bukkit.Bukkit.getServer;

public class Updater {
    public static void UpdateInstaller() throws IOException {
        InputStream in = URI.create("https://github.com/darverdevs/PluginInstaller/raw/main/target/EaglerPluginInstaller-1.1.5.jar")
                .toURL().openStream();
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/EaglerPluginInstaller.jar");
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Plugin instance = Main.getInstance();
        getServer().getPluginManager().disablePlugin(instance);
        getServer().getPluginManager().enablePlugin(instance);
    }
}
