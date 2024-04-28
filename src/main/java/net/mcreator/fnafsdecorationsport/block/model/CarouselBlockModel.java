package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.entity.CarouselTileEntity;

public class CarouselBlockModel extends AnimatedGeoModel<CarouselTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselTileEntity animatable) {
		return new ResourceLocation("fd", "animations/carousel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselTileEntity animatable) {
		return new ResourceLocation("fd", "geo/carousel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselTileEntity entity) {
		return new ResourceLocation("fd", "textures/blocks/carousel_single.png");
	}
}
