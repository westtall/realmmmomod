package net.west.realmmmomod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.west.realmmmomod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ASH_BURN_LOG);
        addDrop(ModBlocks.ASH_BURN_STAIRS);
        addDrop(ModBlocks.ASH_COBBLE);
        addDrop(ModBlocks.ASH_BURN_LOG_TOP);
        addDrop(ModBlocks.ASH_STONE);
        addDrop(ModBlocks.MUD_BRICK);
        addDrop(ModBlocks.MOSSY_ASH_LOG);
        addDrop(ModBlocks.MOSSY_ASH_LOG_TOP);
        addDrop(ModBlocks.LIMESTONE_CORNICE);
        addDrop(ModBlocks.ASH_BURN_STAIRS);
        addDrop(ModBlocks.DWARFLIGHTBLOCK);
        addDrop(ModBlocks.ASH_BROKE_LOG);
        addDrop(ModBlocks.ASH_MOSS_BRICK);
        addDrop(ModBlocks.ASH_MOSS_STONE);







    }
}
