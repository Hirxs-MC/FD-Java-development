package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ChicachickenEntity;

public class ChicachickenModel extends AnimatedGeoModel<ChicachickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicachickenEntity entity) {
		return new ResourceLocation("fd", "animations/chica_chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicachickenEntity entity) {
		return new ResourceLocation("fd", "geo/chica_chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicachickenEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
