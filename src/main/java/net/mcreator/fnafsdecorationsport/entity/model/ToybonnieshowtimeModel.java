package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ToybonnieshowtimeEntity;

public class ToybonnieshowtimeModel extends GeoModel<ToybonnieshowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToybonnieshowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToybonnieshowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToybonnieshowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
