package com.BolekB.ohiomod.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShearsClickedOnMob {
    @SubscribeEvent
    public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand())
            return;
        execute(event, event.getWorld(), event.getTarget(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
        execute(null, world, entity, sourceentity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, (sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), new ItemStack(Blocks.BUDDING_AMETHYST));
                entityToSpawn.setPickUpDelay(5);
                _level.addFreshEntity(entityToSpawn);
            }
        }
    }
}