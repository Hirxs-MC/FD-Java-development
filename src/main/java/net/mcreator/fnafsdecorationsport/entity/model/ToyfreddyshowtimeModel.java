package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ToyfreddyshowtimeEntity;

public class ToyfreddyshowtimeModel extends AnimatedGeoModel<ToyfreddyshowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
