package com.github.amanomc.first_plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class First_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグインが開始しました");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグインが停止しました");
    }
}
