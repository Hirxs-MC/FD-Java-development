
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.fnafsdecorationsport.FdMod;

public class FdModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FdMod.MODID);
	public static final RegistryObject<SimpleParticleType> CHANGERTOOLSPARKLES = REGISTRY.register("changertoolsparkles", () -> new SimpleParticleType(true));
}
