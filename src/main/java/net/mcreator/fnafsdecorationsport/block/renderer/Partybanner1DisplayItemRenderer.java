package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.Partybanner1DisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.Partybanner1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Partybanner1DisplayItemRenderer extends GeoItemRenderer<Partybanner1DisplayItem> {
	public Partybanner1DisplayItemRenderer() {
		super(new Partybanner1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Partybanner1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
