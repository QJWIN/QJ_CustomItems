/*
Class Name : PlayerBeheadingEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Objects;
import java.util.Random;

public class PlayerBeheadingEvent implements Listener {

    Main plugin;
    public PlayerBeheadingEvent(Main plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        if(plugin.getConfig().getBoolean("enable_beheading_player")){

            Random generateNumber = new Random();
            double getvalueof = generateNumber.nextDouble();
            // 10% = 0.10
            double GetChanceAmount = plugin.getConfig().getDouble("beheading_chance");

            if(getvalueof <= GetChanceAmount){
                ItemStack skull = new ItemStack(Material.PLAYER_HEAD,1);
                SkullMeta meta = (SkullMeta) skull.getItemMeta();
                Objects.requireNonNull(meta).setOwningPlayer(event.getEntity());
                skull.setItemMeta(meta);
                event.getEntity().getWorld().dropItem(event.getEntity().getLocation(), skull);
                event.getEntity().sendMessage("Vous vennez de perdre votre tête !");
                Main.getinstance.getLogger().info("Player dead > " + event.getEntity().getName() + " | chance > " + GetChanceAmount + "|" + getvalueof + " | Head dropped");
            } else {
                Main.getinstance.getLogger().info("Player dead > " + event.getEntity().getName() + " | chance > " + GetChanceAmount + "|" + getvalueof + " | Head not dropped");
            }

        }

    }

}
