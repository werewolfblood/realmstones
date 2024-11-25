package dev.west.realmstonesmod.datagen;


import dev.west.realmstonesmod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class realmModelProvider  extends FabricModelProvider {
    public realmModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool RealmGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DROW_COBBLE);
        BlockStateModelGenerator.BlockTexturePool realmGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MITHRIL_STONE);
        BlockStateModelGenerator.BlockTexturePool MMOGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORDOR_BRICK);
        BlockStateModelGenerator.BlockTexturePool MMORPGGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_BRICK);
        BlockStateModelGenerator.BlockTexturePool RPGMMOGarentPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_STONE);
        BlockStateModelGenerator.BlockTexturePool rpgGARNETPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DROW_BRICK);
        BlockStateModelGenerator.BlockTexturePool PGGARNETPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.AMETHYST);
        BlockStateModelGenerator.BlockTexturePool MMPGARNETPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.LUNAR_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMECOBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARFIRON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.TITAHIRE_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ARCANE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DROW_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARFWHITE_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_STONE);


       RealmGarnetPool.slab(InitBlocks.DROW_COBBLESLAB);
       MMOGarnetPool.slab(InitBlocks.MORDOR_BRICK_SLAB);
       realmGarnetPool.slab(InitBlocks.MITHRIL_STONE_SLAB);
       MMORPGGarnetPool.slab(InitBlocks.ANGBAND_BRICK_SLAB);
       RPGMMOGarentPOOL.slab(InitBlocks.ANGBAND_STONE_SLAB);
       rpgGARNETPool.slab(InitBlocks.DROW_BRICK_SLAB);
       PGGARNETPOOL.slab(InitBlocks.AMETHYST_SLAB);
       MMPGARNETPOOL.slab(InitBlocks.LUNAR_STONE_SLAB);


       RealmGarnetPool.fence(InitBlocks.MITHRIL_STONE_FENCE);
       RPGMMOGarentPOOL.fence(InitBlocks.ANGBAND_STONE_FENCE);
       MMOGarnetPool.fence(InitBlocks.MORDOR_BRICK_FENCE);
       PGGARNETPOOL.fence(InitBlocks.AMETHYST_FENCE);
       MMPGARNETPOOL.fence(InitBlocks.LUNAR_STONE_FENCE);
       MMORPGGarnetPool.fence(InitBlocks.ANGBAND_BRICK_FENCE);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}
