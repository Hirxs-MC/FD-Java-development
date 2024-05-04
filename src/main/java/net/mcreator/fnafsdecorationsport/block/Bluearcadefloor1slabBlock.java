
package net.mcreator.fnafsdecorationsport.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class Bluearcadefloor1slabBlock extends SlabBlock {
	public Bluearcadefloor1slabBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1f, 10f).dynamicShape());
	}
}
