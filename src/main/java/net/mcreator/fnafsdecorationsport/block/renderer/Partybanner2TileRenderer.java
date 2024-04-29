package net.mcreator.fnafsdecorationsport.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.block.model.Partybanner2BlockModel;
import net.mcreator.fnafsdecorationsport.block.entity.Partybanner2TileEntity;

public class Partybanner2TileRenderer extends GeoBlockRenderer<Partybanner2TileEntity> {
	public Partybanner2TileRenderer() {
		super(new Partybanner2BlockModel());
	}

	@Override
	public RenderType getRenderType(Partybanner2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
