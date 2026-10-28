package net.mashumaro.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.mashumaro.ChristmasMod;
import net.mashumaro.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab CANDY_CANE_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ChristmasMod.MOD_ID, "christmas_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CANDY_CANE))
                    .title(Component.translatable("creativemodetab.christmas-mod.items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CANDY_CANE_SHARD);
                        output.accept(ModItems.CANDY_CANE);
                    }).build());


    public static final CreativeModeTab CANDY_CANE_BLOCKS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ChristmasMod.MOD_ID, "christmas_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CANDY_CANE_SHARD))
                    .title(Component.translatable("creativemodetab.christmas-mod.blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CANDY_CANE_SHARD);
                        output.accept(ModItems.CANDY_CANE);
                    }).build());


    public static void registerModCreativeModeTabs() {
        ChristmasMod.LOGGER.info("Registering CreativeModeTabs");
    }
}
