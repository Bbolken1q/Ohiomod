package com.BolekB.ohiomod.item;

import com.BolekB.ohiomod.Ohiomod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Ohiomod.MOD_ID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static RegistryObject<SoundEvent> BALL_GUN_RELOAD = registerSoundEvent("ball_reload");
    public static RegistryObject<SoundEvent> BALL_GUN_FIRE = registerSoundEvent("ball_fire");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Ohiomod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}