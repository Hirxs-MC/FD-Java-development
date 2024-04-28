package net.mcreator.fnafsdecorationsport.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TestingProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() > 12500 && world.dayTime() < 23000) {
			return true;
		}
		return false;
	}
}
