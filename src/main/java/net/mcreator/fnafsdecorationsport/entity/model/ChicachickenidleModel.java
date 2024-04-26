package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ChicachickenidleEntity;

public class ChicachickenidleModel extends GeoModel<ChicachickenidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "animations/chica_chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "geo/chica_chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicachickenidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ChicachickenidleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
