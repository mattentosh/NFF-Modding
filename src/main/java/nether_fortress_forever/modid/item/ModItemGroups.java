package nether_fortress_forever.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nether_fortress_forever.modid.NetherFortressForever;
import nether_fortress_forever.modid.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup NFF_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NetherFortressForever.MOD_ID, "nff"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.NFF"))
                    .icon(() -> new ItemStack(ModBlocks.CRACKED_DUNGEON_BRICK)).entries((displayContext, entries) -> {


                        //entried.add(ModItems.Examplename);
                        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK);
                        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_DUNGEON_BRICK_STAIRS);

                        entries.add(ModBlocks.DUNGEON_BRICK);
                        entries.add(ModBlocks.DUNGEON_BRICK_SLAB);
                        entries.add(ModBlocks.DUNGEON_BRICK_STAIRS);

                        entries.add(ModBlocks.DUNGEON_TILES);
                        entries.add(ModBlocks.DUNGEON_TILE_SLAB);
                        entries.add(ModBlocks.DUNGEON_TILE_STAIRS);

                        entries.add(ModBlocks.GILDED_CUT_DUNGEON_BRICK);
                        entries.add(ModBlocks.GILDED_CUT_DUNGEON_BRICK_MIRRORED);
                        entries.add(ModBlocks.GILDED_DUNGEON_BRICK);

                        entries.add(ModBlocks.MIXED_DUNGEON_TILES);

                        entries.add(ModBlocks.PORTAL_GATE);

                        entries.add(ModBlocks.WITHERSKULL_BRICKS);
                        entries.add(ModBlocks.WITHERSKULL_BRICKS_ENCHANTED);

                        entries.add(ModBlocks.CASTLE_WOOD_PLANKS);
                        entries.add(ModBlocks.CASTLE_WOOD_SLAB);
                        entries.add(ModBlocks.CASTLE_WOOD_STAIRS);

                        entries.add(ModBlocks.BRAZIER);




                        }).build());
//creating a new item group with the Cracked Dungeon Brick item as the image

    public static void registerItemGroups() {
        NetherFortressForever.LOGGER.info("Conjuring Item Groups for " +NetherFortressForever.MOD_ID );


    }


}
