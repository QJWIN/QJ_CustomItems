/*
Class Name : UndeadSwordEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Objects;


public class UndeadSwordEvent implements Listener {

    Main plugin;
    public UndeadSwordEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent eventArray) {
        Player player = (Player) eventArray.getDamager();

        if(player.getInventory().getItemInMainHand().getItemMeta() != null && player.getInventory().getItemInMainHand().getItemMeta() .getLore() != null && Objects.requireNonNull(Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta() ).getLore()).contains("§c§kH§r §6ID §c§kH§r §6: §fUS_01")) {

            if(eventArray.getEntity() instanceof Zombie) {
                int zombieMultiplier = plugin.getConfig().getInt("undeadsword.damagemultiplier.zombie");
                eventArray.setDamage(eventArray.getDamage() + (eventArray.getDamage() * zombieMultiplier / 100));
            } else if (eventArray.getEntity() instanceof Skeleton) {
                int skeletonMultiplier = plugin.getConfig().getInt("undeadsword.damagemultiplier.skeleton");
                eventArray.setDamage(eventArray.getDamage() + (eventArray.getDamage() * skeletonMultiplier / 100));
            }
            player.sendMessage(String.valueOf(eventArray.getDamage()));

        }
        player.sendMessage(String.valueOf(eventArray.getDamage()));
    }


}
