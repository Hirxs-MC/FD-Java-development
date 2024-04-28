
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fnafsdecorationsport.block.entity.Partybanner2TileEntity;
import net.mcreator.fnafsdecorationsport.block.entity.Partybanner1TileEntity;
import net.mcreator.fnafsdecorationsport.block.entity.CarouselTileEntity;
import net.mcreator.fnafsdecorationsport.FdMod;

public class FdModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FdMod.MODID);
	public static final RegistryObject<BlockEntityType<Partybanner1TileEntity>> PARTYBANNER_1 = REGISTRY.register("partybanner_1", () -> BlockEntityType.Builder.of(Partybanner1TileEntity::new, FdModBlocks.PARTYBANNER_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Partybanner2TileEntity>> PARTYBANNER_2 = REGISTRY.register("partybanner_2", () -> BlockEntityType.Builder.of(Partybanner2TileEntity::new, FdModBlocks.PARTYBANNER_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarouselTileEntity>> CAROUSEL = REGISTRY.register("carousel", () -> BlockEntityType.Builder.of(CarouselTileEntity::new, FdModBlocks.CAROUSEL.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
