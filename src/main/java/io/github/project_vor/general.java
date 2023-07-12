package io.github.project_vor;

import io.github.project_vor.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class general implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Project VOR");
	public static final String MOD_ID = "project_vor";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		ModItems.register();
	}
}
