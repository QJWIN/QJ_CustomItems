/*
Class Name : DynamiteEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import org.bukkit.Material;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.*;
import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class DynamiteEvent implements Listener {

    List<FallingBlock> throwedtnt = new ArrayList<>();

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInteract(PlayerInteractEvent eventArray) {
        Player player = eventArray.getPlayer();
        if(eventArray.getAction().equals(Action.RIGHT_CLICK_AIR) || eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color +  "ID : §fTD_01") ) {
                FallingBlock tnt = player.getWorld().spawnFallingBlock(player.getEyeLocation(), Material.TNT, (byte) 0);
                tnt.setDropItem(false);
                throwedtnt.add(tnt);
                tnt.setVelocity(player.getLocation().getDirection().multiply(3));
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
                eventArray.setCancelled(true);
            }
        }
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    @EventHandler
    public void onFall(EntityChangeBlockEvent eventArray) {
        if(eventArray.getEntity() instanceof FallingBlock) {
            if(throwedtnt.contains(eventArray.getEntity())) {
                eventArray.getEntity().getWorld().createExplosion(eventArray.getEntity().getLocation(), 3, false,false);
                eventArray.setCancelled(true);
                eventArray.getEntity().remove();
                throwedtnt.remove(eventArray.getEntity());
            }
        }
    }


}





























