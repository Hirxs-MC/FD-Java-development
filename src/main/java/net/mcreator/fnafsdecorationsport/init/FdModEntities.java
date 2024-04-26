
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafsdecorationsport.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafsdecorationsport.entity.ToychicashowtimeEntity;
import net.mcreator.fnafsdecorationsport.entity.FreddyfazbearidleEntity;
import net.mcreator.fnafsdecorationsport.entity.FreddyfazbearEntity;
import net.mcreator.fnafsdecorationsport.entity.FoxyidleEntity;
import net.mcreator.fnafsdecorationsport.entity.FoxyEntity;
import net.mcreator.fnafsdecorationsport.entity.ChicachickenidleEntity;
import net.mcreator.fnafsdecorationsport.entity.ChicachickenEntity;
import net.mcreator.fnafsdecorationsport.entity.ChairexecutionEntity;
import net.mcreator.fnafsdecorationsport.entity.BonniebunnyidleEntity;
import net.mcreator.fnafsdecorationsport.entity.BonniebunnyEntity;
import net.mcreator.fnafsdecorationsport.FdMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FdModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FdMod.MODID);
	public static final RegistryObject<EntityType<ChairexecutionEntity>> CHAIREXECUTION = register("chairexecution",
			EntityType.Builder.<ChairexecutionEntity>of(ChairexecutionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChairexecutionEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<FreddyfazbearEntity>> FREDDYFAZBEAR = register("freddyfazbear", EntityType.Builder.<FreddyfazbearEntity>of(FreddyfazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyfazbearEntity::new).fireImmune().sized(0.5f, 2.2f));
	public static final RegistryObject<EntityType<BonniebunnyEntity>> BONNIEBUNNY = register("bonniebunny", EntityType.Builder.<BonniebunnyEntity>of(BonniebunnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonniebunnyEntity::new).fireImmune().sized(0.5f, 2.2f));
	public static final RegistryObject<EntityType<FreddyfazbearidleEntity>> FREDDYFAZBEARIDLE = register("freddyfazbearidle",
			EntityType.Builder.<FreddyfazbearidleEntity>of(FreddyfazbearidleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyfazbearidleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonniebunnyidleEntity>> BONNIEBUNNYIDLE = register("bonniebunnyidle",
			EntityType.Builder.<BonniebunnyidleEntity>of(BonniebunnyidleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonniebunnyidleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChicachickenEntity>> CHICACHICKEN = register("chicachicken", EntityType.Builder.<ChicachickenEntity>of(ChicachickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChicachickenEntity::new).fireImmune().sized(0.5f, 2.2f));
	public static final RegistryObject<EntityType<ChicachickenidleEntity>> CHICACHICKENIDLE = register("chicachickenidle",
			EntityType.Builder.<ChicachickenidleEntity>of(ChicachickenidleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChicachickenidleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FoxyEntity>> FOXY = register("foxy",
			EntityType.Builder.<FoxyEntity>of(FoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoxyEntity::new).fireImmune().sized(0.5f, 2.2f));
	public static final RegistryObject<EntityType<FoxyidleEntity>> FOXYIDLE = register("foxyidle",
			EntityType.Builder.<FoxyidleEntity>of(FoxyidleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoxyidleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToychicashowtimeEntity>> TOYCHICASHOWTIME = register("toychicashowtime",
			EntityType.Builder.<ToychicashowtimeEntity>of(ToychicashowtimeEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToychicashowtimeEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ChairexecutionEntity.init();
			FreddyfazbearEntity.init();
			BonniebunnyEntity.init();
			FreddyfazbearidleEntity.init();
			BonniebunnyidleEntity.init();
			ChicachickenEntity.init();
			ChicachickenidleEntity.init();
			FoxyEntity.init();
			FoxyidleEntity.init();
			ToychicashowtimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHAIREXECUTION.get(), ChairexecutionEntity.createAttributes().build());
		event.put(FREDDYFAZBEAR.get(), FreddyfazbearEntity.createAttributes().build());
		event.put(BONNIEBUNNY.get(), BonniebunnyEntity.createAttributes().build());
		event.put(FREDDYFAZBEARIDLE.get(), FreddyfazbearidleEntity.createAttributes().build());
		event.put(BONNIEBUNNYIDLE.get(), BonniebunnyidleEntity.createAttributes().build());
		event.put(CHICACHICKEN.get(), ChicachickenEntity.createAttributes().build());
		event.put(CHICACHICKENIDLE.get(), ChicachickenidleEntity.createAttributes().build());
		event.put(FOXY.get(), FoxyEntity.createAttributes().build());
		event.put(FOXYIDLE.get(), FoxyidleEntity.createAttributes().build());
		event.put(TOYCHICASHOWTIME.get(), ToychicashowtimeEntity.createAttributes().build());
	}
}
