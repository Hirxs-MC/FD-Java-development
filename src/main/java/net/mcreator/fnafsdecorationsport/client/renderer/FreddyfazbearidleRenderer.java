
package net.mcreator.fnafsdecorationsport.client.renderer;

public class FreddyfazbearidleRenderer extends GeoEntityRenderer<FreddyfazbearidleEntity> {
	public FreddyfazbearidleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FreddyfazbearidleModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new FreddyfazbearidleLayer(this));
	}

	@Override
	public RenderType getRenderType(FreddyfazbearidleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FreddyfazbearidleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}