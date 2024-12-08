package dev.west.realmstonesmod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class MITHRILSTONE extends Block {
    public MITHRILSTONE(Settings BEDROCK) {
        super(BEDROCK);
    }

    @Override
    public float getHardness() {
        return super.getHardness();
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return super.canPlaceAt(state, world, pos);
    }

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return super.getCodec();
    }

    @Override
    protected void dropExperienceWhenMined(ServerWorld world, BlockPos pos, ItemStack tool, IntProvider experience) {
        super.dropExperienceWhenMined(world, pos, tool, experience);
    }

    @Override
    protected Block asBlock() {
        return super.asBlock();
    }

    @Override
    protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return super.getAmbientOcclusionLightLevel(state, world, pos);
    }

    @Override
    public MapColor getDefaultMapColor() {
        return super.getDefaultMapColor();
    }

}
