
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ChicabetaplushBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ChicabetaplushBlock() {
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
			default -> Shapes.or(box(4.5, 0, 5, 11.5, 7, 10), box(4.5, 7, 4, 11.5, 10, 11), box(4.5, 10, 4, 11.5, 14, 11), box(6, 7, 11, 10, 9, 13), box(7, 9, 11, 9, 10, 12));
			case NORTH -> Shapes.or(box(4.5, 0, 6, 11.5, 7, 11), box(4.5, 7, 5, 11.5, 10, 12), box(4.5, 10, 5, 11.5, 14, 12), box(6, 7, 3, 10, 9, 5), box(7, 9, 4, 9, 10, 5));
			case EAST -> Shapes.or(box(5, 0, 4.5, 10, 7, 11.5), box(4, 7, 4.5, 11, 10, 11.5), box(4, 10, 4.5, 11, 14, 11.5), box(11, 7, 6, 13, 9, 10), box(11, 9, 7, 12, 10, 9));
			case WEST -> Shapes.or(box(6, 0, 4.5, 11, 7, 11.5), box(5, 7, 4.5, 12, 10, 11.5), box(5, 10, 4.5, 12, 14, 11.5), box(3, 7, 6, 5, 9, 10), box(4, 9, 7, 5, 10, 9));
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