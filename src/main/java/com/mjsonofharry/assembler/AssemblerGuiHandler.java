package com.mjsonofharry.assembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class AssemblerGuiHandler implements IGuiHandler
{
    private static final int GUUID = 0;

    private static AssemblerGuiHandler assemblerGuiHandler = new AssemblerGuiHandler();

    public static AssemblerGuiHandler getInstance()
    {
        return assemblerGuiHandler;
    }

    public static int getGuiID()
    {
        return GUUID;
    }

    @Override
    public Object getClientGuiElement(
        int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        AssemblerTileEntity assemblerTileEntity = (AssemblerTileEntity)tileEntity;
        return new AssemblerContainer(player.inventory, assemblerTileEntity);
    }

    @Override
    public Object getServerGuiElement(
        int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        AssemblerTileEntity assemblerTileEntity = (AssemblerTileEntity)tileEntity;
        return new AssemblerContainer(player.inventory, assemblerTileEntity);
    }
}