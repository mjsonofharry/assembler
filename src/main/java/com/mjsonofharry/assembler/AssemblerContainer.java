package com.mjsonofharry.assembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class AssemblerContainer extends Container
{
    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return false;
    }
}