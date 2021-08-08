/*
Class Name : GiveGrapplingHook
From Package : fr.qjwin.qj_customitems.Commands
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Managers;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.*;
import static org.bukkit.inventory.ItemFlag.HIDE_ENCHANTS;

@SuppressWarnings("NullableProblems")
public class CommandManager implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof ConsoleCommandSender) {
            if (cmd.getName().equalsIgnoreCase("Give_Backpack")) {

                if (args[0] != null) {
                    if (sender.hasPermission("op")) {
                        String Target = args[0];

                        Player playerTarget = Main.getinstance.getServer().getPlayer(Target);

                        ItemStack Backpack_Stack = new ItemStack(Material.STONE_HOE, 1);
                        ItemMeta Backpack_Meta = Backpack_Stack.getItemMeta();
                        Objects.requireNonNull(Backpack_Meta).setDisplayName("§c★ §6Sac à dos §c★");
                        List<String> Backpack_Lore = new ArrayList<>();
                        Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                        Backpack_Lore.add(Title_Color + "Description :");
                        Backpack_Lore.add("§fInventé par le grand §bQJWIN");
                        Backpack_Lore.add("§fCe sac vous serviras pour");
                        Backpack_Lore.add("§fagrandir vos poches.");
                        Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                        Backpack_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
                        Backpack_Lore.add(Title_Color + "Pouvoir : §cSac  à dos");
                        Backpack_Lore.add(Title_Color + "Effet -> §fclique §adroit §f:");
                        Backpack_Lore.add("§fOuvre le sac à dos.");
                        Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                        Backpack_Lore.add(Title_Color + "ID : §fBPK_01");
                        Backpack_Lore.add(Title_Color + "UBID :§f " + BackpackManager.QJRandomID(8));
                        Backpack_Meta.setLore(Backpack_Lore);
                        Backpack_Meta.setCustomModelData(BackpackManager.GetCustomSmallTexture());
                        Backpack_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
                        Backpack_Meta.addItemFlags(HIDE_ENCHANTS);
                        Backpack_Stack.setItemMeta(Backpack_Meta);

                        Objects.requireNonNull(playerTarget).getInventory().addItem(Backpack_Stack);
                    }
                } else {
                    sender.sendMessage("Need a player argument !");
                }

            }

        }

        if (!(sender instanceof Player) && !(sender instanceof ConsoleCommandSender)) {
            sender.sendMessage("Only player or console can send this command !");
            return true;
        }

        if (args[0] == null) {

        Player player_instance = (Player) sender;

        // command under op need's
        if (player_instance.hasPermission("op")) {
            if (cmd.getName().equalsIgnoreCase("Give_GrapplingHook")) {
                player_instance.getInventory().addItem(ItemsManager.GrapplingHook);
            }
            if (cmd.getName().equalsIgnoreCase("Give_TeleportSword")) {
                player_instance.getInventory().addItem(ItemsManager.TeleportSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ServerGift")) {
                player_instance.getInventory().addItem(ItemsManager.ServerGift);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ExplosiveBow")) {
                player_instance.getInventory().addItem(ItemsManager.ExplosiveBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteWaterBucket")) {
                player_instance.getInventory().addItem(ItemsManager.InfiniteWaterBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteLavaBucket")) {
                player_instance.getInventory().addItem(ItemsManager.InfiniteLavaBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_MachineGunBow")) {
                player_instance.getInventory().addItem(ItemsManager.MachineGunBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_MultiBreakPickaxe")) {
                player_instance.getInventory().addItem(ItemsManager.MultiBreakPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_CresusPickaxe")) {
                player_instance.getInventory().addItem(ItemsManager.CresusPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Boomerang")) {
                player_instance.getInventory().addItem(ItemsManager.Boomerang);
            }
            if (cmd.getName().equalsIgnoreCase("Give_HomingBow")) {
                player_instance.getInventory().addItem(ItemsManager.HomingBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ThrowingAxe")) {
                player_instance.getInventory().addItem(ItemsManager.ThrowingAxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_UndeadSword")) {
                player_instance.getInventory().addItem(ItemsManager.UndeadSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Dynamite")) {
                player_instance.getInventory().addItem(ItemsManager.Dynamite);
            }
            if (cmd.getName().equalsIgnoreCase("Give_LightingSword")) {
                player_instance.getInventory().addItem(ItemsManager.LightingSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_AutoSmeltPickaxe")) {
                player_instance.getInventory().addItem(ItemsManager.AutoSmeltPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_FireBall")) {
                player_instance.getInventory().addItem(ItemsManager.FireBall);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Grenade")) {
                player_instance.getInventory().addItem(ItemsManager.Grenade);
            }
            if (cmd.getName().equalsIgnoreCase("Give_HermesShoes")) {
                player_instance.getInventory().addItem(ItemsManager.HermesShoes);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Landmine")) {
                player_instance.getInventory().addItem(ItemsManager.Landmine);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteEmptyBucket")) {
                player_instance.getInventory().addItem(ItemsManager.InfiniteEmptyBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_2")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_2);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_3")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_3);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_2")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_2);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_3")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_3);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Resistance_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_Resistance_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Beauty_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_Beauty_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Saturation_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_Saturation_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Absorption_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_Absorption_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_HealBoost_1")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_HealBoost_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potions")) {
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_2);
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_3);
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_2);
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_3);
                player_instance.getInventory().addItem(ItemsManager.Potion_Resistance_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_Beauty_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_Saturation_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_Absorption_1);
                player_instance.getInventory().addItem(ItemsManager.Potion_HealBoost_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Farmer")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Farmer);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Arrow")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Arrow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Fes")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Fes);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Indian")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Indian);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_RED")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RED);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_LBLUE")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LBLUE);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_YELLOW")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_YELLOW);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_LIME")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LIME);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_RAINBOW")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RAINBOW);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_GLASS")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_GLASS);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Squid")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Squid);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hats")) {
                player_instance.getInventory().addItem(ItemsManager.Hat_Farmer);
                player_instance.getInventory().addItem(ItemsManager.Hat_Arrow);
                player_instance.getInventory().addItem(ItemsManager.Hat_Fes);
                player_instance.getInventory().addItem(ItemsManager.Hat_Indian);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RED);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LBLUE);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_YELLOW);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LIME);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RAINBOW);
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_GLASS);
                player_instance.getInventory().addItem(ItemsManager.Hat_Squid);
            }
            if (cmd.getName().equalsIgnoreCase("Give_TrashCan")) {
                player_instance.getInventory().addItem(ItemsManager.TrashCan);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Backpack")) {

                ItemStack Backpack_Stack = new ItemStack(Material.STONE_HOE, 1);
                ItemMeta Backpack_Meta = Backpack_Stack.getItemMeta();
                Objects.requireNonNull(Backpack_Meta).setDisplayName("§c★ §6Sac à dos §c★");
                List<String> Backpack_Lore = new ArrayList<>();
                Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                Backpack_Lore.add(Title_Color + "Description :");
                Backpack_Lore.add("§fInventé par le grand §bQJWIN");
                Backpack_Lore.add("§fCe sac vous serviras pour");
                Backpack_Lore.add("§fagrandir vos poches.");
                Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                Backpack_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
                Backpack_Lore.add(Title_Color + "Pouvoir : §cSac  à dos");
                Backpack_Lore.add(Title_Color + "Effet -> §fclique §adroit §f:");
                Backpack_Lore.add("§fOuvre le sac à dos.");
                Backpack_Lore.add(Separator_Color + "§m--------------------------------");
                Backpack_Lore.add(Title_Color + "ID : §fBPK_01");
                Backpack_Lore.add(Title_Color + "UBID :§f " + BackpackManager.QJRandomID(8));
                Backpack_Meta.setLore(Backpack_Lore);
                Backpack_Meta.setCustomModelData(BackpackManager.GetCustomSmallTexture());
                Backpack_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
                Backpack_Meta.addItemFlags(HIDE_ENCHANTS);
                Backpack_Stack.setItemMeta(Backpack_Meta);

                player_instance.getInventory().addItem(Backpack_Stack);

            }
            // non OP COMMANDS
        } else {
            player_instance.sendMessage("Vous n'avez pas la permission d'utilisé cette commande ! Seulment les opérateurs peuvent !");
        }

        if (Main.getinstance.getConfig().getBoolean("Main_Options.enable_player_home")) {

            if (player_instance.hasPermission("op") || player_instance.hasPermission("home.global")) {

                if (cmd.getName().equalsIgnoreCase("sethome")) {

                    final Location player_Location = player_instance.getLocation();
                    final File savefile = new File(Main.getinstance.getDataFolder(), "/Ressources/homes.yml");
                    final YamlConfiguration config = YamlConfiguration.loadConfiguration(savefile);
                    final UUID player_uuid = player_instance.getUniqueId();
                    final String parsing_key = "players." + player_uuid;

                    config.set(parsing_key + ".world", Objects.requireNonNull(player_Location.getWorld()).getName());
                    config.set(parsing_key + ".x", player_Location.getX());
                    config.set(parsing_key + ".y", player_Location.getY());
                    config.set(parsing_key + ".z", player_Location.getZ());
                    config.set(parsing_key + ".yaw", player_Location.getYaw());
                    config.set(parsing_key + ".pitch", player_Location.getPitch());


                    try {
                        config.save(savefile);
                    } catch (IOException errorArray) {
                        errorArray.printStackTrace();
                    }
                }

                if (cmd.getName().equalsIgnoreCase("home")) {
                    final File savefile = new File(Main.getinstance.getDataFolder(), "/Ressources/homes.yml");
                    final YamlConfiguration config = YamlConfiguration.loadConfiguration(savefile);
                    final UUID player_uuid = player_instance.getUniqueId();
                    final String parsing_key = "players." + player_uuid;
                    final ConfigurationSection configurationSection = config.getConfigurationSection(parsing_key);
                    if (configurationSection == null) {
                        player_instance.sendMessage("Veuillez définir un  point de home avant de vous téléporter (/setqjhome)");
                    } else {
                        final World world = Bukkit.getWorld(Objects.requireNonNull(configurationSection.getString("world")));
                        final double x = configurationSection.getDouble("x");
                        final double y = configurationSection.getDouble("y");
                        final double z = configurationSection.getDouble("z");
                        final float yaw = (float) configurationSection.getDouble("yaw");
                        final float pitch = (float) configurationSection.getDouble("pitch");
                        final Location homeLocation = new Location(world, x, y, z, yaw, pitch);
                        player_instance.teleport(homeLocation);
                        player_instance.sendMessage("Bienvenue chez vous !");
                    }
                }

            } else {
                player_instance.sendMessage("Vous n'avez pas la permission d'utilisé cette commande ! Permission : 'home.global' requise !");
            }

        } else {
            player_instance.sendMessage("L'option 'enable_player_home' est désactivé ! Les commandes /sethome, /home sont désactivée.");
        }

        }

    return true;
    }
}












