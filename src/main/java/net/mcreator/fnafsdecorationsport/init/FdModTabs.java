
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.fnafsdecorationsport.FdMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FdMod.MODID);
	public static final RegistryObject<CreativeModeTab> FNAFS_DECORATIONS = REGISTRY.register("fnafs_decorations",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fd.fnafs_decorations")).icon(() -> new ItemStack(FdModItems.CHANGERTOOL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FdModItems.CHANGERTOOL.get());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKPURPLE.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKBLUE.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKRED.get().asItem());
				tabData.accept(FdModBlocks.CURTAINPURPLEBLOCKPANEL.get().asItem());
				tabData.accept(FdModBlocks.CURTAINREDBLOCKPANEL.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKPURPLEBLOCK.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKBLUEBLOCK.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVECURTAINBLOCKREDBLOCK.get().asItem());
				tabData.accept(FdModBlocks.CURTAINPURPLEBLOCK.get().asItem());
				tabData.accept(FdModBlocks.CURTAINREDBLOCK.get().asItem());
				tabData.accept(FdModBlocks.ARCADEFLOOR_1.get().asItem());
				tabData.accept(FdModBlocks.REDARCADEFLOOR_1.get().asItem());
				tabData.accept(FdModBlocks.PIZZERIALIGHTOFF.get().asItem());
				tabData.accept(FdModBlocks.TRASH_1.get().asItem());
				tabData.accept(FdModBlocks.BLOCKGIFT.get().asItem());
				tabData.accept(FdModBlocks.WALLPAPERS.get().asItem());
				tabData.accept(FdModBlocks.WALLPAPER_1.get().asItem());
				tabData.accept(FdModBlocks.STARS_1.get().asItem());
				tabData.accept(FdModBlocks.WALLSTRUCTURE.get().asItem());
				tabData.accept(FdModBlocks.STAGESPEAKER.get().asItem());
				tabData.accept(FdModBlocks.ROOFWIRES_1.get().asItem());
				tabData.accept(FdModBlocks.CURTAIN_1.get().asItem());
				tabData.accept(FdModBlocks.POSTER_1.get().asItem());
				tabData.accept(FdModBlocks.OFFICEWINDOW.get().asItem());
				tabData.accept(FdModBlocks.OFFICEPOSTER.get().asItem());
				tabData.accept(FdModBlocks.PIZZERIASIGNS_1.get().asItem());
				tabData.accept(FdModBlocks.FLOORWIRES_1.get().asItem());
				tabData.accept(FdModBlocks.PARTYKIDSCHAIRBLUE.get().asItem());
				tabData.accept(FdModBlocks.PARTYKIDSCHAIRRED.get().asItem());
				tabData.accept(FdModBlocks.PARTYKIDSCHAIRBLACK.get().asItem());
				tabData.accept(FdModBlocks.PARTYKIDSCHAIRPURPLE.get().asItem());
				tabData.accept(FdModBlocks.OFFICELAMP.get().asItem());
				tabData.accept(FdModBlocks.STAGESUN.get().asItem());
				tabData.accept(FdModBlocks.STAGECLOUDS.get().asItem());
				tabData.accept(FdModBlocks.PIRATECOVESIGN_1.get().asItem());
				tabData.accept(FdModBlocks.SUPPLYROOMSHELVES.get().asItem());
				tabData.accept(FdModBlocks.FANBLOCK.get().asItem());
				tabData.accept(FdModBlocks.FANBLOCKON.get().asItem());
				tabData.accept(FdModBlocks.DESKPROPS.get().asItem());
				tabData.accept(FdModBlocks.ONLYOFFICEDESK.get().asItem());
				tabData.accept(FdModBlocks.MONITORS_1.get().asItem());
				tabData.accept(FdModBlocks.OFFICEDESK.get().asItem());
				tabData.accept(FdModBlocks.OFFICECHAIR.get().asItem());
				tabData.accept(FdModBlocks.OFFICELIGHTOFF.get().asItem());
				tabData.accept(FdModBlocks.OFFICEDOORBLOCKOPEN.get().asItem());
				tabData.accept(FdModBlocks.OFFICELIGHTBUTTONOFF.get().asItem());
				tabData.accept(FdModBlocks.OFFICEDOORBUTTONOFF.get().asItem());
				tabData.accept(FdModBlocks.PARTYHATRED.get().asItem());
				tabData.accept(FdModBlocks.WALLWARNINGSIGN.get().asItem());
				tabData.accept(FdModBlocks.FAZSODARED.get().asItem());
				tabData.accept(FdModBlocks.FAZSODABLUE.get().asItem());
				tabData.accept(FdModBlocks.SHELF_1.get().asItem());
				tabData.accept(FdModBlocks.BLACKDOOR.get().asItem());
				tabData.accept(FdModBlocks.REDDOOR.get().asItem());
				tabData.accept(FdModBlocks.ALARM_CLOCK.get().asItem());
				tabData.accept(FdModBlocks.ARCADE_SIGN.get().asItem());
				tabData.accept(FdModBlocks.BLOOD_TRAIL.get().asItem());
				tabData.accept(FdModBlocks.CHICAS_MAGIC_RAINBOW.get().asItem());
				tabData.accept(FdModBlocks.BALLOONS.get().asItem());
				tabData.accept(FdModBlocks.BOBBLEHEADS.get().asItem());
				tabData.accept(FdModBlocks.BIRTHDAY_CAKE.get().asItem());
				tabData.accept(FdModBlocks.EMERGENCY_LIGHT.get().asItem());
				tabData.accept(FdModBlocks.CHICAPLUSH.get().asItem());
				tabData.accept(FdModBlocks.CHICABETAPLUSH.get().asItem());
				tabData.accept(FdModBlocks.FREDDYPLUSH.get().asItem());
				tabData.accept(FdModBlocks.BONNIEPLUSH.get().asItem());
				tabData.accept(FdModBlocks.FOXYPLUSH.get().asItem());
				tabData.accept(FdModBlocks.SPRINGBONNIEPLUSH.get().asItem());
				tabData.accept(FdModBlocks.GOLDENFREDDYPLUSH.get().asItem());
				tabData.accept(FdModBlocks.FREDBEARPLUSH.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEOFFICEDOOR.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEBATHROOMDOOR.get().asItem());
				tabData.accept(FdModBlocks.FFDPIZZERIADOOR.get().asItem());
				tabData.accept(FdModBlocks.SWITCHOFF.get().asItem());
				tabData.accept(FdModBlocks.SWITCHON.get().asItem());
				tabData.accept(FdModBlocks.FREDDY_FAZBEARTRASHCAN.get().asItem());
				tabData.accept(FdModBlocks.POLE_1.get().asItem());
				tabData.accept(FdModItems.ROTATETOOL.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> FD_WALLS = REGISTRY.register("fd_walls",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fd.fd_walls")).icon(() -> new ItemStack(FdModBlocks.FLOORBLUE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FdModBlocks.FNAF_1WALLUP.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLDECO_1.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLDECO_2.get().asItem());
				tabData.accept(FdModBlocks.FNAFWALLMIDDLE_2.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLMIDDLE_1.get().asItem());
				tabData.accept(FdModBlocks.F_NA_F_1WALLMIDDLE_3.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLMIDDLE_4.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLMIDDLE_5.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLDOWN_1.get().asItem());
				tabData.accept(FdModBlocks.F_NA_F_1WALLDOWN_2.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLBATHROOM.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLBATHROOM_2.get().asItem());
				tabData.accept(FdModBlocks.FNAF_1WALLBATHROOM_3.get().asItem());
				tabData.accept(FdModBlocks.STAGEUP.get().asItem());
				tabData.accept(FdModBlocks.STAGEMIDDLE_1.get().asItem());
				tabData.accept(FdModBlocks.STAGETILES.get().asItem());
				tabData.accept(FdModBlocks.STAGETILES_2.get().asItem());
				tabData.accept(FdModBlocks.STAGETILES_3.get().asItem());
				tabData.accept(FdModBlocks.STAGEDOWN.get().asItem());
				tabData.accept(FdModBlocks.STAGEBLOCK_4.get().asItem());
				tabData.accept(FdModBlocks.STAGEBLOCK_1.get().asItem());
				tabData.accept(FdModBlocks.STAGEBLOCK_2.get().asItem());
				tabData.accept(FdModBlocks.STAGEBLOCK_3.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLUP_2.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLUP_1.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLMIDDLE_3.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLMIDDLE_2.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLMIDDLE_1.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLDOWN_1.get().asItem());
				tabData.accept(FdModBlocks.WHITEROOF.get().asItem());
				tabData.accept(FdModBlocks.ROOF_1.get().asItem());
				tabData.accept(FdModBlocks.ROOF_2.get().asItem());
				tabData.accept(FdModBlocks.FFDFLOOR.get().asItem());
				tabData.accept(FdModBlocks.FLOORFFDSTAIRS.get().asItem());
				tabData.accept(FdModBlocks.FLOORFFDSLAB.get().asItem());
				tabData.accept(FdModBlocks.FLOORRED.get().asItem());
				tabData.accept(FdModBlocks.FLOORREDSTAIRS.get().asItem());
				tabData.accept(FdModBlocks.FLOORREDSLAB.get().asItem());
				tabData.accept(FdModBlocks.FLOORBLUE.get().asItem());
				tabData.accept(FdModBlocks.FLOORBLUESTAIRS.get().asItem());
				tabData.accept(FdModBlocks.FLOORBLUESLAB.get().asItem());
				tabData.accept(FdModBlocks.FLOORREDBLUE.get().asItem());
				tabData.accept(FdModBlocks.FLOORREDNBLUESTAIRS.get().asItem());
				tabData.accept(FdModBlocks.FLOORREDNBLUESLAB.get().asItem());
				tabData.accept(FdModBlocks.FLOORWHITE.get().asItem());
				tabData.accept(FdModBlocks.FLOORWHITESTAIRS.get().asItem());
				tabData.accept(FdModBlocks.FLOORWHITESLAB.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLUP.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLMIDDLE.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLTILES.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLDOWN.get().asItem());
				tabData.accept(FdModBlocks.FFDEXTERIORWALLUP.get().asItem());
				tabData.accept(FdModBlocks.FFDEXTERIORWALLMIDDLE.get().asItem());
				tabData.accept(FdModBlocks.FFDEXTERIORWALLTILES.get().asItem());
				tabData.accept(FdModBlocks.FFDEXTERIORWALLDOWN.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEWALLUPPEREXTERIOR.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEWALLUPPER_2EXTERIOR.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEWALLMIDDLE_2EXTERIOR.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEWALLMIDDLEEXTERIOR.get().asItem());
				tabData.accept(FdModBlocks.FNAFMOVIEWALLBOTTOMEXTERIOR.get().asItem());
				tabData.accept(FdModBlocks.REDARCADEFLOOR_1STAIRS.get().asItem());
				tabData.accept(FdModBlocks.REDARCADEFLOOR_1SLAB.get().asItem());
				tabData.accept(FdModBlocks.BLUEARCADEFLOOR_1STAIRS.get().asItem());
				tabData.accept(FdModBlocks.BLUEARCADEFLOOR_1SLAB.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLMIDDLECONFETTI.get().asItem());
				tabData.accept(FdModBlocks.PURPLESTAGEBRICKS.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2STAGEWALLMIDDLE.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2STAGEWALLTILES.get().asItem());
				tabData.accept(FdModBlocks.BATTINGTONFLOOR.get().asItem());
				tabData.accept(FdModBlocks.FNAF_2WALLUPPERCONFETTI.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLMIDDLECONFETTI_1.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLMIDDLECONFETTI_2.get().asItem());
				tabData.accept(FdModBlocks.FFDINTERIORWALLMIDDLECONFETTI_3.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> FDPOSTERS = REGISTRY.register("fdposters",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fd.fdposters")).icon(() -> new ItemStack(FdModBlocks.WALLPOSTERFACESF.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FdModBlocks.WALLPOSTERFACESF.get().asItem());
				tabData.accept(FdModBlocks.WALLPOSTERFACESC.get().asItem());
				tabData.accept(FdModBlocks.WALLPOSTERFACESB.get().asItem());
				tabData.accept(FdModBlocks.FFDWALLPOSTERFACES_1.get().asItem());
				tabData.accept(FdModBlocks.FFDWALLPOSTERFACES_2.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ANIMATRONICS = REGISTRY.register("animatronics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fd.animatronics")).icon(() -> new ItemStack(FdModItems.FREDDYFAZBEAR_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FdModItems.FREDDYFAZBEAR_SPAWN_EGG.get());
				tabData.accept(FdModItems.BONNIEBUNNY_SPAWN_EGG.get());
				tabData.accept(FdModItems.CHICACHICKEN_SPAWN_EGG.get());
				tabData.accept(FdModItems.FOXY_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FdModItems.CHAIREXECUTION_SPAWN_EGG.get());
			tabData.accept(FdModItems.FREDDYFAZBEARIDLE_SPAWN_EGG.get());
			tabData.accept(FdModItems.BONNIEBUNNYIDLE_SPAWN_EGG.get());
			tabData.accept(FdModItems.CHICACHICKENIDLE_SPAWN_EGG.get());
			tabData.accept(FdModItems.FOXYIDLE_SPAWN_EGG.get());
		}
	}
}
