/*
Class Name : GrapplingEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Cooldown;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class GrapplingEvent implements Listener {

    @EventHandler
    public void  onFish(PlayerFishEvent eventArray) {
        int getMillisToSeconds;
        Player player_instance = eventArray.getPlayer();
        if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fGH_01")) {
            if (eventArray.getState().equals(PlayerFishEvent.State.REEL_IN)) {
                if (Cooldown.checkCooldown_grappling(eventArray.getPlayer())) {
                    Location playerlocation = player_instance.getLocation();
                    Location hooklocation = eventArray.getHook().getLocation();
                    Location changelocation = hooklocation.subtract(playerlocation);
                    player_instance.setVelocity(changelocation.toVector().multiply(0.3));
                    Cooldown.setCooldown_grappling(eventArray.getPlayer(), 8);
                } else {
                    getMillisToSeconds = (int) ((Cooldown.cooldowns_grappin.get(player_instance.getUniqueId()) - System.currentTimeMillis()) / 1000);
                    player_instance.sendMessage(ChatColor.GREEN + "Le grappin n'est pas encore près ! Il reste " + ChatColor.YELLOW + getMillisToSeconds + ChatColor.GREEN + " secondes.");
                }
            }
        }
    }

}
