
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
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

public class OfficewindowBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public OfficewindowBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default ->
				Shapes.or(box(-6, 2, 2.5, 8, 16, 13.5), box(-6, 16, 2.5, 8, 30, 13.5), box(-9, 0, 3, -6, 16, 13), box(-9, 1, -1, -6, 16, 3), box(-9, -1, 3, 8, 2, 13), box(-9, -1, 13, 8, 2, 17), box(-16, 0, 0, -9, 16, 16), box(-16, 16, 0, -9, 32, 16),
						box(25, 16, 0, 32, 32, 16), box(-9, 1, 13, -6, 16, 17), box(-9, -1, -1, 8, 2, 3), box(-9, 16, 3, -6, 32, 13), box(-9, 16, 13, -6, 31, 17), box(-9, 29, 3, 8, 32, 13), box(-9, 29, -1, 8, 32, 3), box(-9, 16, -1, -6, 31, 3),
						box(-9, 29, 13, 8, 32, 17), box(8, 2, 2.5, 22, 16, 13.5), box(8, 16, 2.5, 22, 30, 13.5), box(22, 0, 3, 25, 16, 13), box(22, 1, 13, 25, 16, 17), box(8, -1, 3, 25, 2, 13), box(8, -1, -1, 25, 2, 3), box(25, 0, 0, 32, 16, 16),
						box(22, 1, -1, 25, 16, 3), box(8, -1, 13, 25, 2, 17), box(22, 16, 3, 25, 32, 13), box(22, 16, -1, 25, 31, 3), box(8, 29, 3, 25, 32, 13), box(8, 29, 13, 25, 32, 17), box(22, 16, 13, 25, 31, 17), box(8, 29, -1, 25, 32, 3));
			case NORTH ->
				Shapes.or(box(8, 2, 2.5, 22, 16, 13.5), box(8, 16, 2.5, 22, 30, 13.5), box(22, 0, 3, 25, 16, 13), box(22, 1, 13, 25, 16, 17), box(8, -1, 3, 25, 2, 13), box(8, -1, -1, 25, 2, 3), box(25, 0, 0, 32, 16, 16), box(25, 16, 0, 32, 32, 16),
						box(-16, 16, 0, -9, 32, 16), box(22, 1, -1, 25, 16, 3), box(8, -1, 13, 25, 2, 17), box(22, 16, 3, 25, 32, 13), box(22, 16, -1, 25, 31, 3), box(8, 29, 3, 25, 32, 13), box(8, 29, 13, 25, 32, 17), box(22, 16, 13, 25, 31, 17),
						box(8, 29, -1, 25, 32, 3), box(-6, 2, 2.5, 8, 16, 13.5), box(-6, 16, 2.5, 8, 30, 13.5), box(-9, 0, 3, -6, 16, 13), box(-9, 1, -1, -6, 16, 3), box(-9, -1, 3, 8, 2, 13), box(-9, -1, 13, 8, 2, 17), box(-16, 0, 0, -9, 16, 16),
						box(-9, 1, 13, -6, 16, 17), box(-9, -1, -1, 8, 2, 3), box(-9, 16, 3, -6, 32, 13), box(-9, 16, 13, -6, 31, 17), box(-9, 29, 3, 8, 32, 13), box(-9, 29, -1, 8, 32, 3), box(-9, 16, -1, -6, 31, 3), box(-9, 29, 13, 8, 32, 17));
			case EAST ->
				Shapes.or(box(2.5, 2, 8, 13.5, 16, 22), box(2.5, 16, 8, 13.5, 30, 22), box(3, 0, 22, 13, 16, 25), box(-1, 1, 22, 3, 16, 25), box(3, -1, 8, 13, 2, 25), box(13, -1, 8, 17, 2, 25), box(0, 0, 25, 16, 16, 32), box(0, 16, 25, 16, 32, 32),
						box(0, 16, -16, 16, 32, -9), box(13, 1, 22, 17, 16, 25), box(-1, -1, 8, 3, 2, 25), box(3, 16, 22, 13, 32, 25), box(13, 16, 22, 17, 31, 25), box(3, 29, 8, 13, 32, 25), box(-1, 29, 8, 3, 32, 25), box(-1, 16, 22, 3, 31, 25),
						box(13, 29, 8, 17, 32, 25), box(2.5, 2, -6, 13.5, 16, 8), box(2.5, 16, -6, 13.5, 30, 8), box(3, 0, -9, 13, 16, -6), box(13, 1, -9, 17, 16, -6), box(3, -1, -9, 13, 2, 8), box(-1, -1, -9, 3, 2, 8), box(0, 0, -16, 16, 16, -9),
						box(-1, 1, -9, 3, 16, -6), box(13, -1, -9, 17, 2, 8), box(3, 16, -9, 13, 32, -6), box(-1, 16, -9, 3, 31, -6), box(3, 29, -9, 13, 32, 8), box(13, 29, -9, 17, 32, 8), box(13, 16, -9, 17, 31, -6), box(-1, 29, -9, 3, 32, 8));
			case WEST ->
				Shapes.or(box(2.5, 2, -6, 13.5, 16, 8), box(2.5, 16, -6, 13.5, 30, 8), box(3, 0, -9, 13, 16, -6), box(13, 1, -9, 17, 16, -6), box(3, -1, -9, 13, 2, 8), box(-1, -1, -9, 3, 2, 8), box(0, 0, -16, 16, 16, -9), box(0, 16, -16, 16, 32, -9),
						box(0, 16, 25, 16, 32, 32), box(-1, 1, -9, 3, 16, -6), box(13, -1, -9, 17, 2, 8), box(3, 16, -9, 13, 32, -6), box(-1, 16, -9, 3, 31, -6), box(3, 29, -9, 13, 32, 8), box(13, 29, -9, 17, 32, 8), box(13, 16, -9, 17, 31, -6),
						box(-1, 29, -9, 3, 32, 8), box(2.5, 2, 8, 13.5, 16, 22), box(2.5, 16, 8, 13.5, 30, 22), box(3, 0, 22, 13, 16, 25), box(-1, 1, 22, 3, 16, 25), box(3, -1, 8, 13, 2, 25), box(13, -1, 8, 17, 2, 25), box(0, 0, 25, 16, 16, 32),
						box(13, 1, 22, 17, 16, 25), box(-1, -1, 8, 3, 2, 25), box(3, 16, 22, 13, 32, 25), box(13, 16, 22, 17, 31, 25), box(3, 29, 8, 13, 32, 25), box(-1, 29, 8, 3, 32, 25), box(-1, 16, 22, 3, 31, 25), box(13, 29, 8, 17, 32, 25));
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
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
