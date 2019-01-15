package com.mjsonofharry.assembler;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

class AssemblerBlockContainer extends BlockContainer
{
    AssemblerBlockContainer()
    {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return new AssemblerTileEntity();
    }
    
    @Override
    public boolean onBlockActivated(
        World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
        EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        playerIn.openGui(Assembler.instance, AssemblerGuiHandler.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
    
    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)worldIn.getTileEntity(pos));
        super.breakBlock(worldIn, pos, state);
    }
}