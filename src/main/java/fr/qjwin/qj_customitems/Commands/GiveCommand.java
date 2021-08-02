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
            if (cmd.getName().equalsIgnoreCase("Give_All")){
                player_instance.getInventory().addItem(ItemsManager.GrapplingHook);
                player_instance.getInventory().addItem(ItemsManager.TeleportSword);
                player_instance.getInventory().addItem(ItemsManager.ServerGift);
                player_instance.getInventory().addItem(ItemsManager.ExplosiveBow);
                player_instance.getInventory().addItem(ItemsManager.InfiniteWaterBucket);
                player_instance.getInventory().addItem(ItemsManager.InfiniteLavaBucket);
                player_instance.getInventory().addItem(ItemsManager.MachineGunBow);
                player_instance.getInventory().addItem(ItemsManager.MultiBreakPickaxe);
                player_instance.getInventory().addItem(ItemsManager.CresusPickaxe);
                player_instance.getInventory().addItem(ItemsManager.Boomerang);
                player_instance.getInventory().addItem(ItemsManager.HomingBow);
                player_instance.getInventory().addItem(ItemsManager.ThrowingAxe);
                player_instance.getInventory().addItem(ItemsManager.UndeadSword);
                player_instance.getInventory().addItem(ItemsManager.Dynamite);
                player_instance.getInventory().addItem(ItemsManager.LightingSword);
                player_instance.getInventory().addItem(ItemsManager.AutoSmeltPickaxe);
                player_instance.getInventory().addItem(ItemsManager.FireBall);
                player_instance.getInventory().addItem(ItemsManager.Grenade);
                player_instance.getInventory().addItem(ItemsManager.HermesShoes);
                player_instance.getInventory().addItem(ItemsManager.Landmine);
                player_instance.getInventory().addItem(ItemsManager.InfiniteEmptyBucket);
            }
        } else {
            sender.sendMessage("You are not allowed to use this command ! Only opérator can do this !");
        }

        return true;

    }
}












