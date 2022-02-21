package com.Imphuls3.createcafe.item.foods;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class StrengthFood extends Item {
    public static final Food STRENGTH_DRINK = (new Food.Builder())
            .effect(new EffectInstance(Effects.STRENGTH, 200, 1), 1.0F)
            .hunger(8).saturation(0.2F).build();

    public StrengthFood(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.createcafe.strength"));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
