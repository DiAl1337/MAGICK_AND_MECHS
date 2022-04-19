package net.dial.mam.magick_crystal;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MECHS_AND_MAGICK = new CreativeModeTab("mechs_and_magick") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.magick_crystal.get());
        }
    };
}
