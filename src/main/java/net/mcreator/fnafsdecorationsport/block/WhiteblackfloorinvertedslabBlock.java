
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WhiteblackfloorinvertedslabBlock extends SlabBlock {
	public WhiteblackfloorinvertedslabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE_BRICKS).strength(1f, 10f).dynamicShape());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}
}