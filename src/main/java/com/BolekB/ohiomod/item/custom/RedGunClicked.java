package com.BolekB.ohiomod.item.custom;

import com.BolekB.ohiomod.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RedGunClicked {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand())
            return;
        execute(event, event.getPlayer(), event.getItemStack());
    }

    public static void execute(Entity entity, ItemStack itemstack) {
        execute(null, entity, itemstack);
    }


    private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RED_GUN.get()) {
            if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GUNPOWDER)) : false) {
                if (entity instanceof Player _player)
                    _player.getCooldowns().addCooldown(itemstack.getItem(), 20);
                entity.setDeltaMovement(new Vec3((entity.getLookAngle().x() * (-1)), (entity.getLookAngle().y() * (-1)), (entity.getLookAngle().z() * (-1))));
                if (entity instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(Items.GUNPOWDER);
                    _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3, _player.inventoryMenu.getCraftSlots());
                }
            }
        }
    }
}