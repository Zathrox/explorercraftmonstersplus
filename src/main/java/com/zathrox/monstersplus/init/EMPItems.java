package com.zathrox.monstersplus.init;

import com.zathrox.monstersplus.MonstersPlus;
import com.zathrox.monstersplus.item.ModdedSpawnEggItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EMPItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MonstersPlus.MOD_ID);

    public static final RegistryObject<ModdedSpawnEggItem> WILD_BOAR_SPAWN_EGG = ITEMS.register("wild_boar_spawn_egg", () -> new ModdedSpawnEggItem(EMPEntityTypes.WILD_BOAR, 0xF0A5A2, 0xA9672B, new Item.Properties().group(EMPItemGroups.EMP_ITEM_GROUP)));

}
