package diag.playmine.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    public static String as = "1234";

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("fucking maven");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
