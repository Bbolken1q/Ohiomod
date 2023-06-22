package com.BolekB.ohiomod.item.custom;

import com.BolekB.ohiomod.item.ModItems;
import com.google.common.collect.ImmutableMap;
import com.BolekB.ohiomod.item.ModArmorMaterials;
import com.mojang.math.Vector3d;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;
import java.util.Vector;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(player.getInventory().ALL_ARMOR_SLOTS.equals(ModItems.BALLER_SNEAKERS)) {
            player.sendMessage(new TextComponent("Amogus"), player.getUUID());
        }
    }

    public void setDeltaMovement(double p_213293_1_, double p_213293_3_, double p_213293_5_){}
}