/*
Class Name : HatsManager
From Package : fr.qjwin.qj_customitems.Managers
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Managers;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HatsManager {

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

    public static void init (){
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



}
