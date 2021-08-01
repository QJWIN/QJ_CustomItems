/*
Class Name : ItemsEvents
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Cooldown;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class ItemsEvents implements Listener {

    // --------------------------------------------------------------------------
    // Gift List array internalname + amount
    // --------------------------------------------------------------------------
    private final ItemStack[] ItemsGiftArray = {
            new ItemStack(Material.BEETROOT, 23),
            new ItemStack(Material.BONE, 16),
            new ItemStack(Material.LEATHER, 8),
            new ItemStack(Material.GHAST_TEAR, 1),
            new ItemStack(Material.NAUTILUS_SHELL, 2),
            new ItemStack(Material.SHULKER_SHELL, 1),
            new ItemStack(Material.POTATO, 23),
            new ItemStack(Material.CARROT, 23),
            new ItemStack(Material.CAKE, 1),
            new ItemStack(Material.STICK, 48),
            new ItemStack(Material.COAL, 32),
            new ItemStack(Material.LAPIS_LAZULI, 21),
            new ItemStack(Material.IRON_INGOT, 20),
            new ItemStack(Material.IRON_INGOT, 15),
            new ItemStack(Material.GOLD_INGOT, 16),
            new ItemStack(Material.GOLD_INGOT, 11),
            new ItemStack(Material.DIAMOND, 9),
            new ItemStack(Material.DIAMOND, 6),
            new ItemStack(Material.EMERALD, 5),
            new ItemStack(Material.EMERALD, 2),
            new ItemStack(Material.NETHERITE_INGOT, 1)
    };

    @EventHandler
    public void  onFish(PlayerFishEvent eventArray) {
        int getMillisToSeconds;
        Player player_instance = eventArray.getPlayer();
        if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fGH_01")) {
            if (eventArray.getState().equals(PlayerFishEvent.State.REEL_IN)) {
                if (Cooldown.checkCooldown_grappling(eventArray.getPlayer())) {
                    Location playerlocation = player_instance.getLocation();
                    Location hooklocation = eventArray.getHook().getLocation();
                    Location changelocation = hooklocation.subtract(playerlocation);
                    player_instance.setVelocity(changelocation.toVector().multiply(0.3));
                    Cooldown.setCooldown_grappling(eventArray.getPlayer(), 8);
                } else {
                    getMillisToSeconds = (int) ((Cooldown.cooldowns_grappin.get(player_instance.getUniqueId()) - System.currentTimeMillis()) / 1000);
                    player_instance.sendMessage(ChatColor.GREEN + "Le grappin n'est pas encore près ! Il reste " + ChatColor.YELLOW + getMillisToSeconds + ChatColor.GREEN + " secondes.");
                }
            }
        }
    }
    // --------------------------------------------------------------------------
    // Teleport sword Event
    // --------------------------------------------------------------------------
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eventArray) {
        Player player_instance = eventArray.getPlayer();
        // --------------------------------------------------------------------------
        // Reading Event RIGHT CLICK AIR
        // --------------------------------------------------------------------------
        if (eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fTS_01")) {
                if (Cooldown.checkCooldown_teleportsword(eventArray.getPlayer())) {
                    Block Destination_Block = player_instance.getTargetBlock(null, 8);
                    Location Destination_Location = Destination_Block.getLocation();
                    float Destination_Pitch = player_instance.getEyeLocation().getPitch();
                    float Destination_Yaw = player_instance.getEyeLocation().getYaw();
                    Destination_Location.add(0, 1, 0);
                    Destination_Location.setPitch(Destination_Pitch);
                    Destination_Location.setYaw(Destination_Yaw);
                    player_instance.teleport(Destination_Location);
                    player_instance.playSound(player_instance.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 5, 5);
                    Cooldown.setCooldown_teleportsword(eventArray.getPlayer(), 5);
                } else {
                    player_instance.sendMessage(ChatColor.GREEN + "L'épée n'as pas encore rechargée son pouvoir !");
                }
                eventArray.setCancelled(true);
            }

            if (Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fSG_01")) {
                Random getRandomizedNumber = new Random();
                eventArray.getPlayer().getInventory().removeItem(ItemsManager.ServerGift);
                eventArray.getPlayer().getInventory().addItem(ItemsGiftArray[getRandomizedNumber.nextInt(ItemsGiftArray.length)]);
                player_instance.sendMessage("§aVous vennez de reçevoir un Cadeau !");
                eventArray.setCancelled(true);
            }
        }
        // --------------------------------------------------------------------------
        // Reading Event RIGHT CLICK BLOCK
        // --------------------------------------------------------------------------
        if (eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fSG_01")) {
                Random getRandomizedNumber = new Random();
                eventArray.getPlayer().getInventory().removeItem(ItemsManager.ServerGift);
                eventArray.getPlayer().getInventory().addItem(ItemsGiftArray[getRandomizedNumber.nextInt(ItemsGiftArray.length)]);
                player_instance.sendMessage("§aVous vennez de reçevoir un Cadeau !");
                eventArray.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent eventArray){
        if ( eventArray.getEntity() instanceof Arrow) {
            Arrow entityArrow = (Arrow) eventArray.getEntity();
            Player ShooterPlayer = (Player) entityArrow.getShooter();
            Location arrow_location =  entityArrow.getLocation();
            World arrow_world = Objects.requireNonNull(ShooterPlayer).getWorld();
            if (ShooterPlayer.getInventory().getItemInMainHand().getItemMeta() != null && ShooterPlayer.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(ShooterPlayer.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fEB_01")) {
                arrow_world.createExplosion(arrow_location, 2, false, false);
            }
        }
    }

    @EventHandler
    public void onBucketDrain (PlayerBucketEmptyEvent eventArray) {
        int getHitBlockX = eventArray.getBlockClicked().getX() + eventArray.getBlockFace().getModX();
        int getHitBlockY = eventArray.getBlockClicked().getY() + eventArray.getBlockFace().getModY();
        int getHitBlockZ = eventArray.getBlockClicked().getZ() + eventArray.getBlockFace().getModZ();
        if (Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fWB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.WATER);
            eventArray.setCancelled(true);
        }
        if (Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fLB_01")) {
            eventArray.getPlayer().getWorld().getBlockAt(getHitBlockX,getHitBlockY,getHitBlockZ).setType(Material.LAVA);
            eventArray.setCancelled(true);
        }
    }







}



















