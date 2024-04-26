package net.mcreator.fnafsdecorationsport.entity.layer;

public class ToychicashowtimeLayer extends GeoRenderLayer<ToychicashowtimeEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("fd", "textures/entities/toy_chica_eyes.png");

	public ToychicashowtimeLayer(GeoRenderer<ToychicashowtimeEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, ToychicashowtimeEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}