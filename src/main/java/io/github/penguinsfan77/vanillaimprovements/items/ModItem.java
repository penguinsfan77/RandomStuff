package io.github.penguinsfan77.vanillaimprovements.items;

import io.github.penguinsfan77.vanillaimprovements.creativeTab.ModCreativeTabs;
import io.github.penguinsfan77.vanillaimprovements.references.Reference;
import io.github.penguinsfan77.vanillaimprovements.references.Textures;
import io.github.penguinsfan77.vanillaimprovements.utilities.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItem extends Item {
	
	//Constructor
	public ModItem() {
		
        super();
        
        this.setCreativeTab(ModCreativeTabs.RANDOM_STUFF_TAB);
        
    }

	//Get the unlocalized name
    @Override
    public String getUnlocalizedName() {
    	
        return String.format("item.%s%s", Textures.PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    
    }

    //Get the unlocalized name of an ItemStack
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
    	
        return String.format("item.%s%s", Textures.PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    
    }

    //Set the texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
    	
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
   
    }

    //Get the unlocalized name without the prefix
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
    	
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    
    }

}
