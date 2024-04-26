
package net.mcreator.fnafsdecorationsport.client.renderer;

public class ChicachickenRenderer extends GeoEntityRenderer<ChicachickenEntity> {
	public ChicachickenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChicachickenModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ChicachickenLayer(this));
	}

	@Override
	public RenderType getRenderType(ChicachickenEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ChicachickenEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}