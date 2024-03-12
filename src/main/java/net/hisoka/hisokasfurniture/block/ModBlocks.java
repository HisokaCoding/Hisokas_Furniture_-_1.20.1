package net.hisoka.hisokasfurniture.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.hisoka.hisokasfurniture.block.custom.OakCupboard;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block OAK_CUPBOARD = Registry.register(Registries.BLOCK, new Identifier(HisokasFurniture.MOD_ID,
            "oak_cupboard"), new OakCupboard(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlock(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HisokasFurniture.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HisokasFurniture.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        HisokasFurniture.LOGGER.info("Registering ModBlocks for " + HisokasFurniture.MOD_ID);
    }
}
