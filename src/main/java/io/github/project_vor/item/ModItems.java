package io.github.project_vor.item;

import io.github.project_vor.general;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
	// https://github.com/QuiltMC/developer-wiki/issues/47#issuecomment-1575035049
	public static final Item EXAMPLE_ITEM = new Item(new QuiltItemSettings());

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(EXAMPLE_ITEM))
			.name(Text.translatable("itemGroup.test_group"))
			.entries((enabledFeatures, entries) -> {
				entries.addItem(EXAMPLE_ITEM);
			})
			.build();

	private static void registerItem(String name, Item item) {
		Registry.register(Registries.ITEM, new Identifier(general.MOD_ID, name), item);
	}

	public static void register() {
		registerItem("example_item", EXAMPLE_ITEM);
		Registry.register(Registries.ITEM_GROUP, new Identifier(general.MOD_ID, "test_group"), ITEM_GROUP);
	}
}
