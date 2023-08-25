package com.BolekB.ohiomod.item;

import com.BolekB.ohiomod.Ohiomod;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ohiomod.MOD_ID);

    public static final RegistryObject<Item> OHIUM = ITEMS.register("ohium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> RAW_OHIUM = ITEMS.register("raw_ohium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> OBSIDIAN_FRAGMENT = ITEMS.register("obsidian_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
/*
    Baller Armor
*/
    public static final RegistryObject<Item> BALLER_SNEAKERS = ITEMS.register("baller_sneakers",
            () -> new ArmorItem(ModArmorMaterials.OHIUM, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> BALLER_PANTS = ITEMS.register("baller_pants",
            () -> new ArmorItem(ModArmorMaterials.OHIUM, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
/*
    Ball Gun
*/
    public static final RegistryObject<Item> BALL_GUN = ITEMS.register("ball_gun",
            () -> new GunItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> MARKSMAN = ITEMS.register("marksman",
            () -> new GunItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<Item> BALL = ITEMS.register("ball",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RED_GUN = ITEMS.register("red_gun",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}