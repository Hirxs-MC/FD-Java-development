package net.mcreator.fnafsdecorationsport.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FreddyfazbearidleModel extends GeoModel<FreddyfazbearidleEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "animations/freddy_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "geo/freddy_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyfazbearidleEntity entity) {
		return new ResourceLocation("fd", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FreddyfazbearidleEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}