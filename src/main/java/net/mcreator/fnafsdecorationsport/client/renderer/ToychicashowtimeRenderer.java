
package net.mcreator.fnafsdecorationsport.client.renderer;

public class ToychicashowtimeRenderer extends GeoEntityRenderer<ToychicashowtimeEntity> {
	public ToychicashowtimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToychicashowtimeModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ToychicashowtimeLayer(this));
	}

	@Override
	public RenderType getRenderType(ToychicashowtimeEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ToychicashowtimeEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}