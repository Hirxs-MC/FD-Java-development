
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafsdecorationsport.client.renderer.ToyfreddyshowtimeRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ToyfoxyshowtimeRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ToychicashowtimeRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ToybonnieshowtimeRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.FreddyfazbearidleRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.FreddyfazbearRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.FoxyidleRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.FoxyRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ChicachickenidleRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ChicachickenRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.ChairexecutionRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.BonniebunnyidleRenderer;
import net.mcreator.fnafsdecorationsport.client.renderer.BonniebunnyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FdModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FdModEntities.CHAIREXECUTION.get(), ChairexecutionRenderer::new);
		event.registerEntityRenderer(FdModEntities.FREDDYFAZBEARIDLE.get(), FreddyfazbearidleRenderer::new);
		event.registerEntityRenderer(FdModEntities.FREDDYFAZBEAR.get(), FreddyfazbearRenderer::new);
		event.registerEntityRenderer(FdModEntities.BONNIEBUNNYIDLE.get(), BonniebunnyidleRenderer::new);
		event.registerEntityRenderer(FdModEntities.BONNIEBUNNY.get(), BonniebunnyRenderer::new);
		event.registerEntityRenderer(FdModEntities.CHICACHICKENIDLE.get(), ChicachickenidleRenderer::new);
		event.registerEntityRenderer(FdModEntities.CHICACHICKEN.get(), ChicachickenRenderer::new);
		event.registerEntityRenderer(FdModEntities.FOXYIDLE.get(), FoxyidleRenderer::new);
		event.registerEntityRenderer(FdModEntities.FOXY.get(), FoxyRenderer::new);
		event.registerEntityRenderer(FdModEntities.TOYCHICASHOWTIME.get(), ToychicashowtimeRenderer::new);
		event.registerEntityRenderer(FdModEntities.TOYFREDDYSHOWTIME.get(), ToyfreddyshowtimeRenderer::new);
		event.registerEntityRenderer(FdModEntities.TOYBONNIESHOWTIME.get(), ToybonnieshowtimeRenderer::new);
		event.registerEntityRenderer(FdModEntities.TOYFOXYSHOWTIME.get(), ToyfoxyshowtimeRenderer::new);
	}
}
