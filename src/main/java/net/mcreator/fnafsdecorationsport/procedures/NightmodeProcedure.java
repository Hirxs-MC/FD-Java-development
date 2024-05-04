package net.mcreator.fnafsdecorationsport.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;

public class NightmodeProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		BlockState wheatBlock = Blocks.AIR.defaultBlockState();
		if (world.dayTime() > 12500 && world.dayTime() < 23000) {
			return true;
		}
		return false;
	}
}
