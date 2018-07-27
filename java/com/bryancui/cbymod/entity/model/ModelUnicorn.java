package com.bryancui.cbymod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelUnicorn - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelUnicorn extends ModelBase {
    public ModelRenderer tailBase;
    public ModelRenderer frontLeftHoof;
    public ModelRenderer tailMiddle;
    public ModelRenderer backRightShin;
    public ModelRenderer body;
    public ModelRenderer shape44;
    public ModelRenderer head;
    public ModelRenderer frontRightLeg;
    public ModelRenderer horseLeftEar;
    public ModelRenderer backLeftShin;
    public ModelRenderer horseRightEar_1;
    public ModelRenderer backLeftLeg;
    public ModelRenderer frontRightHoof;
    public ModelRenderer backLeftHoof;
    public ModelRenderer shape44_1;
    public ModelRenderer neck;
    public ModelRenderer shape44_2;
    public ModelRenderer backRightLeg;
    public ModelRenderer backRightHoof;
    public ModelRenderer frontLeftLeg;
    public ModelRenderer mane;
    public ModelRenderer tailTip;
    public ModelRenderer frontRightShin;
    public ModelRenderer frontLeftShin;
    public ModelRenderer headChild;
    public ModelRenderer headChild_1;

    public ModelUnicorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape44_1 = new ModelRenderer(this, 0, 0);
        this.shape44_1.setRotationPoint(-0.5F, -4.300000190734863F, -20.100000381469727F);
        this.shape44_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape44_1, 0.5309291481971741F, 0.0F, 0.0F);
        this.headChild_1 = new ModelRenderer(this, 24, 18);
        this.headChild_1.setRotationPoint(0.0F, 0.019999999552965164F, 0.019999999552965164F);
        this.headChild_1.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.shape44 = new ModelRenderer(this, 0, 0);
        this.shape44.setRotationPoint(-0.5F, -3.299999952316284F, -19.5F);
        this.shape44.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape44, 0.5309291481971741F, 0.0F, 0.0F);
        this.frontRightShin = new ModelRenderer(this, 60, 41);
        this.frontRightShin.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightShin.addBox(-1.100000023841858F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.frontLeftHoof = new ModelRenderer(this, 44, 51);
        this.frontLeftHoof.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftHoof.addBox(-2.4000000953674316F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 4.76837158203125E-7F);
        this.tailBase = new ModelRenderer(this, 44, 0);
        this.tailBase.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailBase.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailBase, -1.3089969158172607F, 0.0F, 0.0F);
        this.tailTip = new ModelRenderer(this, 24, 3);
        this.tailTip.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailTip.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailTip, -1.570796251296997F, 0.0F, 0.0F);
        this.horseLeftEar = new ModelRenderer(this, 0, 0);
        this.horseLeftEar.setRotationPoint(1.399999976158142F, -8.399999618530273F, -13.899999618530273F);
        this.horseLeftEar.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(horseLeftEar, 0.8152433037757874F, 0.0F, 0.5007349848747253F);
        this.mane = new ModelRenderer(this, 58, 0);
        this.mane.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.mane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(mane, 0.5235987901687622F, 0.0F, 0.0F);
        this.headChild = new ModelRenderer(this, 24, 27);
        this.headChild.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headChild.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.backRightHoof = new ModelRenderer(this, 96, 51);
        this.backRightHoof.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightHoof.addBox(-1.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 4.76837158203125E-7F);
        this.backLeftLeg = new ModelRenderer(this, 78, 29);
        this.backLeftLeg.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.backLeftLeg.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.backLeftHoof = new ModelRenderer(this, 78, 51);
        this.backLeftHoof.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftHoof.addBox(-2.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 4.76837158203125E-7F);
        this.frontLeftShin = new ModelRenderer(this, 44, 41);
        this.frontLeftShin.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftShin.addBox(-1.899999976158142F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 34);
        this.body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.backRightShin = new ModelRenderer(this, 96, 43);
        this.backRightShin.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightShin.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.horseRightEar_1 = new ModelRenderer(this, 0, 0);
        this.horseRightEar_1.setRotationPoint(-3.299999952316284F, -7.300000190734863F, -13.800000190734863F);
        this.horseRightEar_1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(horseRightEar_1, 0.8152433037757874F, 0.0F, -0.5007349848747253F);
        this.frontRightHoof = new ModelRenderer(this, 60, 51);
        this.frontRightHoof.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightHoof.addBox(-1.600000023841858F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 4.76837158203125E-7F);
        this.shape44_2 = new ModelRenderer(this, 0, 0);
        this.shape44_2.setRotationPoint(-0.5F, -5.199999809265137F, -20.700000762939453F);
        this.shape44_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape44_2, 0.5309291481971741F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.neck.addBox(-2.049999952316284F, -9.800000190734863F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.backRightLeg = new ModelRenderer(this, 96, 29);
        this.backRightLeg.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.backRightLeg.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.tailMiddle = new ModelRenderer(this, 38, 7);
        this.tailMiddle.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailMiddle.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailMiddle, -1.3089969158172607F, 0.0F, 0.0F);
        this.backLeftShin = new ModelRenderer(this, 78, 43);
        this.backLeftShin.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftShin.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.frontLeftLeg = new ModelRenderer(this, 44, 29);
        this.frontLeftLeg.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.frontLeftLeg.addBox(-1.899999976158142F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.frontRightLeg = new ModelRenderer(this, 60, 29);
        this.frontRightLeg.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frontRightLeg.addBox(-1.100000023841858F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.head.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(head, 0.5235987901687622F, 0.0F, 0.0F);
        this.head.addChild(this.headChild_1);
        this.head.addChild(this.headChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape44_1.render(f5);
        this.shape44.render(f5);
        this.frontRightShin.render(f5);
        this.frontLeftHoof.render(f5);
        this.tailBase.render(f5);
        this.tailTip.render(f5);
        this.horseLeftEar.render(f5);
        this.mane.render(f5);
        this.backRightHoof.render(f5);
        this.backLeftLeg.render(f5);
        this.backLeftHoof.render(f5);
        this.frontLeftShin.render(f5);
        this.body.render(f5);
        this.backRightShin.render(f5);
        this.horseRightEar_1.render(f5);
        this.frontRightHoof.render(f5);
        this.shape44_2.render(f5);
        this.neck.render(f5);
        this.backRightLeg.render(f5);
        this.tailMiddle.render(f5);
        this.backLeftShin.render(f5);
        this.frontLeftLeg.render(f5);
        this.frontRightLeg.render(f5);
        this.head.render(f5);
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
    	this.frontLeftLeg.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.frontRightShin.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.backLeftLeg.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.backRightShin.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	
    	this.frontRightLeg.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	this.frontLeftShin.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	this.backRightLeg.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	this.backLeftShin.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	
    	this.frontLeftHoof.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.backLeftHoof.rotateAngleX= MathHelper.cos(limbSwing + 0.1F)* 1F* limbSwingAmount;
    	this.frontRightHoof.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	this.backRightHoof.rotateAngleX= MathHelper.cos(limbSwing + 0.1F+ (float)Math.PI)* 1F* limbSwingAmount;
    	
    }
    
}
