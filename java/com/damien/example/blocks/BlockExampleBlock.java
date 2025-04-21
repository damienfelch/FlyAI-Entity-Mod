package com.damien.example.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockExampleBlock extends BlockBase {
    public BlockExampleBlock(String name,
                             Material mat,
                             CreativeTabs tab,
                             float hardness,
                             float resistance,
                             String tool,
                             int harvest)
    {
        super(name, mat, tab, hardness, resistance, tool, harvest);
    }
}
