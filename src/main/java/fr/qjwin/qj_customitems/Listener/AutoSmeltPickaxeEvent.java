/*
Class Name : AutoSmeltPickaxeEvent
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import java.util.Iterator;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Listener.ItemsManager.Title_Color;

public class AutoSmeltPickaxeEvent implements Listener {


    @EventHandler
    public void onBreak(BlockDropItemEvent eventArray) {

        if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && Objects.requireNonNull(Objects.requireNonNull(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains(Title_Color + "ID : §fAP_01")) {

            Iterator<Recipe> recipes = Bukkit.recipeIterator();

            while(recipes.hasNext()){

                Recipe recipe = recipes.next();

                if(recipe instanceof FurnaceRecipe) {

                    FurnaceRecipe furnaceRecipe = (FurnaceRecipe) recipe;

                    for (int i = 0; i < eventArray.getItems().size(); i++) {

                        ItemStack drop = eventArray.getItems().get(i).getItemStack();

                        if(drop.getType() == Material.SAND &&
                                drop.getType() == Material.RED_SAND &&
                                drop.getType() == Material.STONE &&
                                drop.getType() == Material.ANCIENT_DEBRIS &&
                                drop.getType() == Material.KELP &&
                                drop.getType() == Material.SANDSTONE &&
                                drop.getType() == Material.RED_SANDSTONE &&
                                drop.getType() == Material.QUARTZ_BLOCK &&
                                drop.getType() == Material.CLAY &&
                                drop.getType() == Material.TERRACOTTA &&
                                drop.getType() == Material.WHITE_TERRACOTTA &&
                                drop.getType() == Material.ORANGE_TERRACOTTA &&
                                drop.getType() == Material.MAGENTA_TERRACOTTA &&
                                drop.getType() == Material.LIGHT_BLUE_TERRACOTTA &&
                                drop.getType() == Material.YELLOW_TERRACOTTA &&
                                drop.getType() == Material.LIME_TERRACOTTA &&
                                drop.getType() == Material.PINK_TERRACOTTA &&
                                drop.getType() == Material.GRAY_TERRACOTTA &&
                                drop.getType() == Material.LIGHT_GRAY_TERRACOTTA &&
                                drop.getType() == Material.CYAN_TERRACOTTA &&
                                drop.getType() == Material.PURPLE_TERRACOTTA &&
                                drop.getType() == Material.BLUE_TERRACOTTA &&
                                drop.getType() == Material.BROWN_TERRACOTTA &&
                                drop.getType() == Material.GREEN_TERRACOTTA &&
                                drop.getType() == Material.RED_TERRACOTTA &&
                                drop.getType() == Material.BLACK_TERRACOTTA &&
                                drop.getType() == Material.SEA_PICKLE &&
                                drop.getType() == Material.CACTUS &&
                                drop.getType() == Material.WET_SPONGE &&
                                drop.getType() == Material.STONE_BRICKS &&
                                drop.getType() == Material.NETHERRACK &&
                                drop.getType() == Material.CHORUS_FRUIT ) { return; }

                        if(furnaceRecipe.getInputChoice().test(drop)) {
                            ItemStack newdrop = furnaceRecipe.getResult();
                            newdrop.setAmount(drop.getAmount());
                            eventArray.getItems().remove(eventArray.getItems().get(i));
                            eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation().add(0.5,0.5,0.5), newdrop);
                        }

                    }

                }

            }


        }




    }


}


























