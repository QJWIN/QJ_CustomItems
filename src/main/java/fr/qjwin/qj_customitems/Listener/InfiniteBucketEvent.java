/*
Class Name : InfiniteBucketEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class InfiniteBucketEvent implements Listener {

    @EventHandler
    public void onBucketDrain (PlayerBucketEmptyEvent eventArray) {
        int getHitBlockX = eventArray.getBlockClicked().getX() + eventArray.getBlockFace().getModX();
        int getHitBlockY = eventArray.getBlockClicked().getY() + eventArray.getBlockFace().getModY();
        int getHitBlockZ = eventArray.getBlockClicked().getZ() + eventArray.getBlockFace().getModZ();
        if (Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fWB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.WATER);
            eventArray.setCancelled(true);
        }
        if (Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fLB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.LAVA);
            eventArray.setCancelled(true);
        }
    }

    @EventHandler
    public void onBucketFill(PlayerBucketFillEvent eventArray) {

        int getHitBlockX = eventArray.getBlockClicked().getX() + eventArray.getBlockFace().getModX();
        int getHitBlockY = eventArray.getBlockClicked().getY() + eventArray.getBlockFace().getModY();
        int getHitBlockZ = eventArray.getBlockClicked().getZ() + eventArray.getBlockFace().getModZ();
        Player player = eventArray.getPlayer();
        ItemStack emptybukket = player.getInventory().getItemInMainHand();
        ItemMeta emptybukket_meta = emptybukket.getItemMeta();
        if(emptybukket_meta != null && emptybukket_meta.getLore() != null && emptybukket_meta.getLore().contains(Title_Color + "ID : §fIB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY - 1,getHitBlockZ).setType(Material.AIR);
            eventArray.setCancelled(true);
        }

    }
}
