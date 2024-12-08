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
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DROW_COBBLE)
                .slab(InitBlocks.DROW_COBBLE_SLAB)
                .slab(InitBlocks.DROW_COBBLESLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DROW_BRICK)
                .slab(InitBlocks.DROW_BRICK_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MITHRIL_STONE)
                .slab(InitBlocks.MITHRIL_STONE_SLAB)
                .fence(InitBlocks.MITHRIL_STONE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_BRICK)
                .slab(InitBlocks.ANGBAND_BRICK_SLAB)
                .fence(InitBlocks.ANGBAND_BRICK_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_STONE)
                .slab(InitBlocks.ANGBAND_STONE_SLAB)
                .fence(InitBlocks.ANGBAND_STONE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.AMETHYST)
                .slab(InitBlocks.AMETHYST_SLAB)
                .fence(InitBlocks.AMETHYST_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORDOR_BRICK)
                .slab(InitBlocks.MORDOR_BRICK_SLAB)
                .fence(InitBlocks.MORDOR_BRICK_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DEAD_STONE)
                .slab(InitBlocks.DEAD_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DEAD_BREAK)
                .slab(InitBlocks.DEAD_BREAK_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.LUNAR_STONE)
                .slab(InitBlocks.LUNAR_STONE_SLAB)
                .fence(InitBlocks.LUNAR_STONE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.IIVHALITE)
                .slab(InitBlocks.IIVHALITE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DIRT_MOSS)
                .slab(InitBlocks.DIRT_MOSS_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.CRYSTALICE_STONE)
                .slab(InitBlocks.CRYSTALICE_STONE_SLAB)
                .fence(InitBlocks.CRYSTALICE_STONE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.NIGHT_STONE)
                .slab(InitBlocks.NIGHT_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.SILVER_STONE)
                .slab(InitBlocks.SILVER_STONE_SLAB)
                .fence(InitBlocks.SILVER_STONE_FENCE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.LILAC_STONE)
                .fence(InitBlocks.LILAC_STONE_FENCE)
                .slab(InitBlocks.LILAC_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.GUNBAND_STONE)
                .slab(InitBlocks.GUNBAND_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORIA_STONE)
                .slab(InitBlocks.MORIA_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.TAN_DIRT)
                .slab(InitBlocks.TAN_DIRT_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DWARF_DIRT)
                .slab(InitBlocks.DWARF_DIRT_SLAB);
       blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.CRYSTAL_DIRT)
                       .slab(InitBlocks.CRYSTAL_DIRT_SLAB);
       blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ELF_DIRT)
                       .slab(InitBlocks.ELF_DIRT_SLAB);
       blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.IRONDWARF_STONE)
                       .slab(InitBlocks.IRONDWARF_STONE_SLAB);



       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ORC_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_BRICK);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ORC_LANTERN);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ORC_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ORC_BLOOD_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SALIC_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DROW_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMECOBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_LIMESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARFIRON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.TuTAHIRE_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ARCANE);
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
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.PEAL_STONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GOLDSTONE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_SILVER);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_GOLD);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_BLUE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_ORE);




























    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

}
