package net.magmabits.hydrosteel.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.magmabits.hydrosteel.Hydrosteel;
import net.magmabits.hydrosteel.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block HYDROSTEEL_BLOCK = registerModBlock("hydrosteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),
            ModItemGroup.HYDROSTEEL);

    public static void registerModBlocks() {
        Hydrosteel.LOGGER.debug("Registering blocks for " + Hydrosteel.MOD_ID);
    }

    private static Block registerModBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Hydrosteel.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Hydrosteel.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }
}
