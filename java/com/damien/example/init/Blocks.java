package com.damien.example.init;

import com.damien.example.blocks.BlockExampleBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;

public class Blocks {
    public static final Block exampleBlock = new BlockExampleBlock(
            "example_block",
            Material.ROCK,
            CreativeTabs.BUILDING_BLOCKS,
            5F,
            15F,
            "pickaxe",
            1
    );
}
