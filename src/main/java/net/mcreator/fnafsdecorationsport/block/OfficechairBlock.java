
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafsdecorationsport.procedures.BlockofficechairProcedure;

import java.util.List;

public class OfficechairBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public OfficechairBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u963F (without variations)"));
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
				Shapes.or(box(7, 1, 7, 9, 7, 9), box(7, 0, 2, 9, 2, 4), box(7, 0, 12, 9, 2, 14), box(7, 0, 12, 9, 2, 14), box(7, 0, 2, 9, 2, 4), box(2, 11.2, 0.84, 14, 18.4, 3.24), box(2, 19.6, -1.56, 14, 26.8, 0.84), box(2, 7.4, 2, 14, 9.8, 12.8));
			case NORTH -> Shapes.or(box(7, 1, 7, 9, 7, 9), box(7, 0, 12, 9, 2, 14), box(7, 0, 2, 9, 2, 4), box(7, 0, 2, 9, 2, 4), box(7, 0, 12, 9, 2, 14), box(2, 11.2, 12.76, 14, 18.4, 15.16), box(2, 19.6, 15.16, 14, 26.8, 17.56),
					box(2, 7.4, 3.2, 14, 9.8, 14));
			case EAST ->
				Shapes.or(box(7, 1, 7, 9, 7, 9), box(2, 0, 7, 4, 2, 9), box(12, 0, 7, 14, 2, 9), box(12, 0, 7, 14, 2, 9), box(2, 0, 7, 4, 2, 9), box(0.84, 11.2, 2, 3.24, 18.4, 14), box(-1.56, 19.6, 2, 0.84, 26.8, 14), box(2, 7.4, 2, 12.8, 9.8, 14));
			case WEST -> Shapes.or(box(7, 1, 7, 9, 7, 9), box(12, 0, 7, 14, 2, 9), box(2, 0, 7, 4, 2, 9), box(2, 0, 7, 4, 2, 9), box(12, 0, 7, 14, 2, 9), box(12.76, 11.2, 2, 15.16, 18.4, 14), box(15.16, 19.6, 2, 17.56, 26.8, 14),
					box(3.2, 7.4, 2, 14, 9.8, 14));
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
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		BlockofficechairProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
