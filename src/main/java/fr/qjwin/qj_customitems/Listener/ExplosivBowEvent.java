/*
Class Name : ExplosivBowEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class ExplosivBowEvent implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent eventArray){
        if (eventArray.getEntity() instanceof Arrow) {
            Arrow entityArrow = (Arrow) eventArray.getEntity();
            if (eventArray.getEntity().getShooter() instanceof Player) {
                Player ShooterPlayer = (Player) entityArrow.getShooter();
                Location arrow_location = entityArrow.getLocation();
                World arrow_world = Objects.requireNonNull(ShooterPlayer).getWorld();
                if (ShooterPlayer.getInventory().getItemInMainHand().getItemMeta() != null && ShooterPlayer.getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(ShooterPlayer.getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fEB_01")) {
                    arrow_world.createExplosion(arrow_location, 2, false, false);
                }
            }
        }
    }

}
