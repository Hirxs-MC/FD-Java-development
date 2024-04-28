package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ToychicashowtimeEntity;

public class ToychicashowtimeModel extends AnimatedGeoModel<ToychicashowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
