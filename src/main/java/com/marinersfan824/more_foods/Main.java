package com.marinersfan824.more_foods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public static final Oreo OREO = new Oreo(
            new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(10f).snack().build()));
    public static final Cream CREAM = new Cream(
            new FabricItemSettings().group(ItemGroup.FOOD));
    public static final Chocolate_Cookie CHOCOLATE_COOKIE = new Chocolate_Cookie(
            new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(8f).snack().build()));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("more_foods", "oreo"), OREO);
        Registry.register(Registry.ITEM, new Identifier("more_foods", "cream"), CREAM);
        Registry.register(Registry.ITEM, new Identifier("more_foods", "chocolate_cookie"), CHOCOLATE_COOKIE);
    }

}