
package net.mcreator.fnafsdecorationsport.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafsdecorationsport.entity.model.BonniebunnyidleModel;
import net.mcreator.fnafsdecorationsport.entity.layer.BonniebunnyidleLayer;
import net.mcreator.fnafsdecorationsport.entity.BonniebunnyidleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BonniebunnyidleRenderer extends GeoEntityRenderer<BonniebunnyidleEntity> {
	public BonniebunnyidleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BonniebunnyidleModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new BonniebunnyidleLayer(this));
	}

	@Override
	public RenderType getRenderType(BonniebunnyidleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BonniebunnyidleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
