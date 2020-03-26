package com.zathrox.monstersplus.init;

import com.zathrox.monstersplus.MonstersPlus;
import com.zathrox.monstersplus.entity.WildBoarEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EMPEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MonstersPlus.MOD_ID);

    public static final String WILD_BOAR_NAME = "wild_boar";
    public static final RegistryObject<EntityType<WildBoarEntity>> WILD_BOAR = ENTITY_TYPES.register(WILD_BOAR_NAME, () ->
            EntityType.Builder.<WildBoarEntity>create(WildBoarEntity::new, EntityClassification.CREATURE)
                    .size(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())
                    .build(new ResourceLocation(MonstersPlus.MOD_ID, WILD_BOAR_NAME).toString())
    );

}
