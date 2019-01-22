package com.mjsonofharry.assembler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AssemblerContainer extends Container
{
    private AssemblerTileEntity mAssemblerTileEntity;

    // Inventory slot counts
    private final int PLAYER_HOTBAR_SLOTS = 9;
    private final int PLAYER_INVENTORY_COLUMNS = 9;
    private final int PLAYER_INVENTORY_ROWS = 3;
    private final int PLAYER_INVENTORY_SLOTS = PLAYER_HOTBAR_SLOTS + (PLAYER_INVENTORY_COLUMNS * PLAYER_INVENTORY_ROWS);
    private final int INPUT_COLUMNS = 3;
    private final int INPUT_ROWS = 3;
    private final int INPUT_SLOTS = INPUT_COLUMNS * INPUT_ROWS;
    private final int RECIPE_SLOTS = 1;
    private final int FUEL_SLOTS = 1;
    private final int OUTPUT_SLOTS = 1;
    private final int TOTAL_INVENTORY = INPUT_SLOTS + OUTPUT_SLOTS + RECIPE_SLOTS + FUEL_SLOTS;

    // Logical inventory offsets
    private final int PLAYER_HOTBAR_INDEX = 0;
    private final int PLAYER_INVENTORY_INDEX = PLAYER_HOTBAR_INDEX + PLAYER_HOTBAR_SLOTS;
    private final int INPUT_INDEX = PLAYER_INVENTORY_INDEX + PLAYER_INVENTORY_SLOTS;
    private final int RECIPE_INDEX = INPUT_INDEX + INPUT_SLOTS;
    private final int FUEL_INDEX = RECIPE_INDEX + RECIPE_SLOTS;
    private final int OUTPUT_INDEX = FUEL_INDEX + FUEL_SLOTS;

    // GUI positions in pixels (upper left corner of dark areas)
    private final int PLAYER_HOTBAR_POS_X = 8;
    private final int PLAYER_HOTBAR_POS_Y = 142;
    private final int PLAYER_INVENTORY_POS_X = 8;
    private final int PLAYER_INVENTORY_POS_Y = 84;
    private final int INPUT_POS_X = 52;
    private final int INPUT_POS_Y = 17;
    private final int RECIPE_POS_X = 16;
    private final int RECIPE_POS_Y = 23;
    private final int FUEL_POS_X = 16;
    private final int FUEL_POS_Y = 59;
    private final int OUTPUT_POS_X = 144;
    private final int OUTPUT_POS_Y = 31;
    private final int SLOT_GAP = 2;

    public AssemblerContainer(InventoryPlayer inventoryPlayer, AssemblerTileEntity assemblerTileEntity)
    {
        this.mAssemblerTileEntity = assemblerTileEntity;

        for (int i = 0; i < PLAYER_HOTBAR_SLOTS; i++)
        {
            final int index = PLAYER_HOTBAR_INDEX + i;
            final int xpos = PLAYER_HOTBAR_POS_X + (SLOT_GAP * i);
            final int ypos = PLAYER_HOTBAR_POS_Y;
            addSlotToContainer(new Slot(inventoryPlayer, index, xpos, ypos));
        }

        {
            int i = 0;
            for (int x = 0; x < PLAYER_INVENTORY_COLUMNS; x++)
            {
                for (int y = 0; y < PLAYER_INVENTORY_ROWS; y++)
                {
                    final int index = PLAYER_INVENTORY_INDEX + i;
                    final int xpos = PLAYER_INVENTORY_POS_X + (SLOT_GAP * x);
                    final int ypos = PLAYER_INVENTORY_POS_Y + (SLOT_GAP * y);
                    addSlotToContainer(new Slot(inventoryPlayer, index, xpos, ypos));
                    i++;
                }
                i++;
            }
        }

        {
            int i = 0;
            for (int x = 0; x < INPUT_COLUMNS; x++)
            {
                for (int y = 0; y < INPUT_ROWS; y++)
                {
                    final int index = INPUT_INDEX + i;
                    final int xpos = INPUT_POS_X + (SLOT_GAP * x);
                    final int ypos = INPUT_POS_Y + (SLOT_GAP * y);
                    addSlotToContainer(new Slot(inventoryPlayer, index, xpos, ypos));
                    i++;
                }
                i++;
            }
        }

        addSlotToContainer(new Slot(inventoryPlayer, RECIPE_INDEX, RECIPE_POS_X, RECIPE_POS_Y));
        addSlotToContainer(new Slot(inventoryPlayer, FUEL_INDEX, FUEL_POS_X, FUEL_POS_Y));
        addSlotToContainer(new Slot(inventoryPlayer, OUTPUT_INDEX, OUTPUT_POS_X, OUTPUT_POS_Y));
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.mAssemblerTileEntity.isUsableByPlayer(playerIn);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        return null;
    }

    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void updateProgressBar(int id, int data)
    {
        
    }
}