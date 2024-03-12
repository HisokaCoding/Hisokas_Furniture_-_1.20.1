package net.hisoka.hisokasfurniture.block.entity;


import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.hisoka.hisokasfurniture.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocksEntities {
    public static BlockEntityType<OakCupboardEntity> OAK_CUPBOARD_ENTITY;

    public static void registerAllBlockEntities() {
        OAK_CUPBOARD_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(HisokasFurniture.MOD_ID, "oak_cupboard_entity"),
                FabricBlockEntityTypeBuilder.create(OakCupboardEntity::new, ModBlocks.OAK_CUPBOARD).build());
    }
}
