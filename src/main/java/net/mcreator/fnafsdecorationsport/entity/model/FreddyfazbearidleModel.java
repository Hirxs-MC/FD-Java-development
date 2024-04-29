package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.FreddyfazbearidleEntity;

public class FreddyfazbearidleModel extends GeoModel<FreddyfazbearidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "animations/freddy_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "geo/freddy_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
