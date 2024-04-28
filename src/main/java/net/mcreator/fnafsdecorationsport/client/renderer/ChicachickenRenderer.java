
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.ChicachickenModel;
import net.mcreator.fnafsdecorationsport.entity.layer.ChicachickenLayer;
import net.mcreator.fnafsdecorationsport.entity.ChicachickenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChicachickenRenderer extends GeoEntityRenderer<ChicachickenEntity> {
	public ChicachickenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChicachickenModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new ChicachickenLayer(this));
	}

	@Override
	public RenderType getRenderType(ChicachickenEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
