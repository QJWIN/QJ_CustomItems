/*
Class Name : CraftsManager
From Package : fr.qjwin.qj_customitems.Method
Made by : QJWIN
*/
package fr.qjwin.qj_customitems.Managers;

import fr.qjwin.qj_customitems.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import static fr.qjwin.qj_customitems.Managers.ItemsManager.TrashCan;

public class CraftsManager {

    Main plugin;

    public CraftsManager(Main plugin){
        this.plugin = plugin;
    }

    public static void init(){

        Init_CustomCraft();

    }

    // Shapeless
    public static ShapelessRecipe inkSac;
    public static ShapelessRecipe inkSac2;
    public static ShapelessRecipe prismarineshard;
    public static ShapelessRecipe prismarineCrystals;

    // Shaped
    public static ShapedRecipe powered_rail;
    public static ShapedRecipe cobweb;
    public static ShapedRecipe packedice;
    public static ShapedRecipe blueice;
    public static ShapedRecipe firecoral;
    public static ShapedRecipe braincoral;
    public static ShapedRecipe tubecoral;
    public static ShapedRecipe horncoral;
    public static ShapedRecipe bubblecoral;
    public static ShapedRecipe endstone;
    public static ShapedRecipe endRod;

    public static ShapedRecipe lilypad;
    public static ShapedRecipe lilypad2;
    public static ShapedRecipe lilypad3;
    public static ShapedRecipe lilypad4;
    public static ShapedRecipe lilypad5;
    public static ShapedRecipe lilypad6;

    public static ShapedRecipe vines;
    public static ShapedRecipe vines2;
    public static ShapedRecipe vines3;
    public static ShapedRecipe vines4;
    public static ShapedRecipe vines5;
    public static ShapedRecipe vines6;

    public static ShapedRecipe poubelle;

    // Furnace
    public static FurnaceRecipe smooth_sandstone;
    public static FurnaceRecipe smooth_red_sandstone;

