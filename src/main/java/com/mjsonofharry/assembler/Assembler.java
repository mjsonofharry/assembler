package com.mjsonofharry.assembler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Assembler.MODID, name = Assembler.NAME, version = Assembler.VERSION)
public class Assembler
{
    public static final String MODID = "assembler";
    public static final String NAME = "Assembler";
    public static final String VERSION = "0.1.0";

    @Mod.Instance(Assembler.MODID)
    public static Assembler instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(Assembler.instance, new AssemblerGuiHandler());
    }
}
