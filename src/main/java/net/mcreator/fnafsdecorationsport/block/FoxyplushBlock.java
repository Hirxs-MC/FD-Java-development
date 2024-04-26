
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class FoxyplushBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FoxyplushBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound"))))
				.strength(1f, 10f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(5, 0, 4, 11, 7, 10), box(4.5, 7, 4, 11.5, 10, 11), box(4.5, 10, 4, 11.5, 13, 11), box(6.5, 7, 12, 9.5, 9, 14), box(5.5, 7, 11, 10.5, 9, 12), box(3.9, 11.6, 7, 6.9, 14.6, 8), box(3.9, 14.6, 7, 5.9, 15.6, 8),
					box(9.1, 11.6, 7, 12.1, 14.6, 8), box(10.1, 14.6, 7, 12.1, 15.6, 8));
			case NORTH -> Shapes.or(box(5, 0, 6, 11, 7, 12), box(4.5, 7, 5, 11.5, 10, 12), box(4.5, 10, 5, 11.5, 13, 12), box(6.5, 7, 2, 9.5, 9, 4), box(5.5, 7, 4, 10.5, 9, 5), box(9.1, 11.6, 8, 12.1, 14.6, 9), box(10.1, 14.6, 8, 12.1, 15.6, 9),
					box(3.9, 11.6, 8, 6.9, 14.6, 9), box(3.9, 14.6, 8, 5.9, 15.6, 9));
			case EAST -> Shapes.or(box(4, 0, 5, 10, 7, 11), box(4, 7, 4.5, 11, 10, 11.5), box(4, 10, 4.5, 11, 13, 11.5), box(12, 7, 6.5, 14, 9, 9.5), box(11, 7, 5.5, 12, 9, 10.5), box(7, 11.6, 9.1, 8, 14.6, 12.1), box(7, 14.6, 10.1, 8, 15.6, 12.1),
					box(7, 11.6, 3.9, 8, 14.6, 6.9), box(7, 14.6, 3.9, 8, 15.6, 5.9));
			case WEST -> Shapes.or(box(6, 0, 5, 12, 7, 11), box(5, 7, 4.5, 12, 10, 11.5), box(5, 10, 4.5, 12, 13, 11.5), box(2, 7, 6.5, 4, 9, 9.5), box(4, 7, 5.5, 5, 9, 10.5), box(8, 11.6, 3.9, 9, 14.6, 6.9), box(8, 14.6, 3.9, 9, 15.6, 5.9),
					box(8, 11.6, 9.1, 9, 14.6, 12.1), box(8, 14.6, 10.1, 9, 15.6, 12.1));
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
		PlushiesoundProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}