/*
Class Name : TeleportSwordEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Cooldown;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class TeleportSwordEvent implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eventArray) {
        int getMillisToSeconds;
        Player player_instance = eventArray.getPlayer();
        if (eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fTS_01")) {

                if (Cooldown.checkCooldown_teleportsword(eventArray.getPlayer())) {
                    Block Destination_Block = player_instance.getTargetBlock(null, 8);
                    Location Destination_Location = Destination_Block.getLocation();
                    float Destination_Pitch = player_instance.getEyeLocation().getPitch();
                    float Destination_Yaw = player_instance.getEyeLocation().getYaw();
                    Destination_Location.add(0, 1, 0);
                    Destination_Location.setPitch(Destination_Pitch);
                    Destination_Location.setYaw(Destination_Yaw);
                    player_instance.teleport(Destination_Location);
                    player_instance.playSound(player_instance.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 5);
                    Cooldown.setCooldown_teleportsword(eventArray.getPlayer(), 5);
                } else {
                    getMillisToSeconds = (int) ((Cooldown.cooldowns_teleportsword.get(player_instance.getUniqueId()) - System.currentTimeMillis()) / 1000);
                    player_instance.sendMessage("§aL'épée n'as pas encore rechargée Il reste §e" + getMillisToSeconds + " §asecondes.");
                }
                eventArray.setCancelled(true);

            }

        }

    }

}
