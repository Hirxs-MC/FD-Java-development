
package net.mcreator.fnafsdecorationsport.client.renderer;

public class ChairexecutionRenderer extends MobRenderer<ChairexecutionEntity, ChickenModel<ChairexecutionEntity>> {

	public ChairexecutionRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ChairexecutionEntity entity) {
		return new ResourceLocation("fd:textures/entities/inv.png");
	}

}
