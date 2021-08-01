/*
Class Name : LightingSwordEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class LightingSwordEvent implements Listener {

    @EventHandler
    public void onHit(EntityDamageByEntityEvent eventArray) {
        if (eventArray.getDamager() instanceof Player && eventArray.getEntity() instanceof LivingEntity) {
            Player player = (Player) eventArray.getDamager();
            LivingEntity livingEntity = (LivingEntity) eventArray.getEntity();
            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fLS_01")) {
                player.getWorld().strikeLightningEffect(eventArray.getEntity().getLocation());
                double damage = 10;
                livingEntity.damage(damage);
            }
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent eventArray) {

        if(eventArray.getAction().equals(Action.RIGHT_CLICK_AIR) || eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null &&Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fLS_01")) {
                for(Entity entity : eventArray.getPlayer().getNearbyEntities(12,12,12)) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity) entity;
                        livingEntity.getWorld().strikeLightningEffect(livingEntity.getLocation());
                        double damage = 6;
                        livingEntity.damage(damage);
                    }
                }
            }
        }

    }








}











































