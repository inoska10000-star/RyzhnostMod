package com.example.ryzhnostmod.client;

import com.example.ryzhnostmod.RyzhnostMod;
import com.example.ryzhnostmod.entity.RyzhnostEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RyzhnostRenderer extends MobRenderer<RyzhnostEntity, RyzhnostModel<RyzhnostEntity>> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(RyzhnostMod.MODID, "textures/entity/ryzhnost.png");

    public RyzhnostRenderer(EntityRendererProvider.Context context) {
        super(context, new RyzhnostModel<>(context.bakeLayer(RyzhnostModel.LAYER_LOCATION)), 0.65F);
    }

    @Override
    public ResourceLocation getTextureLocation(RyzhnostEntity entity) {
        return TEXTURE;
    }
}
