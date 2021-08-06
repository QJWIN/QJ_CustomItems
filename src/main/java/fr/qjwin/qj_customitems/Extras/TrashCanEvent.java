/*
Class Name : TrashEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import fr.qjwin.qj_customitems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
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

import java.util.Collection;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;
import static fr.qjwin.qj_customitems.Managers.ItemsManager.TrashCan;

public class TrashCanEvent implements Listener {

    Main plugin;

    public TrashCanEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent eventArray) {
        Block blockplaced = eventArray.getBlockPlaced();
        Player player = eventArray.getPlayer();
        if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fPBL_01") ) {
            try {
                Location getBlockPlacedLocation = blockplaced.getLocation();
                Hologram PlaceNewHologram = HologramsAPI.createHologram(plugin, getBlockPlacedLocation.add(0.5, 2.75, 0.5));
                String TrashName;
                if(player.hasPermission("op")) {
                    TrashName = "§6Poubelle §bpublic";
                } else {
                    TrashName = "§6Poubelle de §b" + player.getName();
                }
                PlaceNewHologram.appendItemLine(new ItemStack(TrashCan));
                PlaceNewHologram.appendTextLine(TrashName);
                blockplaced.setMetadata("poubelle", new FixedMetadataValue(plugin, player.getName()));
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

                    for (Hologram hologram : HologramsAPI.getHolograms(plugin)) {
                        Location breakedblockLoc = eventArray.getBlock().getLocation();
                        Location hologramLoc = hologram.getLocation();

                        if (breakedblockLoc.add(0.5, 1.75, 0.5).equals(hologramLoc) || breakedblockLoc.distance(hologramLoc) < 2) {
                            hologram.delete();
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


                    for (Hologram hologram : HologramsAPI.getHolograms(plugin)) {
                        Location breakedblockLoc = eventArray.getBlock().getLocation();
                        Location hologramLoc = hologram.getLocation();

                        if (breakedblockLoc.add(0.5, 1.75, 0.5).equals(hologramLoc) || breakedblockLoc.distance(hologramLoc) <= 1.75) {
                            hologram.delete();
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
