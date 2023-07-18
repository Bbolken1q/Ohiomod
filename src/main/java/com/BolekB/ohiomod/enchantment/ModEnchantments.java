package com.BolekB.ohiomod.enchantment;

import com.BolekB.ohiomod.Ohiomod;
import com.mrcrayfish.guns.enchantment.EnchantmentTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Ohiomod.MOD_ID);

    public static RegistryObject<Enchantment> PIERCE =
            ENCHANTMENTS.register("pierce",
                    () -> new PierceEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentTypes.GUN, EquipmentSlot.MAINHAND));

    public static  void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }

}
