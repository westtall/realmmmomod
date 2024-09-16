package net.west.realmmmomod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.west.realmmmomod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ASH_COBBLE)
                .add(ModBlocks.ASH_STONE)
                .add(ModBlocks.LIMESTONE_CORNICE)
                .add(ModBlocks.DWARFLIGHTBLOCK)
                .add(ModBlocks.ASH_MOSS_BRICK)
                .add(ModBlocks.ASH_MOSS_STONE);




        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ASH_BURN_LOG_TOP)
                .add(ModBlocks.ASH_BURN_LOG)
                .add(ModBlocks.ASH_BURN_STAIRS)
                .add(ModBlocks.MOSSY_ASH_LOG)
                .add(ModBlocks.MOSSY_ASH_LOG_TOP)
                .add(ModBlocks.ASH_BROKE_LOG);



        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.MUD_BRICK);



    }
}
