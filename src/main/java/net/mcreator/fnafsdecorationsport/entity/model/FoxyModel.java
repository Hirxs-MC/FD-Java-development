package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.FoxyEntity;

public class FoxyModel extends AnimatedGeoModel<FoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyEntity entity) {
		return new ResourceLocation("fd", "animations/foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyEntity entity) {
		return new ResourceLocation("fd", "geo/foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
