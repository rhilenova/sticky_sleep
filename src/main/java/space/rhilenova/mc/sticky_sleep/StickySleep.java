package space.rhilenova.mc.sticky_sleep;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = StickySleep.MODID, version = StickySleep.VERSION)
public class StickySleep
{
    public static final String MODID = "sticky_sleep";
    public static final String VERSION = "1.0";

    @Instance
    public static StickySleep instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
