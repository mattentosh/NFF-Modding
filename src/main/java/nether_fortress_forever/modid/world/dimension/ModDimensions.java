package nether_fortress_forever.modid.world.dimension;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import nether_fortress_forever.modid.NetherFortressForever;

import java.util.OptionalLong;

public class ModDimensions {

    public static final RegistryKey<DimensionOptions> DUNGEONDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(NetherFortressForever.MOD_ID, "dungeondim"));

    public static final RegistryKey<DimensionType> DUNGEON_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(NetherFortressForever.MOD_ID, "dungeondim_type"));

    public static final RegistryKey<World> DUNGEON_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(NetherFortressForever.MOD_ID, "dungeondim"));


    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(DUNGEON_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.OVERWORLD_ID, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }


    public static void register() {
        NetherFortressForever.LOGGER.debug("Registering Dimension for"+ NetherFortressForever.MOD_ID);
        System.out.println("atsdfuyasfgvgudguyarduytvg");

    }
}
