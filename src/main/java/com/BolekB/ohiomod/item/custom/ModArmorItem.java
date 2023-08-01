package com.BolekB.ohiomod.item.custom;

import com.BolekB.ohiomod.item.ModItems;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import javax.annotation.Nullable;
import java.util.Random;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }

    @Mod.EventBusSubscriber
    public static class Dash {
        @SubscribeEvent
        public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
            execute(event, event.getEntityLiving());
        }

        private static void execute(@Nullable Event event, Entity entity) {
            if (entity == null)
                return;
            if (!entity.isOnGround()) {
            if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ModItems.BALLER_PANTS.get()) {
                    if (entity.isShiftKeyDown()) {
                        entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), (entity.getDeltaMovement().y()), (entity.getLookAngle().z)));
                    }
                }
            }
        }
    }
}