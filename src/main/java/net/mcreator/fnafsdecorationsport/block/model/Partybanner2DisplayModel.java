package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.display.Partybanner2DisplayItem;

public class Partybanner2DisplayModel extends GeoModel<Partybanner2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Partybanner2DisplayItem animatable) {
		return new ResourceLocation("fd", "animations/n_party_banner_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Partybanner2DisplayItem animatable) {
		return new ResourceLocation("fd", "geo/n_party_banner_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Partybanner2DisplayItem entity) {
		return new ResourceLocation("fd", "textures/block/lets_party_banner.png");
	}
}
