
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

public class SpringbonnieplushBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SpringbonnieplushBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fd:plushie_sound"))))
				.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(4.5, 0, 5, 11.5, 7, 11), box(3.5, 8, 4, 12.5, 11, 12), box(4.5, 11, 5, 11.5, 15, 12), box(5.5, 6, 12, 10.5, 10, 14), box(4.5, 15, 8, 7.5, 18, 9), box(8.5, 15, 8, 11.5, 18, 9), box(8.5, 18, 8, 11.5, 22, 9),
					box(4.5, 18, 8, 7.5, 22, 9), box(4.5, 7, 5, 11.5, 8, 12));
			case NORTH -> Shapes.or(box(4.5, 0, 5, 11.5, 7, 11), box(3.5, 8, 4, 12.5, 11, 12), box(4.5, 11, 4, 11.5, 15, 11), box(5.5, 6, 2, 10.5, 10, 4), box(8.5, 15, 7, 11.5, 18, 8), box(4.5, 15, 7, 7.5, 18, 8), box(4.5, 18, 7, 7.5, 22, 8),
					box(8.5, 18, 7, 11.5, 22, 8), box(4.5, 7, 4, 11.5, 8, 11));
			case EAST -> Shapes.or(box(5, 0, 4.5, 11, 7, 11.5), box(4, 8, 3.5, 12, 11, 12.5), box(5, 11, 4.5, 12, 15, 11.5), box(12, 6, 5.5, 14, 10, 10.5), box(8, 15, 8.5, 9, 18, 11.5), box(8, 15, 4.5, 9, 18, 7.5), box(8, 18, 4.5, 9, 22, 7.5),
					box(8, 18, 8.5, 9, 22, 11.5), box(5, 7, 4.5, 12, 8, 11.5));
			case WEST -> Shapes.or(box(5, 0, 4.5, 11, 7, 11.5), box(4, 8, 3.5, 12, 11, 12.5), box(4, 11, 4.5, 11, 15, 11.5), box(2, 6, 5.5, 4, 10, 10.5), box(7, 15, 4.5, 8, 18, 7.5), box(7, 15, 8.5, 8, 18, 11.5), box(7, 18, 8.5, 8, 22, 11.5),
					box(7, 18, 4.5, 8, 22, 7.5), box(4, 7, 4.5, 11, 8, 11.5));
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
