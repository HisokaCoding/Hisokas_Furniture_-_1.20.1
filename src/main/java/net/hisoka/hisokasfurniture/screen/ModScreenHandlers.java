package net.hisoka.hisokasfurniture.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.hisoka.hisokasfurniture.HisokasFurniture;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<OakCupboardScreenHandler> OAK_CUPBOARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(HisokasFurniture.MOD_ID, "oak_cupboard"),
                    new ExtendedScreenHandlerType<>(OakCupboardScreenHandler::new));

    public static void registerScreenHandlers() {
        HisokasFurniture.LOGGER.info("Registering Screen Handlers for " + HisokasFurniture.MOD_ID);
    }
}
