package space.rhilenova.mc.sticky_sleep.block;

import net.minecraft.block.BlockWeb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class BlockComfortableWeb extends BlockWeb
{
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player,
                                    int meta, float sideX, float sideY, float sideZ)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            player.setSpawnChunk(new ChunkCoordinates(x, y, z), false);
            return true;
        }
    }
}
