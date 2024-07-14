package nether_fortress_forever.modid;

import net.fabricmc.api.ModInitializer;

import nether_fortress_forever.modid.block.ModBlocks;
import nether_fortress_forever.modid.item.ModItemGroups;
import nether_fortress_forever.modid.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherFortressForever implements ModInitializer {
	public static final String MOD_ID = "nether_fortress_forever";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}