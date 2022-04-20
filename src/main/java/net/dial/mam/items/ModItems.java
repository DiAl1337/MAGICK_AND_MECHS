package net.dial.mam.items;

import net.dial.mam.mam;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, mam.MOD_ID);


    public static final RegistryObject<Item> magic_crystal = ITEMS.register("magic_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MECHS_AND_MAGIC_TAB)));



    public static final RegistryObject<Item> magical_condencer = ITEMS.register("magical_condencer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MECHS_AND_MAGIC_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
