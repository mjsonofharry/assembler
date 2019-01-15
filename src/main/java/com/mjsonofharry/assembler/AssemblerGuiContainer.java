package com.mjsonofharry.assembler;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class AssemblerGuiContainer extends GuiContainer
{
    private static AssemblerTileEntity mAssemblerTileEntity;

    public AssemblerGuiContainer(InventoryPlayer inventoryPlayer, AssemblerTileEntity assemblerTileEntity)
    {
        super(new AssemblerContainer(inventoryPlayer, assemblerTileEntity));
        this.mAssemblerTileEntity = assemblerTileEntity;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }
}