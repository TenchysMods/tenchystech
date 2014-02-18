package me.TenchysMods.TenchyCraft;

import me.TenchysMods.TenchyCraft.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "tenchystech", name = "Tenchy's Tech", version = "0.01")
public class TenchyCraft {
	
	@Instance(value = "tenchystech")
	public static TenchyCraft instance;
	
	@SidedProxy(clientSide = "me.TenchysMods.TenchyCraft.proxy.ClientProxy", serverSide = "me.TenchysMods.TenchyCraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	// Creative Tab
	public static CreativeTabs tabTenchyTech = new TabTenchyTech(CreativeTabs.getNextID(), "Tenchy's Tech");
	
	// Items
	public static Item ChargedIngot;
	
	public void itemloader() {
		ChargedIngot = new me.TenchysMods.TenchyCraft.item.ChargedIngot(2001).setUnlocalizedName("itemChargedIngot");
		LanguageRegistry.addName(ChargedIngot, "Redstone Charged Ingot");
		GameRegistry.addRecipe(new ItemStack(ChargedIngot, 1), new Object[]{"rrr", "rir", "rrr", 'r', Item.redstone, 'i', Item.ingotIron});
	}
	
	public void blockloader() {
		
	}
	
	public void toolloader() {
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		itemloader();
		blockloader();
		toolloader();
	}
	
}
