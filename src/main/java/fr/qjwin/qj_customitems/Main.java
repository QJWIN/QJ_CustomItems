package fr.qjwin.qj_customitems;

import fr.qjwin.qj_customitems.Commands.GiveCommand;
import fr.qjwin.qj_customitems.Listener.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        getServer().getLogger().info("QJ_CustomItems >>> starting enabling plugin ...");
        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");

        ItemsManager.init();
        getServer().getLogger().info("QJ_CustomItems >>> initialize itemManager 1/1 ==> OK");

        Objects.requireNonNull(this.getCommand("Give_GrapplingHook")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_TeleportSword")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_ServerGift")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_ExplosiveBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_InfiniteWaterBucket")).setExecutor(new GiveCommand());

        Objects.requireNonNull(this.getCommand("Give_InfiniteLavaBucket")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_MachineGunBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_MultiBreakPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_CresusPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_Boomerang")).setExecutor(new GiveCommand());

        Objects.requireNonNull(this.getCommand("Give_HomingBow")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_ThrowingAxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_UndeadSword")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_Dynamite")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_LightingSword")).setExecutor(new GiveCommand());

        Objects.requireNonNull(this.getCommand("Give_AutoSmeltPickaxe")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_FireBall")).setExecutor(new GiveCommand());
        Objects.requireNonNull(this.getCommand("Give_All")).setExecutor(new GiveCommand());
        getServer().getLogger().info("QJ_CustomItems >>> initialize commands 18/18 ==> OK");

        getServer().getPluginManager().registerEvents(new ServerGiftEvent(), this);
        getServer().getPluginManager().registerEvents(new GrapplingEvent(), this);
        getServer().getPluginManager().registerEvents(new InfiniteBucketEvent(), this);
        getServer().getPluginManager().registerEvents(new ExplosivBowEvent(), this);
        getServer().getPluginManager().registerEvents(new TeleportSwordEvent(), this);

        getServer().getPluginManager().registerEvents(new MultiBreakPickaxeEvent(), this);
        getServer().getPluginManager().registerEvents(new MachineGunBowEvent(this), this);
        getServer().getPluginManager().registerEvents(new CresusPickaxeEvent(), this);
        getServer().getPluginManager().registerEvents(new BoomerangEvent(this), this);
        getServer().getPluginManager().registerEvents(new HomingBowEvent(this), this);

        getServer().getPluginManager().registerEvents(new ThrowingAxeEvent(this), this);
        getServer().getPluginManager().registerEvents(new UndeadSwordEvent(this), this);
        getServer().getPluginManager().registerEvents(new DynamiteEvent(), this);
        getServer().getPluginManager().registerEvents(new LightingSwordEvent(), this);
        getServer().getPluginManager().registerEvents(new AutoSmeltPickaxeEvent(), this);

        getServer().getPluginManager().registerEvents(new FireBallEvent(this), this);
        getServer().getLogger().info("QJ_CustomItems >>> initialize events 16/16 ==> OK");

        Cooldown.setupCooldown_grappling();
        Cooldown.setupCooldown_teleportsword();
        getServer().getLogger().info("QJ_CustomItems >>> load cooldown in memory 2/2 ==> OK");

        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        getServer().getLogger().info("QJ_CustomItems >>> load config file 1/1 ==> OK");

        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");
        getServer().getLogger().info("QJ_CustomItems >>> plugin enabled correctly");
        getServer().getLogger().info("QJ_CustomItems >>> --------------------------------------");

    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("QJ_CustomItems >>> plugin disabled correctly");
    }

}
