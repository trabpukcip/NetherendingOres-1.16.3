package org.icannt.netherendingores.registry.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.icannt.netherendingores.common.data.recipe.OreSmeltingRecipe;
import org.icannt.netherendingores.registry.data.tag.NetherendingOresTags;

public class DataRegistry {

    public static void serverSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        registerRecipes(generator);
        registerTags(generator, helper);
    }

    public static void registerRecipes(DataGenerator generator) {
        generator.addProvider(new OreSmeltingRecipe(generator));
    }

    public static void registerTags(DataGenerator generator, ExistingFileHelper helper) {
        generator.addProvider(new NetherendingOresTags.Blocks(generator, helper));
    }

}
