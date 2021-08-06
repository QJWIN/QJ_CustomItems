/*
Class Name : MachineGunBowEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class MachineGunBowEvent implements Listener {
    Main plugin;
    public MachineGunBowEvent(Main plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onClick(PlayerInteractEvent eventArray) {
        if (eventArray.getAction().equals(Action.LEFT_CLICK_AIR) || eventArray.getAction().equals(Action.LEFT_CLICK_BLOCK)){

            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fMB_01")) {
                new BukkitRunnable() {
                    int timer = 25;
                    @Override
                    public void run() {
                        if (eventArray.getPlayer().getInventory().containsAtLeast(new ItemStack(Material.ARROW), 1)) {
                            Location eye = eventArray.getPlayer().getEyeLocation();
                            Location loc = eye.add(eye.getDirection().multiply(1.2));
                            Arrow arrow = (Arrow) Objects.requireNonNull(loc.getWorld()).spawnEntity(loc, EntityType.ARROW);
                            arrow.setVelocity(loc.getDirection().normalize().multiply(2));
                            arrow.setShooter(eventArray.getPlayer());
                            eventArray.getPlayer().getInventory().removeItem(new ItemStack(Material.ARROW));
                        }
                        timer--;
                        if (timer == 0) {
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, 0L, 4L);
            }
        }
    }
}






















