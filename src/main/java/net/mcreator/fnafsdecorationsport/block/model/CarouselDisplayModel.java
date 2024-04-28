package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.display.CarouselDisplayItem;

public class CarouselDisplayModel extends GeoModel<CarouselDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("fd", "animations/carousel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("fd", "geo/carousel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselDisplayItem entity) {
		return new ResourceLocation("fd", "textures/block/carousel_single.png");
	}
}
