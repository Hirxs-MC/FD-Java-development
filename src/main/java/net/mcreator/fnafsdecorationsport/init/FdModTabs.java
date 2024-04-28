
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FdModTabs {
	public static CreativeModeTab TAB_FNAFS_DECORATIONS;
	public static CreativeModeTab TAB_FD_WALLS;
	public static CreativeModeTab TAB_FDPOSTERS;
	public static CreativeModeTab TAB_ANIMATRONICS;
	public static CreativeModeTab TAB_TOOLKITANDMORE;

	public static void load() {
		TAB_FNAFS_DECORATIONS = new CreativeModeTab("tabfnafs_decorations") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FdModBlocks.CUPCAKE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FD_WALLS = new CreativeModeTab("tabfd_walls") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FdModBlocks.FLOORBLUE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FDPOSTERS = new CreativeModeTab("tabfdposters") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FdModBlocks.WALLPOSTERFACESF.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ANIMATRONICS = new CreativeModeTab("tabanimatronics") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FdModItems.FREDDYFAZBEAR_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLKITANDMORE = new CreativeModeTab("tabtoolkitandmore") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FdModItems.CHANGERTOOL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
