package Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;


/**
 * Created by localPhone on 10/11/2015.
 */
public class World implements Listener {

    @EventHandler
    public void onLoadChunk(PlayerChangedWorldEvent event){

        Player player = event.getPlayer();
        player.sendMessage(ChatColor.BLUE+" You Tele Form World"+event.getFrom().getName());

    }
}
