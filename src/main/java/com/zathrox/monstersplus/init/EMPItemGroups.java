package com.zathrox.monstersplus.init;

import com.zathrox.monstersplus.MonstersPlus;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public final class EMPItemGroups {

    public static final ItemGroup EMP_ITEM_GROUP = new ModItemGroup(MonstersPlus.MOD_ID, () -> new ItemStack(EMPItems.WILD_BOAR_SPAWN_EGG.get()));

    public static final class ModItemGroup extends ItemGroup {

        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }
}
