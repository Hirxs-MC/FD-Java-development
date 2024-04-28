package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.Partybanner2DisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.Partybanner2DisplayItem;

public class Partybanner2DisplayItemRenderer extends GeoItemRenderer<Partybanner2DisplayItem> {
	public Partybanner2DisplayItemRenderer() {
		super(new Partybanner2DisplayModel());
	}

	@Override
	public RenderType getRenderType(Partybanner2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
