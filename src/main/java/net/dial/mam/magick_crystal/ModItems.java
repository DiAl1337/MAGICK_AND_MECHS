package net.dial.mam.magick_crystal;

import net.dial.mam.MaM;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaM.MOD_ID);


    public static final RegistryObject<Item> magick_crystal = ITEMS.register("magick_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MECHS_AND_MAGICK)));



    public static final RegistryObject<Item> magickal_condencer = ITEMS.register("magickal_condencer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MECHS_AND_MAGICK)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
