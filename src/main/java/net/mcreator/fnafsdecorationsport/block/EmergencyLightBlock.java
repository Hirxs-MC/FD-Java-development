
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
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafsdecorationsport.procedures.EmergencylightoffProcedure;

public class EmergencyLightBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public EmergencyLightBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
			default -> Shapes.or(box(5, 5, -1, 11, 11, 1), box(5.5, 5.5, 1, 10.5, 10.5, 7), box(6, 6, 1, 10, 10, 6));
			case NORTH -> Shapes.or(box(5, 5, 15, 11, 11, 17), box(5.5, 5.5, 9, 10.5, 10.5, 15), box(6, 6, 10, 10, 10, 15));
			case EAST -> Shapes.or(box(-1, 5, 5, 1, 11, 11), box(1, 5.5, 5.5, 7, 10.5, 10.5), box(1, 6, 6, 6, 10, 10));
			case WEST -> Shapes.or(box(15, 5, 5, 17, 11, 11), box(9, 5.5, 5.5, 15, 10.5, 10.5), box(10, 6, 6, 15, 10, 10));
			case UP -> Shapes.or(box(5, -1, 5, 11, 1, 11), box(5.5, 1, 5.5, 10.5, 7, 10.5), box(6, 1, 6, 10, 6, 10));
			case DOWN -> Shapes.or(box(5, 15, 5, 11, 17, 11), box(5.5, 9, 5.5, 10.5, 15, 10.5), box(6, 10, 6, 10, 15, 10));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
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
		EmergencylightoffProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}
