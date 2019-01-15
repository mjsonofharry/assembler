package com.mjsonofharry.assembler;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public abstract class CommonProxy
{
    public static Block assemblerBlock;
    public static ItemBlock assemblerItemBlock;

    public void preInit()
    {
        assemblerBlock = new AssemblerBlockContainer().setUnlocalizedName("assembler");
        assemblerBlock.setRegistryName("assembler");
        ForgeRegistries.BLOCKS.register(assemblerBlock);

        assemblerItemBlock = new ItemBlock(assemblerBlock);
        assemblerItemBlock.setRegistryName(assemblerBlock.getRegistryName());
        ForgeRegistries.ITEMS.register(assemblerItemBlock);

        GameRegistry.registerTileEntity(AssemblerTileEntity.class, "assembler");
        NetworkRegistry.INSTANCE.registerGuiHandler(Assembler.instance, AssemblerGuiHandler.getInstance());
    }

    public void init() {}

    public void postInit() {}
}