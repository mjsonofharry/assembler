package com.mjsonofharry.assembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class AssemblerGuiHandler implements IGuiHandler
{
    private static AssemblerGuiHandler assemblerGuiHandler = new AssemblerGuiHandler();

    public static AssemblerGuiHandler getInstance()
    {
        return assemblerGuiHandler;
    }

    @Override
    public Object getClientGuiElement(
        int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getServerGuiElement(
        int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}