package net.mcreator.fnafsdecorationsport.entity.layer;

public class FoxyLayer extends GeoRenderLayer<FoxyEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("fd", "textures/entities/foxy_emit.png");

	public FoxyLayer(GeoRenderer<FoxyEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, FoxyEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}