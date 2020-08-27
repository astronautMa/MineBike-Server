package edu.ics.uci.minebike.minecraft;

//import biomesoplenty.common.biome.overworld.BiomeGenWhiteBeach;
import edu.ics.uci.minebike.minecraft.worlds.WorldProviderFishing;
import edu.ics.uci.minebike.minecraft.worlds.WorldProviderSoccerQuest;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class CommonProxy implements IGuiHandler {
    public CommonProxy(){
        System.out.println("Registering Dimension with id = " + WorldProviderSoccerQuest.DIM_ID);
        DimensionType soccerDType = DimensionType.register("soccerDim", "customDim", WorldProviderSoccerQuest.DIM_ID,WorldProviderSoccerQuest.class, true);
        DimensionManager.registerDimension(soccerDType.getId(),soccerDType);
        DimensionType fishingDtype = DimensionType.register("fishingDim", "customDim", WorldProviderFishing.DIM_ID,WorldProviderFishing.class ,true);
        DimensionManager.registerDimension(fishingDtype.getId(),fishingDtype);
    }
    public void load(){
        BiGXMain.Channel.register(new PacketHandlerClient());
        BiGXMain.ChannelPlayer.register(new PacketHandlerServer());
    }

    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),id));
    }
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
}
