package io.github.codecademyminecraftmods.atlantismod.thedeep;

import io.github.codecademyminecraftmods.atlantismod.AtlantisMod;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenOcean;

public class BiomeGenTheDeep extends BiomeGenOcean {
	
	public BiomeGenTheDeep(int par1) {
		super(par1);
		this.spawnableCreatureList.clear();
		this.topBlock = Blocks.sand;
		this.fillerBlock = AtlantisMod.blockDeepSand;
		this.setColor(0);
	}

}
