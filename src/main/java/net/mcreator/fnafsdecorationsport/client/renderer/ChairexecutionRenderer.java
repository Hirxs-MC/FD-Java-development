
package net.mcreator.fnafsdecorationsport.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.fnafsdecorationsport.entity.ChairexecutionEntity;

public class ChairexecutionRenderer extends MobRenderer<ChairexecutionEntity, ChickenModel<ChairexecutionEntity>> {
	public ChairexecutionRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChairexecutionEntity entity) {
		return new ResourceLocation("fd:textures/entities/inv.png");
	}
}
