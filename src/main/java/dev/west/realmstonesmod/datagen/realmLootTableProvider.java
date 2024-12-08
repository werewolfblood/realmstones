package dev.west.realmstonesmod.datagen;

import dev.west.realmstonesmod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class realmLootTableProvider extends FabricBlockLootTableProvider {
    public realmLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(InitBlocks.MITHRIL_STONE);
        addDrop(InitBlocks.MITHRIL_COBBLE);
        addDrop(InitBlocks.CRYSTAL_STONE);
        addDrop(InitBlocks.DWARF_COBBLE);
        addDrop(InitBlocks.DWARF_LIMECOBBLE);
        addDrop(InitBlocks.DWARFIRON_STONE);
        addDrop(InitBlocks.DWARF_LIMESTONE);
        addDrop(InitBlocks.TuTAHIRE_STONE);
        addDrop(InitBlocks.LUNAR_STONE);
       addDrop(InitBlocks.ARCANE);
       addDrop(InitBlocks.DROW_STONE);
       addDrop(InitBlocks.DROW_BRICK);
       addDrop(InitBlocks.DROW_COBBLE);
       addDrop(InitBlocks.DWARFWHITE_BRICK);
       addDrop(InitBlocks.DROW_COBBLESLAB);
       addDrop(InitBlocks.MORDOR_STONE);
       addDrop(InitBlocks.MORDOR_BRICK);
       addDrop(InitBlocks.MITHRIL_STONE_SLAB);
       addDrop(InitBlocks.ANGBAND_STONE);
       addDrop(InitBlocks.ANGBAND_BRICK);
       addDrop(InitBlocks.ANGBAND_BRICK_SLAB);
       addDrop(InitBlocks.MORDOR_BRICK_SLAB);
       addDrop(InitBlocks.AMETHYST);
       addDrop(InitBlocks.ANGBAND_STONE_SLAB);
       addDrop(InitBlocks.DROW_BRICK_SLAB);
       addDrop(InitBlocks.AMETHYST_SLAB);
       addDrop(InitBlocks.MITHRIL_STONE_FENCE);
       addDrop(InitBlocks.ANGBAND_STONE_FENCE);
       addDrop(InitBlocks.MORDOR_BRICK_FENCE);
       addDrop(InitBlocks.AMETHYST_FENCE);
       addDrop(InitBlocks.LUNAR_STONE_SLAB);
       addDrop(InitBlocks.LUNAR_STONE_FENCE);
       addDrop(InitBlocks.ANGBAND_BRICK_FENCE);
       addDrop(InitBlocks.DWARF_STEIOLITE);
       addDrop(InitBlocks.DWARF_STEIOLITE_BRICK);
       addDrop(InitBlocks.DWARF_BEIGE_BRICK);
       addDrop(InitBlocks.DWARF_BEIGE);
       addDrop(InitBlocks.MEN_KUKHOG);
       addDrop(InitBlocks.MEN_COLUAZ);
       addDrop(InitBlocks.MAROON);
       addDrop(InitBlocks.CYAN);
       addDrop(InitBlocks.GRAYLIME);
       addDrop(InitBlocks.BIXBITE);
       addDrop(InitBlocks.AZURITE);
       addDrop(InitBlocks.BARITE);
       addDrop(InitBlocks.JADE);
       addDrop(InitBlocks.SARD);
       addDrop(InitBlocks.ROCK_CRYSTAL);
       addDrop(InitBlocks.LOLITE);
       addDrop(InitBlocks.GOSHRNITE);
       addDrop(InitBlocks.KYANNITE);
       addDrop(InitBlocks.ELF_DIRT);
       addDrop(InitBlocks.ARCHROITE);
       addDrop(InitBlocks.ZIRCON);
       addDrop(InitBlocks.WILLEMITE);
       addDrop(InitBlocks.CARMINE);
       addDrop(InitBlocks.LECHULI);
       addDrop(InitBlocks.MOTALD);
       addDrop(InitBlocks.AERKY);
       addDrop(InitBlocks.MORDOR_WEASTE);
       addDrop(InitBlocks.MORDOR_PIT_STONE);
       addDrop(InitBlocks.DEAD_BREAK);
       addDrop(InitBlocks.DEAD_STONE);
       addDrop(InitBlocks.DEAD_BREAK_SLAB);
       addDrop(InitBlocks.DEAD_STONE_SLAB);
       addDrop(InitBlocks.DEATH_STONE);
       addDrop(InitBlocks.GRAVEL_MOSS);
       addDrop(InitBlocks.DIRT_MOSS);
       addDrop(InitBlocks.IIVHALITE);
       addDrop(InitBlocks.IIVHALITE_SLAB);
       addDrop(InitBlocks.DIRT_MOSS_SLAB);
        addDrop(InitBlocks.GATTASE);
        addDrop(InitBlocks.ARCHROITE);
        addDrop(InitBlocks.TAUPE);
        addDrop(InitBlocks.SILVER_STONE);
        addDrop(InitBlocks.PEAL_STONE);
        addDrop(InitBlocks.NIGHT_STONE);
        addDrop(InitBlocks.CRYSTALICE_STONE);
        addDrop(InitBlocks.CRYSTALICE_STONE_SLAB);
        addDrop(InitBlocks.CRYSTALICE_STONE_FENCE);
        addDrop(InitBlocks.NIGHT_STONE_SLAB);
        addDrop(InitBlocks.SILVER_STONE_SLAB);
        addDrop(InitBlocks.SILVER_STONE_FENCE);
        addDrop(InitBlocks.GOLDSTONE);
        addDrop(InitBlocks.CRYSTAL_BLUE);
        addDrop(InitBlocks.CRYSTAL_GOLD);
        addDrop(InitBlocks.CRYSTAL_SILVER);
        addDrop(InitBlocks.CRYSTAL_ORE);
        addDrop(InitBlocks.MORDOR_ORE);
        addDrop(InitBlocks.LILAC_STONE);
        addDrop(InitBlocks.LILAC_STONE_SLAB);
        addDrop(InitBlocks.LILAC_STONE_FENCE);
        addDrop(InitBlocks.MOSS_PEAL);
        addDrop(InitBlocks.GUNBAND_STONE);
        addDrop(InitBlocks.GUNBAND_STONE_SLAB);
        addDrop(InitBlocks.MORIA_STONE);
        addDrop(InitBlocks.MORIA_STONE_SLAB);
        addDrop(InitBlocks.DWARF_DIRT);
        addDrop(InitBlocks.TAN_DIRT);
        addDrop(InitBlocks.DWARF_DIRT_SLAB);
        addDrop(InitBlocks.TAN_DIRT_SLAB);
        addDrop(InitBlocks.SALIC_DIRT);
        addDrop(InitBlocks.CRYSTAL_DIRT);
        addDrop(InitBlocks.CRYSTAL_DIRT_SLAB);
        addDrop(InitBlocks.ELF_DIRT_SLAB);
        addDrop(InitBlocks.DROW_COBBLE_SLAB);
        addDrop(InitBlocks.IRONDWARF_STONE);
        addDrop(InitBlocks.IRONDWARF_STONE_SLAB);
        addDrop(InitBlocks.ORC_BLOOD_STONE);
        addDrop(InitBlocks.ORC_STONE);
        addDrop(InitBlocks.ORC_LANTERN);
        addDrop(InitBlocks.EVIL_BRICK);
        addDrop(InitBlocks.ORC_BRICK);







    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
