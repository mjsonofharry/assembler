package com.mjsonofharry.assembler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Assembler.MODID, name = Assembler.NAME, version = Assembler.VERSION)
public class Assembler
{
    public static final String MODID = "assembler";
    public static final String NAME = "Assembler";
    public static final String VERSION = "0.1.0";

    @Mod.Instance(Assembler.MODID)
    public static Assembler instance;

    @SidedProxy(clientSide="mjsonofharry.assembler.ClientProxy", serverSide="mjsonofharry.assembler.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}
