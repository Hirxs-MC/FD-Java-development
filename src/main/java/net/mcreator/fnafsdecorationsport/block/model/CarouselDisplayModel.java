package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.display.CarouselDisplayItem;

public class CarouselDisplayModel extends AnimatedGeoModel<CarouselDisplayItem> {
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
		return new ResourceLocation("fd", "textures/blocks/carousel_single.png");
	}
}
