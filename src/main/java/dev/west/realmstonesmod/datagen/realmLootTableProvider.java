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
        addDrop(InitBlocks.TITAHIRE_STONE);
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

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
