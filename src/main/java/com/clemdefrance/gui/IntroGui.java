package com.clemdefrance.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class IntroGui extends GuiScreen {

    private static final int TOTAL_FRAMES = 1147;
    private static final int FRAME_DELAY = 2;

    private int tickCounter = 0;
    private int currentFrame = 0;

    private boolean checked = false;

    private static final Map<Integer, ResourceLocation> FRAMES = new HashMap<>();

    @Override
    public void initGui() {

        for (int i = 1; i <= TOTAL_FRAMES; i++) {
            ResourceLocation location = new ResourceLocation(
                    "footballmods",
                    "textures/gui/intro/frame" + i + ".png"
            );
            FRAMES.put(i, location);
        }
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        if (!checked) {
            for (int i = 1; i <= TOTAL_FRAMES; i++) {
                ResourceLocation loc = FRAMES.get(i);
                try {
                    mc.getResourceManager().getResource(loc);
                    System.out.println("✔ Found: " + loc);
                } catch (Exception e) {
                    System.out.println("❌ Missing: " + loc);
                }
            }
            checked = true;
        }

        // Animation
        tickCounter++;
        if (tickCounter >= FRAME_DELAY) {
            tickCounter = 0;
            currentFrame = (currentFrame + 1) % TOTAL_FRAMES;
        }

        if (currentFrame >= TOTAL_FRAMES - 1) {
            mc.displayGuiScreen(new net.minecraft.client.gui.GuiMainMenu());
            return;
        }

        mc.getTextureManager().bindTexture(FRAMES.get(currentFrame + 1));

        int x = (width - 256) / 2;
        int y = (height - 256) / 2;

        drawModalRectWithCustomSizedTexture(x, y, 0, 0, 256, 256, 256, 256);

        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
