package tech.nully.PluginUpdater;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static org.bukkit.Bukkit.getServer;

import org.bukkit.plugin.Plugin;
import tech.nully.PluginInstaller.Main;

public class Updater {
    public static void UpdateInstaller() throws IOException {
        InputStream in = URI.create("https://github.com/darverdevs/PluginInstaller/raw/main/out/artifacts/EaglerPluginInstaller_jar/EaglerPluginInstaller.jar")
                .toURL().openStream();
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/EaglerPluginInstaller.jar");
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Plugin instance = Main.getInstance();
        getServer().getPluginManager().disablePlugin(instance);
        getServer().getPluginManager().enablePlugin(instance);
    }
}
