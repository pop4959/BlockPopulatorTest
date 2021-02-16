package org.popcraft.blockpopulatortest;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockPopulatorTest extends JavaPlugin {
    private static final ChunkGenerator chunkGenerator = new CustomChunkGenerator();

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return chunkGenerator;
    }
}
