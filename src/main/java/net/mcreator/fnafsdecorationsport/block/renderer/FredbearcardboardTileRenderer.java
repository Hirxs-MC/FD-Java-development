package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.FredbearcardboardBlockModel;
import net.mcreator.fnafsdecorationsport.block.entity.FredbearcardboardTileEntity;

public class FredbearcardboardTileRenderer extends GeoBlockRenderer<FredbearcardboardTileEntity> {
	public FredbearcardboardTileRenderer() {
		super(new FredbearcardboardBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearcardboardTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
