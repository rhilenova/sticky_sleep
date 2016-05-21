package space.rhilenova.mc.sticky_sleep;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import space.rhilenova.mc.sticky_sleep.block.BlockComfortableWeb;

@Mod(modid = StickySleep.MODID, version = StickySleep.VERSION)
public class StickySleep
{
    public static final String MODID = "sticky_sleep";
    public static final String VERSION = "1.0";

    public static Block web;

    public static final CreativeTabs ss_tab = new CreativeTabs(MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            ItemStack iStack = new ItemStack(web);
            return iStack.getItem();
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        web = new BlockComfortableWeb();
        GameRegistry.registerBlock(web, "comfyWeb");
    }
    // MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.entity.player.PlayerWakeUpEvent(this, p_70999_1_, p_70999_2_, p_70999_3_));
}
