package com.damien.example.renderers;

import com.damien.example.entity.monster.EntitySpiderZombie;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpiderZombie extends RenderLiving<EntitySpiderZombie> {
    protected ResourceLocation spiderZombieTexture;

    public RenderSpiderZombie(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelSpider(), 1F);
        setEntityTexture();
    }

    protected void setEntityTexture()
    {
        spiderZombieTexture = new ResourceLocation("example:textures/entity/zombie_spider.png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(EntitySpiderZombie par1Entity)
    {
        return spiderZombieTexture;
    }
}
