package com.mjsonofharry.assembler;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

import java.awt.Container;

import org.apache.logging.log4j.Logger;

@Mod(modid = Assembler.MODID, name = Assembler.NAME, version = Assembler.VERSION)
public class Assembler
{
    public static final String MODID = "assembler";
    public static final String NAME = "Assembler";
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}


class AssemblerBlock extends BlockContainer
{
    AssemblerBlock() {
        super(Material.ROCK);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new AssemblerTileEntity();
    }
}

class AssemblerContainer extends Container
{

}

class AssemblerTileEntity extends TileEntity implements IInventory, ITickable
{
    @Override
    public void clear() {
        
    }

    @Override
    public void closeInventory(EntityPlayer player) {
        
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return null;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return false;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void openInventory(EntityPlayer player) {
        
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    @Override
    public void setField(int id, int value) {
        
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        
    }

    @Override
    public void tick() {
        
    }
}
