/*
Class Name : BoomerangEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import java.util.Objects;

public class BoomerangEvent implements Listener {

    Main plugin;

    public BoomerangEvent(Main plugin){
        this.plugin = plugin;
    }
    @EventHandler
    @SuppressWarnings("deprecation")
    public void onInteract(PlayerInteractEvent eventArray) {

        Player player = eventArray.getPlayer();

        if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fBR_01")) {

            ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            Location destination = player.getLocation().add(player.getLocation().getDirection().multiply(10));

            as.setArms(true);
            as.setGravity(false);
            as.setVisible(false);
            as.setItemInHand(new ItemStack(Material.BONE));
            as.setRightArmPose(new EulerAngle(Math.toRadians(0), Math.toRadians(120), Math.toRadians(0)));

            ItemStack BaseItemStack = ItemsManager.Boomerang;
            ItemMeta BaseItemMeta = BaseItemStack.getItemMeta();

            ItemStack PreserveItemStack = eventArray.getPlayer().getInventory().getItemInMainHand();
            ItemMeta PreserveItemMeta = PreserveItemStack.getItemMeta();

            player.getInventory().removeItem(PreserveItemStack);

            Vector vector = destination.subtract(player.getLocation()).toVector();

            new BukkitRunnable() {
                //distance to trow the boomrang
                final int distance = 40;
                int i = 0;

                public void run() {
                    EulerAngle rot = as.getRightArmPose();
                    EulerAngle rotnew = rot.add(0, 20, 0);
                    as.setRightArmPose(rotnew);

                    if (i >= distance) {
                        as.teleport(as.getLocation().subtract(vector.normalize()));
                        if (i >= distance * 2) {
                            as.remove();
                            if (player.getInventory().firstEmpty() == -1) {

                                if(BaseItemMeta == PreserveItemMeta) {
                                    player.getWorld().dropItemNaturally(player.getLocation(), BaseItemStack);
                                } else {
                                    player.getWorld().dropItemNaturally(player.getLocation(), PreserveItemStack);
                                }

                            } else {

                                if(BaseItemMeta != PreserveItemMeta) {
                                    player.getInventory().addItem(BaseItemStack);
                                } else {
                                    player.getInventory().addItem(PreserveItemStack);
                                }
                            }
                            cancel();
                        }
                    } else {
                        as.teleport(as.getLocation().add(vector.normalize()));
                    }

                    i++;

                    for (Entity entity : as.getLocation().getChunk().getEntities()) {
                        if (as.getLocation().distanceSquared(entity.getLocation()) < 1) {

                            if (entity != player) {

                                if (entity instanceof Monster || entity instanceof Animals || entity instanceof Player) {
                                    LivingEntity livingentity = (LivingEntity) entity;
                                    livingentity.damage(4, player);
                                }

                            }

                        }
                    }
                }
            }.runTaskTimer(plugin, 1L, 1L);
            eventArray.setCancelled(true);
        }
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onEntity(PlayerInteractAtEntityEvent eventArray) {
        if (eventArray.getRightClicked() instanceof ArmorStand) {
            ArmorStand as = (ArmorStand) eventArray.getRightClicked();
            if (as.getItemInHand().getType().equals(Material.BONE)) {
                eventArray.setCancelled(true);
            }
        }
    }

}