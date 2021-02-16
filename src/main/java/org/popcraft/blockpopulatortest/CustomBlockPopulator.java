package org.popcraft.blockpopulatortest;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class CustomBlockPopulator extends BlockPopulator {
    @Override
    public void populate(World world, Random random, Chunk source) {
        source.getBlock(0, world.getMaxHeight() - 1, 0).setType(Material.DIAMOND_BLOCK, false);
        Bukkit.getLogger().info(String.format("Populated chunk %d, %d", source.getX(), source.getZ()));
    }
}
