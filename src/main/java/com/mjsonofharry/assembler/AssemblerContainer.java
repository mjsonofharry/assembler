package com.mjsonofharry.assembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AssemblerContainer extends Container
{
    private AssemblerTileEntity mAssemblerTileEntity;

    public AssemblerContainer(InventoryPlayer inventoryPlayer, AssemblerTileEntity assemblerTileEntity)
    {
        this.mAssemblerTileEntity = assemblerTileEntity;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.mAssemblerTileEntity.isUsableByPlayer(playerIn);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return null;
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void updateProgressBar(int id, int data) {
        
    }
}