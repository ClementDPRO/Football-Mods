package com.clemdefrance;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.opengl.Display;
import scala.collection.parallel.ParIterableLike;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
    public static final String MODID = "footballmods";
    public static final String NAME = "Football Mods";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("[Football] Pre-Init!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        System.out.println("[Football] Init!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("[Football] Post-Init!");
        Display.setTitle("Football mods - " + Minecraft.getMinecraft().player.getName().toString());
    }
}
