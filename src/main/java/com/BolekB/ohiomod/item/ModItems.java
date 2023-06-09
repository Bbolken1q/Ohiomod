package com.BolekB.ohiomod.item;

import com.BolekB.ohiomod.Ohiomod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ohiomod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("ohium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_ohium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}