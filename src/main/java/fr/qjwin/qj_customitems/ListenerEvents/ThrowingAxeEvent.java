/*
Class Name : ThrowingAxeEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import fr.qjwin.qj_customitems.Managers.ItemsManager;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import java.util.*;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class ThrowingAxeEvent implements Listener {

    Main plugin;
    public ThrowingAxeEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInteract(PlayerInteractEvent eventArray) {
        if(eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK) || eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            Player player = eventArray.getPlayer();
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fTA_01")) {

                int finaldamage = 10;

                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0,0.5,0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.setMarker(true);
                as.setItemInHand(new ItemStack(ItemsManager.ThrowingAxe));
                as.setRightArmPose(new EulerAngle(Math.toRadians(90), Math.toRadians(0),Math.toRadians(0)));

                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);

                Location destination = player.getLocation().add(player.getLocation().getDirection().multiply(10));
                Vector vector = destination.subtract(player.getLocation()).toVector();

                new BukkitRunnable() {

                    final int distance = 30;
                    int i = 0;

                    public void run() {

                        EulerAngle rot = as.getRightArmPose();
                        EulerAngle rotnew = rot.add(20,0,0);

                        as.setRightArmPose(rotnew);
                        as.teleport(as.getLocation().add(vector.normalize()));

                        if (as.getTargetBlockExact(1) != null && !Objects.requireNonNull(as.getTargetBlockExact(1)).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1 ){
                                    player.getInventory().addItem(ItemsManager.ThrowingAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), ItemsManager.ThrowingAxe);
                                }
                                cancel();
                            }
                        }
                        for (Entity entity : as.getLocation().getChunk().getEntities()) {
                            if(!as.isDead()) {
                                if(as.getLocation().distanceSquared(entity.getLocation()) <= 1) {
                                    if (entity != player && entity != as) {
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity livingEntity = (LivingEntity) entity;
                                            livingEntity.damage(finaldamage, player);
                                            as.remove();
                                            if (player.getInventory().firstEmpty() != -1) {
                                                player.getInventory().addItem(ItemsManager.ThrowingAxe);
                                            } else {
                                                player.getWorld().dropItemNaturally(player.getLocation(), ItemsManager.ThrowingAxe);
                                            }
                                            cancel();
                                        }
                                    }
                                }
                            }
                        }

                        if (i > distance) {
                            if(!as.isDead()){
                                as.remove();
                                if (player.getInventory().firstEmpty() != -1 ){
                                    player.getInventory().addItem(ItemsManager.ThrowingAxe);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), ItemsManager.ThrowingAxe);
                                }
                                cancel();
                            }
                        }

                        i++;

                    }

                }.runTaskTimer(plugin, 0L, 1L);

                eventArray.setCancelled(true);

            }


        }
    }

}
