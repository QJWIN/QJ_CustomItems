/*
Class Name : CresusPickaxeEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class CresusPickaxeEvent implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent eventArray) {
        if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fCP_01")) {
            Collection<ItemStack> drops = eventArray.getBlock().getDrops();
            if (!(drops.size() == 0)) {
                eventArray.setDropItems(false);
                eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 1));
            }
        }
    }

}
