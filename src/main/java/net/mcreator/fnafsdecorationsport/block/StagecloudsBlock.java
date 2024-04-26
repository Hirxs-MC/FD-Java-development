
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class StagecloudsBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public StagecloudsBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
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
			default -> Shapes.or(box(9, -1, 0.7, 20, 11, 1.3), box(7.8, -1.6, 0.9, 20, 11.7, 1.5), box(2, 2, 0.2, 15, 15, 0.8), box(1.4, 1.4, 0.4, 15.6, 15.7, 1), box(5, -1, 1.2, 13, 7, 1.8), box(4.4, -1.6, 1.4, 13.6, 7.7, 2),
					box(-6, 0, 1.2, 1, 7, 1.8), box(-6.6, -0.6, 1.4, 1.6, 7.7, 2), box(-2, -1, 0.7, 7, 9, 1.3), box(-2.6, -1.6, 0.9, 7.6, 9.7, 1.5));
			case NORTH -> Shapes.or(box(-4, -1, 14.7, 7, 11, 15.3), box(-4, -1.6, 14.5, 8.2, 11.7, 15.1), box(1, 2, 15.2, 14, 15, 15.8), box(0.4, 1.4, 15, 14.6, 15.7, 15.6), box(3, -1, 14.2, 11, 7, 14.8), box(2.4, -1.6, 14, 11.6, 7.7, 14.6),
					box(15, 0, 14.2, 22, 7, 14.8), box(14.4, -0.6, 14, 22.6, 7.7, 14.6), box(9, -1, 14.7, 18, 9, 15.3), box(8.4, -1.6, 14.5, 18.6, 9.7, 15.1));
			case EAST -> Shapes.or(box(0.7, -1, -4, 1.3, 11, 7), box(0.9, -1.6, -4, 1.5, 11.7, 8.2), box(0.2, 2, 1, 0.8, 15, 14), box(0.4, 1.4, 0.4, 1, 15.7, 14.6), box(1.2, -1, 3, 1.8, 7, 11), box(1.4, -1.6, 2.4, 2, 7.7, 11.6),
					box(1.2, 0, 15, 1.8, 7, 22), box(1.4, -0.6, 14.4, 2, 7.7, 22.6), box(0.7, -1, 9, 1.3, 9, 18), box(0.9, -1.6, 8.4, 1.5, 9.7, 18.6));
			case WEST -> Shapes.or(box(14.7, -1, 9, 15.3, 11, 20), box(14.5, -1.6, 7.8, 15.1, 11.7, 20), box(15.2, 2, 2, 15.8, 15, 15), box(15, 1.4, 1.4, 15.6, 15.7, 15.6), box(14.2, -1, 5, 14.8, 7, 13), box(14, -1.6, 4.4, 14.6, 7.7, 13.6),
					box(14.2, 0, -6, 14.8, 7, 1), box(14, -0.6, -6.6, 14.6, 7.7, 1.6), box(14.7, -1, -2, 15.3, 9, 7), box(14.5, -1.6, -2.6, 15.1, 9.7, 7.6));
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