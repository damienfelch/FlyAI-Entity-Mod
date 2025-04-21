package com.damien.example.init;

import com.damien.example.entity.monster.EntityFly;
import com.damien.example.entity.monster.EntitySpiderZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Mobs {
    public static final EntityMob fly = new EntityFly(null);
    public static final EntityMob spiderZombie = new EntitySpiderZombie(null);
}
