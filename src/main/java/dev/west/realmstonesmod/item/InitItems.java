package dev.west.realmstonesmod.item;

import dev.west.realmstonesmod.RealmstonesMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class InitItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RealmstonesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealmstonesMod.LOGGER.info("Registering Mod Items for " + RealmstonesMod.MOD_ID);



        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}

