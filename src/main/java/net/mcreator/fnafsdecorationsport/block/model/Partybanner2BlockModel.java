package net.mcreator.fnafsdecorationsport.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.block.entity.Partybanner2TileEntity;

public class Partybanner2BlockModel extends AnimatedGeoModel<Partybanner2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Partybanner2TileEntity animatable) {
		return new ResourceLocation("fd", "animations/n_party_banner_2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Partybanner2TileEntity animatable) {
		return new ResourceLocation("fd", "geo/n_party_banner_2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Partybanner2TileEntity entity) {
		return new ResourceLocation("fd", "textures/blocks/lets_party_banner.png");
	}
}
