/*
Class Name : FireBallEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class FireBallEvent implements Listener {

    Main plugin;
    public FireBallEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent eventArray) {

        if(eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK) ||eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {

            if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fFB_01")) {

                Fireball fireball = eventArray.getPlayer().getWorld().spawn(eventArray.getPlayer().getEyeLocation(), Fireball.class);

                fireball.setYield(0);
                fireball.setCustomName("Fireball");
                fireball.setVelocity(eventArray.getPlayer().getLocation().getDirection());

                new BukkitRunnable(){

                    public void run(){

                        if(!fireball.isDead()) {
                            fireball.getWorld().spawnParticle(Particle.FLAME, fireball.getLocation(), 1);
                        } else {
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, 0L,2L);

                eventArray.getPlayer().getInventory().getItemInMainHand().setAmount(eventArray.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);

                eventArray.setCancelled(true);
            }


        }

    }

    @EventHandler
    public void onLand(ProjectileHitEvent eventArray) {

        if(eventArray.getEntity().getCustomName() !=  null && eventArray.getEntity().getCustomName().equals("Fireball")) {

            eventArray.getEntity().getWorld().createExplosion(eventArray.getEntity().getLocation(), 4, true, false);

            for (Entity entity : eventArray.getEntity().getNearbyEntities(5,5,5)) {

                if(entity instanceof LivingEntity) {
                    LivingEntity livingEntity = (LivingEntity) entity;
                    double distance  = eventArray.getEntity().getLocation().distanceSquared(livingEntity.getLocation());
                    if (distance <= 0.5) {
                        livingEntity.setVelocity(new Location(livingEntity.getWorld(), 0,1,0).toVector());
                    } else {
                        livingEntity.setVelocity(livingEntity.getLocation().subtract(eventArray.getEntity().getLocation()).toVector().multiply(1 / distance));
                    }
                }
            }


        }

    }



}


















