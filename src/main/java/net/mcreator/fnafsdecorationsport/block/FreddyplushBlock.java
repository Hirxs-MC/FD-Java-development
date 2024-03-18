
package net.mcreator.fnafsdecorationsport.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafsdecorationsport.procedures.PlushiesoundProcedure;

import java.util.List;
import java.util.Collections;

public class FreddyplushBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FreddyplushBlock() {
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
			default -> Shapes.or(box(4.5, 0, 4, 11.5, 7, 10), box(3.5, 8, 3, 12.5, 11, 11), box(4.5, 11, 4, 11.5, 15, 11), box(5.5, 7, 11, 10.5, 10, 13), box(2.5, 13, 7, 5.5, 16, 8), box(10.5, 13, 7, 13.5, 16, 8), box(5.5, 15, 5, 10.5, 16, 10),
					box(6.5, 16, 6, 9.5, 19, 9), box(4.5, 7, 4, 11.5, 8, 11));
			case NORTH -> Shapes.or(box(4.5, 0, 6, 11.5, 7, 12), box(3.5, 8, 5, 12.5, 11, 13), box(4.5, 11, 5, 11.5, 15, 12), box(5.5, 7, 3, 10.5, 10, 5), box(10.5, 13, 8, 13.5, 16, 9), box(2.5, 13, 8, 5.5, 16, 9), box(5.5, 15, 6, 10.5, 16, 11),
					box(6.5, 16, 7, 9.5, 19, 10), box(4.5, 7, 5, 11.5, 8, 12));
			case EAST -> Shapes.or(box(4, 0, 4.5, 10, 7, 11.5), box(3, 8, 3.5, 11, 11, 12.5), box(4, 11, 4.5, 11, 15, 11.5), box(11, 7, 5.5, 13, 10, 10.5), box(7, 13, 10.5, 8, 16, 13.5), box(7, 13, 2.5, 8, 16, 5.5), box(5, 15, 5.5, 10, 16, 10.5),
					box(6, 16, 6.5, 9, 19, 9.5), box(4, 7, 4.5, 11, 8, 11.5));
			case WEST -> Shapes.or(box(6, 0, 4.5, 12, 7, 11.5), box(5, 8, 3.5, 13, 11, 12.5), box(5, 11, 4.5, 12, 15, 11.5), box(3, 7, 5.5, 5, 10, 10.5), box(8, 13, 2.5, 9, 16, 5.5), box(8, 13, 10.5, 9, 16, 13.5), box(6, 15, 5.5, 11, 16, 10.5),
					box(7, 16, 6.5, 10, 19, 9.5), box(5, 7, 4.5, 12, 8, 11.5));
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
