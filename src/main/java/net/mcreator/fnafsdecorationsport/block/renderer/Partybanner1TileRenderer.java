package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.Partybanner1BlockModel;
import net.mcreator.fnafsdecorationsport.block.entity.Partybanner1TileEntity;

public class Partybanner1TileRenderer extends GeoBlockRenderer<Partybanner1TileEntity> {
	public Partybanner1TileRenderer() {
		super(new Partybanner1BlockModel());
	}

	@Override
	public RenderType getRenderType(Partybanner1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
