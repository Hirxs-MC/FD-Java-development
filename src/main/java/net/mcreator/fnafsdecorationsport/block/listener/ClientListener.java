package net.mcreator.fnafsdecorationsport.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafsdecorationsport.init.FdModBlockEntities;
import net.mcreator.fnafsdecorationsport.block.renderer.Partybanner2TileRenderer;
import net.mcreator.fnafsdecorationsport.block.renderer.Partybanner1TileRenderer;
import net.mcreator.fnafsdecorationsport.block.renderer.CarouselTileRenderer;
import net.mcreator.fnafsdecorationsport.FdMod;

@Mod.EventBusSubscriber(modid = FdMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FdModBlockEntities.PARTYBANNER_1.get(), context -> new Partybanner1TileRenderer());
		event.registerBlockEntityRenderer(FdModBlockEntities.PARTYBANNER_2.get(), context -> new Partybanner2TileRenderer());
		event.registerBlockEntityRenderer(FdModBlockEntities.CAROUSEL.get(), context -> new CarouselTileRenderer());
	}
}
