package net.hisoka.hisokasfurniture.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OAK_PLANK = registerItem("oak_plank", new Item(new FabricItemSettings()));

    private static void addItemsToModTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(OAK_PLANK);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(HisokasFurniture.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HisokasFurniture.LOGGER.info("Registering Mod Items for" + HisokasFurniture.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToModTabItemGroup);
    }
}
