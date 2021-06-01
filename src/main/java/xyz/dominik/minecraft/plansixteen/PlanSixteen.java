package xyz.dominik.minecraft.plansixteen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlanSixteen extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("heal").setExecutor(new HealCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
