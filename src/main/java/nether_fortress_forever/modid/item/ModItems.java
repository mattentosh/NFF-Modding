package nether_fortress_forever.modid.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nether_fortress_forever.modid.NetherFortressForever;
import nether_fortress_forever.modid.block.ModBlocks;

public class ModItems {



    private static void addItemsToCreativeTabItemGroup(FabricItemGroupEntries entries) {
        //entries.add(Example);
        // do this entry to add items
        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK);
        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK_SLAB);
        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK_STAIRS);

        entries.add(ModBlocks.DUNGEON_BRICK);
        entries.add(ModBlocks.DUNGEON_BRICK_SLAB);
        entries.add(ModBlocks.DUNGEON_BRICK_STAIRS);

        entries.add(ModBlocks.DUNGEON_TILES);
        entries.add(ModBlocks.DUNGEON_TILE_SLAB);
        entries.add(ModBlocks.DUNGEON_TILE_STAIRS);

        entries.add(ModBlocks.MIXED_DUNGEON_TILES);

        entries.add(ModBlocks.PORTAL_GATE);

        entries.add(ModBlocks.WITHERSKULL_BRICKS);
        entries.add(ModBlocks.WITHERSKULL_BRICKS_ENCHANTED);

        entries.add(ModBlocks.CASTLE_WOOD_PLANKS);
        entries.add(ModBlocks.CASTLE_WOOD_SLAB);
        entries.add(ModBlocks.CASTLE_WOOD_STAIRS);

        entries.add(ModBlocks.WOOD_PANELING);

        entries.add(ModBlocks.BRAZIER);
        entries.add(ModBlocks.CHANDELIER);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NetherFortressForever.MOD_ID, name), item);
    }



    public static void registerModItems() {
        NetherFortressForever.LOGGER.info("Summoning Mod Items from the Void for " + NetherFortressForever.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCreativeTabItemGroup);

    }
}
