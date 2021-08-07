/*
Class Name : ItemsManager
From Package : fr.qjwin.qj_customitems.Listener
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Managers;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static org.bukkit.inventory.ItemFlag.*;

public class ItemsManager {

    public static ChatColor Title_Color = ChatColor.of("#009933");
    public static ChatColor Separator_Color = ChatColor.of("#3399ff");
    public static Color HermesShoes_Color = Color.fromRGB(21, 139, 227);

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
    public static ItemStack Grenade;
    public static ItemStack HermesShoes;
    public static ItemStack Landmine;
    public static ItemStack InfiniteEmptyBucket;

    public static ItemStack Potion_haste_1;
    public static ItemStack Potion_haste_2;
    public static ItemStack Potion_haste_3;

    public static ItemStack Potion_luck_1;
    public static ItemStack Potion_luck_2;
    public static ItemStack Potion_luck_3;

    public static ItemStack Potion_Resistance_1;
    public static ItemStack Potion_Beauty_1;
    public static ItemStack Potion_Saturation_1;
    public static ItemStack Potion_Absorption_1;
    public static ItemStack Potion_HealBoost_1;
    public static ItemStack Potion_Hero_1;

    public static ItemStack Hat_Farmer;
    public static ItemStack Hat_Arrow;
    public static ItemStack Hat_Fes;
    public static ItemStack Hat_Indian;
    public static ItemStack Hat_Dandy_RED;
    public static ItemStack Hat_Dandy_LBLUE;
    public static ItemStack Hat_Dandy_YELLOW;
    public static ItemStack Hat_Dandy_LIME;
    public static ItemStack Hat_Dandy_RAINBOW;
    public static ItemStack Hat_Dandy_GLASS;
    public static ItemStack Hat_Squid;

    public static ItemStack TrashCan;

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
        CreateGrenade();
        CreateHermesShoes();
        CreateLandmine();
        CreateInfiniteEmptyBucket();
        CreatePotion_haste_1();
        CreatePotion_haste_2();
        CreatePotion_haste_3();
        CreatePotion_luck_1();
        CreatePotion_luck_2();
        CreatePotion_luck_3();
        CreatePotion_Resistance_1();
        CreatePotion_Beauty_1();
        CreatePotion_Saturation_1();
        CreatePotion_Absorption_1();
        CreatePotion_HealBoost_1();
        CreatePotion_Hero_1();
        CreateHat_Farmer();
        CreateHat_Arrow();
        CreateHat_Fes();
        CreateHat_Indian();
        CreateHat_Dandy_RED();
        CreateHat_Dandy_LBLUE();
        CreateHat_Dandy_YELLOW();
        CreateHat_Dandy_LIME();
        CreateHat_Dandy_RAINBOW();
        CreateHat_Dandy_GLASS();
        CreateHat_Squid();
        CreateTrashCan();
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
        Boomerang_Lore.add("§fil sera vous être utile à la chasse.");
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
        LightingSword_Lore.add(Title_Color + "Cooldown : §e15 §fsecondes.");
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

    public static void CreateGrenade() {
        ItemStack Grenade_Stack = new ItemStack(Material.SNOWBALL, 1);
        ItemMeta Grenade_Meta = Grenade_Stack.getItemMeta();
        Objects.requireNonNull(Grenade_Meta).setDisplayName("§c★ §6Grenade MKII §c★");
        List<String> Grenade_Lore = new ArrayList<>();
        Grenade_Lore.add(Separator_Color + "§m--------------------------------");
        Grenade_Lore.add(Title_Color + "Description :");
        Grenade_Lore.add("§fGrenade militaire américaine");
        Grenade_Lore.add("§fde la seconde guerre mondial");
        Grenade_Lore.add(Separator_Color + "§m--------------------------------");
        Grenade_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Grenade_Lore.add(Title_Color + "Pouvoir : §cLancé franc");
        Grenade_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Grenade_Lore.add("§fLance la grenade à l'endroit");
        Grenade_Lore.add("§fciblé.");
        Grenade_Lore.add(Title_Color + "Cooldown : §e10 §fsecondes.");
        Grenade_Lore.add(Separator_Color + "§m--------------------------------");
        Grenade_Lore.add(Title_Color + "ID : §fGN_01");
        Grenade_Meta.setLore(Grenade_Lore);
        Grenade_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        Grenade_Meta.addItemFlags(HIDE_ENCHANTS);
        Grenade_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Grenade_Stack.setItemMeta(Grenade_Meta);
        Grenade = Grenade_Stack;
    }

    public static void CreateHermesShoes() {
        ItemStack HermesShoes_Stack = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta HermesShoes_Meta = (LeatherArmorMeta) HermesShoes_Stack.getItemMeta();
        Objects.requireNonNull(HermesShoes_Meta).setDisplayName("§c★ §6Sandales ailées §c★");
        List<String> HermesShoes_Lore = new ArrayList<>();
        HermesShoes_Lore.add(Separator_Color + "§m--------------------------------");
        HermesShoes_Lore.add(Title_Color + "Description :");
        HermesShoes_Lore.add("§fIl est dit que Hermès le");
        HermesShoes_Lore.add("§fdemi dieu donna ces sandales");
        HermesShoes_Lore.add("§fà Apollon pour le calmer.");
        HermesShoes_Lore.add(Separator_Color + "§m--------------------------------");
        HermesShoes_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        HermesShoes_Lore.add(Title_Color + "Pouvoir : §cVitesse divine");
        HermesShoes_Lore.add(Title_Color + "Effet -> §fen sprint §f:");
        HermesShoes_Lore.add("§fAjoute un effet de vitesse lors");
        HermesShoes_Lore.add("§fd'un sprint.");
        HermesShoes_Lore.add(Title_Color + "Caractéristique :");
        HermesShoes_Lore.add("§a+ §e1 §bpoint d'armure.");
        HermesShoes_Lore.add(Separator_Color + "§m--------------------------------");
        HermesShoes_Lore.add(Title_Color + "ID : §fHS_01");
        HermesShoes_Meta.setLore(HermesShoes_Lore);
        HermesShoes_Meta.setColor(HermesShoes_Color);
        HermesShoes_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        HermesShoes_Meta.addItemFlags(HIDE_ENCHANTS);
        HermesShoes_Meta.addItemFlags(HIDE_ATTRIBUTES);
        HermesShoes_Meta.addItemFlags(HIDE_DYE);
        HermesShoes_Stack.setItemMeta(HermesShoes_Meta);
        HermesShoes = HermesShoes_Stack;
    }

    public static void CreateLandmine() {
        ItemStack Landmine_Stack = new ItemStack(Material.TNT, 1);
        ItemMeta Landmine_Meta = Landmine_Stack.getItemMeta();
        Objects.requireNonNull(Landmine_Meta).setDisplayName("§c★ §6Tellermine 43 §c★");
        List<String> Landmine_Lore = new ArrayList<>();
        Landmine_Lore.add(Separator_Color + "§m--------------------------------");
        Landmine_Lore.add(Title_Color + "Description :");
        Landmine_Lore.add("§fInventé pendant la seconde");
        Landmine_Lore.add("§fguerre mondial la tellermine 43");
        Landmine_Lore.add("§fest une mine très puissante.");
        Landmine_Lore.add(Separator_Color + "§m--------------------------------");
        Landmine_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Landmine_Lore.add(Title_Color + "Pouvoir : §cIED");
        Landmine_Lore.add(Title_Color + "Effet -> §fen marchant dessus §f:");
        Landmine_Lore.add("§fDissimulé sous un bloc lorsqu'un");
        Landmine_Lore.add("§fjoueur marche dessus explose !");
        Landmine_Lore.add(Separator_Color + "§m--------------------------------");
        Landmine_Lore.add(Title_Color + "ID : §fTL_01");
        Landmine_Meta.setLore(Landmine_Lore);
        Landmine_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        Landmine_Meta.addItemFlags(HIDE_ENCHANTS);
        Landmine_Stack.setItemMeta(Landmine_Meta);
        Landmine = Landmine_Stack;
    }

    private static void CreateInfiniteEmptyBucket(){
        ItemStack InfiniteEmptyBucket_Stack = new ItemStack(Material.BUCKET, 1);
        ItemMeta InfiniteEmptyBucket_Meta = InfiniteEmptyBucket_Stack.getItemMeta();
        Objects.requireNonNull(InfiniteEmptyBucket_Meta).setDisplayName("§c★ §6Seau sans font §c★");
        List<String> InfiniteEmptyBucket_Lore = new ArrayList<>();
        InfiniteEmptyBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteEmptyBucket_Lore.add(Title_Color + "Description :");
        InfiniteEmptyBucket_Lore.add("§fCe seau ne ce remplis jamais,");
        InfiniteEmptyBucket_Lore.add("§fvous pourrez vider des océans !");
        InfiniteEmptyBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteEmptyBucket_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        InfiniteEmptyBucket_Lore.add(Title_Color + "Pouvoir : §cRéservoir infini");
        InfiniteEmptyBucket_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        InfiniteEmptyBucket_Lore.add("§fRetire les sources d'eau et");
        InfiniteEmptyBucket_Lore.add("§fde lave sans remplir le seau.");
        InfiniteEmptyBucket_Lore.add(Separator_Color + "§m--------------------------------");
        InfiniteEmptyBucket_Lore.add(Title_Color + "ID : §fIB_01");
        InfiniteEmptyBucket_Meta.setLore(InfiniteEmptyBucket_Lore);
        InfiniteEmptyBucket_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        InfiniteEmptyBucket_Meta.addItemFlags(HIDE_ENCHANTS);
        InfiniteEmptyBucket_Stack.setItemMeta(InfiniteEmptyBucket_Meta);
        InfiniteEmptyBucket = InfiniteEmptyBucket_Stack;
    }

    private static void CreatePotion_haste_1() {
        ItemStack Potion_haste_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_haste_1_Meta = (PotionMeta) Potion_haste_1_Stack.getItemMeta();
        PotionEffect Hast1Effect = PotionEffectType.FAST_DIGGING.createEffect( 2400, 0);
        Objects.requireNonNull(Potion_haste_1_Meta).addCustomEffect(Hast1Effect, true);
        Potion_haste_1_Meta.setDisplayName("§c★ §6Potion du Mineur §c★");
        List<String> Potion_haste_1_Lore = new ArrayList<>();
        Potion_haste_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_1_Lore.add(Title_Color + "Description :");
        Potion_haste_1_Lore.add("§fCette potion vous fera oublier le");
        Potion_haste_1_Lore.add("§fmétier de Mineur");
        Potion_haste_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_1_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        Potion_haste_1_Lore.add(Title_Color + "Pouvoir : §cCélérité I");
        Potion_haste_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_haste_1_Lore.add("§fBoie la potion et donne");
        Potion_haste_1_Lore.add("§fl'effet célérité I.");
        Potion_haste_1_Lore.add(Title_Color + "Caractéristique :");
        Potion_haste_1_Lore.add("§a+ §e10% §bde vitesse d'attaque.");
        Potion_haste_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_1_Meta.setLore(Potion_haste_1_Lore);
        Potion_haste_1_Meta.setColor(Color.fromRGB(253, 255,0));
        Potion_haste_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_haste_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_haste_1_Stack.setItemMeta(Potion_haste_1_Meta);
        Potion_haste_1 = Potion_haste_1_Stack;
    }

    private static void CreatePotion_haste_2() {
        ItemStack Potion_haste_2_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_haste_2_Meta = (PotionMeta) Potion_haste_2_Stack.getItemMeta();
        PotionEffect Hast2Effect = PotionEffectType.FAST_DIGGING.createEffect( 1800, 1);
        Objects.requireNonNull(Potion_haste_2_Meta).addCustomEffect(Hast2Effect, true);
        Potion_haste_2_Meta.setDisplayName("§c★ §6Potion du Mineur II §c★");
        List<String> Potion_haste_2_Lore = new ArrayList<>();
        Potion_haste_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_2_Lore.add(Title_Color + "Description :");
        Potion_haste_2_Lore.add("§fCette potion vous fera oublier le");
        Potion_haste_2_Lore.add("§fmétier de Mineur");
        Potion_haste_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_2_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        Potion_haste_2_Lore.add(Title_Color + "Pouvoir : §cCélérité II");
        Potion_haste_2_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_haste_2_Lore.add("§fBoie la potion et donne");
        Potion_haste_2_Lore.add("§fl'effet célérité II.");
        Potion_haste_2_Lore.add(Title_Color + "Caractéristique :");
        Potion_haste_2_Lore.add("§a+ §e20% §bde vitesse d'attaque.");
        Potion_haste_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_2_Meta.setLore(Potion_haste_2_Lore);
        Potion_haste_2_Meta.setColor(Color.fromRGB(253, 255,0));
        Potion_haste_2_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_haste_2_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_haste_2_Stack.setItemMeta(Potion_haste_2_Meta);
        Potion_haste_2 = Potion_haste_2_Stack;
    }

    private static void CreatePotion_haste_3() {
        ItemStack Potion_haste_3_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_haste_3_Meta = (PotionMeta) Potion_haste_3_Stack.getItemMeta();
        PotionEffect Hast3Effect = PotionEffectType.FAST_DIGGING.createEffect( 1200, 2);
        Objects.requireNonNull(Potion_haste_3_Meta).addCustomEffect(Hast3Effect, true);
        Potion_haste_3_Meta.setDisplayName("§c★ §6Potion du Mineur III §c★");
        List<String> Potion_haste_3_Lore = new ArrayList<>();
        Potion_haste_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_3_Lore.add(Title_Color + "Description :");
        Potion_haste_3_Lore.add("§fCette potion vous fera oublier le");
        Potion_haste_3_Lore.add("§fmétier de Mineur");
        Potion_haste_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_3_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        Potion_haste_3_Lore.add(Title_Color + "Pouvoir : §cCélérité III");
        Potion_haste_3_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_haste_3_Lore.add("§fBoie la potion et donne");
        Potion_haste_3_Lore.add("§fl'effet célérité III.");
        Potion_haste_3_Lore.add(Title_Color + "Caractéristique :");
        Potion_haste_3_Lore.add("§a+ §e30% §bde vitesse d'attaque.");
        Potion_haste_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_haste_3_Meta.setLore(Potion_haste_3_Lore);
        Potion_haste_3_Meta.setColor(Color.fromRGB(253, 255,0));
        Potion_haste_3_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_haste_3_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_haste_3_Stack.setItemMeta(Potion_haste_3_Meta);
        Potion_haste_3 = Potion_haste_3_Stack;
    }

    private static void CreatePotion_luck_1() {
        ItemStack Potion_luck_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_luck_1_Meta = (PotionMeta) Potion_luck_1_Stack.getItemMeta();
        PotionEffect luck1Effect = PotionEffectType.LUCK.createEffect( 2400, 0);
        Objects.requireNonNull(Potion_luck_1_Meta).addCustomEffect(luck1Effect, true);
        Potion_luck_1_Meta.setDisplayName("§c★ §6Potion du Leprechaun §c★");
        List<String> Potion_luck_1_Lore = new ArrayList<>();
        Potion_luck_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_1_Lore.add(Title_Color + "Description :");
        Potion_luck_1_Lore.add("§fCette potion vous apportera");
        Potion_luck_1_Lore.add("§fchance et bonheur !");
        Potion_luck_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_1_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Potion_luck_1_Lore.add(Title_Color + "Pouvoir : §cChance I");
        Potion_luck_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_luck_1_Lore.add("§fBoie la potion et donne");
        Potion_luck_1_Lore.add("§fl'effet chance I.");
        Potion_luck_1_Lore.add(Title_Color + "Caractéristique :");
        Potion_luck_1_Lore.add("§a+ §e1 §bde chance.");
        Potion_luck_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_1_Meta.setLore(Potion_luck_1_Lore);
        Potion_luck_1_Meta.setColor(Color.fromRGB(13, 255,0));
        Potion_luck_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_luck_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_luck_1_Stack.setItemMeta(Potion_luck_1_Meta);
        Potion_luck_1 = Potion_luck_1_Stack;
    }

    private static void CreatePotion_luck_2() {
        ItemStack Potion_luck_2_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_luck_2_Meta = (PotionMeta) Potion_luck_2_Stack.getItemMeta();
        PotionEffect Hast2Effect = PotionEffectType.LUCK.createEffect( 1800, 1);
        Objects.requireNonNull(Potion_luck_2_Meta).addCustomEffect(Hast2Effect, true);
        Potion_luck_2_Meta.setDisplayName("§c★ §6Potion du Leprechaun II §c★");
        List<String> Potion_luck_2_Lore = new ArrayList<>();
        Potion_luck_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_2_Lore.add(Title_Color + "Description :");
        Potion_luck_2_Lore.add("§fCette potion vous apportera");
        Potion_luck_2_Lore.add("§fchance et bonheur !");
        Potion_luck_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_2_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Potion_luck_2_Lore.add(Title_Color + "Pouvoir : §cChance II");
        Potion_luck_2_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_luck_2_Lore.add("§fBoie la potion et donne");
        Potion_luck_2_Lore.add("§fl'effet chance II.");
        Potion_luck_2_Lore.add(Title_Color + "Caractéristique :");
        Potion_luck_2_Lore.add("§a+ §e2 §bde chance.");
        Potion_luck_2_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_2_Meta.setLore(Potion_luck_2_Lore);
        Potion_luck_2_Meta.setColor(Color.fromRGB(13, 255,0));
        Potion_luck_2_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_luck_2_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_luck_2_Stack.setItemMeta(Potion_luck_2_Meta);
        Potion_luck_2 = Potion_luck_2_Stack;
    }

    private static void CreatePotion_luck_3() {
        ItemStack Potion_luck_3_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_luck_3_Meta = (PotionMeta) Potion_luck_3_Stack.getItemMeta();
        PotionEffect Hast3Effect = PotionEffectType.LUCK.createEffect( 1200, 2);
        Objects.requireNonNull(Potion_luck_3_Meta).addCustomEffect(Hast3Effect, true);
        Potion_luck_3_Meta.setDisplayName("§c★ §6Potion du Leprechaun III §c★");
        List<String> Potion_luck_3_Lore = new ArrayList<>();
        Potion_luck_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_3_Lore.add(Title_Color + "Description :");
        Potion_luck_3_Lore.add("§fCette potion vous apportera");
        Potion_luck_3_Lore.add("§fchance et bonheur !");
        Potion_luck_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_3_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Potion_luck_3_Lore.add(Title_Color + "Pouvoir : §cChance III");
        Potion_luck_3_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_luck_3_Lore.add("§fBoie la potion et donne");
        Potion_luck_3_Lore.add("§fl'effet chance III.");
        Potion_luck_3_Lore.add(Title_Color + "Caractéristique :");
        Potion_luck_3_Lore.add("§a+ §e3 §bde chance.");
        Potion_luck_3_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_luck_3_Meta.setLore(Potion_luck_3_Lore);
        Potion_luck_3_Meta.setColor(Color.fromRGB(13, 255,0));
        Potion_luck_3_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_luck_3_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_luck_3_Stack.setItemMeta(Potion_luck_3_Meta);
        Potion_luck_3 = Potion_luck_3_Stack;
    }

    private static void CreatePotion_Resistance_1() {
        ItemStack Potion_Resistance_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_Resistance_1_Meta = (PotionMeta) Potion_Resistance_1_Stack.getItemMeta();
        PotionEffect Hast3Effect = PotionEffectType.DAMAGE_RESISTANCE.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_Resistance_1_Meta).addCustomEffect(Hast3Effect, true);
        Potion_Resistance_1_Meta.setDisplayName("§c★ §6Potion de résistance I §c★");
        List<String> Potion_Resistance_1_Lore = new ArrayList<>();
        Potion_Resistance_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Resistance_1_Lore.add(Title_Color + "Description :");
        Potion_Resistance_1_Lore.add("§fCette potion vous permettera");
        Potion_Resistance_1_Lore.add("§fde résisté au attaque très");
        Potion_Resistance_1_Lore.add("§fpuissante !");
        Potion_Resistance_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Resistance_1_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Potion_Resistance_1_Lore.add(Title_Color + "Pouvoir : §cRésistance I");
        Potion_Resistance_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_Resistance_1_Lore.add("§fBoie la potion et donne");
        Potion_Resistance_1_Lore.add("§fl'effet résistance I.");
        Potion_Resistance_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Resistance_1_Meta.setLore(Potion_Resistance_1_Lore);
        Potion_Resistance_1_Meta.setColor(Color.fromRGB(186, 98,79));
        Potion_Resistance_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_Resistance_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_Resistance_1_Stack.setItemMeta(Potion_Resistance_1_Meta);
        Potion_Resistance_1 = Potion_Resistance_1_Stack;
    }

    private static void CreatePotion_Beauty_1() {
        ItemStack Potion_beauty_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_beauty_1_Meta = (PotionMeta) Potion_beauty_1_Stack.getItemMeta();
        PotionEffect Beauty1Effect = PotionEffectType.GLOWING.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_beauty_1_Meta).addCustomEffect(Beauty1Effect, true);
        Potion_beauty_1_Meta.setDisplayName("§c★ §6Potion de brillance I §c★");
        List<String> Potion_beauty_1_Lore = new ArrayList<>();
        Potion_beauty_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_beauty_1_Lore.add(Title_Color + "Description :");
        Potion_beauty_1_Lore.add("§fCette potion vous fera brillé");
        Potion_beauty_1_Lore.add("§fdans toutes les circonstances !");
        Potion_beauty_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_beauty_1_Lore.add(Title_Color + "Qualité : " + Rarity_Rare);
        Potion_beauty_1_Lore.add(Title_Color + "Pouvoir : §cBrillance I");
        Potion_beauty_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_beauty_1_Lore.add("§fBoie la potion et donne");
        Potion_beauty_1_Lore.add("§fl'effet brillance I.");
        Potion_beauty_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_beauty_1_Meta.setLore(Potion_beauty_1_Lore);
        Potion_beauty_1_Meta.setColor(Color.fromRGB(157, 185,121));
        Potion_beauty_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_beauty_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_beauty_1_Stack.setItemMeta(Potion_beauty_1_Meta);
        Potion_Beauty_1 = Potion_beauty_1_Stack;
    }

    private static void CreatePotion_Saturation_1() {
        ItemStack Potion_Saturation_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_Saturation_1_Meta = (PotionMeta) Potion_Saturation_1_Stack.getItemMeta();
        PotionEffect Saturation1Effect = PotionEffectType.SATURATION.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_Saturation_1_Meta).addCustomEffect(Saturation1Effect, true);
        Potion_Saturation_1_Meta.setDisplayName("§c★ §6Potion de saturation I §c★");
        List<String> Potion_Saturation_1_Lore = new ArrayList<>();
        Potion_Saturation_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Saturation_1_Lore.add(Title_Color + "Description :");
        Potion_Saturation_1_Lore.add("§fCette potion vous remplira");
        Potion_Saturation_1_Lore.add("§fle ventre pendant longtemp !");
        Potion_Saturation_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Saturation_1_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        Potion_Saturation_1_Lore.add(Title_Color + "Pouvoir : §cSaturation I");
        Potion_Saturation_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_Saturation_1_Lore.add("§fBoie la potion et donne");
        Potion_Saturation_1_Lore.add("§fl'effet saturation I.");
        Potion_Saturation_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Saturation_1_Meta.setLore(Potion_Saturation_1_Lore);
        Potion_Saturation_1_Meta.setColor(Color.fromRGB(249, 26,38));
        Potion_Saturation_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_Saturation_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_Saturation_1_Stack.setItemMeta(Potion_Saturation_1_Meta);
        Potion_Saturation_1 = Potion_Saturation_1_Stack;
    }

    private static void CreatePotion_Absorption_1() {
        ItemStack Potion_Absorption_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_Absorption_1_Meta = (PotionMeta) Potion_Absorption_1_Stack.getItemMeta();
        PotionEffect Absorption1Effect = PotionEffectType.SATURATION.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_Absorption_1_Meta).addCustomEffect(Absorption1Effect, true);
        Potion_Absorption_1_Meta.setDisplayName("§c★ §6Potion de absorption I §c★");
        List<String> Potion_Absorption_1_Lore = new ArrayList<>();
        Potion_Absorption_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Absorption_1_Lore.add(Title_Color + "Description :");
        Potion_Absorption_1_Lore.add("§fCette potion vous aidera");
        Potion_Absorption_1_Lore.add("§fà amortir les chocs !");
        Potion_Absorption_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Absorption_1_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        Potion_Absorption_1_Lore.add(Title_Color + "Pouvoir : §cAbsorption I");
        Potion_Absorption_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_Absorption_1_Lore.add("§fBoie la potion et donne");
        Potion_Absorption_1_Lore.add("§fl'effet absorption I.");
        Potion_Absorption_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Absorption_1_Meta.setLore(Potion_Absorption_1_Lore);
        Potion_Absorption_1_Meta.setColor(Color.fromRGB(249, 26,38));
        Potion_Absorption_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_Absorption_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_Absorption_1_Stack.setItemMeta(Potion_Absorption_1_Meta);
        Potion_Absorption_1 = Potion_Absorption_1_Stack;
    }

    private static void CreatePotion_HealBoost_1() {
        ItemStack Potion_HealBoost_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_HealBoost_1_Meta = (PotionMeta) Potion_HealBoost_1_Stack.getItemMeta();
        PotionEffect HealBoost1Effect = PotionEffectType.HEALTH_BOOST.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_HealBoost_1_Meta).addCustomEffect(HealBoost1Effect, true);
        Potion_HealBoost_1_Meta.setDisplayName("§c★ §6Potion de boost de vie I §c★");
        List<String> Potion_HealBoost_1_Lore = new ArrayList<>();
        Potion_HealBoost_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_HealBoost_1_Lore.add(Title_Color + "Description :");
        Potion_HealBoost_1_Lore.add("§fCette potion vous donnera");
        Potion_HealBoost_1_Lore.add("§fune vie plus longue !");
        Potion_HealBoost_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_HealBoost_1_Lore.add(Title_Color + "Qualité : " + Rarity_Epic);
        Potion_HealBoost_1_Lore.add(Title_Color + "Pouvoir : §cBoost de vie I");
        Potion_HealBoost_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_HealBoost_1_Lore.add("§fBoie la potion et donne");
        Potion_HealBoost_1_Lore.add("§fl'effet boost de vie I.");
        Potion_HealBoost_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_HealBoost_1_Meta.setLore(Potion_HealBoost_1_Lore);
        Potion_HealBoost_1_Meta.setColor(Color.fromRGB(255, 148,41));
        Potion_HealBoost_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_HealBoost_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_HealBoost_1_Stack.setItemMeta(Potion_HealBoost_1_Meta);
        Potion_HealBoost_1 = Potion_HealBoost_1_Stack;
    }

    private static void CreatePotion_Hero_1() {
        ItemStack Potion_Hero_1_Stack = new ItemStack(Material.POTION,1);
        PotionMeta Potion_Hero_1_Meta = (PotionMeta) Potion_Hero_1_Stack.getItemMeta();
        PotionEffect Hero1Effect = PotionEffectType.HEALTH_BOOST.createEffect( 1200, 0);
        Objects.requireNonNull(Potion_Hero_1_Meta).addCustomEffect(Hero1Effect, true);
        Potion_Hero_1_Meta.setDisplayName("§c★ §6Potion des hero's I §c★");
        List<String> Potion_Hero_1_Lore = new ArrayList<>();
        Potion_Hero_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Hero_1_Lore.add(Title_Color + "Description :");
        Potion_Hero_1_Lore.add("§fCette potion vous apportera");
        Potion_Hero_1_Lore.add("§fune grande gloire dans votre");
        Potion_Hero_1_Lore.add("§fville !");
        Potion_Hero_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Hero_1_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Potion_Hero_1_Lore.add(Title_Color + "Pouvoir : §cHero's I");
        Potion_Hero_1_Lore.add(Title_Color + "Effet -> §fClique §adroit §f:");
        Potion_Hero_1_Lore.add("§fBoie la potion et donne");
        Potion_Hero_1_Lore.add("§fl'effet Hero's I.");
        Potion_Hero_1_Lore.add(Separator_Color + "§m--------------------------------");
        Potion_Hero_1_Meta.setLore(Potion_Hero_1_Lore);
        Potion_Hero_1_Meta.setColor(Color.fromRGB(81, 255,51));
        Potion_Hero_1_Meta.addItemFlags(HIDE_POTION_EFFECTS);
        Potion_Hero_1_Meta.addItemFlags(HIDE_ATTRIBUTES);
        Potion_Hero_1_Stack.setItemMeta(Potion_Hero_1_Meta);
        Potion_Hero_1 = Potion_Hero_1_Stack;
    }

    private static void CreateHat_Farmer() {
        ItemStack Hat_Farmer_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Farmer_Meta = Hat_Farmer_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Farmer_Meta).setDisplayName("§c★ §6Chapeau de §aFermier §c★");
        List<String> Hat_Farmer_Lore = new ArrayList<>();
        Hat_Farmer_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Farmer_Lore.add(Title_Color + "Description :");
        Hat_Farmer_Lore.add("§fCe chapeau de paille vous");
        Hat_Farmer_Lore.add("§fsera très utilse au milieu");
        Hat_Farmer_Lore.add("§fde vos champs !");
        Hat_Farmer_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Farmer_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Farmer_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Farmer_Lore.add(Title_Color + "Type : §eObjet de quête §f:");
        Hat_Farmer_Lore.add("§fPeut être obtenue une quête.");
        Hat_Farmer_Lore.add(Title_Color + "quête : §bPlantez des graines");
        Hat_Farmer_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Farmer_Meta.setLore(Hat_Farmer_Lore);
        Hat_Farmer_Meta.setCustomModelData(48);
        Hat_Farmer_Stack.setItemMeta(Hat_Farmer_Meta);
        Hat_Farmer = Hat_Farmer_Stack;
    }

    private static void CreateHat_Arrow() {
        ItemStack Hat_Arrow_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Arrow_Meta = Hat_Arrow_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Arrow_Meta).setDisplayName("§c★ §6Chapeau §aFlèche §c★");
        List<String> Hat_Arrow_Lore = new ArrayList<>();
        Hat_Arrow_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Arrow_Lore.add(Title_Color + "Description :");
        Hat_Arrow_Lore.add("§fCette flèche à l'air de");
        Hat_Arrow_Lore.add("§fs'être perdu dans votre");
        Hat_Arrow_Lore.add("§ftête !");
        Hat_Arrow_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Arrow_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Arrow_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Arrow_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Arrow_Lore.add("§fPeut être obtenue au shop.");
        Hat_Arrow_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Arrow_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Arrow_Meta.setLore(Hat_Arrow_Lore);
        Hat_Arrow_Meta.setCustomModelData(3);
        Hat_Arrow_Stack.setItemMeta(Hat_Arrow_Meta);
        Hat_Arrow = Hat_Arrow_Stack;
    }

    private static void CreateHat_Fes() {
        ItemStack Hat_Fes_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Fes_Meta = Hat_Fes_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Fes_Meta).setDisplayName("§c★ §6Chapeau §aFès §c★");
        List<String> Hat_Fes_Lore = new ArrayList<>();
        Hat_Fes_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Fes_Lore.add(Title_Color + "Description :");
        Hat_Fes_Lore.add("§fVeritable chapeau marocain");
        Hat_Fes_Lore.add("§fil vous aidera à passé les");
        Hat_Fes_Lore.add("§fdesert les plus arides !");
        Hat_Fes_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Fes_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Fes_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Fes_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Fes_Lore.add("§fPeut être obtenue au shop.");
        Hat_Fes_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Fes_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Fes_Meta.setLore(Hat_Fes_Lore);
        Hat_Fes_Meta.setCustomModelData(1);
        Hat_Fes_Stack.setItemMeta(Hat_Fes_Meta);
        Hat_Fes = Hat_Fes_Stack;
    }

    private static void CreateHat_Indian() {
        ItemStack Hat_Indian_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Indian_Meta = Hat_Indian_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Indian_Meta).setDisplayName("§c★ §6Chapeau §ad'indien §c★");
        List<String> Hat_Indian_Lore = new ArrayList<>();
        Hat_Indian_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Indian_Lore.add(Title_Color + "Description :");
        Hat_Indian_Lore.add("§fVeritable chapeau marocain");
        Hat_Indian_Lore.add("§fil vous aidera à passé les");
        Hat_Indian_Lore.add("§fdesert les plus arides !");
        Hat_Indian_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Indian_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Indian_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Indian_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Indian_Lore.add("§fPeut être obtenue au shop.");
        Hat_Indian_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Indian_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Indian_Meta.setLore(Hat_Indian_Lore);
        Hat_Indian_Meta.setCustomModelData(60);
        Hat_Indian_Stack.setItemMeta(Hat_Indian_Meta);
        Hat_Indian = Hat_Indian_Stack;
    }

    private static void CreateHat_Dandy_RED() {
        ItemStack Hat_Dandy_RED_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_RED_Meta = Hat_Dandy_RED_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_RED_Meta).setDisplayName("§c★ §6Chapeau de §aDandy rouge §c★");
        List<String> Hat_Dandy_RED_Lore = new ArrayList<>();
        Hat_Dandy_RED_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RED_Lore.add(Title_Color + "Description :");
        Hat_Dandy_RED_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_RED_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_RED_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_RED_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RED_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Dandy_RED_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_RED_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_RED_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_RED_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_RED_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RED_Meta.setLore(Hat_Dandy_RED_Lore);
        Hat_Dandy_RED_Meta.setCustomModelData(19);
        Hat_Dandy_RED_Stack.setItemMeta(Hat_Dandy_RED_Meta);
        Hat_Dandy_RED = Hat_Dandy_RED_Stack;
    }

    private static void CreateHat_Dandy_LBLUE() {
        ItemStack Hat_Dandy_LBLUE_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_LBLUE_Meta = Hat_Dandy_LBLUE_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_LBLUE_Meta).setDisplayName("§c★ §6Chapeau de §aDandy blue clair §c★");
        List<String> Hat_Dandy_LBLUE_Lore = new ArrayList<>();
        Hat_Dandy_LBLUE_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LBLUE_Lore.add(Title_Color + "Description :");
        Hat_Dandy_LBLUE_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_LBLUE_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_LBLUE_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_LBLUE_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LBLUE_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Dandy_LBLUE_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_LBLUE_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_LBLUE_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_LBLUE_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_LBLUE_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LBLUE_Meta.setLore(Hat_Dandy_LBLUE_Lore);
        Hat_Dandy_LBLUE_Meta.setCustomModelData(8);
        Hat_Dandy_LBLUE_Stack.setItemMeta(Hat_Dandy_LBLUE_Meta);
        Hat_Dandy_LBLUE = Hat_Dandy_LBLUE_Stack;
    }

    private static void CreateHat_Dandy_YELLOW() {
        ItemStack Hat_Dandy_YELLOW_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_YELLOW_Meta = Hat_Dandy_YELLOW_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_YELLOW_Meta).setDisplayName("§c★ §6Chapeau de §aDandy jaune §c★");
        List<String> Hat_Dandy_YELLOW_Lore = new ArrayList<>();
        Hat_Dandy_YELLOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_YELLOW_Lore.add(Title_Color + "Description :");
        Hat_Dandy_YELLOW_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_YELLOW_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_YELLOW_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_YELLOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_YELLOW_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Dandy_YELLOW_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_YELLOW_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_YELLOW_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_YELLOW_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_YELLOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_YELLOW_Meta.setLore(Hat_Dandy_YELLOW_Lore);
        Hat_Dandy_YELLOW_Meta.setCustomModelData(9);
        Hat_Dandy_YELLOW_Stack.setItemMeta(Hat_Dandy_YELLOW_Meta);
        Hat_Dandy_YELLOW = Hat_Dandy_YELLOW_Stack;
    }

    private static void CreateHat_Dandy_LIME() {
        ItemStack Hat_Dandy_LIME_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_LIME_Meta = Hat_Dandy_LIME_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_LIME_Meta).setDisplayName("§c★ §6Chapeau de §aDandy vert clair §c★");
        List<String> Hat_Dandy_LIME_Lore = new ArrayList<>();
        Hat_Dandy_LIME_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LIME_Lore.add(Title_Color + "Description :");
        Hat_Dandy_LIME_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_LIME_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_LIME_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_LIME_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LIME_Lore.add(Title_Color + "Qualité : " + Rarity_Legendary);
        Hat_Dandy_LIME_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_LIME_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_LIME_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_LIME_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_LIME_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_LIME_Meta.setLore(Hat_Dandy_LIME_Lore);
        Hat_Dandy_LIME_Meta.setCustomModelData(10);
        Hat_Dandy_LIME_Stack.setItemMeta(Hat_Dandy_LIME_Meta);
        Hat_Dandy_LIME = Hat_Dandy_LIME_Stack;
    }

    private static void CreateHat_Dandy_RAINBOW() {
        ItemStack Hat_Dandy_RAINBOW_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_RAINBOW_Meta = Hat_Dandy_RAINBOW_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_RAINBOW_Meta).setDisplayName("§c★ §6Chapeau de §aDandy multicouleur §c★");
        List<String> Hat_Dandy_RAINBOW_Lore = new ArrayList<>();
        Hat_Dandy_RAINBOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RAINBOW_Lore.add(Title_Color + "Description :");
        Hat_Dandy_RAINBOW_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_RAINBOW_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_RAINBOW_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_RAINBOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RAINBOW_Lore.add(Title_Color + "Qualité : " + Rarity_Artefact);
        Hat_Dandy_RAINBOW_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_RAINBOW_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_RAINBOW_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_RAINBOW_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_RAINBOW_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_RAINBOW_Meta.setLore(Hat_Dandy_RAINBOW_Lore);
        Hat_Dandy_RAINBOW_Meta.setCustomModelData(21);
        Hat_Dandy_RAINBOW_Stack.setItemMeta(Hat_Dandy_RAINBOW_Meta);
        Hat_Dandy_RAINBOW = Hat_Dandy_RAINBOW_Stack;
    }

    private static void CreateHat_Dandy_GLASS() {
        ItemStack Hat_Dandy_GLASS_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Dandy_GLASS_Meta = Hat_Dandy_GLASS_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Dandy_GLASS_Meta).setDisplayName("§c★ §6Chapeau de §aDandy monocle §c★");
        List<String> Hat_Dandy_GLASS_Lore = new ArrayList<>();
        Hat_Dandy_GLASS_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_GLASS_Lore.add(Title_Color + "Description :");
        Hat_Dandy_GLASS_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Dandy_GLASS_Lore.add("§fil vous ouvrira les portes des");
        Hat_Dandy_GLASS_Lore.add("§fcourt les plus prisées !");
        Hat_Dandy_GLASS_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_GLASS_Lore.add(Title_Color + "Qualité : " + Rarity_Artefact);
        Hat_Dandy_GLASS_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Dandy_GLASS_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Dandy_GLASS_Lore.add("§fPeut être obtenue au shop.");
        Hat_Dandy_GLASS_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Dandy_GLASS_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Dandy_GLASS_Meta.setLore(Hat_Dandy_GLASS_Lore);
        Hat_Dandy_GLASS_Meta.setCustomModelData(22);
        Hat_Dandy_GLASS_Stack.setItemMeta(Hat_Dandy_GLASS_Meta);
        Hat_Dandy_GLASS = Hat_Dandy_GLASS_Stack;
    }

    private static void CreateHat_Squid() {
        ItemStack Hat_Squid_Stack = new ItemStack(Material.CARVED_PUMPKIN,1);
        ItemMeta Hat_Squid_Meta = Hat_Squid_Stack.getItemMeta();
        Objects.requireNonNull(Hat_Squid_Meta).setDisplayName("§c★ §6Chapeau §aPoulpe §c★");
        List<String> Hat_Squid_Lore = new ArrayList<>();
        Hat_Squid_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Squid_Lore.add(Title_Color + "Description :");
        Hat_Squid_Lore.add("§fVeritable chapeau de gentleman");
        Hat_Squid_Lore.add("§fil vous ouvrira les portes des");
        Hat_Squid_Lore.add("§fcourt les plus prisées !");
        Hat_Squid_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Squid_Lore.add(Title_Color + "Qualité : " + Rarity_Artefact);
        Hat_Squid_Lore.add(Title_Color + "Pouvoir : §6☻ §cInconnus §6☻");
        Hat_Squid_Lore.add(Title_Color + "Type : §eObjet cosmétique §f:");
        Hat_Squid_Lore.add("§fPeut être obtenue au shop.");
        Hat_Squid_Lore.add(Title_Color + "Shop : §bCosmétiques");
        Hat_Squid_Lore.add(Separator_Color + "§m--------------------------------");
        Hat_Squid_Meta.setLore(Hat_Squid_Lore);
        Hat_Squid_Meta.setCustomModelData(2);
        Hat_Squid_Stack.setItemMeta(Hat_Squid_Meta);
        Hat_Squid = Hat_Squid_Stack;
    }

    private static void CreateTrashCan() {
        ItemStack TrashCan_Stack = new ItemStack(Material.CAULDRON, 1);
        ItemMeta TrashCan_Meta = TrashCan_Stack.getItemMeta();
        Objects.requireNonNull(TrashCan_Meta).setDisplayName("§c★ §6Poubelle §c★");
        List<String> TrashCan_Lore = new ArrayList<>();
        TrashCan_Lore.add(Separator_Color + "§m--------------------------------");
        TrashCan_Lore.add(Title_Color + "Description :");
        TrashCan_Lore.add("§fInventé par le grand §bQJWIN");
        TrashCan_Lore.add("§fla poubelle est un item très");
        TrashCan_Lore.add("§futile pour supprimer vos items.");
        TrashCan_Lore.add(Separator_Color + "§m--------------------------------");
        TrashCan_Lore.add(Title_Color + "Qualité : " + Rarity_Commun);
        TrashCan_Lore.add(Title_Color + "Pouvoir : §cPoubelle");
        TrashCan_Lore.add(Title_Color + "Effet -> §fclique §adroit §f:");
        TrashCan_Lore.add("§fOuvre le menu de la poubelle");
        TrashCan_Lore.add("§fpuis détruit les items quand");
        TrashCan_Lore.add("§fle menu ce ferme !");
        TrashCan_Lore.add(Separator_Color + "§m--------------------------------");
        TrashCan_Lore.add(Title_Color + "ID : §fPBL_01");
        TrashCan_Meta.setLore(TrashCan_Lore);
        TrashCan_Meta.addEnchant(Enchantment.DURABILITY, 3, false);
        TrashCan_Meta.addItemFlags(HIDE_ENCHANTS);
        TrashCan_Stack.setItemMeta(TrashCan_Meta);
        TrashCan = TrashCan_Stack;
    }


}























