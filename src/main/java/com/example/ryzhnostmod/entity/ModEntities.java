package com.example.ryzhnostmod.entity;

import com.example.ryzhnostmod.RyzhnostMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, RyzhnostMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<RyzhnostEntity>> RYZHNOST =
            ENTITY_TYPES.register("ryzhnost", () -> EntityType.Builder.of(RyzhnostEntity::new, MobCategory.MONSTER)
                    .sized(1.15F, 2.95F)
                    .clientTrackingRange(10)
                    .build("ryzhnost"));
}
