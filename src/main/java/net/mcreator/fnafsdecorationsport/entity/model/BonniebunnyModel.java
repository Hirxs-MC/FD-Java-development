package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.BonniebunnyEntity;

public class BonniebunnyModel extends AnimatedGeoModel<BonniebunnyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonniebunnyEntity entity) {
		return new ResourceLocation("fd", "animations/bonnie_bunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonniebunnyEntity entity) {
		return new ResourceLocation("fd", "geo/bonnie_bunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonniebunnyEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
