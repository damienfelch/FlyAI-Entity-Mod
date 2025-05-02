// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CyBug extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer legs;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer middle_left_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer middle_right_leg;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer wings;
	private final ModelRenderer front_left_wing;
	private final ModelRenderer front_right_wing;
	private final ModelRenderer back_right_wing;
	private final ModelRenderer back_left_wing;

	public CyBug() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 16.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -6.0F, -2.0F);
		bone.addChild(body);
		setRotationAngle(body, -0.1309F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 40, 46, -8.0F, -8.0F, -14.0F, 14, 12, 4, 0.01F, false));
		body.cubeList.add(new ModelBox(body, 44, 24, -8.0F, 2.0F, -12.0F, 14, 4, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 20, -7.0F, -2.0F, -6.0F, 12, 8, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 64, -6.0F, 2.0F, 4.0F, 10, 4, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -10.0F, -12.0F, 14, 12, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 46, -7.0F, -8.0F, -4.0F, 12, 10, 8, 0.01F, false));
		body.cubeList.add(new ModelBox(body, 40, 62, -6.0F, -4.0F, 4.0F, 10, 6, 8, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(legs);
		

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-4.0F, -2.0F, 0.0F);
		legs.addChild(front_left_leg);
		front_left_leg.cubeList.add(new ModelBox(front_left_leg, 58, 82, 10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));
		front_left_leg.cubeList.add(new ModelBox(front_left_leg, 52, 36, 16.0F, 1.0F, -11.0F, 8, 3, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(24.0F, 6.0F, -10.0F);
		front_left_leg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.4835F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 82, -2.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(14.9696F, -2.3473F, -10.0F);
		front_left_leg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.3963F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 60, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(-2.0F, -2.0F, 0.0F);
		legs.addChild(front_right_leg);
		front_right_leg.cubeList.add(new ModelBox(front_right_leg, 22, 86, -10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));
		front_right_leg.cubeList.add(new ModelBox(front_right_leg, 74, 36, -20.0F, 1.0F, -11.0F, 8, 3, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-20.0F, 6.0F, -10.0F);
		front_right_leg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.4835F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 86, -4.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-10.9696F, -2.3473F, -10.0F);
		front_right_leg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.3963F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 76, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		middle_left_leg = new ModelRenderer(this);
		middle_left_leg.setRotationPoint(-5.0F, -1.0F, 6.0F);
		legs.addChild(middle_left_leg);
		middle_left_leg.cubeList.add(new ModelBox(middle_left_leg, 72, 86, 10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(24.0F, 6.0F, -10.0F);
		middle_left_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5272F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 86, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(18.0F, 1.0F, -10.0F);
		middle_left_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 76, -2.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(14.9696F, -2.3473F, -10.0F);
		middle_left_leg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.3963F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 76, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		middle_right_leg = new ModelRenderer(this);
		middle_right_leg.setRotationPoint(-1.0F, -1.0F, 6.0F);
		legs.addChild(middle_right_leg);
		middle_right_leg.cubeList.add(new ModelBox(middle_right_leg, 0, 88, -10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-20.0F, 7.0F, -10.0F);
		middle_right_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.5272F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 88, 24, -2.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-14.0F, 1.0F, -10.0F);
		middle_right_leg.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 42, -6.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-10.9696F, -2.3473F, -10.0F);
		middle_right_leg.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.3963F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 66, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-6.0F, 0.0F, 13.0F);
		legs.addChild(back_left_leg);
		back_left_leg.cubeList.add(new ModelBox(back_left_leg, 88, 28, 10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(24.0F, 5.0F, -10.0F);
		back_left_leg.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.5272F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 88, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(18.0F, 1.0F, -10.0F);
		back_left_leg.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.2618F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 48, -2.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(14.9696F, -2.3473F, -10.0F);
		back_left_leg.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 1.3963F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 76, -2.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(0.0F, 0.0F, 13.0F);
		legs.addChild(back_right_leg);
		back_right_leg.cubeList.add(new ModelBox(back_right_leg, 88, 76, -10.0F, -5.0F, -11.0F, 4, 3, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-20.0F, 6.0F, -10.0F);
		back_right_leg.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.5272F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 82, -2.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-14.0F, 1.0F, -10.0F);
		back_right_leg.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 54, -6.0F, 0.0F, -1.0F, 8, 3, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-10.9696F, -2.3473F, -10.0F);
		back_right_leg.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.3963F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 82, -6.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(wings);
		

		front_left_wing = new ModelRenderer(this);
		front_left_wing.setRotationPoint(6.0F, -18.0F, -7.0F);
		wings.addChild(front_left_wing);
		setRotationAngle(front_left_wing, -0.1265F, -0.0338F, -0.2597F);
		front_left_wing.cubeList.add(new ModelBox(front_left_wing, 52, 42, -4.0F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));
		front_left_wing.cubeList.add(new ModelBox(front_left_wing, 0, 38, 3.0F, -0.8695F, -2.0086F, 20, 2, 6, 0.0F, false));

		front_right_wing = new ModelRenderer(this);
		front_right_wing.setRotationPoint(-6.0F, -18.0F, -7.0F);
		wings.addChild(front_right_wing);
		setRotationAngle(front_right_wing, -0.1265F, 0.0338F, 0.2597F);
		front_right_wing.cubeList.add(new ModelBox(front_right_wing, 76, 72, -3.0F, -1.0F, 0.0F, 7, 2, 2, 0.0F, false));
		front_right_wing.cubeList.add(new ModelBox(front_right_wing, 44, 0, -23.0F, -0.8695F, -2.0086F, 20, 2, 6, 0.0F, false));

		back_right_wing = new ModelRenderer(this);
		back_right_wing.setRotationPoint(-6.0F, -15.0F, 1.0F);
		wings.addChild(back_right_wing);
		setRotationAngle(back_right_wing, -0.1265F, -0.0338F, -0.2597F);
		back_right_wing.cubeList.add(new ModelBox(back_right_wing, 22, 82, -3.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));
		back_right_wing.cubeList.add(new ModelBox(back_right_wing, 44, 8, -23.0F, 0.1305F, -2.0086F, 20, 2, 6, 0.0F, false));

		back_left_wing = new ModelRenderer(this);
		back_left_wing.setRotationPoint(6.0F, -15.0F, 1.0F);
		wings.addChild(back_left_wing);
		setRotationAngle(back_left_wing, -0.1265F, 0.0338F, 0.2597F);
		back_left_wing.cubeList.add(new ModelBox(back_left_wing, 40, 82, -4.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));
		back_left_wing.cubeList.add(new ModelBox(back_left_wing, 44, 16, 3.0F, 0.1305F, -2.0086F, 20, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}