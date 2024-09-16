package net.west.realmmmomod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.west.realmmmomod.RealmmmoMod;

import static net.minecraft.block.Blocks.always;
import static net.minecraft.block.Blocks.register;
import static net.minecraft.data.client.TextureMap.particle;

public class ModBlocks {

   public static final  Block ASH_BURN_LOG = registerBlock("ash_burn_log",
           new Block(AbstractBlock.Settings.create().strength(4F)));
   public static final Block ASH_BURN_LOG_TOP =registerBlock("ash_burn_log_top",
           new Block(AbstractBlock.Settings.create().strength(3F)));
   public static final  Block ASH_COBBLE = registerBlock("ash_cobble",
           new Block(AbstractBlock.Settings.create().strength(4F)));
   public static final Block ASH_STONE = registerBlock("ash_stone",
           new Block(AbstractBlock.Settings.create().strength(5F)));
   public static final Block MUD_BRICK = registerBlock("mud_bricks",
           new Block(AbstractBlock.Settings.create().strength(4F)));
   public static final Block LIMESTONE_CORNICE = registerBlock("limestone_cornice",
           new Block(AbstractBlock.Settings.create().strength(4F)));
   public static final Block MOSSY_ASH_LOG = registerBlock("mossy_ash_log",
           new Block(AbstractBlock.Settings.create().strength(3F)));
   public static final Block MOSSY_ASH_LOG_TOP = registerBlock("mossy_ash_log_top",
           new Block(AbstractBlock.Settings.create().strength(4F)));
   public static final Block ASH_BURN_STAIRS = registerBlock("ash_burn_stairs",
           new StairsBlock(ModBlocks.ASH_BURN_LOG.getDefaultState(),
                   AbstractBlock.Settings.create().strength(2F)));
    public static final Block DWARFLIGHTBLOCK = registerBlock("dwarflightblock",
           new DwarfLightBlock(AbstractBlock.Settings.create().strength(3F)));
    public static final Block ASH_BROKE_LOG = registerBlock("ash_broke_log",
            new Block(AbstractBlock.Settings.create().strength(4F)));
    public static final Block ASH_MOSS_STONE = registerBlock("ash_moss_stone",
            new Block(AbstractBlock.Settings.create().strength(3F)));
    public static final Block ASH_MOSS_BRICK = registerBlock("ash_moss_brick",
            new Block(AbstractBlock.Settings.create().strength(4F)));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, Identifier.of(RealmmmoMod.MOD_ID,name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RealmmmoMod.MOD_ID, name),
                new BlockItem(block,new Item.Settings()));
    }
    public static void registerModBlocks() {
        RealmmmoMod.LOGGER.info("Registering Mod Blocks for" + RealmmmoMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ASH_BURN_LOG);
            entries.add(ModBlocks.ASH_BURN_LOG_TOP);
            entries.add(ModBlocks.ASH_COBBLE);
            entries.add(ModBlocks.MUD_BRICK);
            entries.add(ModBlocks.LIMESTONE_CORNICE);
            entries.add(ModBlocks.MOSSY_ASH_LOG);
            entries.add(ModBlocks.MOSSY_ASH_LOG_TOP);
            entries.add(ModBlocks.ASH_BURN_STAIRS);
            entries.add(ModBlocks.DWARFLIGHTBLOCK);
            entries.add(ModBlocks.ASH_BROKE_LOG);
            entries.add(ModBlocks.ASH_MOSS_STONE);
            entries.add(ModBlocks.ASH_MOSS_BRICK);







        });
    }
}
