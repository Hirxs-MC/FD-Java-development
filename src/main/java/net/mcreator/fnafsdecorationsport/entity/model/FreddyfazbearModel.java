package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.FreddyfazbearEntity;

public class FreddyfazbearModel extends AnimatedGeoModel<FreddyfazbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyfazbearEntity entity) {
		return new ResourceLocation("fd", "animations/freddy_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyfazbearEntity entity) {
		return new ResourceLocation("fd", "geo/freddy_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyfazbearEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
