package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.entity.ToyfreddyshowtimeEntity;

public class ToyfreddyshowtimeModel extends GeoModel<ToyfreddyshowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyfreddyshowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ToyfreddyshowtimeEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
