/*
Class Name : LandMineEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import fr.qjwin.qj_customitems.Managers.ItemsManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.Collection;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class LandMineEvent implements Listener {

    Main plugin;
    public LandMineEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent eventArray) {
        Block blockplaced = eventArray.getBlockPlaced();
        Player player = eventArray.getPlayer();
        if( eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null &&
            eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
            eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fTL_01") ) {
            blockplaced.setMetadata("landmine", new FixedMetadataValue(plugin, player.getName()));
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent eventArray) {
        Player player = eventArray.getPlayer();
        Block breakedblock = eventArray.getBlock();
        if(breakedblock.hasMetadata("landmine")) {
            String landmineplacedBy = breakedblock.getMetadata("landmine").get(0).asString();
            if(!player.getName().equals(landmineplacedBy)) {

                Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                if (!(drops.size() == 0)) {
                    eventArray.setDropItems(false);
                    eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), ItemsManager.Landmine);
                    breakedblock.removeMetadata("landmine", plugin);
                    player.sendMessage("§c! Attention ! §fvous déterrez une land mine appartenant à : §b" + landmineplacedBy + "§f, agissez avec prudence !");
                }
            } else {
                Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                if (!(drops.size() == 0)) {
                    eventArray.setDropItems(false);
                    eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), ItemsManager.Landmine);
                    breakedblock.removeMetadata("landmine", plugin);
                    player.sendMessage("§c! Attention ! §fvous déterrez votre land mine, agissez avec prudence !");
                }

            }
        }
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent eventArray) {
        Player player = eventArray.getPlayer();
        Location movefrom = eventArray.getFrom();
        Location moveto = eventArray.getTo();
        if (moveto != null && movefrom.getBlockX() == moveto.getBlockX() && movefrom.getBlockY() == moveto.getBlockY() && movefrom.getBlockZ() == moveto.getBlockZ()) {
            return;
        }

        Block BlockAt = player.getWorld().getBlockAt(Objects.requireNonNull(moveto));
        Block RelativePos = BlockAt.getRelative(0, -2, 0);
        if(RelativePos.hasMetadata("landmine")) {
            String landmineplacedBy = RelativePos.getMetadata("landmine").get(0).asString();
            if(!player.getName().equals(landmineplacedBy)) {
                Location loc = player.getLocation();
                player.getWorld().createExplosion(loc.getX(), loc.getY(), loc.getZ(), 2, false, false);
                RelativePos.setType(Material.AIR);
                RelativePos.removeMetadata("landmine", plugin);
            } else {
                player.sendMessage("§c! Attention ! §fvous marchez sur votre land mine, agissez avec prudence !");
            }
        }
    }

}
