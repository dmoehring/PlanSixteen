package xyz.dominik.minecraft.plansixteen;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlanSixteen extends JavaPlugin {

    @Override
    public void onEnable() {
        this.registerCommand("heal", new HealCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    protected void registerCommand(String command, CommandExecutor executor) {
        Bukkit.getPluginCommand(command).setExecutor(executor);
    }
}
