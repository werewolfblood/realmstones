package dev.west.realmstonesmod.block;

import dev.west.realmstonesmod.RealmstonesMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class InitBlocks {

    public static final Block MITHRIL_STONE = registerBlock("mithril_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block CRYSTAL_STONE = registerBlock("crystal_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_COBBLE = registerBlock("dwarf_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_LIMESTONE = registerBlock("dwarf_limestone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_LIMECOBBLE = registerBlock("dwarf_limecobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARFIRON_STONE = registerBlock("dwarfiron_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARFWHITE_BRICK = registerBlock("dwarfwhite_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_COBBLE = registerBlock("mithril_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block TuTAHIRE_STONE = registerBlock("tutahire_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block LUNAR_STONE = registerBlock("lunar_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ARCANE = registerBlock("arcane",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_STONE = registerBlock("drow_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_BRICK = registerBlock("drow_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_COBBLE = registerBlock("drow_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DROW_COBBLESLAB = registerBlock("drow_cobbleslab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_STONE = registerBlock("mordor_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_BRICK = registerBlock("mordor_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_STONE = registerBlock("angband_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_BRICK = registerBlock("angband_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_BEIGE = registerBlock("dwarf_beige",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_BEIGE_BRICK = registerBlock("dwarf_beige_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_STEIOLITE = registerBlock("dwarf_steiolite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DWARF_STEIOLITE_BRICK = registerBlock("dwarf_steiolite_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AMETHYST = registerBlock("amethyst",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_BRICK_SLAB = registerBlock("angband_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_BRICK_SLAB = registerBlock("mordor_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_STONE_SLAB = registerBlock("angband_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_STONE_FENCE = registerBlock("angband_stone_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MITHRIL_STONE_SLAB = registerBlock("mithril_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_STONE_FENCE = registerBlock("mithril_stone_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DROW_BRICK_SLAB = registerBlock("drow_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_BRICK_FENCE = registerBlock("mordor_brick_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block LUNAR_STONE_SLAB = registerBlock("lunar_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block LUNAR_STONE_FENCE = registerBlock("lunar_stone_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANGBAND_BRICK_FENCE = registerBlock("angband_brick_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MEN_KUKHOG = registerBlock("men_kukhog",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MEN_COLUAZ = registerBlock("men_coluaz",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MAROON = registerBlock("maroon",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CYAN = registerBlock("cyan",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GRAYLIME = registerBlock("graylime",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BIXBITE = registerBlock("bixbite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AZURITE = registerBlock("azurite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block BARITE = registerBlock("barite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block JADE = registerBlock("jade",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block SARD = registerBlock("sard",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ROCK_CRYSTAL = registerBlock("rock_crystal",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block LOLITE = registerBlock("lolite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GOSHRNITE = registerBlock("goshrnite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block KYANNITE = registerBlock("kyannite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ELF_DIRT = registerBlock("elf_dirt",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ARCHROITE = registerBlock("archroite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ZIRCON = registerBlock("zircon",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block WILLEMITE = registerBlock("willemite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block CARMINE = registerBlock("carmine",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block LECHULI = registerBlock("lechuli",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MOTALD = registerBlock("motald",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block AERKY = registerBlock("aerky",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block MORDOR_WEASTE = registerBlock("mordor_weaste",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_PIT_STONE = registerBlock("mordor_pit_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DEAD_BREAK = registerBlock("dead_break",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DEAD_BREAK_SLAB = registerBlock("dead_break_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DEAD_STONE = registerBlock("dead_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DEAD_STONE_SLAB = registerBlock("dead_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DEATH_STONE = registerBlock("death_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GRAVEL_MOSS = registerBlock("gravel_moss",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRT_MOSS = registerBlock("dirt_moss",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IIVHALITE = registerBlock("iivhalite",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block IIVHALITE_SLAB = registerBlock("iivhalite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block DIRT_MOSS_SLAB = registerBlock("dirt_moss_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block GATTASE = registerBlock("gattase",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block ANORNIC = registerBlock("anornic",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));
    public static final Block TAUPE = registerBlock("taupe",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool()));








    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RealmstonesMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RealmstonesMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RealmstonesMod.LOGGER.info("Registering Mod Blocks for " + RealmstonesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(InitBlocks.MITHRIL_STONE);
            entries.add(InitBlocks.MITHRIL_COBBLE);
            entries.add(InitBlocks.CRYSTAL_STONE);
            entries.add(InitBlocks.DWARF_COBBLE);
            entries.add(InitBlocks.DWARF_LIMESTONE);
            entries.add(InitBlocks.DWARF_LIMECOBBLE);
            entries.add(InitBlocks.DWARFIRON_STONE);
            entries.add(InitBlocks.TuTAHIRE_STONE);
            entries.add(InitBlocks.LUNAR_STONE);
            entries.add(InitBlocks.ARCANE);
            entries.add(InitBlocks.DROW_STONE);
            entries.add(InitBlocks.DROW_BRICK);
            entries.add(InitBlocks.DROW_COBBLE);
            entries.add(InitBlocks.DROW_COBBLESLAB);
            entries.add(InitBlocks.DWARFWHITE_BRICK);
            entries.add(InitBlocks.MORDOR_STONE);
            entries.add(InitBlocks.MORDOR_BRICK);
            entries.add(InitBlocks.MORDOR_BRICK_SLAB);
            entries.add(InitBlocks.MITHRIL_STONE_SLAB);
            entries.add(InitBlocks.ANGBAND_STONE);
            entries.add(InitBlocks.ANGBAND_BRICK);
            entries.add(InitBlocks.ANGBAND_BRICK_SLAB);
            entries.add(InitBlocks.AMETHYST);
            entries.add(InitBlocks.ANGBAND_STONE_SLAB);
            entries.add(InitBlocks.DROW_BRICK_SLAB);
            entries.add(InitBlocks.AMETHYST_SLAB);
            entries.add(InitBlocks.MITHRIL_STONE_FENCE);
            entries.add(InitBlocks.ANGBAND_STONE_FENCE);
            entries.add(InitBlocks.MORDOR_BRICK_FENCE);
            entries.add(InitBlocks.AMETHYST_FENCE);
            entries.add(InitBlocks.LUNAR_STONE_SLAB);
            entries.add(InitBlocks.LUNAR_STONE_FENCE);
            entries.add(InitBlocks.ANGBAND_BRICK_FENCE);
            entries.add(InitBlocks.DWARF_BEIGE);
            entries.add(InitBlocks.DWARF_BEIGE_BRICK);
            entries.add(InitBlocks.DWARF_STEIOLITE);
            entries.add(InitBlocks.DWARF_STEIOLITE_BRICK);
            entries.add(InitBlocks.MEN_KUKHOG);
            entries.add(InitBlocks.MEN_COLUAZ);
            entries.add(InitBlocks.MAROON);
            entries.add(InitBlocks.CYAN);
            entries.add(InitBlocks.GRAYLIME);
            entries.add(InitBlocks.BIXBITE);
            entries.add(InitBlocks.AZURITE);
            entries.add(InitBlocks.BARITE);
            entries.add(InitBlocks.JADE);
            entries.add(InitBlocks.SARD);
            entries.add(InitBlocks.ROCK_CRYSTAL);
            entries.add(InitBlocks.LOLITE);
            entries.add(InitBlocks.GOSHRNITE);
            entries.add(InitBlocks.KYANNITE);
            entries.add(InitBlocks.ELF_DIRT);
            entries.add(InitBlocks.ARCHROITE);
            entries.add(InitBlocks.ZIRCON);
            entries.add(InitBlocks.WILLEMITE);
            entries.add(InitBlocks.CARMINE);
            entries.add(InitBlocks.LECHULI);
            entries.add(InitBlocks.MOTALD);
            entries.add(InitBlocks.AERKY);
            entries.add(InitBlocks.MORDOR_WEASTE);
            entries.add(InitBlocks.MORDOR_PIT_STONE);
            entries.add(InitBlocks.DEAD_BREAK);
            entries.add(InitBlocks.DEAD_STONE);
            entries.add(InitBlocks.DEAD_BREAK_SLAB);
            entries.add(InitBlocks.DEAD_STONE_SLAB);
            entries.add(InitBlocks.DEATH_STONE);
            entries.add(InitBlocks.GRAVEL_MOSS);
            entries.add(InitBlocks.DIRT_MOSS);
            entries.add(InitBlocks.IIVHALITE);
            entries.add(InitBlocks.IIVHALITE_SLAB);
            entries.add(InitBlocks.DIRT_MOSS_SLAB);
            entries.add(InitBlocks.GATTASE);
            entries.add(InitBlocks.ANORNIC);
            entries.add(InitBlocks.TAUPE);



        });
    }
}
