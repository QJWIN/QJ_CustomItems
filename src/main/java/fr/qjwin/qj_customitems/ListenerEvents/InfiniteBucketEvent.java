/*
Class Name : InfiniteBucketEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class InfiniteBucketEvent implements Listener {

    @EventHandler
    public void onBucketDrain (PlayerBucketEmptyEvent eventArray) {

        int getHitBlockX = eventArray.getBlockClicked().getX() + eventArray.getBlockFace().getModX();
        int getHitBlockY = eventArray.getBlockClicked().getY() + eventArray.getBlockFace().getModY();
        int getHitBlockZ = eventArray.getBlockClicked().getZ() + eventArray.getBlockFace().getModZ();

        Player player = eventArray.getPlayer();

        if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fWB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.WATER);
            eventArray.setCancelled(true);
        }
        if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fLB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.LAVA);
            eventArray.setCancelled(true);
        }
    }

    @EventHandler
    public void onBucketFill(PlayerBucketFillEvent eventArray) {

        int getHitBlockX = eventArray.getBlockClicked().getX();
        int getHitBlockY = eventArray.getBlockClicked().getY();
        int getHitBlockZ = eventArray.getBlockClicked().getZ();
        Player player = eventArray.getPlayer();
        ItemStack emptybukket = player.getInventory().getItemInMainHand();
        ItemMeta emptybukket_meta = emptybukket.getItemMeta();

        if(emptybukket_meta != null && emptybukket_meta.getLore() != null && emptybukket_meta.getLore().contains(Title_Color + "ID : §fIB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY ,getHitBlockZ).setType(Material.AIR);
            eventArray.setCancelled(true);
        }

    }
}
