
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class OfficelightonBlock extends Block {
	public OfficelightonBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).lightLevel(s -> 14).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(3, 13, 3, 13, 15.9, 13), box(2.7, 12.7, 2.7, 13.3, 16, 13.4), box(2, 15, 2, 14, 16, 14));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}