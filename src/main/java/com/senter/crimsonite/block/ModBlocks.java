package com.senter.crimsonite.block;

import com.senter.crimsonite.Crimsonite;
import com.senter.crimsonite.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Crimsonite.MOD_ID);

    // The ore block itself — requires a pickaxe, stone-like hardness
    public static final DeferredBlock<Block> CRIMSONITE_ORE = BLOCKS.registerSimpleBlock(
            "crimsonite_ore",
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .destroyTime(3.0f)
                    .explosionResistance(3.0f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
    );

    // Register the BlockItem (the item form held in inventory) via ModItems
    public static final DeferredItem<BlockItem> CRIMSONITE_ORE_ITEM =
            ModItems.ITEMS.registerSimpleBlockItem("crimsonite_ore", CRIMSONITE_ORE);
}
