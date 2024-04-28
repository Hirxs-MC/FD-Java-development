package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.FoxyidleEntity;

public class FoxyidleModel extends AnimatedGeoModel<FoxyidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyidleEntity entity) {
		return new ResourceLocation("fd", "animations/foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyidleEntity entity) {
		return new ResourceLocation("fd", "geo/foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
