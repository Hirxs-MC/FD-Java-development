
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.ToyfreddyshowtimeModel;
import net.mcreator.fnafsdecorationsport.entity.layer.ToyfreddyshowtimeLayer;
import net.mcreator.fnafsdecorationsport.entity.ToyfreddyshowtimeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyfreddyshowtimeRenderer extends GeoEntityRenderer<ToyfreddyshowtimeEntity> {
	public ToyfreddyshowtimeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToyfreddyshowtimeModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new ToyfreddyshowtimeLayer(this));
	}

	@Override
	public RenderType getRenderType(ToyfreddyshowtimeEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ToyfreddyshowtimeEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
