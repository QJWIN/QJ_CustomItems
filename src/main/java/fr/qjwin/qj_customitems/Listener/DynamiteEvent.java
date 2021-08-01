/*
Class Name : DynamiteEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Material;
import org.bukkit.entity.FallingBlock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.*;

public class DynamiteEvent implements Listener {

    List<FallingBlock> throwedtnt = new ArrayList<>();

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInteract(PlayerInteractEvent eventArray) {

        if(eventArray.getAction().equals(Action.RIGHT_CLICK_AIR) || eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {

            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fTD_01") ) {
                FallingBlock tnt = eventArray.getPlayer().getWorld().spawnFallingBlock(eventArray.getPlayer().getEyeLocation(), Material.TNT, (byte) 0);
                tnt.setDropItem(false);
                throwedtnt.add(tnt);
                tnt.setVelocity(eventArray.getPlayer().getLocation().getDirection().multiply(3));
                eventArray.setCancelled(true);
            }
        }
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    @EventHandler
    public void onFall(EntityChangeBlockEvent eventArray) {
        if(eventArray.getEntity() instanceof FallingBlock) {
            if(throwedtnt.contains(eventArray.getEntity())) {
                eventArray.getEntity().getWorld().createExplosion(eventArray.getEntity().getLocation(), 2, false,false);
                eventArray.setCancelled(true);
                eventArray.getEntity().remove();
                throwedtnt.remove(eventArray.getEntity());
            }
        }
    }


}





























