package edu.ics.uci.minebike.minecraft.npcs.customNpcs;

import edu.ics.uci.minebike.minecraft.npcs.NpcDatabase;
import edu.ics.uci.minebike.minecraft.quests.CustomQuestManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import noppes.npcs.entity.EntityCustomNpc;

public class Jaya extends AbstractCustomNpc{
    public static final String NAME = "Jaya";
    public static final Vec3d LOCATION = new Vec3d(111,70,10); // TODO: figure out the location
    public static final String TEXTURE_NAME = "customnpcs:textures/entity/humanmale/tradesteve.png";
    public static String UUID;

    public Jaya(){
        name = NAME;
        location = LOCATION;
        texture = TEXTURE_NAME;

        // TODO: implement the quest system and new it here

        this.register();

    }
    @Override
    public void onInteraction(EntityPlayer player, PlayerInteractEvent.EntityInteract event) {
        System.out.println("Jaya was interacted");

        for(EntityCustomNpc npc: NpcDatabase.npc_entities){
            //System.out.println(npc.getName());
            if(npc.getName().equals(this.name)){
                npc.delete();
                System.out.println(npc.getName() + " is deleted");
            }
        }
        CustomQuestManager.quest_list.get(0);
    }
}