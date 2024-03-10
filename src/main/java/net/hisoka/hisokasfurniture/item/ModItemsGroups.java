package net.hisoka.hisokasfurniture.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemsGroups {
    public static final ItemGroup FURNITURE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HisokasFurniture.MOD_ID, "oak_plank"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oak_plank"))
                    .icon(() -> new ItemStack(ModItems.OAK_PLANK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OAK_PLANK);
                    }).build());

    public static void registerItemGroups() {
        HisokasFurniture.LOGGER.info("Registering Item Groups for " + HisokasFurniture.MOD_ID);
    }
}
