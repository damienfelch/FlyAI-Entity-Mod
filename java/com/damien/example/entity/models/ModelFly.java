// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

package com.damien.example.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFly extends ModelBase {
	private final ModelRenderer main;
	private final ModelRenderer flybutt;
	private final ModelRenderer flybutt_r1;
	private final ModelRenderer head;
	private final ModelRenderer wings;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer legs;
	private final ModelRenderer leg1;
	private final ModelRenderer upperleg1_r1;
	private final ModelRenderer lowerleg1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer lowerleg1_r1;
	private final ModelRenderer leg2;
	private final ModelRenderer upperleg2_r1;
	private final ModelRenderer lowerleg2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer lowerleg2_r1;
	private final ModelRenderer leg3;
	private final ModelRenderer upperleg3_r1;
	private final ModelRenderer lowerleg3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer lowerleg3_r1;
	private final ModelRenderer leg4;
	private final ModelRenderer upperleg4_r1;
	private final ModelRenderer lowerleg4;
	private final ModelRenderer cube_r6;
	private final ModelRenderer lowerleg4_r1;
	private final ModelRenderer leg5;
	private final ModelRenderer upperleg5_r1;
	private final ModelRenderer lowerleg5;
	private final ModelRenderer cube_r7;
	private final ModelRenderer lowerleg5_r1;
	private final ModelRenderer leg6;
	private final ModelRenderer upperleg6_r1;
	private final ModelRenderer lowerleg6;
	private final ModelRenderer cube_r8;
	private final ModelRenderer lowerleg6_r1;

	public ModelFly() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 17.0F, 1.0F);
		setRotationAngle(main, 0.0F, 0.0F, 0.0262F);
		main.cubeList.add(new ModelBox(main, 36, 28, -8.0F, -2.0F, -4.0F, 8, 4, 8, 0.05F, false));

		flybutt = new ModelRenderer(this);
		flybutt.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(flybutt);
		

		flybutt_r1 = new ModelRenderer(this);
		flybutt_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
		flybutt.addChild(flybutt_r1);
		setRotationAngle(flybutt_r1, -0.1745F, 0.0F, 0.0F);
		flybutt_r1.cubeList.add(new ModelBox(flybutt_r1, 0, 28, -4.0F, -2.0F, 0.0F, 8, 4, 10, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-4.0F, 16.0F, -2.0F);
		setRotationAngle(head, 0.0F, 0.0F, 0.0262F);
		head.cubeList.add(new ModelBox(head, 40, 7, -3.0F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 40, 0, -2.0F, -1.0F, -3.0F, 4, 2, 2, 1.0F, false));
		head.cubeList.add(new ModelBox(head, 40, 4, 1.0F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(-4.0F, 14.0F, 2.0F);
		setRotationAngle(wings, 0.0F, 0.0F, 0.0262F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		wings.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, -0.2182F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -7.0F, 1.0F, 1.0F, 7, 1, 13, 0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, -1.0F);
		wings.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.1745F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, 1.0F, 1.0F, 7, 1, 13, 0.11F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 27.0F, 0.0F);
		setRotationAngle(legs, 0.0F, 0.0F, 0.0262F);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, -9.0F, -1.0F);
		legs.addChild(leg1);
		setRotationAngle(leg1, 0.0F, 0.0F, 0.0F);
		

		upperleg1_r1 = new ModelRenderer(this);
		upperleg1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(upperleg1_r1);
		setRotationAngle(upperleg1_r1, 0.0F, 0.0F, -0.1745F);
		upperleg1_r1.cubeList.add(new ModelBox(upperleg1_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg1 = new ModelRenderer(this);
		lowerleg1.setRotationPoint(3.0F, -1.0F, 0.0F);
		leg1.addChild(lowerleg1);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, 4.0F, 0.0F);
		lowerleg1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.6109F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 33, 0.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg1_r1 = new ModelRenderer(this);
		lowerleg1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg1.addChild(lowerleg1_r1);
		setRotationAngle(lowerleg1_r1, 0.0F, 0.0F, 1.0472F);
		lowerleg1_r1.cubeList.add(new ModelBox(lowerleg1_r1, 49, 34, 0.0F, -1.0F, -1.0F, 6, 1, 1, -0.2F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, -9.0F, 1.0F);
		legs.addChild(leg2);
		

		upperleg2_r1 = new ModelRenderer(this);
		upperleg2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(upperleg2_r1);
		setRotationAngle(upperleg2_r1, 0.0F, 0.0F, -0.1745F);
		upperleg2_r1.cubeList.add(new ModelBox(upperleg2_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg2 = new ModelRenderer(this);
		lowerleg2.setRotationPoint(3.0F, -1.0F, 0.0F);
		leg2.addChild(lowerleg2);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.0F, 4.0F, 0.0F);
		lowerleg2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6109F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 33, 0.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg2_r1 = new ModelRenderer(this);
		lowerleg2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg2.addChild(lowerleg2_r1);
		setRotationAngle(lowerleg2_r1, 0.0F, 0.0F, 1.0472F);
		lowerleg2_r1.cubeList.add(new ModelBox(lowerleg2_r1, 49, 34, 0.0F, -1.0F, -1.0F, 6, 1, 1, -0.2F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, -9.0F, 3.0F);
		legs.addChild(leg3);
		

		upperleg3_r1 = new ModelRenderer(this);
		upperleg3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(upperleg3_r1);
		setRotationAngle(upperleg3_r1, 0.0F, 0.0F, -0.1745F);
		upperleg3_r1.cubeList.add(new ModelBox(upperleg3_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg3 = new ModelRenderer(this);
		lowerleg3.setRotationPoint(3.0F, -1.0F, 0.0F);
		leg3.addChild(lowerleg3);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.0F, 4.0F, 0.0F);
		lowerleg3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.6109F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 33, 0.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg3_r1 = new ModelRenderer(this);
		lowerleg3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg3.addChild(lowerleg3_r1);
		setRotationAngle(lowerleg3_r1, 0.0F, 0.0F, 1.0472F);
		lowerleg3_r1.cubeList.add(new ModelBox(lowerleg3_r1, 49, 34, 0.0F, -1.0F, -1.0F, 6, 1, 1, -0.2F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-8.0F, -9.0F, -1.0F);
		legs.addChild(leg4);
		

		upperleg4_r1 = new ModelRenderer(this);
		upperleg4_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		leg4.addChild(upperleg4_r1);
		setRotationAngle(upperleg4_r1, -3.1416F, 0.0F, -2.9671F);
		upperleg4_r1.cubeList.add(new ModelBox(upperleg4_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg4 = new ModelRenderer(this);
		lowerleg4.setRotationPoint(-3.0F, -1.0F, 0.0F);
		leg4.addChild(lowerleg4);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, 4.0F, 0.0F);
		lowerleg4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 2.5307F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 33, 1.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg4_r1 = new ModelRenderer(this);
		lowerleg4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg4.addChild(lowerleg4_r1);
		setRotationAngle(lowerleg4_r1, 0.0F, 0.0F, 1.9199F);
		lowerleg4_r1.cubeList.add(new ModelBox(lowerleg4_r1, 49, 34, -0.5977F, 0.2817F, -1.0F, 6, 1, 1, -0.2F, false));

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(-8.0F, -9.0F, 1.0F);
		legs.addChild(leg5);
		

		upperleg5_r1 = new ModelRenderer(this);
		upperleg5_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		leg5.addChild(upperleg5_r1);
		setRotationAngle(upperleg5_r1, -3.1416F, 0.0F, -2.9671F);
		upperleg5_r1.cubeList.add(new ModelBox(upperleg5_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg5 = new ModelRenderer(this);
		lowerleg5.setRotationPoint(-3.0F, -1.0F, 0.0F);
		leg5.addChild(lowerleg5);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, 4.0F, 0.0F);
		lowerleg5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 2.5307F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 33, 1.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg5_r1 = new ModelRenderer(this);
		lowerleg5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg5.addChild(lowerleg5_r1);
		setRotationAngle(lowerleg5_r1, 0.0F, 0.0F, 1.9199F);
		lowerleg5_r1.cubeList.add(new ModelBox(lowerleg5_r1, 49, 34, -0.5977F, 0.2817F, -1.0F, 6, 1, 1, -0.2F, false));

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-8.0F, -9.0F, 3.0F);
		legs.addChild(leg6);
		

		upperleg6_r1 = new ModelRenderer(this);
		upperleg6_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
		leg6.addChild(upperleg6_r1);
		setRotationAngle(upperleg6_r1, -3.1416F, 0.0F, -2.9671F);
		upperleg6_r1.cubeList.add(new ModelBox(upperleg6_r1, 49, 34, 0.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		lowerleg6 = new ModelRenderer(this);
		lowerleg6.setRotationPoint(-3.0F, -1.0F, 0.0F);
		leg6.addChild(lowerleg6);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.0F, 4.0F, 0.0F);
		lowerleg6.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 2.5307F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 33, 1.0F, 0.0F, -1.0F, 4, 1, 1, -0.25F, false));

		lowerleg6_r1 = new ModelRenderer(this);
		lowerleg6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lowerleg6.addChild(lowerleg6_r1);
		setRotationAngle(lowerleg6_r1, 0.0F, 0.0F, 1.9199F);
		lowerleg6_r1.cubeList.add(new ModelBox(lowerleg6_r1, 49, 34, -0.5977F, 0.2817F, -1.0F, 6, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		main.render(f5);
		head.render(f5);
		wings.render(f5);
		legs.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}