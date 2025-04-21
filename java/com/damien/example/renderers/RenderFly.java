package com.damien.example.renderers;

import com.damien.example.entity.monster.EntityFly;
import com.damien.example.entity.monster.EntitySpiderZombie;
import net.minecraft.client.model.ModelBase;
import com.damien.example.entity.models.ModelFly;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFly extends RenderLiving<EntityFly> {
    protected ResourceLocation flyTexture;

    public RenderFly(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelFly(), 1F);
        setEntityTexture();
    }

    protected void setEntityTexture()
    {
        flyTexture = new ResourceLocation("example:textures/entity/fly.png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(EntityFly par1Entity)
    {
        return flyTexture;
    }
}
