package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.display.Partybanner1DisplayItem;

public class Partybanner1DisplayModel extends GeoModel<Partybanner1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Partybanner1DisplayItem animatable) {
		return new ResourceLocation("fd", "animations/n_party_banner_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Partybanner1DisplayItem animatable) {
		return new ResourceLocation("fd", "geo/n_party_banner_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Partybanner1DisplayItem entity) {
		return new ResourceLocation("fd", "textures/block/party_banner_1.png");
	}
}
