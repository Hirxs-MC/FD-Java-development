package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.FredbearcardboardDisplayModel;
import net.mcreator.fnafsdecorationsport.block.display.FredbearcardboardDisplayItem;

public class FredbearcardboardDisplayItemRenderer extends GeoItemRenderer<FredbearcardboardDisplayItem> {
	public FredbearcardboardDisplayItemRenderer() {
		super(new FredbearcardboardDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredbearcardboardDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
