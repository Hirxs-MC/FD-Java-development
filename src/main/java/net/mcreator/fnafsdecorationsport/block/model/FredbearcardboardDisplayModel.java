package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.display.FredbearcardboardDisplayItem;

public class FredbearcardboardDisplayModel extends GeoModel<FredbearcardboardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearcardboardDisplayItem animatable) {
		return new ResourceLocation("fd", "animations/fredbear_papercut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearcardboardDisplayItem animatable) {
		return new ResourceLocation("fd", "geo/fredbear_papercut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearcardboardDisplayItem entity) {
		return new ResourceLocation("fd", "textures/block/fredbear_cardboard.png");
	}
}
