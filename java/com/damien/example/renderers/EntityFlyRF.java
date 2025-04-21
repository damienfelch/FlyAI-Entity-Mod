package com.damien.example.renderers;

import com.damien.example.entity.monster.EntityFly;
import com.damien.example.entity.monster.EntitySpiderZombie;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityFlyRF implements IRenderFactory<EntityFly> {
    @Override
    public RenderFly createRenderFor(RenderManager manager){
        return new RenderFly(manager);
    }
}
