package net.west.realmmmomod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.west.realmmmomod.block.ModBlocks;
import net.west.realmmmomod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_BURN_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_BURN_LOG_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUD_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_CORNICE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ASH_LOG_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ASH_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_BURN_STAIRS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DWARFLIGHTBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASH_BROKE_LOG);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WAND, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHIRL,Models.GENERATED);
        itemModelGenerator.register(ModItems.WIZARDSTAFF,Models.GENERATED);

    }
}
