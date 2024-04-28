package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.entity.Partybanner1TileEntity;

public class Partybanner1BlockModel extends GeoModel<Partybanner1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Partybanner1TileEntity animatable) {
		return new ResourceLocation("fd", "animations/n_party_banner_1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Partybanner1TileEntity animatable) {
		return new ResourceLocation("fd", "geo/n_party_banner_1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Partybanner1TileEntity entity) {
		return new ResourceLocation("fd", "textures/block/party_banner_1.png");
	}
}
