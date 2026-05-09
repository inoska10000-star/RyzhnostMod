package com.example.ryzhnostmod.client;

import com.example.ryzhnostmod.RyzhnostMod;
import com.example.ryzhnostmod.entity.RyzhnostEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class RyzhnostModel<T extends RyzhnostEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(RyzhnostMod.MODID, "ryzhnost"), "main");

    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart torso;
    private final ModelPart leftArm;
    private final ModelPart rightArm;
    private final ModelPart leftLeg;
    private final ModelPart rightLeg;

    public RyzhnostModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild("head");
        this.torso = root.getChild("torso");
        this.leftArm = root.getChild("left_arm");
        this.rightArm = root.getChild("right_arm");
        this.leftLeg = root.getChild("left_leg");
        this.rightLeg = root.getChild("right_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        partDefinition.addOrReplaceChild("head",
            CubeListBuilder.create()
            .texOff(2, 2).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F)
            .texOff(68, 2).addBox(-8.5000F, -7.5000F, 6.0F, 17.0F, 16.0F, 3.0F)
            .texOff(110, 2).addBox(6.0F, -7.5000F, -7.0F, 3.0F, 16.0F, 14.0F)
            .texOff(146, 2).addBox(-9.0F, -7.5000F, -7.0F, 3.0F, 16.0F, 14.0F)
            .texOff(182, 2).addBox(-8.2000F, -10.0F, -8.2000F, 16.4000F, 2.5000F, 16.4000F)
            .texOff(2, 36).addBox(-8.0F, -7.0F, -9.0F, 7.0F, 8.0F, 2.0F)
            .texOff(22, 36).addBox(-1.5000F, -6.0F, -9.0F, 3.0F, 8.0F, 2.0F)
            .texOff(34, 36).addBox(1.0F, -7.0F, -9.0F, 7.0F, 8.0F, 2.0F)
            .texOff(54, 36).addBox(-6.5000F, -10.5000F, -1.0F, 13.0F, 3.0F, 2.0F)
            .texOff(86, 36).addBox(7.5000F, -4.0F, -4.0F, 3.0F, 8.0F, 8.0F)
            .texOff(110, 36).addBox(-10.5000F, -4.0F, -4.0F, 3.0F, 8.0F, 8.0F)
            .texOff(134, 36).addBox(-5.5000F, -2.5000F, -8.7000F, 11.0F, 5.0F, 0.6000F),
            PartPose.offset(0.0F, -8.0F, 0.0F));
        partDefinition.addOrReplaceChild("torso",
            CubeListBuilder.create()
            .texOff(160, 36).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F)
            .texOff(178, 36).addBox(-6.0F, -2.0F, -4.0F, 12.0F, 10.0F, 8.0F)
            .texOff(2, 56).addBox(-6.6000F, -2.6000F, -4.6000F, 13.2000F, 11.0F, 9.2000F)
            .texOff(48, 56).addBox(0.7000F, 0.0F, -6.6000F, 4.6000F, 4.8000F, 4.4000F)
            .texOff(68, 56).addBox(-5.3000F, 0.0F, -6.6000F, 4.6000F, 4.8000F, 4.4000F)
            .texOff(88, 56).addBox(-7.0F, 6.0F, -4.7000F, 14.0F, 4.0F, 9.4000F),
            PartPose.offset(0.0F, 4.0F, 0.0F));
        partDefinition.addOrReplaceChild("left_arm",
            CubeListBuilder.create()
            .texOff(136, 56).addBox(-2.2000F, -1.0F, -2.6000F, 4.4000F, 8.0F, 5.2000F)
            .texOff(156, 56).addBox(-1.8000F, 6.8000F, -2.3000F, 3.6000F, 8.2000F, 4.6000F)
            .texOff(176, 56).addBox(-2.4000F, 14.8000F, -2.8000F, 4.8000F, 3.2000F, 5.6000F),
            PartPose.offset(8.8000F, 3.0F, 0.0F));
        partDefinition.addOrReplaceChild("right_arm",
            CubeListBuilder.create()
            .texOff(200, 56).addBox(-2.2000F, -1.0F, -2.6000F, 4.4000F, 8.0F, 5.2000F)
            .texOff(220, 56).addBox(-1.8000F, 6.8000F, -2.3000F, 3.6000F, 8.2000F, 4.6000F)
            .texOff(2, 78).addBox(-2.4000F, 14.8000F, -2.8000F, 4.8000F, 3.2000F, 5.6000F),
            PartPose.offset(-8.8000F, 3.0F, 0.0F));
        partDefinition.addOrReplaceChild("left_leg",
            CubeListBuilder.create()
            .texOff(26, 78).addBox(-1.7000F, 0.0F, -2.1000F, 3.4000F, 12.0F, 4.2000F)
            .texOff(58, 78).addBox(-2.0F, 11.2000F, -2.6000F, 4.0F, 2.8000F, 5.6000F),
            PartPose.offset(2.5000F, 12.0F, 0.0F));
        partDefinition.addOrReplaceChild("right_leg",
            CubeListBuilder.create()
            .texOff(42, 78).addBox(-1.7000F, 0.0F, -2.1000F, 3.4000F, 12.0F, 4.2000F)
            .texOff(80, 78).addBox(-2.0F, 11.2000F, -2.6000F, 4.0F, 2.8000F, 5.6000F),
            PartPose.offset(-2.5000F, 12.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 256, 256);
    }

    @Override
    public ModelPart root() {
        return this.root;
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = headPitch * ((float)Math.PI / 180F);

        this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.2F * limbSwingAmount;
        this.leftLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.2F * limbSwingAmount;
    }
}
