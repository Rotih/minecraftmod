package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Block  shaunakOre = new ModBlock(Material.rock,"shaunakOre");
    	GameRegistry.registerBlock(shaunakOre, "shaunakOre");
    }
    
    private class ModBlock extends Block{

		public ModBlock(Material material, String blockName) {
			super(material);
			this.setBlockName(blockName);
			this.setBlockTextureName(MODID + ":" + blockName);
			this.setCreativeTab(CreativeTabs.tabBlock);
			// TODO Auto-generated constructor stub
		}
    	
    }
}
