package net.aungk.tutorial_mod.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static  final FoodProperties STAWBERRY = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).fast()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 0.2f).build();
}
