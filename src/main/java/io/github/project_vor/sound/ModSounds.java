package io.github.project_vor.sound;

import io.github.project_vor.general;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
	public static SoundEvent MUS_DREAMTHEORY = registerSoundEvent("music_disc_dreamtheory");
	public static SoundEvent MUS_BALLISTIC = registerSoundEvent("music_disc_ballistic");
	public static SoundEvent MUS_WILLDELUNE = registerSoundEvent("music_disc_willdelune");

	private static SoundEvent registerSoundEvent(String name) {
		Identifier id = new Identifier(general.MOD_ID, name);
		SoundEvent soundEvent = SoundEvent.createVariableRangeEvent(new Identifier(general.MOD_ID, name));
		Registry.register(Registries.SOUND_EVENT, id, soundEvent);
		return soundEvent;
	}
}
