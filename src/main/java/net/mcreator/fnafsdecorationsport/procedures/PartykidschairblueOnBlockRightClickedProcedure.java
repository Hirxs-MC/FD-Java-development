package net.mcreator.fnafsdecorationsport.procedures;

import net.minecraft.world.entity.Entity;

public class PartykidschairblueOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle() == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
