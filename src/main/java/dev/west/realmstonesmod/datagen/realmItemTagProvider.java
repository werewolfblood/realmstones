package dev.west.realmstonesmod.datagen;

import dev.west.realmstonesmod.unit.RealmTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class realmItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public realmItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(RealmTags.Items.TRANSFORMABLE_ITEMS);


    }
}