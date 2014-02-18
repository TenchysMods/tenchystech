package me.TenchysMods.TenchyCraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public final class TabTenchyTech extends CreativeTabs {

	public TabTenchyTech(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return TenchyCraft.ChargedIngot.itemID;
	}
	
	public String getTranslatedTabLabel() {
		return "Tenchy's Tech";
	}
	
}
