package com.Imphuls3.createcafe.block;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.block.custom.CassavaBlock;
import com.Imphuls3.createcafe.block.custom.CoffeeBlock;
import com.Imphuls3.createcafe.item.ModItemGroup;
import com.Imphuls3.createcafe.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCafe.MOD_ID);

    //Crops:
    public static final RegistryObject<Block> COFFEE = BLOCKS.register("coffee_crop",
            () -> new CoffeeBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> CASSAVA = BLOCKS.register("cassava_crop",
            () -> new CassavaBlock(AbstractBlock.Properties.from(Blocks.WHEAT)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.CREATE_CAFE)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
