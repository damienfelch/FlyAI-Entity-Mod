package com.damien.example.entity.ai;

import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.monster.EntityZombie;
import com.damien.example.entity.monster.EntitySpiderZombie;

public class EntityAISpiderZombieAttack extends EntityAIAttackMelee
{
    private final EntitySpiderZombie spider_zombie;
    private int raiseArmTicks;

    public EntityAISpiderZombieAttack(EntitySpiderZombie zombieIn, double speedIn, boolean longMemoryIn)
    {
        super(zombieIn, speedIn, longMemoryIn);
        this.spider_zombie = zombieIn;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        super.resetTask();
        //this.zombie.setArmsRaised(false);
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
        super.updateTask();
//        ++this.raiseArmTicks;
//
//        if (this.raiseArmTicks >= 5 && this.attackTick < 10)
//        {
//            this.zombie.setArmsRaised(true);
//        }
//        else
//        {
//            this.zombie.setArmsRaised(false);
//        }
    }
}