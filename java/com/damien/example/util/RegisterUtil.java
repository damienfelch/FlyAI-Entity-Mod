package com.damien.example.util;

import com.damien.example.Example;
import com.damien.example.Ref;
import com.damien.example.entity.monster.EntityFly;
import com.damien.example.entity.monster.EntityCybug;
import com.damien.example.init.Blocks;
import com.damien.example.init.Items;
import com.damien.example.init.Mobs;
import com.damien.example.renderers.EntityFlyRF;
import com.damien.example.renderers.EntityCybugRF;
import com.damien.example.renderers.EntitySpiderZombieRF;
import com.damien.example.renderers.RenderSpiderZombie;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.io.IOException;

public class RegisterUtil {
    public static void RegisterAll(FMLPreInitializationEvent event)
    {
        RegisterItems(event, Items.exampleItem);
        RegisterBlocks(event, Blocks.exampleBlock);
        //RegisterMobs(event, Mobs.spiderZombie);
        RegisterMobs(event, Mobs.cybug);
    }

    private static void RegisterBlocks (FMLPreInitializationEvent event, Block...blocks)
    {
        Example.LOGGER.info("Registering blocks: ");
        for (Block block:blocks)
        {
            Example.LOGGER.info("\tRegistering " + block.getUnlocalizedName().substring(5));
            final ItemBlock itemBlock = new ItemBlock(block);
            if (event.getSide() == Side.CLIENT)
            {
                GameRegistry.register(block);
                GameRegistry.register(itemBlock, block.getRegistryName());
                Example.LOGGER.info("\t\tRegistered!");
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                        0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
                Example.LOGGER.info("\t\tModel Registered!");
            }
        }
    }

    private static void RegisterItems (FMLPreInitializationEvent event, Item...items)
    {
        Example.LOGGER.info("Registering items: ");
        for (Item item:items)
        {
            Example.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
            if (event.getSide() == Side.CLIENT)
            {
                GameRegistry.register(item);
                Example.LOGGER.info("\t\tRegistered!");
                ModelLoader.setCustomModelResourceLocation(item,
                        0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
                Example.LOGGER.info("\t\tModel Registered!");
            }
        }
    }

    private static void RegisterMobs (FMLPreInitializationEvent event, EntityMob...entityMobs)
    {
        Example.LOGGER.info("Registering mobs: ");
        int mobId = 0;
        for (EntityMob entityMob:entityMobs)
        {
            Example.LOGGER.info("\tRegistering " + entityMob.getName().substring(5));
            if (event.getSide() == Side.CLIENT)
            {
                ResourceLocation registryName = new ResourceLocation("example: " + entityMob.getName());
                EntityRegistry.registerModEntity(registryName,
                        entityMob.getClass(),
                        entityMob.getName(),
                        mobId,
                        Ref.MODID,
                        80,
                        3,
                        false,
                        0x0000FF,
                        0x808080);
                Example.LOGGER.info("\t\tRegistered!");
                RenderingRegistry.registerEntityRenderingHandler(EntityCybug.class, new EntityCybugRF());
            }
            mobId++;
        }
    }
}
