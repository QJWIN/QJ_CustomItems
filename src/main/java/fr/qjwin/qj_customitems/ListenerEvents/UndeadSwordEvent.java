/*
Class Name : UndeadSwordEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import java.util.Objects;
import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class UndeadSwordEvent implements Listener {

    Main plugin;
    public UndeadSwordEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent eventArray) {

        if (eventArray.getDamager() instanceof Player) {
            Player player = (Player) eventArray.getDamager();
            if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta() ).getLore()).contains(Title_Color + "ID : §fUS_01")) {
                if(eventArray.getEntity() instanceof Zombie) {
                    int zombieMultiplier = plugin.getConfig().getInt("Main_Options.Undeadsword.Damagemultiplier.Zombie");
                    eventArray.setDamage(eventArray.getDamage() + (eventArray.getDamage() * zombieMultiplier / 100));
                } else if (eventArray.getEntity() instanceof Skeleton) {
                    int skeletonMultiplier = plugin.getConfig().getInt("Main_Options.Undeadsword.Damagemultiplier.Skeleton");
                    eventArray.setDamage(eventArray.getDamage() + (eventArray.getDamage() * skeletonMultiplier / 100));
                }
            }
        }

    }
}
