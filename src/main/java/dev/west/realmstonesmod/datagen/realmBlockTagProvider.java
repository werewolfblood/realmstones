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
                .add(InitBlocks.TuTAHIRE_STONE)
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
                .add(InitBlocks.DWARF_BEIGE)
                .add(InitBlocks.DWARF_BEIGE_BRICK)
                .add(InitBlocks.DWARF_STEIOLITE)
                .add(InitBlocks.DWARF_STEIOLITE_BRICK)
                .add(InitBlocks.MEN_KUKHOG)
                .add(InitBlocks.MEN_COLUAZ)
                .add(InitBlocks.MAROON)
                .add(InitBlocks.CYAN)
                .add(InitBlocks.GRAYLIME)
                .add(InitBlocks.BIXBITE)
                .add(InitBlocks.AZURITE)
                .add(InitBlocks.BARITE)
                .add(InitBlocks.JADE)
                .add(InitBlocks.SARD)
                .add(InitBlocks.ROCK_CRYSTAL)
                .add(InitBlocks.LOLITE)
                .add(InitBlocks.GOSHRNITE)
                .add(InitBlocks.KYANNITE)
                .add(InitBlocks.ELF_DIRT)
                .add(InitBlocks.ARCHROITE)
                .add(InitBlocks.ZIRCON)
                .add(InitBlocks.WILLEMITE)
                .add(InitBlocks.CARMINE)
                .add(InitBlocks.LECHULI)
                .add(InitBlocks.MOTALD)
                .add(InitBlocks.AERKY)
                .add(InitBlocks.MORDOR_WEASTE)
                .add(InitBlocks.MORDOR_PIT_STONE)
                .add(InitBlocks.DEAD_BREAK)
                .add(InitBlocks.DEAD_STONE)
                .add(InitBlocks.DEAD_BREAK_SLAB)
                .add(InitBlocks.DEAD_STONE_SLAB)
                .add(InitBlocks.DEATH_STONE)
                .add(InitBlocks.TAUPE)
                .add(InitBlocks.SILVER_STONE)
                .add(InitBlocks.PEAL_STONE)
                .add(InitBlocks.NIGHT_STONE)
                .add(InitBlocks.CRYSTALICE_STONE)
                .add(InitBlocks.CRYSTALICE_STONE_SLAB)
                .add(InitBlocks.CRYSTALICE_STONE_FENCE)
                .add(InitBlocks.NIGHT_STONE_SLAB)
                .add(InitBlocks.SILVER_STONE_SLAB)
                .add(InitBlocks.GOLDSTONE)
                .add(InitBlocks.CRYSTAL_BLUE)
                .add(InitBlocks.CRYSTAL_GOLD)
                .add(InitBlocks.CRYSTAL_SILVER)
                .add(InitBlocks.LILAC_STONE)
                .add(InitBlocks.GUNBAND_STONE)
                .add(InitBlocks.GUNBAND_STONE_SLAB)
                .add(InitBlocks.MORIA_STONE)
                .add(InitBlocks.MORIA_STONE_SLAB)
                .add(InitBlocks.DROW_COBBLE_SLAB)
                .add(InitBlocks.IRONDWARF_STONE)
                .add(InitBlocks.MITHRIL_STONE);


        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(InitBlocks.DROW_COBBLE_SLAB)
                .add(InitBlocks.ELF_DIRT_SLAB)
                .add(InitBlocks.GUNBAND_STONE_SLAB)
                .add(InitBlocks.SILVER_STONE_SLAB)
                .add(InitBlocks.CRYSTALICE_STONE_SLAB)
                .add(InitBlocks.DIRT_MOSS_SLAB)
                .add(InitBlocks.IIVHALITE_SLAB)
                .add(InitBlocks.DEAD_STONE_SLAB)
                .add(InitBlocks.DEAD_BREAK_SLAB)
                .add(InitBlocks.LUNAR_STONE_SLAB)
                .add(InitBlocks.AMETHYST_SLAB)
                .add(InitBlocks.DROW_BRICK_SLAB)
                .add(InitBlocks.ANGBAND_STONE_SLAB)
                .add(InitBlocks.ANGBAND_BRICK_SLAB)
                .add(InitBlocks.MORDOR_BRICK_SLAB)
                .add(InitBlocks.MITHRIL_STONE_SLAB)
                .add(InitBlocks.NIGHT_STONE_SLAB)
                .add(InitBlocks.MORIA_STONE_SLAB)
                .add(InitBlocks.TAN_DIRT_SLAB)
                .add(InitBlocks.DWARF_DIRT_SLAB)
                .add(InitBlocks.SALIC_DIRT)
                .add(InitBlocks.CRYSTAL_DIRT_SLAB)
                .add(InitBlocks.IRONDWARF_STONE_SLAB)
                .add(InitBlocks.DROW_COBBLESLAB);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(InitBlocks.SILVER_STONE_FENCE)
                .add(InitBlocks.ANGBAND_BRICK_FENCE)
                .add(InitBlocks.LUNAR_STONE_FENCE)
                .add(InitBlocks.AMETHYST_FENCE)
                .add(InitBlocks.MORDOR_BRICK_FENCE)
                .add(InitBlocks.ANGBAND_STONE_FENCE)
                .add(InitBlocks.CRYSTALICE_STONE_FENCE)
                .add(InitBlocks.MITHRIL_STONE_FENCE);





        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(InitBlocks.ELF_DIRT_SLAB)
                .add(InitBlocks.CRYSTAL_DIRT)
                .add(InitBlocks.ANORNIC)
                .add(InitBlocks.GATTASE)
                .add(InitBlocks.DIRT_MOSS_SLAB)
                .add(InitBlocks.IIVHALITE_SLAB)
                .add(InitBlocks.IIVHALITE)
                .add(InitBlocks.DIRT_MOSS)
                .add(InitBlocks.DWARF_DIRT)
                .add(InitBlocks.TAN_DIRT)
                .add(InitBlocks.DWARF_DIRT_SLAB)
                .add(InitBlocks.SALIC_DIRT)
                .add(InitBlocks.CRYSTAL_DIRT_SLAB)
                .add(InitBlocks.GRAVEL_MOSS);


        getOrCreateTagBuilder(BlockTags.IRON_ORES)
                .add(InitBlocks.CRYSTAL_ORE);


        getOrCreateTagBuilder(BlockTags.GOLD_ORES)
                .add(InitBlocks.CRYSTAL_SILVER)
                .add(InitBlocks.MORDOR_ORE);




        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(InitBlocks.CRYSTAL_SILVER)
                .add(InitBlocks.CRYSTAL_ORE);



        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(InitBlocks.ORC_BRICK)
                .add(InitBlocks.EVIL_BRICK)
                .add(InitBlocks.ORC_LANTERN)
                .add(InitBlocks.IRONDWARF_STONE_SLAB)
                .add(InitBlocks.ORC_STONE)
                .add(InitBlocks.ORC_BLOOD_STONE)
                .add(InitBlocks.IRONDWARF_STONE);
























    }
}