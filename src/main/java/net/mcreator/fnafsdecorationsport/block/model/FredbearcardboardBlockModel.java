package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.entity.FredbearcardboardTileEntity;

public class FredbearcardboardBlockModel extends GeoModel<FredbearcardboardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearcardboardTileEntity animatable) {
		return new ResourceLocation("fd", "animations/fredbear_papercut.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearcardboardTileEntity animatable) {
		return new ResourceLocation("fd", "geo/fredbear_papercut.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearcardboardTileEntity animatable) {
		return new ResourceLocation("fd", "textures/block/fredbear_cardboard.png");
	}
}
