package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.CarouselDisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.CarouselDisplayItem;

public class CarouselDisplayItemRenderer extends GeoItemRenderer<CarouselDisplayItem> {
	public CarouselDisplayItemRenderer() {
		super(new CarouselDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarouselDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
