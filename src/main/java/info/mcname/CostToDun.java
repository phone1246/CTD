package info.mcname;

import Listener.World;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by localPhone on 10/11/2015.
 */
public class CostToDun extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft");
    @Override
    public void onEnable() {
        log.severe("==============Start CTD===================");
        getServer().getPluginManager().registerEvents(new World(),this);

    }

    @Override
    public void onDisable() {

    }
}
