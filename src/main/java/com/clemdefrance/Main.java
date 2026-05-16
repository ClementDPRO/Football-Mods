package com.clemdefrance;

import com.clemdefrance.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

    @SidedProxy(clientSide = "com.clemdefrance.proxy.ClientProxy", serverSide = "com.clemdefrance.proxy.CommonProxy")
    public static CommonProxy proxy;

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
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("[Football] Post-Init!");
    }
}
