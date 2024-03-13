package net.hisoka.hisokasfurniture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hisoka.hisokasfurniture.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OAK_PLANK, RecipeCategory.MISC,
                Blocks.OAK_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.OAK_CUPBOARD, 1)
                .pattern("PPP")
                .pattern("P P")
                .pattern("PPP")
                .input('P', ModItems.OAK_PLANK)
                .criterion(hasItem(ModItems.OAK_PLANK), conditionsFromItem(ModItems.OAK_PLANK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OAK_CUPBOARD)));
    }
}
