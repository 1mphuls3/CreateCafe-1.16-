package com.Imphuls3.createcafe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup CREATE_CAFE = new ItemGroup("createCafeTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.STRAWBERRY_TEA.get());
        }
    };
}
