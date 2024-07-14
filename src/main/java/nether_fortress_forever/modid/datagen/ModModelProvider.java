package nether_fortress_forever.modid.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import nether_fortress_forever.modid.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output); }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


       BlockStateModelGenerator.BlockTexturePool crackedbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_DUNGEON_BRICK);
       BlockStateModelGenerator.BlockTexturePool brickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUNGEON_BRICK);
       BlockStateModelGenerator.BlockTexturePool tilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUNGEON_TILES);

       BlockStateModelGenerator.BlockTexturePool castlewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CASTLE_WOOD_PLANKS);

       crackedbrickPool.stairs(ModBlocks.CRACKED_DUNGEON_BRICK_STAIRS);
       crackedbrickPool.slab(ModBlocks.CRACKED_DUNGEON_BRICK_SLAB);

       brickPool.stairs(ModBlocks.DUNGEON_BRICK_STAIRS);
       brickPool.slab(ModBlocks.DUNGEON_BRICK_SLAB);

       tilePool.stairs(ModBlocks.DUNGEON_TILE_STAIRS);
       tilePool.slab(ModBlocks.DUNGEON_TILE_SLAB);

       castlewoodPool.stairs(ModBlocks.CASTLE_WOOD_STAIRS);
       castlewoodPool.slab(ModBlocks.CASTLE_WOOD_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }


}
