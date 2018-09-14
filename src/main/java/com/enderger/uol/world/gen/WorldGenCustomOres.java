package com.enderger.uol.world.gen;

//Imports
import com.enderger.uol.init.BlockInit;
import com.enderger.uol.objects.BlockOres;
import com.enderger.uol.util.handelers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;


public class WorldGenCustomOres implements IWorldGenerator {
    private WorldGenerator ore_overworld_copper;
    private WorldGenerator ore_overworld_aluminum;
    private WorldGenerator ore_overworld_tin;
    private WorldGenerator ore_overworld_silver;
    private WorldGenerator ore_overworld_lead;
    private WorldGenerator ore_overworld_mithril;
    private WorldGenerator ore_overworld_nickel;
    private WorldGenerator ore_overworld_platinum;

    public WorldGenCustomOres() {
        ore_overworld_copper = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER), 8, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_aluminum = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ALUMINUM), 8, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_tin = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TIN), 8, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_silver = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SILVER), 8, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_lead = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.LEAD), 3, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_mithril = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MITHRIL), 4, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_nickel = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.NICKEL), 4, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_platinum = new WorldGenMinable(BlockInit.OVERWORLD_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PLATINUM), 4, BlockMatcher.forBlock(Blocks.STONE));
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
        if(minHeight > maxHeight || minHeight < 0) throw new IllegalArgumentException("Ore generated out of bounds.");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0:
                runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 8, 40, 75);
                runGenerator(ore_overworld_aluminum, world, random, chunkX, chunkZ, 4, 20, 60);
                runGenerator(ore_overworld_tin, world, random, chunkX, chunkZ, 7, 20, 55);
                runGenerator(ore_overworld_mithril, world, random, chunkX, chunkZ, 4, 4, 20);
                runGenerator(ore_overworld_platinum, world, random, chunkX, chunkZ, 2, 4, 20);
                runGenerator(ore_overworld_silver, world, random, chunkX, chunkZ, 4, 5, 30);
                runGenerator(ore_overworld_lead, world, random, chunkX, chunkZ, 4, 10, 35);
                runGenerator(ore_overworld_nickel, world, random, chunkX, chunkZ, 2, 5, 20);
        }
    }
}
