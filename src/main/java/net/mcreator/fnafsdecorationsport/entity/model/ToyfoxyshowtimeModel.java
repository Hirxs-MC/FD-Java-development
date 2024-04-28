package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ToyfoxyshowtimeEntity;

public class ToyfoxyshowtimeModel extends AnimatedGeoModel<ToyfoxyshowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyfoxyshowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyfoxyshowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyfoxyshowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
