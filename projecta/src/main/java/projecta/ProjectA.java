package projecta;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("projecta")
public class ProjectA {
	
	public static ProjectA instance;
	public static final String modid = "projecta";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public ProjectA() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("Setup Method Registered");
	}
	private void clientRegistries(final FMLClientSetupEvent event) {
		logger.info("Client Registries Method Registered");
	}
}
