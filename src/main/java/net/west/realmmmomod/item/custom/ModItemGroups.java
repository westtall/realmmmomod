package net.west.realmmmomod.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.west.realmmmomod.RealmmmoMod;
import net.west.realmmmomod.block.ModBlocks;
import net.west.realmmmomod.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup FANTASY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RealmmmoMod.MOD_ID, "fantasy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WAND))
                    .displayName(Text.translatable("item group.wand_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WAND);
                        entries.add(ModBlocks.ASH_COBBLE);
                        entries.add(ModBlocks.ASH_BURN_LOG);
                        entries.add(ModBlocks.LIMESTONE_CORNICE);
                        entries.add(ModBlocks.MUD_BRICK);
                        entries.add(ModBlocks.MOSSY_ASH_LOG);
                        entries.add(ModBlocks.MOSSY_ASH_LOG_TOP);
                        entries.add(ModBlocks.ASH_BURN_LOG_TOP);
                        entries.add(ModBlocks.ASH_BROKE_LOG);


                    }).build());



    public static void registerItemGroups() {
        RealmmmoMod.LOGGER.info("Registering Item Groups for " + RealmmmoMod.MOD_ID);
    }
}

