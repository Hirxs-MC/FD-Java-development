package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.CarouselDisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.CarouselDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CarouselDisplayItemRenderer extends GeoItemRenderer<CarouselDisplayItem> {
	public CarouselDisplayItemRenderer() {
		super(new CarouselDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
