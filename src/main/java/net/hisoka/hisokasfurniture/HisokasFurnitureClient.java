package net.hisoka.hisokasfurniture;

import net.fabricmc.api.ClientModInitializer;
import net.hisoka.hisokasfurniture.block.entity.ModBlocksEntities;
import net.hisoka.hisokasfurniture.block.entity.client.OakCupboardRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class HisokasFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlocksEntities.OAK_CUPBOARD_ENTITY, OakCupboardRenderer::new);
    }
}
