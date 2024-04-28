
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.FoxyidleModel;
import net.mcreator.fnafsdecorationsport.entity.layer.FoxyidleLayer;
import net.mcreator.fnafsdecorationsport.entity.FoxyidleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoxyidleRenderer extends GeoEntityRenderer<FoxyidleEntity> {
	public FoxyidleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FoxyidleModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new FoxyidleLayer(this));
	}

	@Override
	public RenderType getRenderType(FoxyidleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
