package dev.west.realmstonesmod;

import dev.west.realmstonesmod.datagen.realmBlockTagProvider;
import dev.west.realmstonesmod.datagen.realmItemTagProvider;
import dev.west.realmstonesmod.datagen.realmLootTableProvider;
import dev.west.realmstonesmod.datagen.realmModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RealmstonesModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(realmBlockTagProvider::new);
		pack.addProvider(realmItemTagProvider::new);
		pack.addProvider(realmModelProvider::new);
		pack.addProvider(realmLootTableProvider::new);

	}
}
