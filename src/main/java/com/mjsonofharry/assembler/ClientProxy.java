package com.mjsonofharry.assembler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public abstract class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        super.preInit();
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation("com:mjsonofharry:assembler", "inventory");
        ModelLoader.setCustomModelResourceLocation(CommonProxy.assemblerItemBlock, 0, modelResourceLocation);
    }

    public void init()
    {
        super.init();
    }

    public void postInit()
    {
        super.postInit();
    }
}