/*
Class Name : TrashEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import fr.qjwin.qj_customitems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.Title_Color;
import static fr.qjwin.qj_customitems.Managers.ItemsManager.TrashCan;

public class TrashCanEvent implements Listener {

    Main plugin;
    public TrashCanEvent(Main plugin){
        this.plugin = plugin;
    }

    public String QJRandomID(int IDlenght) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength;
        targetStringLength = IDlenght; // id size
        Random random = new Random();
        String generatedString;
        generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public static void Update_Trashcan() {

        // create holo from file
        final File file_trashcan = new File(Main.getinstance.getDataFolder(), "/Ressources/trashcan.yml");
        final YamlConfiguration config = YamlConfiguration.loadConfiguration(file_trashcan);
        final String parsing_key = "players";

        if (config.contains(parsing_key)){
            for (String getUUIDkey : Objects.requireNonNull(config.getConfigurationSection("players")).getKeys(false)) {
                final String current_usermap = parsing_key + "." + getUUIDkey;
                for (String gettrash_in_map : Objects.requireNonNull(config.getConfigurationSection(current_usermap)).getKeys(false)) {
                    final String current_user_index = current_usermap + "." + gettrash_in_map;

                    try {

                        final String setname = config.getString(current_user_index + ".holo_trashcan_name");
                        final World setworld = Bukkit.getServer().getWorld(Objects.requireNonNull(config.getString(current_user_index + ".holo_trashcan_world")));
                        final double setX = config.getDouble(current_user_index + ".holo_trashcan_x");
                        final double setY = config.getDouble(current_user_index + ".holo_trashcan_y");
                        final double setZ = config.getDouble(current_user_index + ".holo_trashcan_z");
                        final Location holo_location = new Location(setworld, setX, setY, setZ);
                        final String block_owner = config.getString(current_user_index + ".holo_trashcan_owner");
                        final double block_setX = (config.getDouble(current_user_index + ".holo_trashcan_x") - 0.5D);
                        final double block_setY = (config.getDouble(current_user_index + ".holo_trashcan_y") - 2.75D);
                        final double block_setZ = (config.getDouble(current_user_index + ".holo_trashcan_z") - 0.5D);
                        final Location block_location = new Location(setworld, block_setX, block_setY, block_setZ);
                        Hologram PlaceNewHologram = HologramsAPI.createHologram(Main.getinstance, holo_location);
                        PlaceNewHologram.appendItemLine(new ItemStack(TrashCan));
                        PlaceNewHologram.appendTextLine(setname);
                        block_location.getBlock().setMetadata("poubelle", new FixedMetadataValue(Main.getinstance, block_owner));

                    } catch (NoClassDefFoundError errorArray) {
                        errorArray.printStackTrace();
                    }

                }
            }
        }

    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent eventArray) {
        Block blockplaced = eventArray.getBlockPlaced();
        Player player = eventArray.getPlayer();
        if(eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null &&
                eventArray.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains(Title_Color + "ID : §fPBL_01") ) {
            try {
                Location getBlockPlacedLocation = blockplaced.getLocation();
                Hologram PlaceNewHologram = HologramsAPI.createHologram(plugin, getBlockPlacedLocation.add(0.5, 2.75, 0.5));
                String TrashName;
                if(player.hasPermission("op")) {
                    TrashName = "§6Poubelle §bpublic";
                } else {
                    TrashName = "§6Poubelle de §b" + player.getName();
                }
                PlaceNewHologram.appendItemLine(new ItemStack(TrashCan));
                PlaceNewHologram.appendTextLine(TrashName);
                blockplaced.setMetadata("poubelle", new FixedMetadataValue(plugin, player.getName()));


                final File file_trashcan = new File(Main.getinstance.getDataFolder(), "/Ressources/trashcan.yml");
                final YamlConfiguration config = YamlConfiguration.loadConfiguration(file_trashcan);
                final UUID player_uuid = player.getUniqueId();
                final String parsing_key = "players." + player_uuid;

                final String trashcan_uniqueID = QJRandomID(8);

                String current_index = parsing_key + "." + trashcan_uniqueID;
                config.set(current_index + ".holo_trashcan_name", TrashName);
                config.set(current_index + ".holo_trashcan_owner", player.getName());
                config.set(current_index + ".holo_trashcan_world", Objects.requireNonNull(getBlockPlacedLocation.getWorld()).getName());
                config.set(current_index + ".holo_trashcan_x", getBlockPlacedLocation.getX());
                config.set(current_index + ".holo_trashcan_y", getBlockPlacedLocation.getY());
                config.set(current_index + ".holo_trashcan_z", getBlockPlacedLocation.getZ());

                try {
                    config.save(file_trashcan);
                } catch (IOException errorArray) {
                    errorArray.printStackTrace();
                }

            } catch (NoClassDefFoundError errorArray) {
                errorArray.printStackTrace();
            }
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent eventArray) {
        Player player = eventArray.getPlayer();
        Block breakedblock = eventArray.getBlock();
        if(breakedblock.hasMetadata("poubelle")) {
            String trachcanplacedBy = breakedblock.getMetadata("poubelle").get(0).asString();
            if(!player.getName().equals(trachcanplacedBy)) {

                try {

                    for (Hologram hologram : HologramsAPI.getHolograms(plugin)) {
                        Location breakedblockLoc = eventArray.getBlock().getLocation();
                        Location hologramLoc = hologram.getLocation();

                        if (breakedblockLoc.add(0.5, 2.75, 0.5).equals(hologramLoc) || breakedblockLoc.distance(hologramLoc) < 1) {
                            hologram.delete();
                        }
                    }

                    Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                    if (!(drops.size() == 0)) {
                        eventArray.setDropItems(false);
                        eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), TrashCan);
                        breakedblock.removeMetadata("poubelle", plugin);
                        player.sendMessage("§c! Attention ! §fvous cassez une poubelle appartenant à : §b" + trachcanplacedBy + " §f!");
                    }

                    final File file_trashcan = new File(Main.getinstance.getDataFolder(), "/Ressources/trashcan.yml");
                    final YamlConfiguration config = YamlConfiguration.loadConfiguration(file_trashcan);
                    final String parsing_key = "players";
                    final World holo_world = eventArray.getBlock().getWorld();
                    final double holo_x = eventArray.getBlock().getX();
                    final double holo_y = eventArray.getBlock().getY();
                    final double holo_z = eventArray.getBlock().getZ();
                    if (config.contains(parsing_key)){
                        for (String getUUIDkey : Objects.requireNonNull(config.getConfigurationSection("players")).getKeys(false)) {
                            final String current_usermap = parsing_key + "." + getUUIDkey;
                            for (String gettrash_in_map : Objects.requireNonNull(config.getConfigurationSection(current_usermap)).getKeys(false)) {
                                final String current_user_index = current_usermap + "." + gettrash_in_map;
                                if (Objects.requireNonNull(config.getString(current_user_index + ".holo_trashcan_world")).equalsIgnoreCase(holo_world.getName()) &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_x") - 0.5D) == holo_x &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_y") - 2.75D) == holo_y &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_z") - 0.5D) == holo_z) {
                                    config.set(current_user_index, null);
                                    try {
                                        config.save(file_trashcan);
                                    } catch (IOException errorArray) {
                                        errorArray.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                } catch (NoClassDefFoundError errorArray) {
                    errorArray.printStackTrace();
                }

            } else {

                try {
                    for (Hologram hologram : HologramsAPI.getHolograms(plugin)) {
                        Location breakedblockLoc = eventArray.getBlock().getLocation();
                        Location hologramLoc = hologram.getLocation();
                        if (breakedblockLoc.add(0.5, 2.75, 0.5).equals(hologramLoc) || breakedblockLoc.distance(hologramLoc) <= 1) {
                            hologram.delete();
                        }
                    }
                    Collection<ItemStack> drops = eventArray.getBlock().getDrops();
                    if (!(drops.size() == 0)) {
                        eventArray.setDropItems(false);
                        eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), TrashCan);
                        breakedblock.removeMetadata("poubelle", plugin);
                        player.sendMessage("§c! Attention ! §fvous cassez votre poubelle !");
                    }

                    final File file_trashcan = new File(Main.getinstance.getDataFolder(), "/Ressources/trashcan.yml");
                    final YamlConfiguration config = YamlConfiguration.loadConfiguration(file_trashcan);
                    final String parsing_key = "players";
                    final World holo_world = eventArray.getBlock().getWorld();
                    final double holo_x = eventArray.getBlock().getX();
                    final double holo_y = eventArray.getBlock().getY();
                    final double holo_z = eventArray.getBlock().getZ();
                    if (config.contains(parsing_key)){
                        for (String getUUIDkey : Objects.requireNonNull(config.getConfigurationSection("players")).getKeys(false)) {
                            final String current_usermap = parsing_key + "." + getUUIDkey;
                            for (String gettrash_in_map : Objects.requireNonNull(config.getConfigurationSection(current_usermap)).getKeys(false)) {
                                final String current_user_index = current_usermap + "." + gettrash_in_map;
                                if (Objects.requireNonNull(config.getString(current_user_index + ".holo_trashcan_world")).equalsIgnoreCase(holo_world.getName()) &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_x") - 0.5D) == holo_x &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_y") - 2.75D) == holo_y &&
                                        (config.getDouble(current_user_index + ".holo_trashcan_z") - 0.5D) == holo_z) {
                                    config.set(current_user_index, null);
                                    try {
                                        config.save(file_trashcan);
                                    } catch (IOException errorArray) {
                                        errorArray.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                } catch (NoClassDefFoundError errorArray) {
                    errorArray.printStackTrace();
                }

            }
        }
    }


    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eventArray) {

        Player player = eventArray.getPlayer();
        Action playeractions = eventArray.getAction();
        Block clickedblock = eventArray.getClickedBlock();

        if (playeractions == Action.RIGHT_CLICK_BLOCK &&
            Objects.requireNonNull(clickedblock).hasMetadata("poubelle") &&
            clickedblock.getType() == Material.CAULDRON &&
            player.getInventory().getItemInMainHand().getType() != Material.WATER_BUCKET &&
            player.getInventory().getItemInMainHand().getType() != Material.BUCKET &&
            player.getInventory().getItemInMainHand().getType() != Material.GLASS_BOTTLE &&
            player.hasPermission("trashcan.use")) {

            Inventory inventory = Bukkit.createInventory(player, 36, "Poubelle");
            player.openInventory(inventory);
        }

    }



}
