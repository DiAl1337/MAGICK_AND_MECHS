package net.dial.mam.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MECHS_AND_MAGIC = new CreativeModeTab("mechs_and_magic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.magic_crystal.get());
        }

    };
}
