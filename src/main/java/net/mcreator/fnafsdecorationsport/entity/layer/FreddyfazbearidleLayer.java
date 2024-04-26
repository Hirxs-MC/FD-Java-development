package net.mcreator.fnafsdecorationsport.entity.layer;

public class FreddyfazbearidleLayer extends GeoRenderLayer<FreddyfazbearidleEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("fd", "textures/entities/freddy_2.png");

	public FreddyfazbearidleLayer(GeoRenderer<FreddyfazbearidleEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, FreddyfazbearidleEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}