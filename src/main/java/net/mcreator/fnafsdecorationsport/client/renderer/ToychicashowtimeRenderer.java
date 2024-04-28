
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.ToychicashowtimeModel;
import net.mcreator.fnafsdecorationsport.entity.layer.ToychicashowtimeLayer;
import net.mcreator.fnafsdecorationsport.entity.ToychicashowtimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToychicashowtimeRenderer extends GeoEntityRenderer<ToychicashowtimeEntity> {
	public ToychicashowtimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToychicashowtimeModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new ToychicashowtimeLayer(this));
	}

	@Override
	public RenderType getRenderType(ToychicashowtimeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
