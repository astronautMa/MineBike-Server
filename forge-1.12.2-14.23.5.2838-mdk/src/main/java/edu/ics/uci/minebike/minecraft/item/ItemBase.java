package edu.ics.uci.minebike.minecraft.item;


import edu.ics.uci.minebike.minecraft.BiGXMain;
import edu.ics.uci.minebike.minecraft.ModItems;
import edu.ics.uci.minebike.minecraft.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        BiGXMain.proxy.registerItemRenderer(this, 0 , "inventory");
    }
}