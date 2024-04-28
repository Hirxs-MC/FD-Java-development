
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.FoxyModel;
import net.mcreator.fnafsdecorationsport.entity.layer.FoxyLayer;
import net.mcreator.fnafsdecorationsport.entity.FoxyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyRenderer extends GeoEntityRenderer<FoxyEntity> {
	public FoxyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FoxyModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new FoxyLayer(this));
	}

	@Override
	public RenderType getRenderType(FoxyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
