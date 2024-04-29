package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.CarouselBlockModel;
import net.mcreator.fnafsdecorationsport.block.entity.CarouselTileEntity;

public class CarouselTileRenderer extends GeoBlockRenderer<CarouselTileEntity> {
	public CarouselTileRenderer() {
		super(new CarouselBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
