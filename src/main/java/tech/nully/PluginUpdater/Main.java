package tech.nully.PluginUpdater;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        try {
            Updater.UpdateInstaller();
        } catch (IOException e) {
            System.out.println("PluginUpdater: Error while updating PluginInstaller, please contact Bongo Cat#1100 on discord");
        }
        Bukkit.getServer().getConsoleSender().sendMessage("--------------------------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage("--------------------------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginUpdater]" + ChatColor.AQUA + " EaglerPluginUpdater V1.0.9 is now Enabled! :D");
        Bukkit.getServer().getConsoleSender().sendMessage("You do not need to do anything, this plugin will automatically update your PluginUpdater on startup");
        Bukkit.getServer().getConsoleSender().sendMessage("--------------------------------------------");
        Bukkit.getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginUpdater]" + ChatColor.AQUA + " EaglerPluginUpdater V1.0.9 is now Disabled! D:");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }
}
