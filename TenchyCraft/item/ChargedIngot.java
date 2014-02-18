package me.TenchysMods.TenchyCraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.TenchysMods.TenchyCraft.TenchyCraft;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ChargedIngot extends Item {

	public ChargedIngot(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(TenchyCraft.tabTenchyTech);
	}
	
	@Override()
	public boolean hasEffect(ItemStack par1) {
		return true;
	}
	
	@Override()
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1) {
		return EnumRarity.rare;
	}
	
}
