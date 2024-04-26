
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class BobbleheadsBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BobbleheadsBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(2.645, 0.63, 3.59, 4.535, 3.15, 5.48), box(7.055, 0.63, 3.59, 8.945, 3.15, 5.48), box(11.465, 0.63, 3.59, 13.355, 3.15, 5.48), box(3.905, 6.3, 4.22, 5.165, 8.82, 4.85), box(11.465, 6.3, 4.22, 13.355, 8.82, 4.85),
					box(7.055, 6.3, 3.59, 8.945, 8.82, 5.48), box(6.929, 6.3, 3.464, 9.071, 6.93, 5.606), box(2.015, 6.3, 4.22, 3.275, 8.82, 4.85), box(2.015, 3.15, 2.96, 5.165, 6.3, 6.11), box(6.425, 3.15, 2.96, 9.575, 6.3, 6.11),
					box(10.835, 3.15, 2.96, 13.985, 6.3, 6.11), box(4.535, 1.89, 4.22, 5.795, 2.52, 6.11), box(3.716, 0, 4.22, 5.354, 0.63, 6.11), box(6.425, 1.575, 4.22, 7.055, 2.835, 6.11), box(8.945, 1.575, 4.22, 9.575, 2.835, 6.11),
					box(13.355, 0.945, 4.22, 13.985, 2.835, 6.11), box(10.835, 0.945, 4.22, 11.465, 2.835, 6.11), box(1.385, 1.89, 4.22, 2.645, 2.52, 6.11), box(1.826, 0, 4.22, 3.464, 0.63, 6.11), box(2.645, 3.15, 6.11, 4.535, 4.41, 6.74),
					box(11.015, 4.41, 6.11, 12.275, 5.67, 6.299), box(12.905, 4.41, 6.11, 14.165, 5.67, 6.299), box(8.495, 4.41, 6.11, 9.755, 5.67, 6.299), box(6.605, 4.41, 6.11, 7.865, 5.67, 6.299), box(4.085, 4.41, 6.11, 5.345, 5.67, 6.299),
					box(2.195, 4.41, 6.11, 3.455, 5.67, 6.299), box(7.055, 3.15, 6.11, 8.945, 4.41, 6.74), box(8.315, 5.418, 4.22, 10.205, 6.678, 4.85), box(5.795, 5.418, 4.22, 7.685, 6.678, 4.85), box(11.465, 3.15, 6.11, 13.355, 4.41, 7.37),
					box(6.236, 0, 4.22, 7.874, 0.63, 6.11), box(8.126, 0, 4.22, 9.764, 0.63, 6.11), box(10.646, 0, 4.22, 12.284, 0.63, 6.11), box(12.536, 0, 4.22, 14.174, 0.63, 6.11));
			case NORTH -> Shapes.or(box(11.465, 0.63, 10.52, 13.355, 3.15, 12.41), box(7.055, 0.63, 10.52, 8.945, 3.15, 12.41), box(2.645, 0.63, 10.52, 4.535, 3.15, 12.41), box(10.835, 6.3, 11.15, 12.095, 8.82, 11.78),
					box(2.645, 6.3, 11.15, 4.535, 8.82, 11.78), box(7.055, 6.3, 10.52, 8.945, 8.82, 12.41), box(6.929, 6.3, 10.394, 9.071, 6.93, 12.536), box(12.725, 6.3, 11.15, 13.985, 8.82, 11.78), box(10.835, 3.15, 9.89, 13.985, 6.3, 13.04),
					box(6.425, 3.15, 9.89, 9.575, 6.3, 13.04), box(2.015, 3.15, 9.89, 5.165, 6.3, 13.04), box(10.205, 1.89, 9.89, 11.465, 2.52, 11.78), box(10.646, 0, 9.89, 12.284, 0.63, 11.78), box(8.945, 1.575, 9.89, 9.575, 2.835, 11.78),
					box(6.425, 1.575, 9.89, 7.055, 2.835, 11.78), box(2.015, 0.945, 9.89, 2.645, 2.835, 11.78), box(4.535, 0.945, 9.89, 5.165, 2.835, 11.78), box(13.355, 1.89, 9.89, 14.615, 2.52, 11.78), box(12.536, 0, 9.89, 14.174, 0.63, 11.78),
					box(11.465, 3.15, 9.26, 13.355, 4.41, 9.89), box(3.725, 4.41, 9.701, 4.985, 5.67, 9.89), box(1.835, 4.41, 9.701, 3.095, 5.67, 9.89), box(6.245, 4.41, 9.701, 7.505, 5.67, 9.89), box(8.135, 4.41, 9.701, 9.395, 5.67, 9.89),
					box(10.655, 4.41, 9.701, 11.915, 5.67, 9.89), box(12.545, 4.41, 9.701, 13.805, 5.67, 9.89), box(7.055, 3.15, 9.26, 8.945, 4.41, 9.89), box(5.795, 5.418, 11.15, 7.685, 6.678, 11.78), box(8.315, 5.418, 11.15, 10.205, 6.678, 11.78),
					box(2.645, 3.15, 8.63, 4.535, 4.41, 9.89), box(8.126, 0, 9.89, 9.764, 0.63, 11.78), box(6.236, 0, 9.89, 7.874, 0.63, 11.78), box(3.716, 0, 9.89, 5.354, 0.63, 11.78), box(1.826, 0, 9.89, 3.464, 0.63, 11.78));
			case EAST -> Shapes.or(box(3.59, 0.63, 11.465, 5.48, 3.15, 13.355), box(3.59, 0.63, 7.055, 5.48, 3.15, 8.945), box(3.59, 0.63, 2.645, 5.48, 3.15, 4.535), box(4.22, 6.3, 10.835, 4.85, 8.82, 12.095),
					box(4.22, 6.3, 2.645, 4.85, 8.82, 4.535), box(3.59, 6.3, 7.055, 5.48, 8.82, 8.945), box(3.464, 6.3, 6.929, 5.606, 6.93, 9.071), box(4.22, 6.3, 12.725, 4.85, 8.82, 13.985), box(2.96, 3.15, 10.835, 6.11, 6.3, 13.985),
					box(2.96, 3.15, 6.425, 6.11, 6.3, 9.575), box(2.96, 3.15, 2.015, 6.11, 6.3, 5.165), box(4.22, 1.89, 10.205, 6.11, 2.52, 11.465), box(4.22, 0, 10.646, 6.11, 0.63, 12.284), box(4.22, 1.575, 8.945, 6.11, 2.835, 9.575),
					box(4.22, 1.575, 6.425, 6.11, 2.835, 7.055), box(4.22, 0.945, 2.015, 6.11, 2.835, 2.645), box(4.22, 0.945, 4.535, 6.11, 2.835, 5.165), box(4.22, 1.89, 13.355, 6.11, 2.52, 14.615), box(4.22, 0, 12.536, 6.11, 0.63, 14.174),
					box(6.11, 3.15, 11.465, 6.74, 4.41, 13.355), box(6.11, 4.41, 3.725, 6.299, 5.67, 4.985), box(6.11, 4.41, 1.835, 6.299, 5.67, 3.095), box(6.11, 4.41, 6.245, 6.299, 5.67, 7.505), box(6.11, 4.41, 8.135, 6.299, 5.67, 9.395),
					box(6.11, 4.41, 10.655, 6.299, 5.67, 11.915), box(6.11, 4.41, 12.545, 6.299, 5.67, 13.805), box(6.11, 3.15, 7.055, 6.74, 4.41, 8.945), box(4.22, 5.418, 5.795, 4.85, 6.678, 7.685), box(4.22, 5.418, 8.315, 4.85, 6.678, 10.205),
					box(6.11, 3.15, 2.645, 7.37, 4.41, 4.535), box(4.22, 0, 8.126, 6.11, 0.63, 9.764), box(4.22, 0, 6.236, 6.11, 0.63, 7.874), box(4.22, 0, 3.716, 6.11, 0.63, 5.354), box(4.22, 0, 1.826, 6.11, 0.63, 3.464));
			case WEST -> Shapes.or(box(10.52, 0.63, 2.645, 12.41, 3.15, 4.535), box(10.52, 0.63, 7.055, 12.41, 3.15, 8.945), box(10.52, 0.63, 11.465, 12.41, 3.15, 13.355), box(11.15, 6.3, 3.905, 11.78, 8.82, 5.165),
					box(11.15, 6.3, 11.465, 11.78, 8.82, 13.355), box(10.52, 6.3, 7.055, 12.41, 8.82, 8.945), box(10.394, 6.3, 6.929, 12.536, 6.93, 9.071), box(11.15, 6.3, 2.015, 11.78, 8.82, 3.275), box(9.89, 3.15, 2.015, 13.04, 6.3, 5.165),
					box(9.89, 3.15, 6.425, 13.04, 6.3, 9.575), box(9.89, 3.15, 10.835, 13.04, 6.3, 13.985), box(9.89, 1.89, 4.535, 11.78, 2.52, 5.795), box(9.89, 0, 3.716, 11.78, 0.63, 5.354), box(9.89, 1.575, 6.425, 11.78, 2.835, 7.055),
					box(9.89, 1.575, 8.945, 11.78, 2.835, 9.575), box(9.89, 0.945, 13.355, 11.78, 2.835, 13.985), box(9.89, 0.945, 10.835, 11.78, 2.835, 11.465), box(9.89, 1.89, 1.385, 11.78, 2.52, 2.645), box(9.89, 0, 1.826, 11.78, 0.63, 3.464),
					box(9.26, 3.15, 2.645, 9.89, 4.41, 4.535), box(9.701, 4.41, 11.015, 9.89, 5.67, 12.275), box(9.701, 4.41, 12.905, 9.89, 5.67, 14.165), box(9.701, 4.41, 8.495, 9.89, 5.67, 9.755), box(9.701, 4.41, 6.605, 9.89, 5.67, 7.865),
					box(9.701, 4.41, 4.085, 9.89, 5.67, 5.345), box(9.701, 4.41, 2.195, 9.89, 5.67, 3.455), box(9.26, 3.15, 7.055, 9.89, 4.41, 8.945), box(11.15, 5.418, 8.315, 11.78, 6.678, 10.205), box(11.15, 5.418, 5.795, 11.78, 6.678, 7.685),
					box(8.63, 3.15, 11.465, 9.89, 4.41, 13.355), box(9.89, 0, 6.236, 11.78, 0.63, 7.874), box(9.89, 0, 8.126, 11.78, 0.63, 9.764), box(9.89, 0, 10.646, 11.78, 0.63, 12.284), box(9.89, 0, 12.536, 11.78, 0.63, 14.174));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
