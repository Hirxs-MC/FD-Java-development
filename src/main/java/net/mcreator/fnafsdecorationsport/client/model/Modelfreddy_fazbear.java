package net.mcreator.fnafsdecorationsport.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfreddy_fazbear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fd", "modelfreddy_fazbear"), "main");
	public final ModelPart feddy;

	public Modelfreddy_fazbear(ModelPart root) {
		this.feddy = root.getChild("feddy");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition feddy = partdefinition.addOrReplaceChild("feddy", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition upperpart = feddy.addOrReplaceChild("upperpart", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 2.0F));
		PartDefinition feddyHed = upperpart.addOrReplaceChild("feddyHed", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition head = feddyHed.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition headsuit = head.addOrReplaceChild("headsuit", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition masktop = headsuit.addOrReplaceChild("masktop", CubeListBuilder.create().texOffs(29, 9).addBox(-4.0F, -14.0F, -6.4F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-5.0F, -10.0F, -6.4F, 10.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 40).addBox(-5.0F, -6.0F, -2.4F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 1.4F));
		PartDefinition eyebrows = masktop.addOrReplaceChild("eyebrows", CubeListBuilder.create(), PartPose.offset(-3.0F, -4.5F, -5.4F));
		PartDefinition eyebrowL = eyebrows.addOrReplaceChild("eyebrowL", CubeListBuilder.create().texOffs(62, 49).addBox(0.0F, -7.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition eyebrowR = eyebrows.addOrReplaceChild("eyebrowR", CubeListBuilder.create().texOffs(55, 28).addBox(-2.0F, -7.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition muzzle = masktop.addOrReplaceChild("muzzle", CubeListBuilder.create().texOffs(69, 6).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 91)
				.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(66, 124).addBox(-1.5F, -9.0F, -4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, -4.4F));
		PartDefinition hat = masktop.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, -7.75F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(73, 19).addBox(-2.0F, -10.75F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.25F, -2.4F));
		PartDefinition jaw = headsuit.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(74, 125).addBox(-1.5F, 1.0F, -7.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(50, 0)
				.addBox(-4.0F, 1.0F, -7.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 124).addBox(-2.5F, 0.0F, -6.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1", CubeListBuilder.create().texOffs(28, 0).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, 0.7418F, 0.0F, 0.0F));
		PartDefinition headendo = head.addOrReplaceChild("headendo",
				CubeListBuilder.create().texOffs(74, 34).addBox(-3.0F, -7.0F, -2.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(85, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(85, 64)
						.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 80).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition earL = headendo.addOrReplaceChild("earL", CubeListBuilder.create().texOffs(85, 41).addBox(-1.4287F, -4.1263F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
				.addBox(-1.4287F, -4.1263F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(27, 30).addBox(-0.5324F, -1.0426F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.55F, -6.5F, -1.5F, 0.0F, 0.0F, -0.8727F));
		PartDefinition earR = headendo.addOrReplaceChild("earR", CubeListBuilder.create().texOffs(57, 62).addBox(-1.5713F, -4.1263F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 62)
				.addBox(-1.5713F, -4.1263F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(0, 30).addBox(-0.4676F, -1.0426F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.55F, -6.5F, -1.5F, 0.0F, 0.0F, 0.8727F));
		PartDefinition eyes = headendo.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(-2.0F, 3.0F, -2.0F));
		PartDefinition eyeL = eyes.addOrReplaceChild("eyeL", CubeListBuilder.create().texOffs(86, 0).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pupil = eyeL.addOrReplaceChild("pupil", CubeListBuilder.create().texOffs(29, 4).addBox(-0.5F, -7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.15F));
		PartDefinition eyelid = eyeL.addOrReplaceChild("eyelid", CubeListBuilder.create().texOffs(79, 31).addBox(-1.0F, -0.65F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, -7.55F, 0.0F));
		PartDefinition eyeR = eyes.addOrReplaceChild("eyeR", CubeListBuilder.create().texOffs(54, 52).addBox(-1.0F, -8.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
		PartDefinition pupil2 = eyeR.addOrReplaceChild("pupil2", CubeListBuilder.create().texOffs(29, 1).addBox(-0.5F, -7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.15F));
		PartDefinition eyelid2 = eyeR.addOrReplaceChild("eyelid2", CubeListBuilder.create().texOffs(24, 39).addBox(-1.0F, -0.7F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, -7.5F, 0.0F));
		PartDefinition neck = feddyHed.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(4, 81).addBox(0.25F, -11.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 81).addBox(-1.25F, -11.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(4, 81).addBox(-0.5F, -4.5F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, -6.5F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(4, 81).addBox(-0.5F, -4.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, -7.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition feddybod = upperpart.addOrReplaceChild("feddybod", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bodysuit = feddybod.addOrReplaceChild("bodysuit", CubeListBuilder.create().texOffs(31, 23).addBox(-4.0F, -15.0F, -4.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(27, 35)
				.addBox(-4.0F, -15.0F, -4.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bodysuit_r1 = bodysuit.addOrReplaceChild("bodysuit_r1", CubeListBuilder.create().texOffs(73, 58).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -13.75F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bodysuit_r2 = bodysuit.addOrReplaceChild("bodysuit_r2", CubeListBuilder.create().texOffs(74, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -13.75F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition belly = bodysuit.addOrReplaceChild("belly",
				CubeListBuilder.create().texOffs(74, 26).addBox(0.9F, -7.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 44).addBox(-0.1F, -4.0F, -1.0F, 8.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.9F, -7.0F, -5.0F));
		PartDefinition bowtie = belly.addOrReplaceChild("bowtie", CubeListBuilder.create(), PartPose.offset(0.9F, 6.0F, 1.0F));
		PartDefinition bowtie_r1 = bowtie.addOrReplaceChild("bowtie_r1", CubeListBuilder.create().texOffs(95, 0).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -12.6721F, -1.2458F, -0.6109F, 0.0F, 0.0F));
		PartDefinition endobody = feddybod.addOrReplaceChild("endobody",
				CubeListBuilder.create().texOffs(18, 46).addBox(-7.0F, -20.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(12, 53).addBox(5.0F, -20.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).texOffs(0, 77)
						.addBox(-1.0F, -18.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 35).addBox(-5.0F, -20.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition endobody_r1 = endobody.addOrReplaceChild("endobody_r1", CubeListBuilder.create().texOffs(114, 0).addBox(-1.0F, -6.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.5F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition armL = feddybod.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offset(-6.0F, -13.0F, 0.0F));
		PartDefinition upper = armL.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(84, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition lower = armL.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(85, 54).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
				.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 48).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition hand = lower.addOrReplaceChild("hand",
				CubeListBuilder.create().texOffs(42, 79).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 77).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 5.5F, 0.0F));
		PartDefinition fingers = hand.addOrReplaceChild("fingers", CubeListBuilder.create().texOffs(28, 81).addBox(0.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.0F, 3.0F, 0.0F));
		PartDefinition fingers2 = fingers.addOrReplaceChild("fingers2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition thumb = hand.addOrReplaceChild("thumb", CubeListBuilder.create().texOffs(13, 86).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offset(-1.0F, 1.0F, -2.0F));
		PartDefinition item = hand.addOrReplaceChild("item",
				CubeListBuilder.create().texOffs(96, 121).addBox(2.0F, 2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(114, 120).addBox(1.5F, 1.5F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 83)
						.addBox(1.5F, 1.5F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(114, 113).addBox(2.0F, 2.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(76, 100)
						.addBox(3.0F, 2.0F, -10.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -1.0F, 1.0F));
		PartDefinition armR = feddybod.addOrReplaceChild("armR", CubeListBuilder.create(), PartPose.offset(6.0F, -13.0F, 0.0F));
		PartDefinition upper2 = armR.addOrReplaceChild("upper2", CubeListBuilder.create().texOffs(70, 82).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 62)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition lower2 = armR.addOrReplaceChild("lower2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 69)
				.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 11).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition hand2 = lower2.addOrReplaceChild("hand2",
				CubeListBuilder.create().texOffs(77, 64).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 41).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 5.5F, 0.0F));
		PartDefinition fingers3 = hand2.addOrReplaceChild("fingers3", CubeListBuilder.create().texOffs(16, 80).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(1.0F, 3.0F, 0.0F));
		PartDefinition fingers4 = fingers3.addOrReplaceChild("fingers4", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition thumb3 = hand2.addOrReplaceChild("thumb3", CubeListBuilder.create().texOffs(85, 16).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offset(1.0F, 1.0F, -2.0F));
		PartDefinition thumb4 = thumb3.addOrReplaceChild("thumb4", CubeListBuilder.create(), PartPose.offset(-1.0F, -1.0F, -2.0F));
		PartDefinition belowpart = feddy.addOrReplaceChild("belowpart", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 2.0F));
		PartDefinition pelvis = belowpart.addOrReplaceChild("pelvis", CubeListBuilder.create().texOffs(29, 21).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition waist = pelvis.addOrReplaceChild("waist", CubeListBuilder.create().texOffs(14, 73).addBox(-2.0F, -8.5F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.5F, 0.0F));
		PartDefinition pelvissuit = belowpart.addOrReplaceChild("pelvissuit",
				CubeListBuilder.create().texOffs(0, 30).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 44).addBox(-2.0F, 2.0F, -4.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition legL = belowpart.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offset(-3.0F, 4.0F, 0.0F));
		PartDefinition upper3 = legL.addOrReplaceChild("upper3", CubeListBuilder.create().texOffs(62, 81).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 52)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 56).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lower3 = legL.addOrReplaceChild("lower3",
				CubeListBuilder.create().texOffs(54, 79).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 17).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition knee = lower3.addOrReplaceChild("knee", CubeListBuilder.create().texOffs(82, 48).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));
		PartDefinition foot = lower3.addOrReplaceChild("foot",
				CubeListBuilder.create().texOffs(61, 27).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 72).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition legR = belowpart.addOrReplaceChild("legR", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, 0.0F));
		PartDefinition upper4 = legR.addOrReplaceChild("upper4", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 6)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 53).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lower4 = legR.addOrReplaceChild("lower4",
				CubeListBuilder.create().texOffs(8, 78).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 52).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition knee2 = lower4.addOrReplaceChild("knee2", CubeListBuilder.create().texOffs(28, 56).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));
		PartDefinition foot2 = lower4.addOrReplaceChild("foot2",
				CubeListBuilder.create().texOffs(27, 61).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 71).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.5F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		feddy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
