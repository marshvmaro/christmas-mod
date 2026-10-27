package net.mashumaro.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.mashumaro.ChristmasMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item CANDY_CANE = registerItem("candy_cane", Item::new);
    public static final Item CANDY_CANE_SHARD = registerItem("candy_cane_shard", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ChristmasMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ChristmasMod.MOD_ID, name)))));
    }

    public static void registerModItems(){
        ChristmasMod.LOGGER.info("Registering ModItems for " + ChristmasMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(CANDY_CANE);
            output.accept(CANDY_CANE_SHARD);
        });
    }
}
