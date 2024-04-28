package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.BonniebunnyidleEntity;

public class BonniebunnyidleModel extends AnimatedGeoModel<BonniebunnyidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonniebunnyidleEntity entity) {
		return new ResourceLocation("fd", "animations/bonnie_bunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonniebunnyidleEntity entity) {
		return new ResourceLocation("fd", "geo/bonnie_bunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonniebunnyidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
