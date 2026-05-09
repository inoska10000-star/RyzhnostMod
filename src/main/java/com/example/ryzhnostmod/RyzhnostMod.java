package com.example.ryzhnostmod;

import com.example.ryzhnostmod.entity.ModEntities;
import com.example.ryzhnostmod.entity.RyzhnostEntity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod(RyzhnostMod.MODID)
public class RyzhnostMod {
    public static final String MODID = "ryzhnostmod";

    public RyzhnostMod(IEventBus modEventBus) {
        ModEntities.ENTITY_TYPES.register(modEventBus);
        modEventBus.addListener(this::registerAttributes);
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RYZHNOST.get(), RyzhnostEntity.createAttributes().build());
    }
}
