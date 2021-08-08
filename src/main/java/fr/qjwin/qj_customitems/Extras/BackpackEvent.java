/*
Class Name : BackpackEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import fr.qjwin.qj_customitems.Managers.BackpackManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;

public class BackpackEvent implements Listener {

    @EventHandler
    public static void onInventoryClose(InventoryCloseEvent eventArray) {


        Player player = (Player) eventArray.getPlayer();

        if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
            player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
            player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fBPK_01")) {

            ItemStack item_stack = player.getInventory().getItemInMainHand();
            ItemMeta item_meta = item_stack.getItemMeta();
            List<String> item_lore = item_meta.getLore();
            String getUBID_fromlore = item_lore.get(12);
            String[] splitUBID = getUBID_fromlore.split(" ");
            String backpack_UBID = splitUBID[2];

            if (eventArray.getView().getTitle().contains("Backpack")) {
                final File file_backpacks = new File(Main.getinstance.getDataFolder(), "Ressources/backpack.yml");
                final YamlConfiguration backpacks_config = YamlConfiguration.loadConfiguration(file_backpacks);
                final String parsing_key = "players";

                if (backpacks_config.contains(parsing_key)) {
                    for (String getUUIDkey : Objects.requireNonNull(backpacks_config.getConfigurationSection(parsing_key)).getKeys(false)) {

                        final String current_usermap = parsing_key + "." + getUUIDkey;

                        if (backpacks_config.contains(current_usermap)) {

                            if (backpack_UBID.equalsIgnoreCase(getUUIDkey)) {
                                Inventory Backpack_Inventory = eventArray.getInventory();
                                String inventoryString = BackpackManager.invToBase64(Backpack_Inventory);
                                backpacks_config.set(current_usermap, inventoryString);
                                BackpackManager.file_saveYML(file_backpacks, backpacks_config);
                            }

                        } else {
                            Inventory Backpack_Inventory = eventArray.getInventory();
                            String inventoryString = BackpackManager.invToBase64(Backpack_Inventory);
                            backpacks_config.set(parsing_key + "." + getUUIDkey, inventoryString);
                            BackpackManager.file_saveYML(file_backpacks, backpacks_config);

                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onPlayerRightClick(PlayerInteractEvent eventArray) {
        Player player = eventArray.getPlayer();
        String pluginprefix = Main.getinstance.getConfig().getString("Prefix_String");
        final String parsing_key = "players";

        if (eventArray.getAction() == Action.RIGHT_CLICK_AIR || eventArray.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fBPK_01")) {

                ItemStack item_stack = player.getInventory().getItemInMainHand();
                ItemMeta item_meta = item_stack.getItemMeta();
                List<String> item_lore = item_meta.getLore();
                String getUBID_fromlore = item_lore.get(12);
                String[] splitUBID = getUBID_fromlore.split(" ");
                String backpack_UBID = splitUBID[2];

                if (player.hasPermission("backpacks.use")) {

                    File backpacksFile = new File(Main.getinstance.getDataFolder(), "Ressources/backpack.yml");
                    FileConfiguration backpacks_config = YamlConfiguration.loadConfiguration(backpacksFile);

                    Inventory backpack_inventory;
                    int backpack_smallsize = 9;
                    String backpackTitle = "§3Backpack N° §d" + backpack_UBID ;
                    if (backpacks_config.contains(parsing_key + "." + backpack_UBID)) {

                        String Base64Inventory = backpacks_config.getString(parsing_key + "." + backpack_UBID);

                        try {
                            backpack_inventory = BackpackManager.base64ToInv(Base64Inventory);
                        } catch (IOException e) {
                            backpack_inventory = Bukkit.getServer().createInventory(null, backpack_smallsize, backpackTitle);
                        }
                    } else {

                        backpack_inventory = Bukkit.getServer().createInventory(null, backpack_smallsize, backpackTitle);
                        String inventoryString = BackpackManager.invToBase64(backpack_inventory);
                        backpacks_config.set(parsing_key + "." + backpack_UBID, inventoryString);
                        BackpackManager.file_saveYML(backpacksFile, backpacks_config);
                    }

                    player.openInventory(backpack_inventory);

                } else {
                    player.sendMessage(pluginprefix + "Vous n'avez pas la permission d'ouvrir un sac.");
                    eventArray.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onBackpackPlace(BlockPlaceEvent eventArray) {
        Player player = eventArray.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                player.getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                !player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fBPK_01")) {
            eventArray.setCancelled(true);
        }
    }














}
