package net.hisoka.hisokasfurniture.item.client;

import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.hisoka.hisokasfurniture.item.custom.OakCupboardItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class OakCupboardItemModel extends GeoModel<OakCupboardItem> {
    @Override
    public Identifier getModelResource(OakCupboardItem animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "geo/oak_cupboard.geo.json");
    }

    @Override
    public Identifier getTextureResource(OakCupboardItem animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "textures/block/oak_cupboard.png");
    }

    @Override
    public Identifier getAnimationResource(OakCupboardItem animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "animations/oak_cupboard.animation.json");
    }
}
