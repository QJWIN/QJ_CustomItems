/*
Class Name : TrashEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.*;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;
import static fr.qjwin.qj_customitems.Managers.ItemsManager.TrashCan;

public class TrashCanEvent implements Listener {

    Main plugin;
    public TrashCanEvent(Main plugin){
        this.plugin = plugin;
    }
    static List<Location> list = new ArrayList<>();

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent eventArray) {
        Block blockplaced = eventArray.getBlockPlaced();
        Player player = eventArray.getPlayer();
        if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fPBL_01") ) {
            try {
                Location getBlockPlacedLocation = blockplaced.getLocation();
                list.add(eventArray.getBlock().getLocation());
                System.out.println("Poubelle ajouter : " + eventArray.getBlock().getLocation().getX() + " " + eventArray.getBlock().getLocation().getY() + " " + eventArray.getBlock().getLocation().getZ() + " dans le  monde " + eventArray.getBlock().getWorld().getName());
                String TrashName;
                if(player.hasPermission("op")) {
                    TrashName = "§6Poubelle §bpublic";
                } else {
                    TrashName = "§6Poubelle de §b" + player.getName();
                }
                blockplaced.setMetadata("poubelle", new FixedMetadataValue(plugin, player.getName()));
                ArmorStand TrashCan_Title = (ArmorStand) Objects.requireNonNull(getBlockPlacedLocation.getWorld()).spawnEntity(getBlockPlacedLocation.add(0.5D,1.50D,0.5D), EntityType.ARMOR_STAND);
                TrashCan_Title.setVisible(false);
                TrashCan_Title.setGravity(false);
                TrashCan_Title.setMarker(true);
                TrashCan_Title.setSmall(true);
                TrashCan_Title.setBasePlate(false);
                TrashCan_Title.setCustomNameVisible(true);
                TrashCan_Title.setCustomName(TrashName);
                TrashCan_Title.setMetadata("poubelle", new FixedMetadataValue(plugin, player.getName()));
            } catch (NoClassDefFoundError errorArray) {
                errorArray.printStackTrace();
            }
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent eventArray) {
        Player player = eventArray.getPlayer();
        Block breakedblock = eventArray.getBlock();
        if(breakedblock.hasMetadata("poubelle")) {
            String trachcanplacedBy = breakedblock.getMetadata("poubelle").get(0).asString();
            if(!player.getName().equals(trachcanplacedBy)) {
                try {
                    Location breakedblockLoc = eventArray.getBlock().getLocation();
                    Collection<Entity> entities = Objects.requireNonNull(breakedblockLoc.getWorld()).getNearbyEntities(breakedblockLoc, 1D, 3D, 1D);
                    for (final Entity entity : entities) {
                        if ((entity instanceof ArmorStand)) {
                            entity.remove();
                        }
                    }
                    Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                    if (!(drops.size() == 0)) {
                        eventArray.setDropItems(false);
                        eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), TrashCan);
                        breakedblock.removeMetadata("poubelle", plugin);
                        player.sendMessage("§c! Attention ! §fvous cassez une poubelle appartenant à : §b" + trachcanplacedBy + " §f!");
                    }
                } catch (NoClassDefFoundError errorArray) {
                    errorArray.printStackTrace();
                }
            } else {
                try {
                    Location breakedblockLoc = eventArray.getBlock().getLocation();
                    final Collection<Entity> entities = Objects.requireNonNull(breakedblockLoc.getWorld()).getNearbyEntities(breakedblockLoc.getBlock().getLocation(), 1D, 3D, 1D);
                    for (final Entity entity : entities) {
                        if ((entity instanceof ArmorStand)) {
                            entity.remove();
                        }
                    }
                    Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                    if (!(drops.size() == 0)) {
                        eventArray.setDropItems(false);
                        eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), TrashCan);
                        breakedblock.removeMetadata("poubelle", plugin);
                        player.sendMessage("§c! Attention ! §fvous cassez votre poubelle !");
                    }
                } catch (NoClassDefFoundError errorArray) {
                    errorArray.printStackTrace();
                }
            }
            list.remove(eventArray.getBlock().getLocation());
            System.out.println("Poubelle retirer : " + eventArray.getBlock().getLocation().getX() + " " + eventArray.getBlock().getLocation().getY() + " " + eventArray.getBlock().getLocation().getZ() + " dans le  monde " + eventArray.getBlock().getWorld().getName());
        }
    }


    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eventArray) {
        Player player = eventArray.getPlayer();
        Action playeractions = eventArray.getAction();
        Block clickedblock = eventArray.getClickedBlock();
        if (playeractions == Action.RIGHT_CLICK_BLOCK &&
            Objects.requireNonNull(clickedblock).hasMetadata("poubelle") &&
            clickedblock.getType() == Material.CAULDRON &&
            player.getInventory().getItemInMainHand().getType() != Material.WATER_BUCKET &&
            player.getInventory().getItemInMainHand().getType() != Material.BUCKET &&
            player.getInventory().getItemInMainHand().getType() != Material.GLASS_BOTTLE &&
            player.hasPermission("trashcan.use")) {

            Inventory inventory = Bukkit.createInventory(player, 36, "Poubelle");
            player.openInventory(inventory);
        }
    }



}
