package com.senter.crimsonite;

import com.mojang.logging.LogUtils;
import com.senter.crimsonite.block.ModBlocks;
import com.senter.crimsonite.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(Crimsonite.MOD_ID)
public class Crimsonite {

    public static final String MOD_ID = "crimsonite";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Crimsonite(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        LOGGER.info("Crimsonite mod loaded!");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.CRIMSONITE_ORE);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CRIMSONITE_SHARD);
        }
    }
}
