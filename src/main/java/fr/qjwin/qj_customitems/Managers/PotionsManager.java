/*
Class Name : PotionsManager
From Package : fr.qjwin.qj_customitems.Managers
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Managers;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.bukkit.inventory.ItemFlag.HIDE_ATTRIBUTES;
import static org.bukkit.inventory.ItemFlag.HIDE_POTION_EFFECTS;

public class PotionsManager {

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

    public static void init (){
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

}
