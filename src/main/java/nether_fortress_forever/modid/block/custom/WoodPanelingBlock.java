package nether_fortress_forever.modid.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class WoodPanelingBlock extends Block {
    public static final IntProperty CONNECTED_STATE = IntProperty.of("connected_state", 0, 3);

    public WoodPanelingBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(CONNECTED_STATE, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CONNECTED_STATE);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return state.with(CONNECTED_STATE, getConnectedState(world, pos));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(CONNECTED_STATE, getConnectedState(ctx.getWorld(), ctx.getBlockPos()));
    }

    private int getConnectedState(WorldAccess world, BlockPos pos) {
        boolean up = world.getBlockState(pos.up()).isOf(this);
        boolean down = world.getBlockState(pos.down()).isOf(this);

        if (up && down) {
            return 3; // Connected both up and down
        } else if (up) {
            return 1; // Connected only up
        } else if (down) {
            return 2; // Connected only down
        } else {
            return 0; // Not connected
        }
    }
}