/*
Class Name : GrenadeEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import org.bukkit.Location;

import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.projectiles.ProjectileSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class GrenadeEvent implements Listener {

    public List<UUID> entities = new ArrayList<>();

    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent eventArray) {
        Projectile entity = eventArray.getEntity();
        ProjectileSource shooter = entity.getShooter();
        if (!(shooter instanceof Player)) return;
        Player player = (Player) shooter;
        if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fGN_01")) {
            entities.add(entity.getUniqueId());
        }
    }

    @EventHandler
    public void onHit(ProjectileHitEvent event) {
        Projectile entity = event.getEntity();
        if (!entities.contains(entity.getUniqueId())) return;
        entities.remove(entity.getUniqueId());
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent eventArray){

        if (eventArray.getEntity().getShooter() instanceof Player) {
            Player player = (Player) eventArray.getEntity().getShooter();
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
            player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
            player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fGN_01")) {
                if (eventArray.getHitBlock() == null) {
                    Location loc = Objects.requireNonNull(eventArray.getHitEntity()).getLocation();
                    eventArray.getHitEntity().getWorld().createExplosion(loc.getX(), loc.getY(), loc.getZ(), 1, false, false);
                } else if (eventArray.getHitEntity() == null) {
                    Location loc = eventArray.getHitBlock().getLocation();
                    eventArray.getHitBlock().getWorld().createExplosion(loc.getX(), loc.getY(), loc.getZ(), 1, false, false);
                }
            }
        }
    }



}
