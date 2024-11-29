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
        BlockStateModelGenerator.BlockTexturePool DEADGARNETPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DEAD_BREAK);
        BlockStateModelGenerator.BlockTexturePool DDGRARENTPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DEAD_STONE);
        BlockStateModelGenerator.BlockTexturePool IIGRAENTPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.IIVHALITE);
        BlockStateModelGenerator.BlockTexturePool DRGRAENTPOOL = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DIRT_MOSS);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMECOBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARFIRON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.TuTAHIRE_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ARCANE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DROW_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARFWHITE_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_BEIGE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_BEIGE_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_STEIOLITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_STEIOLITE_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MEN_KUKHOG);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MEN_COLUAZ);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MAROON);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CYAN);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GRAYLIME);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.BIXBITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.AZURITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.BARITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.JADE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SARD);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ROCK_CRYSTAL);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.LOLITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GOSHRNITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.KYANNITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ELF_DIRT);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ARCHROITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ZIRCON);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.WILLEMITE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CARMINE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.LECHULI);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MOTALD);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.AERKY);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_WEASTE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_PIT_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DEATH_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GRAVEL_MOSS);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GATTASE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ANORNIC);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.TAUPE);





       RealmGarnetPool.slab(InitBlocks.DROW_COBBLESLAB);
       DDGRARENTPOOL.slab(InitBlocks.DEAD_STONE_SLAB);
       DEADGARNETPOOL.slab(InitBlocks.DEAD_BREAK_SLAB);
       MMOGarnetPool.slab(InitBlocks.MORDOR_BRICK_SLAB);
       realmGarnetPool.slab(InitBlocks.MITHRIL_STONE_SLAB);
       MMORPGGarnetPool.slab(InitBlocks.ANGBAND_BRICK_SLAB);
       RPGMMOGarentPOOL.slab(InitBlocks.ANGBAND_STONE_SLAB);
       rpgGARNETPool.slab(InitBlocks.DROW_BRICK_SLAB);
       PGGARNETPOOL.slab(InitBlocks.AMETHYST_SLAB);
       MMPGARNETPOOL.slab(InitBlocks.LUNAR_STONE_SLAB);
       IIGRAENTPOOL.slab(InitBlocks.IIVHALITE_SLAB);
       DRGRAENTPOOL.slab(InitBlocks.DIRT_MOSS_SLAB);


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
