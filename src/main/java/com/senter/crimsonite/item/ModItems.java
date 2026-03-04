package com.senter.crimsonite.item;

import com.senter.crimsonite.Crimsonite;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Crimsonite.MOD_ID);

    // Raw material dropped when mining Crimsonite Ore
    public static final DeferredItem<Item> CRIMSONITE_SHARD =
            ITEMS.registerSimpleItem("crimsonite_shard", new Item.Properties());
}
