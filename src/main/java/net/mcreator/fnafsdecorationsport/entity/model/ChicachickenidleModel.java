package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ChicachickenidleEntity;

public class ChicachickenidleModel extends GeoModel<ChicachickenidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "animations/chica_chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "geo/chica_chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
