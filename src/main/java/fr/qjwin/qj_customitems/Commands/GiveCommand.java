/*
Class Name : GiveGrapplingHook
From Package : fr.qjwin.qj_customitems.Commands
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Commands;

import fr.qjwin.qj_customitems.Listener.ItemsManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("NullableProblems")
public class GiveCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)) {
            sender.sendMessage("Only player can send this command !");
            return true;
        }

        Player player_instance = (Player) sender;

        if (player_instance.hasPermission("op")) {
            if (cmd.getName().equalsIgnoreCase("Give_GrapplingHook")){
                player_instance.getInventory().addItem(ItemsManager.GrapplingHook);
            }
            if (cmd.getName().equalsIgnoreCase("Give_TeleportSword")){
                player_instance.getInventory().addItem(ItemsManager.TeleportSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ServerGift")){
                player_instance.getInventory().addItem(ItemsManager.ServerGift);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ExplosiveBow")) {
                player_instance.getInventory().addItem(ItemsManager.ExplosiveBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteWaterBucket")){
                player_instance.getInventory().addItem(ItemsManager.InfiniteWaterBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteLavaBucket")){
                player_instance.getInventory().addItem(ItemsManager.InfiniteLavaBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_MachineGunBow")){
                player_instance.getInventory().addItem(ItemsManager.MachineGunBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_MultiBreakPickaxe")) {
                player_instance.getInventory().addItem(ItemsManager.MultiBreakPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_CresusPickaxe")){
                player_instance.getInventory().addItem(ItemsManager.CresusPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Boomerang")){
                player_instance.getInventory().addItem(ItemsManager.Boomerang);
            }
            if (cmd.getName().equalsIgnoreCase("Give_HomingBow")){
                player_instance.getInventory().addItem(ItemsManager.HomingBow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_ThrowingAxe")){
                player_instance.getInventory().addItem(ItemsManager.ThrowingAxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_UndeadSword")){
                player_instance.getInventory().addItem(ItemsManager.UndeadSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Dynamite")){
                player_instance.getInventory().addItem(ItemsManager.Dynamite);
            }
            if (cmd.getName().equalsIgnoreCase("Give_LightingSword")){
                player_instance.getInventory().addItem(ItemsManager.LightingSword);
            }
            if (cmd.getName().equalsIgnoreCase("Give_AutoSmeltPickaxe")){
                player_instance.getInventory().addItem(ItemsManager.AutoSmeltPickaxe);
            }
            if (cmd.getName().equalsIgnoreCase("Give_FireBall")){
                player_instance.getInventory().addItem(ItemsManager.FireBall);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Grenade")){
                player_instance.getInventory().addItem(ItemsManager.Grenade);
            }
            if (cmd.getName().equalsIgnoreCase("Give_HermesShoes")){
                player_instance.getInventory().addItem(ItemsManager.HermesShoes);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Landmine")){
                player_instance.getInventory().addItem(ItemsManager.Landmine);
            }
            if (cmd.getName().equalsIgnoreCase("Give_InfiniteEmptyBucket")){
                player_instance.getInventory().addItem(ItemsManager.InfiniteEmptyBucket);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_2")){
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_2);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_haste_3")){
                player_instance.getInventory().addItem(ItemsManager.Potion_haste_3);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_2")){
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_2);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_luck_3")){
                player_instance.getInventory().addItem(ItemsManager.Potion_luck_3);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Resistance_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_Resistance_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Beauty_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_Beauty_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Saturation_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_Saturation_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_Absorption_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_Absorption_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potion_HealBoost_1")){
                player_instance.getInventory().addItem(ItemsManager.Potion_HealBoost_1);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Potions")){
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
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Farmer")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Farmer);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Arrow")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Arrow);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Fes")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Fes);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Indian")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Indian);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_RED")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RED);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_LBLUE")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LBLUE);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_YELLOW")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_YELLOW);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_LIME")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_LIME);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_RAINBOW")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_RAINBOW);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Dandy_GLASS")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Dandy_GLASS);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hat_Squid")){
                player_instance.getInventory().addItem(ItemsManager.Hat_Squid);
            }
            if (cmd.getName().equalsIgnoreCase("Give_Hats")){
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

        } else {
            sender.sendMessage("You are not allowed to use this command ! Only opérator can do this !");
        }

        return true;

    }
}












