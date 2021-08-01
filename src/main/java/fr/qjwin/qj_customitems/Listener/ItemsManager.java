/*
Class Name : ItemsManager
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Listener;

import net.md_5.bungee.api.ChatColor;
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

    public static ChatColor Title_Color = ChatColor.of("#009933");
    public static ChatColor Separator_Color = ChatColor.of("#3399ff");
    public static String Rarity_name_Commun = ChatColor.of("#1eff00") + "Commun";
    public static String Rarity_level_Commun = "§6✦§8✦✦✦✦ ";
    public static String Rarity_Commun = Rarity_level_Commun + Rarity_name_Commun;
    public static String Rarity_name_Rare = ChatColor.of("#0070dd") + "Rare";
    public static String Rarity_level_Rare = "§6✦✦§8✦✦✦ ";
    public static String Rarity_Rare = Rarity_level_Rare + Rarity_name_Rare;
    public static String Rarity_name_Epic = ChatColor.of("#a335ee") + "Epique";
    public static String Rarity_level_Epic = "§6✦✦✦§8✦✦ ";
    public static String Rarity_Epic = Rarity_level_Epic + Rarity_name_Epic;
    public static String Rarity_name_Legendary = ChatColor.of("#ff8000") + "Légendaire";
    public static String Rarity_level_Legendary = "§6✦✦✦✦§8✦ ";
    public static String Rarity_Legendary = Rarity_level_Legendary + Rarity_name_Legendary;
    public static String Rarity_name_Artefact = ChatColor.of("#e6cc80") + "Artéfact";
    public static String Rarity_level_Artefact = "§6✦✦✦✦✦ ";
    public static String Rarity_Artefact = Rarity_level_Artefact + Rarity_name_Artefact;

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
    public static ItemStack LightingSword;
    public static ItemStack AutoSmeltPickaxe;
    public static ItemStack FireBall;

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
        CreateLightingSword();
        CreateAutoSmeltPickaxe();
        CreateFireBall();
    }

    private static void CreateGrapplingHook(){
        ItemStack GrapplingHook_Stack = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta GrapplingHook_Meta = GrapplingHook_Stack.getItemMeta();
        Objects.requireNonNull(GrapplingHook_Meta).setDisplayName("§c★ §6Grappin §c★");
        List<String> GrapplingHook_Lore = new ArrayList<>();
        GrapplingHook_Lore.add(Separator_Color + "§m--------------------------------");
        GrapplingHook_Lore.add(Title_Color + "Description :");
        GrapplingHook_Lore.add("§fVéritable grappin crée,");
        GrapplingHook_Lore.add("§fpar le roi des voleurs.");
        GrapplingHook_Lore.add(Separator_Color + "§m--------------------------------");
        GrapplingHook_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        GrapplingHook_Lore.add(Title_Color + "Pouvoir : §cGrappin");
        GrapplingHook_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        GrapplingHook_Lore.add("§f1er clique Lance le grappin");
        GrapplingHook_Lore.add("§f2eme clique vous propulse");
        GrapplingHook_Lore.add(Title_Color + "Cooldown : §e8 §fsecondes.");
        GrapplingHook_Lore.add(Title_Color + "Caractéristique :");
        GrapplingHook_Lore.add("§a+ §e4 §bde dommages à chaque hit.");
        GrapplingHook_Lore.add(Separator_Color + "§m--------------------------------");
        GrapplingHook_Lore.add(Title_Color + "ID : §fGH_01");
        GrapplingHook_Meta.setLore(GrapplingHook_Lore);
        GrapplingHook_Meta.setUnbreakable(true);
        GrapplingHook_Meta.addItemFlags(HIDE_UNBREAKABLE);
        GrapplingHook_Stack.setItemMeta(GrapplingHook_Meta);
        GrapplingHook = GrapplingHook_Stack;
    }

    private static void CreateTeleportSword() {
        ItemStack TeleportSword_Stack = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta TeleportSword_Meta = TeleportSword_Stack.getItemMeta();
        Objects.requireNonNull(TeleportSword_Meta).setDisplayName("§c★ §6Epée d'enderman §c★");
        List<String> TeleportSword_Lore = new ArrayList<>();
        TeleportSword_Lore.add(Separator_Color + "§m--------------------------------");
        TeleportSword_Lore.add(Title_Color + "Description :");
        TeleportSword_Lore.add("§fCette épée à le pouvoir");
        TeleportSword_Lore.add("§fdes endermans !");
        TeleportSword_Lore.add(Separator_Color + "§m--------------------------------");
        TeleportSword_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        TeleportSword_Lore.add(Title_Color + "Pouvoir : §cLumière du vide");
        TeleportSword_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        TeleportSword_Lore.add("§fTéléporte le propriétaire");
        TeleportSword_Lore.add("§fà §a8 §fblocs de distance");
        TeleportSword_Lore.add(Title_Color + "Cooldown : §e5 §fsecondes.");
        TeleportSword_Lore.add(Title_Color + "Caractéristique :");
        TeleportSword_Lore.add("§a+ §e7 §bde points d'attaque.");
        TeleportSword_Lore.add("§a+ §e1.6 §bde vitesse d'attaque.");
        TeleportSword_Lore.add(Separator_Color + "§m--------------------------------");
        TeleportSword_Lore.add(Title_Color + "ID : §fTS_01");
        TeleportSword_Meta.setLore(TeleportSword_Lore);
        TeleportSword_Meta.setCustomModelData(15);
        TeleportSword_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        TeleportSword_Meta.addItemFlags(HIDE_ENCHANTS);
        TeleportSword_Meta.addItemFlags(HIDE_ATTRIBUTES);
        TeleportSword_Stack.setItemMeta(TeleportSword_Meta);
        TeleportSword = TeleportSword_Stack;
    }

    private static void CreateServerGift() {
        ItemStack ServerGift_Stack = new ItemStack(Material.SHEARS, 1);
        ItemMeta ServerGift_Meta = ServerGift_Stack.getItemMeta();
        Objects.requireNonNull(ServerGift_Meta).setDisplayName("§c★ §6Cadeau n°1 §c★");
        List<String> ServerGift_Lore = new ArrayList<>();
        ServerGift_Lore.add(Separator_Color + "§m--------------------------------");
        ServerGift_Lore.add(Title_Color + "Description :");
        ServerGift_Lore.add("§6▁▂▃▅▆▇ §f● §bSURPRISE §f● §6▇▆▅▃▂▁");
        ServerGift_Lore.add("§fClique §adroit §fpour ouvrir !");
        ServerGift_Lore.add(Separator_Color + "§m--------------------------------");
        ServerGift_Lore.add(Title_Color + "Qualité : " + Rarity_Artefact);
        ServerGift_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        ServerGift_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        ServerGift_Lore.add("§fOuvre le cadeau, donne une");
        ServerGift_Lore.add("§fsurprise §6☻");
        ServerGift_Lore.add(Separator_Color + "§m--------------------------------");
        ServerGift_Lore.add(Title_Color + "ID : §fSG_01");
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
        Objects.requireNonNull(ExplosiveBow_Meta).setDisplayName("§c★ §6Arc à flèches explosives §c★");
        List<String> ExplosiveBow_Lore = new ArrayList<>();
        ExplosiveBow_Lore.add(Separator_Color + "§m--------------------------------");
        ExplosiveBow_Lore.add(Title_Color + "Description :");
        ExplosiveBow_Lore.add("§fArc extrèmement dangereux, il");
        ExplosiveBow_Lore.add("§fest à utiliser avec précaution !");
        ExplosiveBow_Lore.add(Separator_Color + "§m--------------------------------");
        ExplosiveBow_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        ExplosiveBow_Lore.add(Title_Color + "Pouvoir : §cFlèches explosive");
        ExplosiveBow_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        ExplosiveBow_Lore.add("§fTire une flèche et crée");
        ExplosiveBow_Lore.add("§fune explosion à l'impacte.");
        ExplosiveBow_Lore.add(Separator_Color + "§m--------------------------------");
        ExplosiveBow_Lore.add(Title_Color + "ID : §fEB_01");
        ExplosiveBow_Meta.setLore(ExplosiveBow_Lore);
        ExplosiveBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        ExplosiveBow_Meta.addItemFlags(HIDE_ENCHANTS);
        ExplosiveBow_Stack.setItemMeta(ExplosiveBow_Meta);
        ExplosiveBow = ExplosiveBow_Stack;
    }

    private static void CreateInfiniteWaterBucket(){
        ItemStack InfiniteWaterBucket_Stack = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta InfiniteWaterBucket_Meta = InfiniteWaterBucket_Stack.getItemMeta();
        Objects.requireNonNull(InfiniteWaterBucket_Meta).setDisplayName("§c★ §6Seau d'eau infini §c★");
        List<String> InfiniteWaterBucket_Lore = new ArrayList<>();
        InfiniteWaterBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteWaterBucket_Lore.add(Title_Color + "Description :");
        InfiniteWaterBucket_Lore.add("§fCe seau d'eau ne ce vide");
        InfiniteWaterBucket_Lore.add("§fjamais, ne le perdez pas !");
        InfiniteWaterBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteWaterBucket_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        InfiniteWaterBucket_Lore.add(Title_Color + "Pouvoir : §cLave infini");
        InfiniteWaterBucket_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        InfiniteWaterBucket_Lore.add("§fPlace de l'eau sans vidé");
        InfiniteWaterBucket_Lore.add("§fle seau.");
        InfiniteWaterBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteWaterBucket_Lore.add(Title_Color + "ID : §fWB_01");
        InfiniteWaterBucket_Meta.setLore(InfiniteWaterBucket_Lore);
        InfiniteWaterBucket_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        InfiniteWaterBucket_Meta.addItemFlags(HIDE_ENCHANTS);
        InfiniteWaterBucket_Stack.setItemMeta(InfiniteWaterBucket_Meta);
        InfiniteWaterBucket = InfiniteWaterBucket_Stack;
    }

    private static void CreateInfiniteLavaBucket(){
        ItemStack InfiniteLavaBucket_Stack = new ItemStack(Material.LAVA_BUCKET, 1);
        ItemMeta InfiniteLavaBucket_Meta = InfiniteLavaBucket_Stack.getItemMeta();
        Objects.requireNonNull(InfiniteLavaBucket_Meta).setDisplayName("§c★ §6Seau de lave infini §c★");
        List<String> InfiniteLavaBucket_Lore = new ArrayList<>();
        InfiniteLavaBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteLavaBucket_Lore.add(Title_Color + "Description :");
        InfiniteLavaBucket_Lore.add("§fCe seau de lave ne ce vide");
        InfiniteLavaBucket_Lore.add("§fjamais, ne le perdez pas !");
        InfiniteLavaBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteLavaBucket_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        InfiniteLavaBucket_Lore.add(Title_Color + "Pouvoir : §cLave infini");
        InfiniteLavaBucket_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        InfiniteLavaBucket_Lore.add("§fPlace de la lave sans");
        InfiniteLavaBucket_Lore.add("§fvidé le seau.");
        InfiniteLavaBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteLavaBucket_Lore.add(Title_Color + "ID : §fLB_01");
        InfiniteLavaBucket_Meta.setLore(InfiniteLavaBucket_Lore);
        InfiniteLavaBucket_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        InfiniteLavaBucket_Meta.addItemFlags(HIDE_ENCHANTS);
        InfiniteLavaBucket_Stack.setItemMeta(InfiniteLavaBucket_Meta);
        InfiniteLavaBucket = InfiniteLavaBucket_Stack;
    }

    private static void CreateMachineGunBow () {
        ItemStack MachineGunBow_Stack = new ItemStack(Material.BOW, 1);
        ItemMeta MachineGunBow_Meta = MachineGunBow_Stack.getItemMeta();
        Objects.requireNonNull(MachineGunBow_Meta).setDisplayName("§c★ §6Arc machine gun §c★");
        List<String> MachineGunBow_Lore = new ArrayList<>();
        MachineGunBow_Lore.add(Separator_Color + "§m--------------------------------");
        MachineGunBow_Lore.add(Title_Color + "Description :");
        MachineGunBow_Lore.add("§fInspiré du célèbre Chu Ko Nu");
        MachineGunBow_Lore.add("§fcette arc tire des raffales");
        MachineGunBow_Lore.add("§fde flèches.");
        MachineGunBow_Lore.add(Separator_Color + "§m--------------------------------");
        MachineGunBow_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        MachineGunBow_Lore.add(Title_Color + "Pouvoir : §cFlèches à répétition");
        MachineGunBow_Lore.add(Title_Color + "Effet -> §fClique §agauche §f:");
        MachineGunBow_Lore.add("§fTire §a5 §fflèches par secondes");
        MachineGunBow_Lore.add("§fpendant §a5 §fsecondes !");
        MachineGunBow_Lore.add(Separator_Color + "§m--------------------------------");
        MachineGunBow_Lore.add(Title_Color + "ID : §fMB_01");
        MachineGunBow_Meta.setLore(MachineGunBow_Lore);
        MachineGunBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        MachineGunBow_Meta.addItemFlags(HIDE_ENCHANTS);
        MachineGunBow_Stack.setItemMeta(MachineGunBow_Meta);
        MachineGunBow = MachineGunBow_Stack;
    }

    private static void CreateMultiBreakPickaxe(){
        ItemStack MultiBreakPickaxe_Stack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta MultiBreakPickaxe_Meta = MultiBreakPickaxe_Stack.getItemMeta();
        Objects.requireNonNull(MultiBreakPickaxe_Meta).setDisplayName("§c★ §6Marteau de minage §c★");
        List<String> MultiBreakPickaxe_Lore = new ArrayList<>();
        MultiBreakPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        MultiBreakPickaxe_Lore.add(Title_Color + "Description :");
        MultiBreakPickaxe_Lore.add("§fCe marteau à été créer par");
        MultiBreakPickaxe_Lore.add("§fdes nains, dans les profondeurs");
        MultiBreakPickaxe_Lore.add("§fdes montagnes.");
        MultiBreakPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        MultiBreakPickaxe_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        MultiBreakPickaxe_Lore.add(Title_Color + "Pouvoir : §cLa folie du mineur");
        MultiBreakPickaxe_Lore.add(Title_Color + "Effet -> §fClique §agauche §f:");
        MultiBreakPickaxe_Lore.add("§fDégage une zone de §c3x3 §fblocs");
        MultiBreakPickaxe_Lore.add("§fde stone uniquement !");
        MultiBreakPickaxe_Lore.add(Title_Color + "Caractéristique :");
        MultiBreakPickaxe_Lore.add("§a+ §e5 §bde points d'attaque.");
        MultiBreakPickaxe_Lore.add("§a+ §e1.2 §bde vitesse d'attaque.");
        MultiBreakPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        MultiBreakPickaxe_Lore.add(Title_Color + "ID : §fMP_01");
        MultiBreakPickaxe_Meta.setLore(MultiBreakPickaxe_Lore);
        MultiBreakPickaxe_Meta.setCustomModelData(1);
        MultiBreakPickaxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        MultiBreakPickaxe_Meta.addItemFlags(HIDE_ENCHANTS);
        MultiBreakPickaxe_Meta.addItemFlags(HIDE_ATTRIBUTES);
        MultiBreakPickaxe_Stack.setItemMeta(MultiBreakPickaxe_Meta);
        MultiBreakPickaxe  = MultiBreakPickaxe_Stack;
    }

    private static void CreateCresusPickaxe() {
        ItemStack CresusPickaxe_Stack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta CresusPickaxe_Meta = CresusPickaxe_Stack.getItemMeta();
        Objects.requireNonNull(CresusPickaxe_Meta).setDisplayName("§c★ §6Pioche de Crésus §c★");
        List<String> CresusPickaxe_Lore = new ArrayList<>();
        CresusPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        CresusPickaxe_Lore.add(Title_Color + "Description :");
        CresusPickaxe_Lore.add("§fIl est dit que tout ce");
        CresusPickaxe_Lore.add("§fqui est cassé par cette");
        CresusPickaxe_Lore.add("§fpioche ce transforme en or !");
        CresusPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        CresusPickaxe_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        CresusPickaxe_Lore.add(Title_Color + "Pouvoir : §cLa chance de Crésus");
        CresusPickaxe_Lore.add(Title_Color + "Effet -> §fClique §agauche §f:");
        CresusPickaxe_Lore.add("§fTransforme tout les blocs");
        CresusPickaxe_Lore.add("§fen pépite d'or");
        CresusPickaxe_Lore.add(Title_Color + "Caractéristique :");
        CresusPickaxe_Lore.add("§a+ §e5 §bde points d'attaque.");
        CresusPickaxe_Lore.add("§a+ §e1.2 §bde vitesse d'attaque.");
        CresusPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        CresusPickaxe_Lore.add(Title_Color + "ID : §fCP_01");
        CresusPickaxe_Meta.setLore(CresusPickaxe_Lore);
        CresusPickaxe_Meta.setCustomModelData(8);
        CresusPickaxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        CresusPickaxe_Meta.addItemFlags(HIDE_ENCHANTS);
        CresusPickaxe_Meta.addItemFlags(HIDE_ATTRIBUTES);
        CresusPickaxe_Stack.setItemMeta(CresusPickaxe_Meta);
        CresusPickaxe = CresusPickaxe_Stack;
    }

    private static void CreateBoomerang() {
        ItemStack Boomerang_Stack = new ItemStack(Material.BONE, 1);
        ItemMeta Boomerang_Meta = Boomerang_Stack.getItemMeta();
        Objects.requireNonNull(Boomerang_Meta).setDisplayName("§c★ §6Boomerang §c★");
        List<String> Boomerang_Lore = new ArrayList<>();
        Boomerang_Lore.add(Separator_Color + "§m--------------------------------");
        Boomerang_Lore.add(Title_Color + "Description :");
        Boomerang_Lore.add("§fVéritable Boomerang Australien,");
        Boomerang_Lore.add("§fil sera vous être  à la chasse.");
        Boomerang_Lore.add(Separator_Color + "§m--------------------------------");
        Boomerang_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        Boomerang_Lore.add(Title_Color + "Pouvoir : §cBoomerang lançable");
        Boomerang_Lore.add(Title_Color + "Effet -> §fClique §adroit §fou §agauche §f:");
        Boomerang_Lore.add("§fLance le boomerang dans la");
        Boomerang_Lore.add("§fdirection visée.");
        Boomerang_Lore.add(Title_Color + "Caractéristique :");
        Boomerang_Lore.add("§a+ §e4 §bde dommages à chaque hit.");
        Boomerang_Lore.add(Separator_Color + "§m--------------------------------");
        Boomerang_Lore.add(Title_Color + "ID : §fBR_01");
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
        Objects.requireNonNull(HomingBow_Meta).setDisplayName("§c★ §6Arc à flèches chercheuses §c★");
        List<String> HomingBow_Lore = new ArrayList<>();
        HomingBow_Lore.add(Separator_Color + "§m--------------------------------");
        HomingBow_Lore.add(Title_Color + "Description :");
        HomingBow_Lore.add("§fEnchanté par un magicien noir");
        HomingBow_Lore.add("§fcette arc semble contrôlé les");
        HomingBow_Lore.add("§fflèches qu'il tire.");
        HomingBow_Lore.add(Separator_Color + "§m--------------------------------");
        HomingBow_Lore.add(Title_Color + "Qualité : " + Rarity_Artefact);
        HomingBow_Lore.add(Title_Color + "Pouvoir : §cFlèches chercheuses");
        HomingBow_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        HomingBow_Lore.add("§fTire 1 flèche qui cible la");
        HomingBow_Lore.add("§fpremière entité dans un rayon");
        HomingBow_Lore.add("§fde 5 blocs sur sa trajectoire.");
        HomingBow_Lore.add(Separator_Color + "§m--------------------------------");
        HomingBow_Lore.add(Title_Color + "ID : §fHB_01");
        HomingBow_Meta.setLore(HomingBow_Lore);
        HomingBow_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        HomingBow_Meta.addItemFlags(HIDE_ENCHANTS);
        HomingBow_Stack.setItemMeta(HomingBow_Meta);
        HomingBow = HomingBow_Stack;
    }

    private static void CreateThrowingAxe() {
        ItemStack ThrowingAxe_Stack = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta ThrowingAxe_Meta = ThrowingAxe_Stack.getItemMeta();
        Objects.requireNonNull(ThrowingAxe_Meta).setDisplayName("§c★ §6Hache viking lançable §c★");
        List<String> ThrowingAxe_Lore = new ArrayList<>();
        ThrowingAxe_Lore.add(Separator_Color + "§m--------------------------------");
        ThrowingAxe_Lore.add(Title_Color + "Description :");
        ThrowingAxe_Lore.add("§fCette hache fût crée par");
        ThrowingAxe_Lore.add("§aLOKI §fil y as longtemps.");
        ThrowingAxe_Lore.add(Separator_Color + "§m--------------------------------");
        ThrowingAxe_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        ThrowingAxe_Lore.add(Title_Color + "Pouvoir : §cHache lançable");
        ThrowingAxe_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        ThrowingAxe_Lore.add("§fInflige des dommages supplémentaires");
        ThrowingAxe_Lore.add("§fquand la hache est lancée !");
        ThrowingAxe_Lore.add(Title_Color + "Caractéristique :");
        ThrowingAxe_Lore.add("§a+ §e9 §bde points d'attaque.");
        ThrowingAxe_Lore.add("§a+ §e1 §bde vitesse d'attaque.");
        ThrowingAxe_Lore.add("§a+ §e10 §bde dommages supplémentaires.");
        ThrowingAxe_Lore.add(Separator_Color + "§m--------------------------------");
        ThrowingAxe_Lore.add(Title_Color + "ID : §fTA_01");
        ThrowingAxe_Meta.setLore(ThrowingAxe_Lore);
        AttributeModifier damage = new AttributeModifier(UUID.randomUUID(),"generic.attackDamage", 6,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        ThrowingAxe_Meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, damage);
        ThrowingAxe_Meta.setCustomModelData(11);
        ThrowingAxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        ThrowingAxe_Meta.addItemFlags(HIDE_ENCHANTS);
        ThrowingAxe_Meta.addItemFlags(HIDE_ATTRIBUTES);
        ThrowingAxe_Stack.setItemMeta(ThrowingAxe_Meta);
        ThrowingAxe = ThrowingAxe_Stack;
    }

    private static void CreateUndeadSword() {
        ItemStack UndeadSword_Stack = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta UndeadSword_Meta = UndeadSword_Stack.getItemMeta();
        Objects.requireNonNull(UndeadSword_Meta).setDisplayName("§c★ §6Epée des morts §c★");
        List<String> UndeadSword_Lore = new ArrayList<>();
        UndeadSword_Lore.add(Separator_Color + "§m--------------------------------");
        UndeadSword_Lore.add(Title_Color + "Description :");
        UndeadSword_Lore.add("§fVenue des profondeurs de la");
        UndeadSword_Lore.add("§fterre l'épée semble détenir");
        UndeadSword_Lore.add("§fun grand pouvoir.");
        UndeadSword_Lore.add(Separator_Color + "§m--------------------------------");
        UndeadSword_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        UndeadSword_Lore.add(Title_Color + "Pouvoir : §cForce des morts");
        UndeadSword_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        UndeadSword_Lore.add("§fActive la puissance des morts,");
        UndeadSword_Lore.add("§fen infligeant des dommages");
        UndeadSword_Lore.add("§fsupplémentaires.");
        UndeadSword_Lore.add(Title_Color + "Caractéristique :");
        UndeadSword_Lore.add("§a+ §e10 §bde points d'attaque.");
        UndeadSword_Lore.add("§a+ §e1.6 §bde vitesse d'attaque.");
        UndeadSword_Lore.add("§a+ §e35§a% §bde dommages aux Zombies et Husks.");
        UndeadSword_Lore.add("§a+ §e25§a% §bde dommages aux Squelettes.");
        UndeadSword_Lore.add(Separator_Color + "§m--------------------------------");
        UndeadSword_Lore.add(Title_Color + "ID : §fUS_01");
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
        ItemStack Dynamite_Stack = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta Dynamite_Meta = Dynamite_Stack.getItemMeta();
        Objects.requireNonNull(Dynamite_Meta).setDisplayName("§c★ §6Dynamite §c★");
        List<String> Dynamite_Lore = new ArrayList<>();
        Dynamite_Lore.add(Separator_Color + "§m--------------------------------");
        Dynamite_Lore.add(Title_Color + "Description :");
        Dynamite_Lore.add("§fExplosif à base de nitroglycérine");
        Dynamite_Lore.add("§ftrès puissant !");
        Dynamite_Lore.add(Separator_Color + "§m--------------------------------");
        Dynamite_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        Dynamite_Lore.add(Title_Color + "Pouvoir : §cExplosif lançable");
        Dynamite_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Dynamite_Lore.add("§fLance un explosif à 30 mètres");
        Dynamite_Lore.add("§fde distance.");
        Dynamite_Lore.add(Separator_Color + "§m--------------------------------");
        Dynamite_Lore.add(Title_Color + "ID : §fTD_01");
        Dynamite_Meta.setLore(Dynamite_Lore);
        Dynamite_Meta.setCustomModelData(7);
        Dynamite_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Dynamite_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        Dynamite_Meta.addItemFlags(HIDE_ENCHANTS);
        Dynamite_Stack.setItemMeta(Dynamite_Meta);
        Dynamite = Dynamite_Stack;
    }

    private static void CreateLightingSword() {
        ItemStack LightingSword_Stack = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta LightingSword_Meta = LightingSword_Stack.getItemMeta();
        Objects.requireNonNull(LightingSword_Meta).setDisplayName("§c★ §6Epée de Zeus §c★");
        List<String> LightingSword_Lore = new ArrayList<>();
        LightingSword_Lore.add(Separator_Color + "§m--------------------------------");
        LightingSword_Lore.add(Title_Color + "Description :");
        LightingSword_Lore.add("§fL'épée de la lumière crée");
        LightingSword_Lore.add("§fpar les dieux pour ramener");
        LightingSword_Lore.add("§fl'harmonie sur terre.");
        LightingSword_Lore.add(Separator_Color + "§m--------------------------------");
        LightingSword_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        LightingSword_Lore.add(Title_Color + "Pouvoir : §cColère de Zeus");
        LightingSword_Lore.add(Title_Color + "Effet -> §fClique §agauche §f:");
        LightingSword_Lore.add("§fLance un éclaire sur la cible hit.");
        LightingSword_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        LightingSword_Lore.add("§fLance un éclaire sur toutes les");
        LightingSword_Lore.add("§fentitées dans un rayon de 12 blocs.");
        LightingSword_Lore.add(Title_Color + "Caractéristique :");
        LightingSword_Lore.add("§a+ §e7 §bde points d'attaque.");
        LightingSword_Lore.add("§a+ §e1.6 §bde vitesse d'attaque.");
        LightingSword_Lore.add("§a+ §e10 §bde dommages d'attaque en hit.");
        LightingSword_Lore.add("§a+ §e6 §bde dommages d'attaque en AOE.");
        LightingSword_Lore.add(Separator_Color + "§m--------------------------------");
        LightingSword_Lore.add(Title_Color + "ID : §fLS_01");
        LightingSword_Meta.setLore(LightingSword_Lore);
        LightingSword_Meta.setCustomModelData(69);
        LightingSword_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        LightingSword_Meta.addItemFlags(HIDE_ENCHANTS);
        LightingSword_Meta.addItemFlags(HIDE_ATTRIBUTES);
        LightingSword_Stack.setItemMeta(LightingSword_Meta);
        LightingSword = LightingSword_Stack;
    }

    private static void CreateAutoSmeltPickaxe() {
        ItemStack AutoSmeltPickaxe_Stack = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta AutoSmeltPickaxe_Meta = AutoSmeltPickaxe_Stack.getItemMeta();
        Objects.requireNonNull(AutoSmeltPickaxe_Meta).setDisplayName("§c★ §6Pioche automatique §c★");
        List<String> AutoSmeltPickaxe_Lore = new ArrayList<>();
        AutoSmeltPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        AutoSmeltPickaxe_Lore.add(Title_Color + "Description :");
        AutoSmeltPickaxe_Lore.add("§fVéritable piche de champion, crée");
        AutoSmeltPickaxe_Lore.add("§fpour les mineurs acharnés.");
        AutoSmeltPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        AutoSmeltPickaxe_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        AutoSmeltPickaxe_Lore.add(Title_Color + "Pouvoir : §cPioche haute température");
        AutoSmeltPickaxe_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        AutoSmeltPickaxe_Lore.add("§fTransforme les minerais en lingots.");
        AutoSmeltPickaxe_Lore.add(Title_Color + "Caractéristique :");
        AutoSmeltPickaxe_Lore.add("§a+ §e5 §bde points d'attaque.");
        AutoSmeltPickaxe_Lore.add("§a+ §e1.2 §bde vitesse d'attaque.");
        AutoSmeltPickaxe_Lore.add(Separator_Color + "§m--------------------------------");
        AutoSmeltPickaxe_Lore.add(Title_Color + "ID : §fAP_01");
        AutoSmeltPickaxe_Meta.setLore(AutoSmeltPickaxe_Lore);
        AutoSmeltPickaxe_Meta.setCustomModelData(4);
        AutoSmeltPickaxe_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        AutoSmeltPickaxe_Meta.addItemFlags(HIDE_ENCHANTS);
        AutoSmeltPickaxe_Meta.addItemFlags(HIDE_ATTRIBUTES);
        AutoSmeltPickaxe_Stack.setItemMeta(AutoSmeltPickaxe_Meta);
        AutoSmeltPickaxe = AutoSmeltPickaxe_Stack;
    }

    private static void CreateFireBall() {
        ItemStack FireBall_Stack = new ItemStack(Material.FIRE_CHARGE, 1);
        ItemMeta FireBall_Meta = FireBall_Stack.getItemMeta();
        Objects.requireNonNull(FireBall_Meta).setDisplayName("§c★ §6Boule de Feu §c★");
        List<String> FireBall_Lore = new ArrayList<>();
        FireBall_Lore.add(Separator_Color + "§m--------------------------------");
        FireBall_Lore.add(Title_Color + "Description :");
        FireBall_Lore.add("§fCes boules de feu proviennent");
        FireBall_Lore.add("§fdes couches magmatiques les");
        FireBall_Lore.add("§fplus profondes.");
        FireBall_Lore.add(Separator_Color + "§m--------------------------------");
        FireBall_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        FireBall_Lore.add(Title_Color + "Pouvoir : §cLancé mystique");
        FireBall_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        FireBall_Lore.add("§fLance la boule de feu à l'endroit");
        FireBall_Lore.add("§fciblé.");
        FireBall_Lore.add(Separator_Color + "§m--------------------------------");
        FireBall_Lore.add(Title_Color + "ID : §fFB_01");
        FireBall_Meta.setLore(FireBall_Lore);
        FireBall_Meta.setCustomModelData(4);
        FireBall_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        FireBall_Meta.addItemFlags(HIDE_ENCHANTS);
        FireBall_Meta.addItemFlags(HIDE_ATTRIBUTES);
        FireBall_Stack.setItemMeta(FireBall_Meta);
        FireBall = FireBall_Stack;
    }

}























