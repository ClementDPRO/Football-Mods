package com.clemdefrance.proxy;

import com.clemdefrance.event.OnClientTick;
import com.clemdefrance.event.OnGuiOpen;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends  CommonProxy {
    @Override
    public void RegisterRenderers() {
    }

    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new OnClientTick());
        MinecraftForge.EVENT_BUS.register(new OnGuiOpen());
    }
}
