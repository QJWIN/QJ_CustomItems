/*
Class Name : HermesShoesEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.ListenerEvents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class HermesShoesEvent implements Listener {

    @EventHandler
    public void onPlayerToggleSrpint(PlayerToggleSprintEvent eventArray) {

        Player player = eventArray.getPlayer();

        if (player.getInventory().getBoots() != null && Objects.requireNonNull(player.getInventory().getBoots()).getItemMeta() != null && Objects.requireNonNull(player.getInventory().getBoots().getItemMeta()).getLore() != null &&
                Objects.requireNonNull(player.getInventory().getBoots().getItemMeta().getLore()).contains(Title_Color + "ID : §fHS_01")) {

            if(!player.isSprinting()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 3));
            } else {
                player.removePotionEffect(PotionEffectType.SPEED);
            }

        }

    }


}





























