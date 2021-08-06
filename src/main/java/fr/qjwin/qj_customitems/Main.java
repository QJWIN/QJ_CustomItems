package fr.qjwin.qj_customitems;

import fr.qjwin.qj_customitems.Commands.GiveCommand;
import fr.qjwin.qj_customitems.Extras.*;
import fr.qjwin.qj_customitems.ListenerEvents.*;
import fr.qjwin.qj_customitems.Managers.CooldownManager;
import fr.qjwin.qj_customitems.Managers.CraftsManager;
import fr.qjwin.qj_customitems.Managers.ItemsManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    public static Main getinstance;

    @Override
    public void onEnable() {
        getinstance = this;

        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        getServer().getLogger().info("QJ_CustomItems >>> Hooking plugin ...");

        if (!Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
            getServer().getLogger().severe("QJ_CustomItems >> *** HolographicDisplays is not installed or enabled ! ***");
            getServer().getLogger().severe("QJ_CustomItems >> *** this plugin will be disabled ! ***");
            getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
            getServer().getLogger().info("QJ_CustomItems >>> Major error disabling ...");
            getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
            getinstance.setEnabled(false);
            return;
        }
        getServer().getLogger().info("QJ_CustomItems >>> HolographicDisplays detected !");
        boolean useHolographicDisplays = Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays");
        getServer().getLogger().info("QJ_CustomItems >>> HolographicDisplays running : " + useHolographicDisplays);
        getServer().getLogger().info("QJ_CustomItems >>> HolographicDisplays correctly injected in to memory.");
        getServer().getLogger().info("QJ_CustomItems >>> Hooking plugin 1/1 ==> OK");
        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        getServer().getLogger().info("QJ_CustomItems >>> starting enabling plugin ...");
        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        Load_config();
        getServer().getLogger().info("QJ_CustomItems >>> load config file 1/1 ==> OK");

        ItemsManager.init();
        CraftsManager.init();
        getServer().getLogger().info("QJ_CustomItems >>> initialize Manager 2/2 ==> OK");

        Objects.requireNonNull(getinstance.getCommand("Give_GrapplingHook")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_TeleportSword")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_ServerGift")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_ExplosiveBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_InfiniteWaterBucket")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_InfiniteLavaBucket")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_MachineGunBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_MultiBreakPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_CresusPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Boomerang")).setExecutor(new GiveCommand());

        Objects.requireNonNull(getinstance.getCommand("Give_HomingBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_ThrowingAxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_UndeadSword")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Dynamite")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_LightingSword")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_AutoSmeltPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_FireBall")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Grenade")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_HermesShoes")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Landmine")).setExecutor(new GiveCommand());

        Objects.requireNonNull(getinstance.getCommand("Give_InfiniteEmptyBucket")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_haste_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_haste_2")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_haste_3")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_luck_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_luck_2")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_luck_3")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_Resistance_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_Beauty_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_Saturation_1")).setExecutor(new GiveCommand());

        Objects.requireNonNull(getinstance.getCommand("Give_Potion_Absorption_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potion_HealBoost_1")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Potions")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Farmer")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Arrow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Fes")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Indian")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_RED")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_LBLUE")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_YELLOW")).setExecutor(new GiveCommand());

        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_LIME")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_RAINBOW")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Dandy_GLASS")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hat_Squid")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_Hats")).setExecutor(new GiveCommand());
        Objects.requireNonNull(getinstance.getCommand("Give_TrashCan")).setExecutor(new GiveCommand());
        getServer().getLogger().info("QJ_CustomItems >>> initialize commands 46/46 ==> OK");

        getServer().getPluginManager().registerEvents(new ServerGiftEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new GrapplingEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new InfiniteBucketEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new ExplosivBowEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new TeleportSwordEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new MultiBreakPickaxeEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new MachineGunBowEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new CresusPickaxeEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new BoomerangEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new HomingBowEvent(getinstance), getinstance);

        getServer().getPluginManager().registerEvents(new ThrowingAxeEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new UndeadSwordEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new DynamiteEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new LightingSwordEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new AutoSmeltPickaxeEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new GrenadeEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new FireBallEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new HermesShoesEvent(), getinstance);
        getServer().getPluginManager().registerEvents(new LandMineEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new SilkSpawnerEvent(), getinstance);

        getServer().getPluginManager().registerEvents(new TrashCanEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new AntiPlaceHatEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new PlayerBeheadingEvent(getinstance), getinstance);
        getServer().getPluginManager().registerEvents(new PlayerJoinQuitMessageEvent(getinstance), getinstance);
        getServer().getLogger().info("QJ_CustomItems >>> initialize events 24/24 ==> OK");

        CooldownManager.setupCooldown_grappling();
        CooldownManager.setupCooldown_teleportsword();
        CooldownManager.setupCooldown_lightingsword();
        getServer().getLogger().info("QJ_CustomItems >>> load cooldown in memory 3/3 ==> OK");

        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        getServer().getLogger().info("QJ_CustomItems >>> plugin enabled correctly");
        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");

    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("QJ_CustomItems >>> plugin disabled correctly");
    }


    public void Load_config(){
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
    }

    public static void Generate_log(String message) {
        getinstance.getServer().getLogger().info(message);
    }

}
