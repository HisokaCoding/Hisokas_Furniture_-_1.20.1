package net.hisoka.hisokasfurniture.block.entity.client;

import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.hisoka.hisokasfurniture.block.entity.OakCupboardEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class OakCupboardModel extends GeoModel<OakCupboardEntity> {
    @Override
    public Identifier getModelResource(OakCupboardEntity animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "geo/oak_cupboard.geo.json");
    }

    @Override
    public Identifier getTextureResource(OakCupboardEntity animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "textures/block/oak_cupboard.png");
    }

    @Override
    public Identifier getAnimationResource(OakCupboardEntity animatable) {
        return new Identifier(HisokasFurniture.MOD_ID, "animations/oak_cupboard.animation.json");
    }
}
