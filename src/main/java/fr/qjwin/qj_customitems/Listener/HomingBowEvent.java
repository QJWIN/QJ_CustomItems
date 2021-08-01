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

public class HomingBowEvent implements Listener {

    Main plugin;
    public HomingBowEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onShoot(EntityShootBowEvent eventArray) {
        Entity arrow = eventArray.getProjectile();
        Player player = (Player) eventArray.getEntity();

        if (((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta() != null && ((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(((Player) eventArray.getEntity()).getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fHB_01")) {

            new BukkitRunnable(){

                public void run() {
                    if (arrow.isOnGround() || arrow.isDead()) {

                    } else {
                        List<Entity> nearest = arrow.getNearbyEntities(5, 5, 5);

                        for( Entity target : nearest) {
                            if(player.hasLineOfSight(target) && target instanceof LivingEntity && !target.isDead() && target != player) {
                                arrow.setVelocity(target.getLocation().toVector().subtract(arrow.getLocation().toVector()));
                            }
                        }
                    }
                }
            }.runTaskTimer(plugin, 0L, 1L);

        }



    }


}















