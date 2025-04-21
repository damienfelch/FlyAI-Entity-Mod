package com.damien.example.renderers;

import com.damien.example.entity.monster.EntitySpiderZombie;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntitySpiderZombieRF implements IRenderFactory<EntitySpiderZombie> {
    @Override
    public RenderSpiderZombie createRenderFor(RenderManager manager){
        return new RenderSpiderZombie(manager);
    }
}
