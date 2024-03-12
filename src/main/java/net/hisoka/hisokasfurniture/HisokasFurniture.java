package net.hisoka.hisokasfurniture;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.hisoka.hisokasfurniture.block.ModBlocks;
import net.hisoka.hisokasfurniture.block.entity.ModBlocksEntities;
import net.hisoka.hisokasfurniture.item.ModItems;
import net.hisoka.hisokasfurniture.item.ModItemsGroups;
import net.hisoka.hisokasfurniture.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class HisokasFurniture implements ModInitializer {
	public static final String MOD_ID = "hisokasfurniture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocksEntities.registerAllBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		FuelRegistry.INSTANCE.add(ModItems.OAK_PLANK,25);
		FuelRegistry.INSTANCE.add(ModItems.OAK_CUPBOARD,200);
	}
}