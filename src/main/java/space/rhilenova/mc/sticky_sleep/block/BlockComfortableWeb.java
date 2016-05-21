package space.rhilenova.mc.sticky_sleep.block;

import net.minecraft.block.BlockWeb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import space.rhilenova.mc.sticky_sleep.StickySleep;

public class BlockComfortableWeb extends BlockWeb
{
    public BlockComfortableWeb()
    {
        super();
        this.setCreativeTab(StickySleep.ss_tab);
        this.setBlockName(StickySleep.MODID + "_comfyWeb");
        this.setBlockTextureName("minecraft:web");
    }

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
            player.addChatComponentMessage(new ChatComponentTranslation("commands.spawnpoint.success", player.getDisplayName(), x, y, z));
            player.setSpawnChunk(new ChunkCoordinates(x, y, z), false);
            return true;
        }
    }
}
