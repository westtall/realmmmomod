package net.west.realmmmomod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public class ModMithirlMaterial implements ToolMaterial {


    private  final int miningLevel;
    private  final int itemDurability;
    private  final float miningspeed;
    private  final float attackdamge;
    private  final int enchantability;
    private  final Supplier<Ingredient> reperIngerdient;

    public ModMithirlMaterial(int miningLevel, int itemDurability, float miningspeed, float attackDamge, int enchantability, Supplier<Ingredient> reperIngerdient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningspeed = miningspeed;
        this.attackdamge = attackDamge;
        this.enchantability = enchantability;
        this.reperIngerdient = reperIngerdient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningspeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackdamge;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.reperIngerdient.get();
    }
}
