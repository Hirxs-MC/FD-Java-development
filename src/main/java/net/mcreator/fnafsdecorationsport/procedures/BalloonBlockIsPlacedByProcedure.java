package net.mcreator.fnafsdecorationsport.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafsdecorationsport.init.FdModBlocks;

public class BalloonBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FdModBlocks.BALLOON.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(FdModBlocks.BALLOON_1UP.get().defaultBlockState(), "half", "upper")), 3);
	}
}
