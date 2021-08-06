/*
Class Name : AntiPlaceHatEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.Objects;

public class AntiPlaceHatEvent implements Listener {

    Main plugin;
    public AntiPlaceHatEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onBlockPlace(BlockPlaceEvent eventArray) {

        Player player = eventArray.getPlayer();
        Material getBlockMaterial = eventArray.getBlock().getType();

        String playername = player.getName();

        if(getBlockMaterial == Material.CARVED_PUMPKIN) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && player.getInventory().getItemInMainHand().hasItemMeta()) {
                int GetCustomModelData = Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getCustomModelData();
                if (!(GetCustomModelData == 0)) {
                    Main.getinstance.getLogger().info("QJ_CustomItems >>> " +  playername + " as try to place a hat on ground ! event canceled.");
                    eventArray.setCancelled(true);
                }
            }
        }
    }
}
