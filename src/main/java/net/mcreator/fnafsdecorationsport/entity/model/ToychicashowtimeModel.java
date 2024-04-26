package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class ToychicashowtimeModel extends GeoModel<ToychicashowtimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "animations/toy_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "geo/toy_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToychicashowtimeEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ToychicashowtimeEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}