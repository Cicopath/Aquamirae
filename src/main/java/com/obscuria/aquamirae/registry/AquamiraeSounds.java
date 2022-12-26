
package com.obscuria.aquamirae.registry;

import com.obscuria.aquamirae.AquamiraeMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AquamiraeSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AquamiraeMod.MODID);

	public static final RegistryObject<SoundEvent> ENTITY_GOLDEN_MOTH_CATCH = REGISTRY.register("entity.golden_moth.catch",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.golden_moth.catch")));
	public static final RegistryObject<SoundEvent> ENTITY_GOLDEN_MOTH_AMBIENT = REGISTRY.register("entity.golden_moth.ambient",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.golden_moth.ambient")));
	public static final RegistryObject<SoundEvent> BLOCK_FROZEN_CHEST_UNLOCK = REGISTRY.register("block.frozen_chest.unlock",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "block.frozen_chest.unlock")));
	public static final RegistryObject<SoundEvent> EFFECT_OXYGEN = REGISTRY.register("effect.oxygen",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "effect.oxygen")));
	public static final RegistryObject<SoundEvent> AMBIENT_SHIP_HORN = REGISTRY.register("ambient.ship_horn",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "ambient.ship_horn")));
	public static final RegistryObject<SoundEvent> ITEM_SHELL_HORN_USE = REGISTRY.register("item.shell_horn.use",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "item.shell_horn.use")));
	public static final RegistryObject<SoundEvent> ITEM_TERRIBLE_SWORD = REGISTRY.register("item.terrible_sword",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "item.terrible_sword")));
	public static final RegistryObject<SoundEvent> ITEM_TREASURE_POUCH_OPEN = REGISTRY.register("item.treasure_pouch.open",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "item.treasure_pouch.open")));
	public static final RegistryObject<SoundEvent> ITEM_POUCH_OPEN = REGISTRY.register("item.pouch.open",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "item.pouch.open")));
	public static final RegistryObject<SoundEvent> MUSIC_FORSAKEN_DROWNAGE = REGISTRY.register("music.forsaken_drownage",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "music.forsaken_drownage")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_HORN = REGISTRY.register("entity.captain_cornelia.horn",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.horn")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_ATTACK_1 = REGISTRY.register("entity.captain_cornelia.attack_1",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.attack_1")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_ATTACK_2 = REGISTRY.register("entity.captain_cornelia.attack_2",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.attack_2")));
	public static final RegistryObject<SoundEvent> ENTITY_DEEP_AMBIENT = REGISTRY.register("entity.deep_ambient",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.deep_ambient")));
	public static final RegistryObject<SoundEvent> ENTITY_DEEP_HURT = REGISTRY.register("entity.deep_hurt",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.deep_hurt")));
	public static final RegistryObject<SoundEvent> ENTITY_DEEP_DEATH = REGISTRY.register("entity.deep_death",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.deep_death")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_AMBIENT = REGISTRY.register("entity.captain_cornelia.ambient",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.ambient")));
	public static final RegistryObject<SoundEvent> EFFECT_MYSTERY = REGISTRY.register("effect.mystery",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "effect.mystery")));
	public static final RegistryObject<SoundEvent> ITEM_SCROLL_USE = REGISTRY.register("item.scroll.use",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "item.scroll.use")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_HURT = REGISTRY.register("entity.captain_cornelia.hurt",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.hurt")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_DEATH = REGISTRY.register("entity.captain_cornelia.death",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.death")));
	public static final RegistryObject<SoundEvent> ENTITY_EEL_BITE = REGISTRY.register("entity.eel.bite",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.eel.bite")));
	public static final RegistryObject<SoundEvent> ENTITY_EEL_ROAR = REGISTRY.register("entity.eel.roar",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.eel.roar")));
	public static final RegistryObject<SoundEvent> ENTITY_CAPTAIN_CORNELIA_RAGE = REGISTRY.register("entity.captain_cornelia.rage",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "entity.captain_cornelia.rage")));
	public static final RegistryObject<SoundEvent> MUSIC_ICE_MAZE_THEME = REGISTRY.register("music.ice_maze_theme",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "music.ice_maze_theme")));
	public static final RegistryObject<SoundEvent> RECORD_HORIZON = REGISTRY.register("record.horizon",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "record.horizon")));
	public static final RegistryObject<SoundEvent> RECORD_FORSAKEN_DROWNAGE = REGISTRY.register("record.forsaken_drownage",
			() -> new SoundEvent(new ResourceLocation(AquamiraeMod.MODID, "record.forsaken_drownage")));
}
