package com.clemdefrance.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.Display;

public class OnClientTick {
    @SubscribeEvent
    public void ClientTick(TickEvent.ClientTickEvent event) {
        EntityPlayerSP player = Minecraft.getMinecraft().player;

        if(player == null ) {
            Display.setTitle("Football Mods - Loading...");
        } else {
            Display.setTitle("Football Mods - " + player.getName());
        }
    }
}
