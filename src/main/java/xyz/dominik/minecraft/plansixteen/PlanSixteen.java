package xyz.dominik.minecraft.plansixteen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class PlanSixteen extends JavaPlugin {

    @Override
    public void onEnable() {
        this.register();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    protected void register() {
        Bukkit.getPluginCommand("heal").setExecutor(new HealCommand());
    }
}
