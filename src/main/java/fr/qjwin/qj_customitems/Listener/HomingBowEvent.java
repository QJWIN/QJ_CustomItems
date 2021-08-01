/*
Class Name : HomingBowEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class HomingBowEvent implements Listener {

    Main plugin;
    public HomingBowEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onShoot(EntityShootBowEvent eventArray) {
        Entity arrow = eventArray.getProjectile();

        if (eventArray.getEntity() instanceof Player) {
            Player player = (Player) eventArray.getEntity();

            if (((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta() != null && Objects.requireNonNull(((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta()).getLore() != null && Objects.requireNonNull(Objects.requireNonNull(((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fHB_01")) {
                new BukkitRunnable() {
                    public void run() {
                        if (arrow.isOnGround() || arrow.isDead()) {
                            cancel();
                        } else {
                            List<Entity> nearest = arrow.getNearbyEntities(5, 5, 5);

                            for (Entity target : nearest) {
                                if (player.hasLineOfSight(target) && target instanceof LivingEntity && !target.isDead() && target != player) {
                                    arrow.setVelocity(target.getLocation().toVector().subtract(arrow.getLocation().toVector()));
                                }
                            }
                        }
                    }
                }.runTaskTimer(plugin, 0L, 1L);
            }
        }

    }


}















