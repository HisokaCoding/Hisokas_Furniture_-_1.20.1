package net.hisoka.hisokasfurniture.block.entity.client;

import net.hisoka.hisokasfurniture.block.entity.OakCupboardEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class OakCupboardRenderer extends GeoBlockRenderer<OakCupboardEntity> {
    public OakCupboardRenderer(BlockEntityRendererFactory.Context context) {
        super(new OakCupboardModel());
    }
}
