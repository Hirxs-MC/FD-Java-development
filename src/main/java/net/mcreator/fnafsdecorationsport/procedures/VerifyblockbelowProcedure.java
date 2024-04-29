package net.mcreator.fnafsdecorationsport.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class VerifyblockbelowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
		}
	}
}
