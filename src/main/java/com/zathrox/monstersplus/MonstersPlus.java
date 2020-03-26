package com.zathrox.monstersplus;

import com.zathrox.monstersplus.init.EMPBlocks;
import com.zathrox.monstersplus.init.EMPEntityTypes;
import com.zathrox.monstersplus.init.EMPItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MonstersPlus.MOD_ID)
public class MonstersPlus
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "explorercraftmonstersplus";

    public MonstersPlus() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Deferred Registers (Does not need to be before Configs)
        EMPBlocks.BLOCKS.register(modEventBus);
        EMPItems.ITEMS.register(modEventBus);
        EMPEntityTypes.ENTITY_TYPES.register(modEventBus);

    }

}
