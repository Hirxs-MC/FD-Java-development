
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafsdecorationsport.FdMod;

public class FdModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FdMod.MODID);
	public static final RegistryObject<SoundEvent> PLUSHIE_SOUND = REGISTRY.register("plushie_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fd", "plushie_sound")));
}
