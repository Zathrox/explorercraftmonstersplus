package com.zathrox.monstersplus.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class WildBoarEntity extends PigEntity {

    public WildBoarEntity(final EntityType<? extends WildBoarEntity> entityType, final World world) {
        super(entityType, world);
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();

        final double baseSpeed = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue();
        final double baseHealth = this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
        // Multiply base health and base speed by one and a half
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(baseSpeed * 1.5D);
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(baseHealth * 1.5D);
    }

    @Override
    public WildBoarEntity createChild(final AgeableEntity parent) {
        // Use getType to support overrides in subclasses
        return (WildBoarEntity) getType().create(this.world);
    }

    /**
     * Called on the logical server to get a packet to send to the client containing data necessary to spawn your entity.
     * Using Forge's method instead of the default vanilla one allows extra stuff to work such as sending extra data,
     * using a non-default entity factory and having {@link IEntityAdditionalSpawnData} work.
     *
     * It is not actually necessary for our WildBoarEntity to use Forge's method as it doesn't need any of this extra
     * functionality, however, this is an example mod and many modders are unaware that Forge's method exists.
     *
     * @return The packet with data about your entity
     * @see FMLPlayMessages.SpawnEntity
     */
    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
