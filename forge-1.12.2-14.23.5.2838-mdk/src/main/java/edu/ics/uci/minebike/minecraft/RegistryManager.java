package edu.ics.uci.minebike.minecraft;

import edu.ics.uci.minebike.minecraft.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import edu.ics.uci.minebike.minecraft.item.ItemManager;

public class RegistryManager {
    public RegistryManager() {
    }

    @EventBusSubscriber
    public static class RegistryHandler {
        public static SoundEvent FISH_SPLASHING_EVENT;
        public static SoundEvent REELING_EVENT;

        public RegistryHandler() {
        }

//        @SubscribeEvent
//        public static void onRegisterBlock(Register<Block> e) {

//        }

        @SubscribeEvent
        public static void onRegisterItem(Register<Item> e) {

            ItemManager.register(e.getRegistry());
        }

        @SubscribeEvent
        public static void onItemRegister(RegistryEvent.Register<Item> event){
            event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
        }

        @SubscribeEvent
        public static void onModelRegister(ModelRegistryEvent event)
        {
            for(Item item : ModItems.ITEMS)
            {
                if(item instanceof IHasModel)
                {
                    ((IHasModel)item).registerModels();
                }
            }
        }

//        @SubscribeEvent
//        public static void onRegisterSound(Register<SoundEvent> e) {
////
//        }
    }
}
