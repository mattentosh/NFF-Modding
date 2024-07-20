package nether_fortress_forever.modid.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nether_fortress_forever.modid.NetherFortressForever;
import nether_fortress_forever.modid.block.custom.PortalGateBlock;
import nether_fortress_forever.modid.block.custom.WoodPanelingBlock;

public class ModBlocks {

    public static final Block CRACKED_DUNGEON_BRICK = registerBlock("cracked_dungeon_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    // creates the new block and coppies the settings,sound,harness from stone bricks
    public static final Block CRACKED_DUNGEON_BRICK_SLAB = registerBlock("cracked_dungeon_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block CRACKED_DUNGEON_BRICK_STAIRS = registerBlock("cracked_dungeon_brick_stairs",
            new StairsBlock(ModBlocks.CRACKED_DUNGEON_BRICK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));


    public static final Block DUNGEON_BRICK = registerBlock("dungeon_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block DUNGEON_BRICK_SLAB = registerBlock("dungeon_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block DUNGEON_BRICK_STAIRS = registerBlock("dungeon_brick_stairs",
            new StairsBlock(ModBlocks.DUNGEON_BRICK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block DUNGEON_TILES = registerBlock("dungeon_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block DUNGEON_TILE_SLAB = registerBlock("dungeon_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block DUNGEON_TILE_STAIRS = registerBlock("dungeon_tile_stairs",
            new StairsBlock(ModBlocks.DUNGEON_TILES.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block GILDED_CUT_DUNGEON_BRICK = registerBlock("gilded_cut_dungeon_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block GILDED_CUT_DUNGEON_BRICK_MIRRORED = registerBlock("gilded_cut_dungeon_brick_mirrored",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block GILDED_DUNGEON_BRICK = registerBlock("gilded_dungeon_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block MIXED_DUNGEON_TILES = registerBlock("mixed_dungeon_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block PORTAL_GATE = registerBlock("portal_gate",
            new PortalGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block WITHERSKULL_BRICKS = registerBlock("witherskull_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));
    public static final Block WITHERSKULL_BRICKS_ENCHANTED = registerBlock("witherskull_bricks_enchanted",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS)));

//find how to do the scrolling texture for enchanted wither brick

    public static final Block CASTLE_WOOD_PLANKS = registerBlock("castle_wood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CASTLE_WOOD_SLAB = registerBlock("castle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CASTLE_WOOD_STAIRS = registerBlock("castle_wood_stairs",
            new StairsBlock(ModBlocks.CASTLE_WOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


    public static final Block WOOD_PANELING = registerBlock("wood_paneling",
            new WoodPanelingBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


    public static final Block BRAZIER = registerBlock("brazier",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block CHANDELIER = registerBlock("chandelier",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NetherFortressForever.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NetherFortressForever.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        NetherFortressForever.LOGGER.info("Registering ModBlocks for" + NetherFortressForever.MOD_ID);

    }
}
