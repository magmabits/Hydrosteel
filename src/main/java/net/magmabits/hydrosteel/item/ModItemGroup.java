package net.magmabits.hydrosteel.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.magmabits.hydrosteel.Hydrosteel;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HYDROSTEEL = FabricItemGroupBuilder.build(
            new Identifier(Hydrosteel.MOD_ID, "hydrosteel"), () -> new ItemStack(ModItems.HYDROSTEEL_INGOT));
}
