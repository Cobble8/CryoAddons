package com.Cobble8.cryoaddons.entities.kitten;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelKitten extends ModelBase {
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer BackRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer BodyMain;
    public ModelRenderer BodyDeco1;
    public ModelRenderer BodyDeco2;
    public ModelRenderer BodyDeco3;
    public ModelRenderer BodyDeco4;
    public ModelRenderer BodyDeco5;
    public ModelRenderer Head;
    public ModelRenderer LeftEar;
    public ModelRenderer RightEar;
    public ModelRenderer Tail;

    public ModelKitten() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.FrontRightLeg = new ModelRenderer(this, 8, 0);
        this.FrontRightLeg.setRotationPoint(-3.0F, 21.0F, -4.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.Head = new ModelRenderer(this, 43, 8);
        this.Head.setRotationPoint(-2.5F, 15.0F, -5.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 5, 4, 3, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 24, 0);
        this.BackLeftLeg.setRotationPoint(1.0F, 21.0F, 1.0F);
        this.BackLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.BodyDeco1 = new ModelRenderer(this, 40, 0);
        this.BodyDeco1.setRotationPoint(-2.0F, 19.0F, 2.0F);
        this.BodyDeco1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.LeftEar = new ModelRenderer(this, 40, 3);
        this.LeftEar.setRotationPoint(1.5F, 14.0F, -4.0F);
        this.LeftEar.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.RightEar = new ModelRenderer(this, 46, 3);
        this.RightEar.setRotationPoint(-3.5F, 14.0F, -4.0F);
        this.RightEar.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.BodyDeco2 = new ModelRenderer(this, 46, 0);
        this.BodyDeco2.setRotationPoint(-3.0F, 19.0F, -4.0F);
        this.BodyDeco2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.BodyDeco5 = new ModelRenderer(this, 54, 2);
        this.BodyDeco5.setRotationPoint(-1.5F, 16.0F, -2.0F);
        this.BodyDeco5.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontLeftLeg.setRotationPoint(1.0F, 21.0F, -4.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.BodyDeco3 = new ModelRenderer(this, 0, 5);
        this.BodyDeco3.setRotationPoint(2.1F, 19.0F, -4.0F);
        this.BodyDeco3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 16, 0);
        this.BackRightLeg.setRotationPoint(-3.0F, 21.0F, 1.0F);
        this.BackRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.BodyMain = new ModelRenderer(this, 26, 0);
        this.BodyMain.setRotationPoint(-2.0F, 18.0F, -4.0F);
        this.BodyMain.addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
        this.BodyDeco4 = new ModelRenderer(this, 54, 0);
        this.BodyDeco4.setRotationPoint(-1.0F, 17.0F, -1.0F);
        this.BodyDeco4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Tail = new ModelRenderer(this, 8, 5);
        this.Tail.setRotationPoint(-1.0F, 19.0F, 3.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FrontRightLeg.render(f5);
        this.Head.render(f5);
        this.BackLeftLeg.render(f5);
        this.BodyDeco1.render(f5);
        this.LeftEar.render(f5);
        this.RightEar.render(f5);
        this.BodyDeco2.render(f5);
        this.BodyDeco5.render(f5);
        this.FrontLeftLeg.render(f5);
        this.BodyDeco3.render(f5);
        this.BackRightLeg.render(f5);
        this.BodyMain.render(f5);
        this.BodyDeco4.render(f5);
        this.Tail.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
    	model.rotateAngleX = x;
    	model.rotateAngleY = y;
    	model.rotateAngleZ = z;
    }
    

    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.BackLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6222f + (float)Math.PI) * 1.4f * limbSwingAmount;
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6222f + (float)Math.PI) * 1.4f * limbSwingAmount;
    	this.BackRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6222f) * 1.4f * limbSwingAmount;
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6222f) * 1.4f * limbSwingAmount;
    	this.Tail.rotateAngleX = MathHelper.cos(0.6222f) * -1.3f;
    	//this.Head.rotateAngleY = MathHelper.cos(0.6222f) * -1.3f;
    	//this.LeftEar.rotateAngleY = MathHelper.cos(0.6222f) * -1.3f;
    	//this.RightEar.rotateAngleY = MathHelper.cos(0.6222f) * -1.3f;
    }
}
