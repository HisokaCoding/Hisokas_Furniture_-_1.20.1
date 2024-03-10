package net.hisoka.hisokasfurniture;

import net.fabricmc.api.ModInitializer;

import net.hisoka.hisokasfurniture.item.ModItems;
import net.hisoka.hisokasfurniture.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HisokasFurniture implements ModInitializer {
	public static final String MOD_ID = "hisokasfurniture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}