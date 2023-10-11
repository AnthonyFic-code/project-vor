package io.github.project_vor.item;

import io.github.project_vor.general;
import io.github.project_vor.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	public static final Item EXAMPLE_ITEM = new Item(new QuiltItemSettings());
	public static final Item MEOWSTROGEN = new Item(new QuiltItemSettings());
	public static final Item MUSIC_DISC_DREAMTHEORY = new MusicDiscItem(0, ModSounds.MUS_DREAMTHEORY, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 300);
	public static final Item MUSIC_DISC_BALLISTIC = new MusicDiscItem(0, ModSounds.MUS_BALLISTIC, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 300);
	public static final Item MUSIC_DISC_WILLDELUNE = new MusicDiscItem(0, ModSounds.MUS_WILLDELUNE, new QuiltItemSettings().maxCount(1).rarity(Rarity.RARE), 300);

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(EXAMPLE_ITEM))
			.name(Text.translatable("itemGroup.project_vor"))
			.entries((enabledFeatures, entries) -> {
				entries.addItem(EXAMPLE_ITEM);
				entries.addItem(MEOWSTROGEN);
				entries.addItem(MUSIC_DISC_DREAMTHEORY);
				entries.addItem(MUSIC_DISC_BALLISTIC);
				entries.addItem(MUSIC_DISC_WILLDELUNE);

			})
			.build();

	private static void registerItem(String name, Item item) {
		Registry.register(Registries.ITEM, new Identifier(general.MOD_ID, name), item);
	}

	public static void register() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(general.MOD_ID, "test_group"), ITEM_GROUP);
		registerItem("example_item", EXAMPLE_ITEM);
		registerItem("meowstrogen", MEOWSTROGEN);
		registerItem("music_disc_dreamtheory", MUSIC_DISC_DREAMTHEORY);
		registerItem("music_disc_ballistic", MUSIC_DISC_BALLISTIC);
		registerItem("music_disc_willdelune", MUSIC_DISC_WILLDELUNE);
	}
}
