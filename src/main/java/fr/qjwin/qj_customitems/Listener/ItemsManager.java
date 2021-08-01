/*
Class Name : ItemsManager
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static org.bukkit.inventory.ItemFlag.*;

public class ItemsManager {

    public static ItemStack GrapplingHook;
    public static ItemStack TeleportSword;
    public static ItemStack ServerGift;
    public static ItemStack ExplosiveBow;
    public static ItemStack InfiniteWaterBucket;
    public static ItemStack InfiniteLavaBucket;
    public static ItemStack MachineGunBow;
    public static ItemStack MultiBreakPickaxe;
    public static ItemStack CresusPickaxe;
    public static ItemStack Boomerang;
    public static ItemStack HomingBow;
    public static ItemStack ThrowingAxe;
    public static ItemStack UndeadSword;
    public static ItemStack Dynamite;

    public static void init (){
        CreateGrapplingHook();
        CreateTeleportSword();
        CreateServerGift();
        CreateExplosiveBow();
        CreateInfiniteWaterBucket();
        CreateInfiniteLavaBucket();
        CreateMachineGunBow();
        CreateMultiBreakPickaxe();
        CreateCresusPickaxe();
        CreateBoomerang();
        CreateHomingBow();
        CreateThrowingAxe();
        CreateUndeadSword();
        CreateDynamite();
    }

    private static void CreateGrapplingHook(){
        ItemStack GrapplingHook_Stack = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta GrapplingHook_Meta = GrapplingHook_Stack.getItemMeta();
        Objects.requireNonNull(GrapplingHook_Meta).setDisplayName("§6Grappin");
        List<String> GrapplingHook_Lore = new ArrayList<>();
        GrapplingHook_Lore.add("§bPermet de grimppé les murs !");
        GrapplingHook_Lore.add("§bCooldown : §e8 §bsecondes.");
        GrapplingHook_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fGH_01");
        GrapplingHook_Meta.setLore(GrapplingHook_Lore);
        GrapplingHook_Meta.setUnbreakable(true);
        GrapplingHook_Meta.addItemFlags(HIDE_UNBREAKABLE);
        GrapplingHook_Stack.setItemMeta(GrapplingHook_Meta);
        GrapplingHook = GrapplingHook_Stack;
    }

    private static void CreateTeleportSword() {
        ItemStack TeleportSword_Stack = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta TeleportSword_Meta = TeleportSword_Stack.getItemMeta();
        Objects.requireNonNull(TeleportSword_Meta).setDisplayName("§6Epée d'enderman");
        List<String> TeleportSword_Lore = new ArrayList<>();
        TeleportSword_Lore.add("§bCette épée à les pouvoirs");
        TeleportSword_Lore.add("§bdes endermans !");
        TeleportSword_Lore.add("§bClique §adroit §bpour activé.");
        TeleportSword_Lore.add("§bCooldown : §e5 §bsecondes.");
        TeleportSword_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fTS_01");
        TeleportSword_Meta.setLore(TeleportSword_Lore);
        TeleportSword_Meta.setCustomModelData(15);
        TeleportSword_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        TeleportSword_Meta.addItemFlags(HIDE_ENCHANTS);
        TeleportSword_Meta.setUnbreakable(true);
        TeleportSword_Meta.addItemFlags(HIDE_UNBREAKABLE);
        TeleportSword_Stack.setItemMeta(TeleportSword_Meta);
        TeleportSword = TeleportSword_Stack;
    }

    private static void CreateServerGift() {
        ItemStack ServerGift_Stack = new ItemStack(Material.SHEARS, 1);
        ItemMeta ServerGift_Meta = ServerGift_Stack.getItemMeta();
        Objects.requireNonNull(ServerGift_Meta).setDisplayName("§6Cadeau n°1");
        List<String> ServerGift_Lore = new ArrayList<>();
        ServerGift_Lore.add("§6▁▂▃▅▆▇ §f● §bSURPRISE §f● §6▇▆▅▃▂▁");
        ServerGift_Lore.add("§bClique §adroit §bpour ouvrir !");
        ServerGift_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fSG_01");
        ServerGift_Meta.setLore(ServerGift_Lore);
        ServerGift_Meta.setCustomModelData(61);
        ServerGift_Meta.setUnbreakable(true);
        ServerGift_Meta.addItemFlags(HIDE_UNBREAKABLE);
        ServerGift_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        ServerGift_Meta.addItemFlags(HIDE_ENCHANTS);
        ServerGift_Stack.setItemMeta(ServerGift_Meta);
        ServerGift = ServerGift_Stack;
    }

    private static void CreateExplosiveBow() {
        ItemStack ExplosiveBow_Stack = new ItemStack(Material.BOW, 1);
        ItemMeta ExplosiveBow_Meta = ExplosiveBow_Stack.getItemMeta();
        Objects.requireNonNull(ExplosiveBow_Meta).setDisplayName("§6Arc à flèches explosives");
        List<String> ExplosiveBow_Lore = new ArrayList<>();
        ExplosiveBow_Lore.add("§bArc extrèmement dangereux !");
        ExplosiveBow_Lore.add("§bA utiliser avec précaution !");
        ExplosiveBow_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fEB_01");
        ExplosiveBow_Meta.setLore(ExplosiveBow_Lore);
        ExplosiveBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        ExplosiveBow_Meta.addItemFlags(HIDE_ENCHANTS);
        ExplosiveBow_Stack.setItemMeta(ExplosiveBow_Meta);
        ExplosiveBow = ExplosiveBow_Stack;
    }

    private static void CreateInfiniteWaterBucket(){
        ItemStack InfiniteWaterBucket_Stack = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta InfiniteWaterBucket_Meta = InfiniteWaterBucket_Stack.getItemMeta();
        Objects.requireNonNull(InfiniteWaterBucket_Meta).setDisplayName("§6Seau d'eau infini");
        List<String> InfiniteWaterBucket_Lore = new ArrayList<>();
        InfiniteWaterBucket_Lore.add("§bCe seau ne ce vide jamais");
        InfiniteWaterBucket_Lore.add("§bne le perdez pas !");
        InfiniteWaterBucket_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fWB_01");
        InfiniteWaterBucket_Meta.setLore(InfiniteWaterBucket_Lore);
        InfiniteWaterBucket_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        InfiniteWaterBucket_Meta.addItemFlags(HIDE_ENCHANTS);
        InfiniteWaterBucket_Stack.setItemMeta(InfiniteWaterBucket_Meta);
        InfiniteWaterBucket = InfiniteWaterBucket_Stack;
    }

    private static void CreateInfiniteLavaBucket(){
        ItemStack InfiniteLavaBucket_Stack = new ItemStack(Material.LAVA_BUCKET, 1);
        ItemMeta InfiniteLavaBucket_Meta = InfiniteLavaBucket_Stack.getItemMeta();
        Objects.requireNonNull(InfiniteLavaBucket_Meta).setDisplayName("§6Seau de lave infini");
        List<String> InfiniteLavaBucket_Lore = new ArrayList<>();
        InfiniteLavaBucket_Lore.add("§bCe seau ne ce vide jamais");
        InfiniteLavaBucket_Lore.add("§bne le perdez pas !");
        InfiniteLavaBucket_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fLB_01");
        InfiniteLavaBucket_Meta.setLore(InfiniteLavaBucket_Lore);
        InfiniteLavaBucket_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        InfiniteLavaBucket_Meta.addItemFlags(HIDE_ENCHANTS);
        InfiniteLavaBucket_Stack.setItemMeta(InfiniteLavaBucket_Meta);
        InfiniteLavaBucket = InfiniteLavaBucket_Stack;
    }

    private static void CreateMachineGunBow () {
        ItemStack MachineGunBow_Stack = new ItemStack(Material.BOW, 1);
        ItemMeta MachineGunBow_Meta = MachineGunBow_Stack.getItemMeta();
        Objects.requireNonNull(MachineGunBow_Meta).setDisplayName("§6Arc machine gun");
        List<String> MachineGunBow_Lore = new ArrayList<>();
        MachineGunBow_Lore.add("§bClique §agauche §bpour activer");
        MachineGunBow_Lore.add("§bTire 5 flèches par secondes");
        MachineGunBow_Lore.add("§bpendant 5 secondes !");
        MachineGunBow_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fMB_01");
        MachineGunBow_Meta.setLore(MachineGunBow_Lore);
        MachineGunBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        MachineGunBow_Meta.addItemFlags(HIDE_ENCHANTS);
        MachineGunBow_Stack.setItemMeta(MachineGunBow_Meta);
        MachineGunBow = MachineGunBow_Stack;
    }

    private static void CreateMultiBreakPickaxe(){
        ItemStack MultiBreakPickaxe_Stack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta MultiBreakPickaxe_Meta = MultiBreakPickaxe_Stack.getItemMeta();
        Objects.requireNonNull(MultiBreakPickaxe_Meta).setDisplayName("§6Marteau de minage");
        List<String> MultiBreakPickaxe_Lore = new ArrayList<>();
        MultiBreakPickaxe_Lore.add("§bDégage une zone de 3x3 blocs");
        MultiBreakPickaxe_Lore.add("§bde stone uniquement !");
        MultiBreakPickaxe_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fMP_01");
        MultiBreakPickaxe_Meta.setLore(MultiBreakPickaxe_Lore);
        MultiBreakPickaxe_Meta.setCustomModelData(1);
        MultiBreakPickaxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        MultiBreakPickaxe_Meta.addItemFlags(HIDE_ENCHANTS);
        MultiBreakPickaxe_Meta.setUnbreakable(true);
        MultiBreakPickaxe_Meta.addItemFlags(HIDE_UNBREAKABLE);
        MultiBreakPickaxe_Stack.setItemMeta(MultiBreakPickaxe_Meta);
        MultiBreakPickaxe  = MultiBreakPickaxe_Stack;
    }

    private static void CreateCresusPickaxe() {
        ItemStack CresusPickaxe_Stack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta CresusPickaxe_Meta = CresusPickaxe_Stack.getItemMeta();
        Objects.requireNonNull(CresusPickaxe_Meta).setDisplayName("§6Pioche de Crésus");
        List<String> CresusPickaxe_Lore = new ArrayList<>();
        CresusPickaxe_Lore.add("§bIl est dit que tout ce");
        CresusPickaxe_Lore.add("§bqui est cassé par cette");
        CresusPickaxe_Lore.add("§bpioche ce transforme en or !");
        CresusPickaxe_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fCP_01");
        CresusPickaxe_Meta.setLore(CresusPickaxe_Lore);
        CresusPickaxe_Meta.setCustomModelData(8);
        CresusPickaxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        CresusPickaxe_Meta.addItemFlags(HIDE_ENCHANTS);
        CresusPickaxe_Meta.setUnbreakable(true);
        CresusPickaxe_Meta.addItemFlags(HIDE_UNBREAKABLE);
        CresusPickaxe_Stack.setItemMeta(CresusPickaxe_Meta);
        CresusPickaxe = CresusPickaxe_Stack;
    }

    private static void CreateBoomerang() {
        ItemStack Boomerang_Stack = new ItemStack(Material.BONE, 1);
        ItemMeta Boomerang_Meta = Boomerang_Stack.getItemMeta();
        Objects.requireNonNull(Boomerang_Meta).setDisplayName("§6Boomerang");
        List<String> Boomerang_Lore = new ArrayList<>();
        Boomerang_Lore.add("§bVéritable Boomerang Australien !");
        Boomerang_Lore.add("§bLancez le avec prudence il met");
        Boomerang_Lore.add("§bdes dégats !");
        Boomerang_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fBR_01");
        Boomerang_Meta.setLore(Boomerang_Lore);
        Boomerang_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        Boomerang_Meta.addItemFlags(HIDE_ENCHANTS);
        Boomerang_Meta.setUnbreakable(true);
        Boomerang_Meta.addItemFlags(HIDE_UNBREAKABLE);
        Boomerang_Stack.setItemMeta(Boomerang_Meta);
        Boomerang = Boomerang_Stack;
    }

    private static void CreateHomingBow() {
        ItemStack HomingBow_Stack = new ItemStack(Material.BOW, 1);
        ItemMeta HomingBow_Meta = HomingBow_Stack.getItemMeta();
        Objects.requireNonNull(HomingBow_Meta).setDisplayName("§6Arc à flèches chercheuses");
        List<String> HomingBow_Lore = new ArrayList<>();
        HomingBow_Lore.add("§bTire 1 flèche qui cible la");
        HomingBow_Lore.add("§bpremière entité dans un rayon");
        HomingBow_Lore.add("§bde 5 bloc de sa trajectoire.");
        HomingBow_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fHB_01");
        HomingBow_Meta.setLore(HomingBow_Lore);
        HomingBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        HomingBow_Meta.addItemFlags(HIDE_ENCHANTS);
        HomingBow_Stack.setItemMeta(HomingBow_Meta);
        HomingBow = HomingBow_Stack;
    }

    private static void CreateThrowingAxe() {
        ItemStack ThrowingAxe_Stack = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta ThrowingAxe_Meta = ThrowingAxe_Stack.getItemMeta();
        Objects.requireNonNull(ThrowingAxe_Meta).setDisplayName("§6Hache viking lançable");
        List<String> ThrowingAxe_Lore = new ArrayList<>();
        ThrowingAxe_Lore.add("§bClique §adroit §bpour activer");
        ThrowingAxe_Lore.add("§bLance la hache dans la");
        ThrowingAxe_Lore.add("§bdirection que vous visez.");
        ThrowingAxe_Lore.add("§e+10 §bde dommages supplémentaires !");
        ThrowingAxe_Lore.add("§bquand la hache est lancée !");
        ThrowingAxe_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fTA_01");
        ThrowingAxe_Meta.setLore(ThrowingAxe_Lore);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),"generic.attackDamage", 6,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ThrowingAxe_Meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        ThrowingAxe_Meta.setCustomModelData(11);
        ThrowingAxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        ThrowingAxe_Meta.addItemFlags(HIDE_ENCHANTS);
        ThrowingAxe_Stack.setItemMeta(ThrowingAxe_Meta);
        ThrowingAxe = ThrowingAxe_Stack;
    }

    private static void CreateUndeadSword() {
        ItemStack UndeadSword_Stack = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta UndeadSword_Meta = UndeadSword_Stack.getItemMeta();
        Objects.requireNonNull(UndeadSword_Meta).setDisplayName("§6Epée des morts");
        List<String> UndeadSword_Lore = new ArrayList<>();
        UndeadSword_Lore.add("§bActive la puissance des morts,");
        UndeadSword_Lore.add("§ben infligeant des dommages");
        UndeadSword_Lore.add("§bsupplémentaires :");
        UndeadSword_Lore.add("§aZombie §bet §aHusk §b> §e+35§b% de dommages");
        UndeadSword_Lore.add("§aSquelette §b> §e+25§b% de dommages");
        UndeadSword_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fUS_01");
        UndeadSword_Meta.setLore(UndeadSword_Lore);
        UndeadSword_Meta.setCustomModelData(25);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),"generic.attackDamage", 10,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        UndeadSword_Meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        UndeadSword_Meta.addItemFlags(HIDE_ATTRIBUTES);
        UndeadSword_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        UndeadSword_Meta.addItemFlags(HIDE_ENCHANTS);
        UndeadSword_Stack.setItemMeta(UndeadSword_Meta);
        UndeadSword = UndeadSword_Stack;
    }
    private static void CreateDynamite() {
        ItemStack Dynamite_Stack = new ItemStack(Material.TNT, 1);
        ItemMeta Dynamite_Meta = Dynamite_Stack.getItemMeta();
        Objects.requireNonNull(Dynamite_Meta).setDisplayName("§6Dynamite");
        List<String> Dynamite_Lore = new ArrayList<>();
        Dynamite_Lore.add("§bExplosif à base de nitroglycérine");
        Dynamite_Lore.add("§btrès puissant !");
        Dynamite_Lore.add("§c§kH§r §6ID §c§kH§r §6: §fTD_01");
        Dynamite_Meta.setLore(Dynamite_Lore);
        Dynamite_Meta.setCustomModelData(7);
        Dynamite_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        Dynamite_Meta.addItemFlags(HIDE_ENCHANTS);
        Dynamite_Stack.setItemMeta(Dynamite_Meta);
        Dynamite = Dynamite_Stack;
    }


}























