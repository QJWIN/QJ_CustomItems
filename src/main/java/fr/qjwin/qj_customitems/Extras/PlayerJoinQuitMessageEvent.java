/*
Class Name : PlayerJoinQuitMessageEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitMessageEvent implements Listener {

    Main plugin;
    public PlayerJoinQuitMessageEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(Main.getinstance.getConfig().getBoolean("enable_welcome_message")) {
            Player p = e.getPlayer();
            String pluginprefix = Main.getinstance.getConfig().getString("Prefix_String");
            if (p.hasPlayedBefore()) {
                e.setJoinMessage(pluginprefix + " §fC'est bon de te revoir sur le serveur, §a" + p.getName() + " §f!");
            } else {
                e.setJoinMessage(pluginprefix + " §fBienvenue sur le serveur, §a" + p.getName() + " §f!");
            }
        }

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        if(Main.getinstance.getConfig().getBoolean("enable_welcome_message")) {
            Player p = e.getPlayer();
            String pluginprefix = Main.getinstance.getConfig().getString("Prefix_String");
            e.setQuitMessage(pluginprefix + p.getName() + " §fà quitter la partie !");
        }
    }


}
