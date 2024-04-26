
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FdModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfreddy_fazbear.LAYER_LOCATION, Modelfreddy_fazbear::createBodyLayer);
	}
}
