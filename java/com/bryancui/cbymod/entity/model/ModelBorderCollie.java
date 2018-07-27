package com.bryancui.cbymod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelBorderCollie - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBorderCollie extends ModelBase {
    public ModelRenderer wolfMane;
    public ModelRenderer wolfBody;
    public ModelRenderer wolfLeg4;
    public ModelRenderer wolfHeadMain3;
    public ModelRenderer wolfHeadMain1;
    public ModelRenderer wolfHeadMain2;
    public ModelRenderer wolfLeg1;
    public ModelRenderer wolfLeg2;
    public ModelRenderer wolfHeadMain0;
    public ModelRenderer wolfLeg3;
    public ModelRenderer wolfTail;

    public ModelBorderCollie() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.wolfBody = new ModelRenderer(this, 18, 14);
        this.wolfBody.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.wolfBody.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(wolfBody, 1.5707963705062866F, 0.0F, 0.0F);
        this.wolfMane = new ModelRenderer(this, 21, 0);
        this.wolfMane.setRotationPoint(-1.0F, 14.0F, -3.0F);
        this.wolfMane.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
        this.setRotateAngle(wolfMane, 1.5707963705062866F, 0.0F, 0.0F);
        this.wolfHeadMain3 = new ModelRenderer(this, 0, 10);
        this.wolfHeadMain3.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.wolfHeadMain3.addBox(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
        this.wolfLeg3 = new ModelRenderer(this, 0, 18);
        this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.wolfLeg3.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfLeg4 = new ModelRenderer(this, 0, 18);
        this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.wolfLeg4.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfHeadMain0 = new ModelRenderer(this, 0, 0);
        this.wolfHeadMain0.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.wolfHeadMain0.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.wolfLeg1 = new ModelRenderer(this, 0, 18);
        this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.wolfLeg1.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfLeg2 = new ModelRenderer(this, 0, 18);
        this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.wolfLeg2.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.wolfHeadMain2 = new ModelRenderer(this, 16, 14);
        this.wolfHeadMain2.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.wolfHeadMain2.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.wolfTail = new ModelRenderer(this, 9, 18);
        this.wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.wolfTail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(wolfTail, 1.3613568165555772F, 0.0F, 0.0F);
        this.wolfHeadMain1 = new ModelRenderer(this, 16, 14);
        this.wolfHeadMain1.setRotationPoint(-1.0F, 13.5F, -7.0F);
        this.wolfHeadMain1.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.wolfBody.render(f5);
        this.wolfMane.render(f5);
        this.wolfHeadMain3.render(f5);
        this.wolfLeg3.render(f5);
        this.wolfLeg4.render(f5);
        this.wolfHeadMain0.render(f5);
        this.wolfLeg1.render(f5);
        this.wolfLeg2.render(f5);
        this.wolfHeadMain2.render(f5);
        this.wolfTail.render(f5);
        this.wolfHeadMain1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, 
    		float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.wolfLeg1.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.wolfLeg2.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+(float)Math.PI)* 1F* limbSwingAmount;
    	this.wolfLeg3.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.wolfLeg4.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+(float)Math.PI)* 1F* limbSwingAmount;
    	
    	this.wolfTail.rotateAngleY= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	
    	
    }
    
}
