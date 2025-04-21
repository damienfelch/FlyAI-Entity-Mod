package com.damien.example.handlers;

import com.damien.example.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsHandler {
    public static final CreativeTabs tabExample = new CreativeTabs("exampleTab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.exampleItem);
        }
    };
}
