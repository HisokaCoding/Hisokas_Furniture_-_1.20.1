package net.hisoka.hisokasfurniture.item.client;

import net.hisoka.hisokasfurniture.item.custom.OakCupboardItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class OakCupboardItemRenderer extends GeoItemRenderer<OakCupboardItem> {
    public OakCupboardItemRenderer() {
        super(new OakCupboardItemModel());
    }
}
