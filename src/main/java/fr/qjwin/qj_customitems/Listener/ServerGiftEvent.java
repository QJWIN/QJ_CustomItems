/*
Class Name : ItemsEvents
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.*;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class ServerGiftEvent implements Listener {

    private final ItemStack[] ItemsGiftArray = {
            new ItemStack(Material.BEETROOT, 23),
            new ItemStack(Material.BONE, 16),
            new ItemStack(Material.LEATHER, 8),
            new ItemStack(Material.GHAST_TEAR, 1),
            new ItemStack(Material.NAUTILUS_SHELL, 2),
            new ItemStack(Material.SHULKER_SHELL, 1),
            new ItemStack(Material.POTATO, 23),
            new ItemStack(Material.CARROT, 23),
            new ItemStack(Material.CAKE, 1),
            new ItemStack(Material.STICK, 48),
            new ItemStack(Material.COAL, 32),
            new ItemStack(Material.LAPIS_LAZULI, 21),
            new ItemStack(Material.IRON_INGOT, 20),
            new ItemStack(Material.IRON_INGOT, 15),
            new ItemStack(Material.GOLD_INGOT, 16),
            new ItemStack(Material.GOLD_INGOT, 11),
            new ItemStack(Material.DIAMOND, 9),
            new ItemStack(Material.DIAMOND, 6),
            new ItemStack(Material.EMERALD, 5),
            new ItemStack(Material.EMERALD, 2),
            new ItemStack(Material.NETHERITE_INGOT, 1)
    };

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eventArray) {

        Player player_instance = eventArray.getPlayer();

        if (eventArray.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fSG_01")) {
                Random getRandomizedNumber = new Random();
                eventArray.getPlayer().getInventory().removeItem(ItemsManager.ServerGift);
                eventArray.getPlayer().getInventory().addItem(ItemsGiftArray[getRandomizedNumber.nextInt(ItemsGiftArray.length)]);
                player_instance.sendMessage("§aVous vennez de reçevoir un Cadeau !");
                eventArray.setCancelled(true);
            }
        }

        if (eventArray.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fSG_01")) {
                Random getRandomizedNumber = new Random();
                eventArray.getPlayer().getInventory().removeItem(ItemsManager.ServerGift);
                eventArray.getPlayer().getInventory().addItem(ItemsGiftArray[getRandomizedNumber.nextInt(ItemsGiftArray.length)]);
                player_instance.sendMessage("§aVous vennez de reçevoir un Cadeau !");
                eventArray.setCancelled(true);
            }
        }
    }

}



















