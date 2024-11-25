package dev.west.realmstonesmod.datagen;

import dev.west.realmstonesmod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class realmBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public realmBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(InitBlocks.CRYSTAL_STONE)
                .add(InitBlocks.MITHRIL_COBBLE)
                .add(InitBlocks.DWARF_COBBLE)
                .add(InitBlocks.DWARF_LIMESTONE)
                .add(InitBlocks.DWARF_LIMECOBBLE)
                .add(InitBlocks.DWARFIRON_STONE)
                .add(InitBlocks.TITAHIRE_STONE)
                .add(InitBlocks.LUNAR_STONE)
                .add(InitBlocks.ARCANE)
                .add(InitBlocks.DROW_STONE)
                .add(InitBlocks.DROW_BRICK)
                .add(InitBlocks.DROW_COBBLE)
                .add(InitBlocks.DWARFWHITE_BRICK)
                .add(InitBlocks.DROW_COBBLESLAB)
                .add(InitBlocks.MORDOR_STONE)
                .add(InitBlocks.MORDOR_BRICK)
                .add(InitBlocks.MORDOR_BRICK_SLAB)
                .add(InitBlocks.ANGBAND_STONE)
                .add(InitBlocks.ANGBAND_BRICK)
                .add(InitBlocks.ANGBAND_BRICK_SLAB)
                .add(InitBlocks.AMETHYST)
                .add(InitBlocks.ANGBAND_STONE_SLAB)
                .add(InitBlocks.DROW_BRICK_SLAB)
                .add(InitBlocks.AMETHYST_SLAB)
                .add(InitBlocks.ANGBAND_STONE_FENCE)
                .add(InitBlocks.MITHRIL_STONE_FENCE)
                .add(InitBlocks.MORDOR_BRICK_FENCE)
                .add(InitBlocks.AMETHYST_FENCE)
                .add(InitBlocks.LUNAR_STONE_SLAB)
                .add(InitBlocks.LUNAR_STONE_FENCE)
                .add(InitBlocks.ANGBAND_BRICK_FENCE)
                .add(InitBlocks.MITHRIL_STONE);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(InitBlocks.LUNAR_STONE_SLAB)
                .add(InitBlocks.AMETHYST_SLAB)
                .add(InitBlocks.DROW_BRICK_SLAB)
                .add(InitBlocks.ANGBAND_STONE_SLAB)
                .add(InitBlocks.ANGBAND_BRICK_SLAB)
                .add(InitBlocks.MORDOR_BRICK_SLAB)
                .add(InitBlocks.MITHRIL_STONE_SLAB)
                .add(InitBlocks.DROW_COBBLESLAB);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(InitBlocks.ANGBAND_BRICK_FENCE)
                .add(InitBlocks.LUNAR_STONE_FENCE)
                .add(InitBlocks.AMETHYST_FENCE)
                .add(InitBlocks.MORDOR_BRICK_FENCE)
                .add(InitBlocks.ANGBAND_STONE_FENCE)
                .add(InitBlocks.MITHRIL_STONE_FENCE);

    }
}