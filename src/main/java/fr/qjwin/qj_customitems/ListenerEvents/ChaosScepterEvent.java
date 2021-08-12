/*
Class Name : ChaosScepterEvent
From Package : fr.qjwin.qj_customitems.ListenerEvents
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import fr.qjwin.qj_customitems.Managers.CooldownManager;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.ItemTagType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class ChaosScepterEvent implements Listener {

    Main plugin;
    public ChaosScepterEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onShoot(PlayerInteractEvent eventArray) {
        if (eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK) || eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            Player player = eventArray.getPlayer();
            int getMillisToSeconds;
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                    Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fCS_01")) {

                if (CooldownManager.checkCooldown_chaosscepter(eventArray.getPlayer())) {

                Vector correction = new Vector(0, 1.2, 0);
                Vector correctedvector = player.getEyeLocation().getDirection().add(correction);
                Location finalbatspawnlocation = player.getLocation().add(correctedvector);
                Bat bat = player.getWorld().spawn(finalbatspawnlocation, Bat.class);

                double qj_animation_radius = 2D;

                bat.setAwake(true);
                bat.setAI(false);
                bat.setSilent(true);
                bat.setInvulnerable(true);

                player.getWorld().playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 5, 5);

                new BukkitRunnable() {

                    public void run() {

                        Vector eye = player.getEyeLocation().getDirection();

                        Location location = bat.getLocation().add(eye);

                        location.setPitch(player.getLocation().getPitch());
                        location.setPitch(player.getLocation().getYaw());

                        double qj_animation_vector_X = qj_animation_radius * Math.cos(location.getX());
                        double qj_animation_vector_Z = qj_animation_radius * Math.sin(location.getZ());

                        bat.teleport(location);

                        Location particleLocation = bat.getLocation().add(qj_animation_vector_X, 0D, qj_animation_vector_Z);

                        player.getWorld().spawnParticle(Particle.END_ROD, particleLocation, 5);//, new Particle.DustOptions(Color.LIME, 2.0F));

                        int totalenemies = 0;
                        double totaldamage = 0;
                        double initdamage = 10D;

                        if (bat.getTargetBlockExact(1) != null && !Objects.requireNonNull(bat.getTargetBlockExact(1)).isPassable()) {

                            for (Entity entity : bat.getNearbyEntities(6, 6, 6)) {

                                if (entity instanceof LivingEntity) {

                                    LivingEntity livingEntity = (LivingEntity) entity;
                                    if (!livingEntity.equals(eventArray.getPlayer()) && !(livingEntity instanceof Bat && !livingEntity.hasAI() && livingEntity.isSilent() && livingEntity.isInvulnerable())) {

                                        livingEntity.damage(initdamage, player);
                                        totalenemies = totalenemies + 1;
                                        totaldamage = totaldamage + initdamage;
                                    }
                                }
                            }

                            if (totalenemies != 0) {
                                player.sendMessage("§aLa chauve souris guidé à toucher §e" + totalenemies + " §aentités infligeant §e" + NumberFormat.getNumberInstance(Locale.FRANCE).format(totaldamage) + " §ade dommages.");
                            }

                            bat.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, bat.getLocation(), 10);
                            bat.getWorld().playSound(bat.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 5, 5);
                            bat.remove();
                            cancel();

                        }

                        List<Entity> withinentities = bat.getNearbyEntities(1, 1, 1);
                        withinentities.remove(player);

                        for (Entity withinentity : withinentities) {
                            if (withinentity instanceof LivingEntity) {
                                LivingEntity livingwithinentity = (LivingEntity) withinentity;
                                if (livingwithinentity instanceof Bat && !livingwithinentity.hasAI() && livingwithinentity.isSilent() && livingwithinentity.isInvulnerable()) {
                                    withinentities.remove(withinentity);
                                }
                            }
                        }

                        if (withinentities.size() >= 1) {

                            for (Entity entity : bat.getNearbyEntities(6, 6, 6)) {

                                if (entity instanceof LivingEntity) {

                                    LivingEntity livingEntity = (LivingEntity) entity;
                                    if (!livingEntity.equals(eventArray.getPlayer()) && !(livingEntity instanceof Bat && !livingEntity.hasAI() && livingEntity.isSilent() && livingEntity.isInvulnerable())) {

                                        livingEntity.damage(initdamage, player);
                                        totalenemies = totalenemies + 1;
                                        totaldamage = totaldamage + initdamage;
                                    }
                                }
                            }

                            if (totalenemies != 0) {
                                player.sendMessage("§aLa chauve souris guidé à toucher §e" + totalenemies + " §aentités infligeant §e" + NumberFormat.getNumberInstance(Locale.FRANCE).format(totaldamage) + " §ade dommages.");
                            }

                            bat.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, bat.getLocation(), 10);
                            bat.getWorld().playSound(bat.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 5, 5);
                            bat.remove();
                            cancel();

                        }
                    }
                }.runTaskTimer(plugin, 0L, 1L);

                CooldownManager.setCooldown_chaosscepter(player, 12);
            } else {
                getMillisToSeconds = (int) ((CooldownManager.cooldowns_chaosscepter.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000);
                player.sendMessage("§aL'épée n'as pas encore rechargée Il reste §e" + getMillisToSeconds + " §asecondes.");
                eventArray.setCancelled(true);
            }


            }
        }
    }

    @EventHandler
    public void onDamage(EntityDamageEvent eventArray) {
        LivingEntity livingEntity = (LivingEntity) eventArray.getEntity();
        if(livingEntity instanceof Bat && !livingEntity.hasAI() && livingEntity.isSilent() && livingEntity.isInvulnerable()) {
            eventArray.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent eventArray){
        Player player = eventArray.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fCS_01")) {
            eventArray.setCancelled(true);
        }
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onClick(InventoryClickEvent eventArray) {
        ItemStack items = eventArray.getCurrentItem();
        if (items != null && items.getItemMeta() != null && items.getItemMeta().getLore() != null && items.getItemMeta().getLore().contains(Title_Color + "ID : §fCS_01")) {
            ItemMeta meta = eventArray.getCurrentItem().getItemMeta();
            NamespacedKey key = new NamespacedKey(plugin, String.valueOf(Math.random()));
            Objects.requireNonNull(meta).getCustomTagContainer().setCustomTag(key, ItemTagType.DOUBLE, Math.PI);
            eventArray.getCurrentItem().setItemMeta(meta);
        }
    }

    @EventHandler
    @SuppressWarnings("deprecation")
    public void onPickUp(PlayerPickupItemEvent eventArray) {
        Item items = eventArray.getItem();
        if (items.getItemStack().getItemMeta() != null && items.getItemStack().getItemMeta().getLore() != null && items.getItemStack().getItemMeta().getLore().contains(Title_Color + "ID : §fCS_01")) {
            ItemMeta meta = items.getItemStack().getItemMeta();
            NamespacedKey key = new NamespacedKey(plugin, String.valueOf(Math.random()));
            meta.getCustomTagContainer().setCustomTag(key, ItemTagType.DOUBLE, Math.PI);
            items.getItemStack().setItemMeta(meta);
        }
    }
}