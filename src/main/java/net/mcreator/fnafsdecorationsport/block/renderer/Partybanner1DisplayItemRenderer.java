package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.Partybanner1DisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.Partybanner1DisplayItem;

public class Partybanner1DisplayItemRenderer extends GeoItemRenderer<Partybanner1DisplayItem> {
	public Partybanner1DisplayItemRenderer() {
		super(new Partybanner1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Partybanner1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
