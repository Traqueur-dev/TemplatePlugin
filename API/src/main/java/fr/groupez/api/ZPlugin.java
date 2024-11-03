package fr.groupez.api;

import com.tcoded.folialib.FoliaLib;
import com.tcoded.folialib.impl.PlatformScheduler;
import fr.groupez.api.placeholder.Placeholders;
import fr.groupez.api.placeholder.PlaceholdersHook;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class ZPlugin extends JavaPlugin {

    protected PlatformScheduler scheduler;

    @Override
    public void onEnable() {

        this.scheduler = new FoliaLib(this).getScheduler();
        Placeholders.load(this);

        this.enable();

    }

    @Override
    public void onDisable() {

        this.disable();

    }

    public abstract void enable();

    public abstract void disable();

    public PlatformScheduler getScheduler() {
        return scheduler;
    }

}
