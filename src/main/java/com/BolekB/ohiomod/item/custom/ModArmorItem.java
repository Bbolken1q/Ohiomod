package com.BolekB.ohiomod.item.custom;

import com.BolekB.ohiomod.Ohiomod;
import com.BolekB.ohiomod.item.ModItems;
import com.google.common.collect.ImmutableMap;
import com.BolekB.ohiomod.item.ModArmorMaterials;
import com.mojang.math.Vector3d;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFW.*;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Vector;

import static jdk.jfr.FlightRecorder.addListener;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    @Mod.EventBusSubscriber
    class AmogusProcedure {
        @SubscribeEvent
        public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
            execute(event, event.getEntityLiving());
        }
        public static void execute(Entity entity) {
            execute(null, entity);
        }
        private static void execute(@Nullable Event event, Entity entity) {
            if (entity == null)
                return;
            if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ModItems.BALLER_PANTS.get()) {
                entity.setDeltaMovement(new Vec3(0, 1, 0));
            }
        }
    }
}


