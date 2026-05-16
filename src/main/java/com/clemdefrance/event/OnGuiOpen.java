package com.clemdefrance.event;

import com.clemdefrance.gui.IntroGui;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnGuiOpen {

    private static boolean played = false;

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {

        if (event.getGui() == null)
            return;

        if (!played && event.getGui() instanceof GuiMainMenu) {

            event.setCanceled(true);

            net.minecraft.client.Minecraft.getMinecraft().displayGuiScreen(new IntroGui());

            System.out.println("Play video:");
            System.out.println("Played:" + played);

            played = true;

            System.out.println("Played:" + played);
        }
    }

}
