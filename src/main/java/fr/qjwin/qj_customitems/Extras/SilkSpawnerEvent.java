/*
Class Name : SilkSpawnerEvent
From Package : fr.qjwin.qj_customitems.Extras
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Extras;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class SilkSpawnerEvent implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent eventArray) {

        if(!eventArray.getBlock().getType().equals(Material.SPAWNER) || eventArray.isCancelled()) {
            return;
        }

        String pluginPrefix = Main.getinstance.getConfig().getString("Prefix");

        if (eventArray.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
            Main.Generate_log(pluginPrefix + eventArray.getPlayer().getName() + " a cassé un spawner mais était en mode créatif.");
            return;
        }

        if(Main.getinstance.getConfig().getBoolean("Require_pickaxe") && !isPickaxe(eventArray.getPlayer().getInventory().getItemInMainHand().getType())) {
            Main.Generate_log(pluginPrefix + eventArray.getPlayer().getName() + " a cassé un spawner, mais n'a pas utilisé de pioche.");
            return;
        }

        if (Main.getinstance.getConfig().getBoolean("Require_silktouch") && !eventArray.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
            Main.Generate_log(pluginPrefix + eventArray.getPlayer().getName() + " a cassé un spawner, mais n'a pas utilisé l'enchantement toucher de la soie.");
            return;
        }

        if(!eventArray.getPlayer().hasPermission("silkspawner.allowdrop")) {
            Main.Generate_log(pluginPrefix + eventArray.getPlayer().getName() + " a cassé un spawner, mais n'avait pas la permission de drop !");
            return;
        }

        eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), new ItemStack(Material.SPAWNER, 1));
        Main.Generate_log(pluginPrefix + eventArray.getPlayer().getName() + " a cassé un spawner avec succès. ");

        CreatureSpawner spawner = (CreatureSpawner) eventArray.getBlock().getState();
        EntityType spawnerType = spawner.getSpawnedType();

        if(!spawnerType.equals(EntityType.UNKNOWN) && !spawnerType.equals(EntityType.PIG)) {
            ItemStack mobEggToSpawn = new ItemStack(Material.valueOf(spawnerType + "_SPAWN_EGG"), 1);
            eventArray.getBlock().getWorld().dropItemNaturally(eventArray.getBlock().getLocation(), mobEggToSpawn);
            Main.Generate_log(eventArray.getPlayer().getName() + " à reçu un oeuf de spawner.");
        }

        eventArray.getBlock().setType(Material.AIR);
        eventArray.setCancelled(true);
    }

    private boolean isPickaxe(Material material) {
        switch(material) {
            case WOODEN_PICKAXE:
            case STONE_PICKAXE:
            case IRON_PICKAXE:
            case GOLDEN_PICKAXE:
            case DIAMOND_PICKAXE:
            case NETHERITE_PICKAXE:
                return true;
            default:
                return false;
        }
    }

}