    public static void Init_CustomCraft(){

        // POWERED RAIL
        powered_rail = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        powered_rail.shape("I I", "ISI", "IRI");
        powered_rail.setIngredient('I', Material.IRON_INGOT);
        powered_rail.setIngredient('S', Material.STICK);
        powered_rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(powered_rail);

        // WEB
        cobweb = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_powered_web"), new ItemStack(Material.COBWEB, 1));
        cobweb.shape("WWW", "WWW", "WWW");
        cobweb.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(cobweb);

        // INK SAC
        inkSac = new ShapelessRecipe(new NamespacedKey(Main.getinstance, "QJCI_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        // INK SAC 2
        inkSac2 = new ShapelessRecipe(new NamespacedKey(Main.getinstance, "QJCI_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        // PRISMARINE
        prismarineshard = new ShapelessRecipe(new NamespacedKey(Main.getinstance, "QJCI_prismarine_shard"), new ItemStack(Material.PRISMARINE_SHARD, 1));
        prismarineshard.addIngredient(Material.SAND);
        prismarineshard.addIngredient(Material.DIRT);
        prismarineshard.addIngredient(Material.LAPIS_LAZULI);
        Bukkit.addRecipe(prismarineshard);
        prismarineCrystals = new ShapelessRecipe(new NamespacedKey(Main.getinstance, "QJCI_prismarine_crystals"), new ItemStack(Material.PRISMARINE_CRYSTALS, 1));
        prismarineCrystals.addIngredient(Material.PRISMARINE_SHARD);
        prismarineCrystals.addIngredient(Material.GLOWSTONE_DUST);
        Bukkit.addRecipe(prismarineCrystals);

        // PACKED ICE
        packedice = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_packedice"), new ItemStack(Material.PACKED_ICE, 3));
        packedice.shape("III", "III", "III");
        packedice.setIngredient('I', Material.ICE);
        Bukkit.addRecipe(packedice);
        blueice = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_blueice"), new ItemStack(Material.BLUE_ICE, 3));
        blueice.shape("III", "III", "III");
        blueice.setIngredient('I', Material.PACKED_ICE);
        Bukkit.addRecipe(blueice);

        // CORAL
        firecoral = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_firecoral"), new ItemStack(Material.FIRE_CORAL_BLOCK, 1));
        firecoral.shape("CC", "CC");
        firecoral.setIngredient('C', Material.FIRE_CORAL);
        Bukkit.addRecipe(firecoral);
        braincoral = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_braincoral"), new ItemStack(Material.BRAIN_CORAL_BLOCK, 1));
        braincoral.shape("CC", "CC");
        braincoral.setIngredient('C', Material.BRAIN_CORAL);
        Bukkit.addRecipe(braincoral);
        tubecoral = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_tubecoral"), new ItemStack(Material.TUBE_CORAL_BLOCK, 1));
        tubecoral.shape("CC", "CC");
        tubecoral.setIngredient('C', Material.TUBE_CORAL);
        Bukkit.addRecipe(tubecoral);
        horncoral = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_horncoral"), new ItemStack(Material.HORN_CORAL_BLOCK, 1));
        horncoral.shape("CC", "CC");
        horncoral.setIngredient('C', Material.HORN_CORAL);
        Bukkit.addRecipe(horncoral);
        bubblecoral = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_bubblecoral"), new ItemStack(Material.BUBBLE_CORAL_BLOCK, 1));
        bubblecoral.shape("CC", "CC");
        bubblecoral.setIngredient('C', Material.BUBBLE_CORAL);
        Bukkit.addRecipe(bubblecoral);

        // END STONE
        endstone = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_endstone"), new ItemStack(Material.END_STONE, 1));
        endstone.shape("SSS", "SCS", "SSS");
        endstone.setIngredient('C', Material.COBBLESTONE);
        endstone.setIngredient('S', Material.SAND);
        Bukkit.addRecipe(endstone);

        // LILYPADS
        lilypad = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad1"), new ItemStack(Material.LILY_PAD, 3));
        lilypad.shape("L L", "LLL", "LLL");
        lilypad.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(lilypad);
        lilypad2 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad2"), new ItemStack(Material.LILY_PAD, 3));
        lilypad2.shape("L L", "LLL", "LLL");
        lilypad2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(lilypad2);
        lilypad3 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad3"), new ItemStack(Material.LILY_PAD, 3));
        lilypad3.shape("L L", "LLL", "LLL");
        lilypad3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(lilypad3);
        lilypad4 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad4"), new ItemStack(Material.LILY_PAD, 3));
        lilypad4.shape("L L", "LLL", "LLL");
        lilypad4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(lilypad4);
        lilypad5 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad5"), new ItemStack(Material.LILY_PAD, 3));
        lilypad5.shape("L L", "LLL", "LLL");
        lilypad5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(lilypad5);
        lilypad6 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_lilypad6"), new ItemStack(Material.LILY_PAD, 3));
        lilypad6.shape("L L", "LLL", "LLL");
        lilypad6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(lilypad6);

        // VINES
        vines = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines1"), new ItemStack(Material.VINE, 3));
        vines.shape("L L", "LLL", "L L");
        vines.setIngredient('L', Material.ACACIA_LEAVES);
        Bukkit.addRecipe(vines);
        vines2 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines2"), new ItemStack(Material.VINE, 3));
        vines2.shape("L L", "LLL", "L L");
        vines2.setIngredient('L', Material.BIRCH_LEAVES);
        Bukkit.addRecipe(vines2);
        vines3 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines3"), new ItemStack(Material.VINE, 3));
        vines3.shape("L L", "LLL", "L L");
        vines3.setIngredient('L', Material.DARK_OAK_LEAVES);
        Bukkit.addRecipe(vines3);
        vines4 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines4"), new ItemStack(Material.VINE, 3));
        vines4.shape("L L", "LLL", "L L");
        vines4.setIngredient('L', Material.JUNGLE_LEAVES);
        Bukkit.addRecipe(vines4);
        vines5 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines5"), new ItemStack(Material.VINE, 3));
        vines5.shape("L L", "LLL", "L L");
        vines5.setIngredient('L', Material.OAK_LEAVES);
        Bukkit.addRecipe(vines5);
        vines6 = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_vines6"), new ItemStack(Material.VINE, 3));
        vines6.shape("L L", "LLL", "L L");
        vines6.setIngredient('L', Material.SPRUCE_LEAVES);
        Bukkit.addRecipe(vines6);

        // END ROD
        endRod = new ShapedRecipe(new NamespacedKey(Main.getinstance, "QJCI_endrod"), new ItemStack(Material.END_ROD, 1));
        endRod.shape("GWG", "GWG", "GWG");
        endRod.setIngredient('G', Material.GLOWSTONE_DUST);
        endRod.setIngredient('W', Material.WHITE_STAINED_GLASS);
        Bukkit.addRecipe(endRod);

        // SAND STONE
        smooth_sandstone = new FurnaceRecipe(new NamespacedKey(Main.getinstance, "QJCI_smooth_sandstone"), new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE, 10, 200);
        Bukkit.addRecipe(smooth_sandstone);
        smooth_red_sandstone = new FurnaceRecipe(new NamespacedKey(Main.getinstance, "QJCI_smooth_red_sandstone"), new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE, 10, 200);
        Bukkit.addRecipe(smooth_red_sandstone);

        // POUBELLE
        poubelle = new ShapedRecipe(new NamespacedKey(Main.getinstance,"QJCI_trashcan"), new ItemStack(ItemsManager.TrashCan));
        poubelle.shape("   ", " T ", " C ");
        poubelle.setIngredient('T', Material.IRON_TRAPDOOR);
        poubelle.setIngredient('C', Material.CAULDRON);
        Bukkit.addRecipe(poubelle);

    }

}
