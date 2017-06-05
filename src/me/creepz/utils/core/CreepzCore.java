package me.creepz.utils.core;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.creepz.utils.command.CreepzCmd;


public class CreepzCore extends JavaPlugin {
public final Logger logger = Logger.getLogger("Minecraft");
public static CreepzCore plugin;
	
  
    
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + "has been disabled.");
		
	}
	
	
	@Override
	public void onEnable(){
		
		PluginDescriptionFile pdfFile = this.getDescription();
	if(getServer().getPluginManager().getPlugin("PermissionsEx")!=null){
			
			
			getCommand("creepz").setExecutor(new CreepzCmd());
		
			 
		this.logger.info(pdfFile.getName() + "Version " + pdfFile.getVersion() + "has been enabled.");
		
	}
	else {
		this.logger.warning("Plugin CreepzUtils was not enabled because PermissionsEX does not seem to be installed.");
		this.logger.info("Plugin CreepzUtils requires PermissionsEX to be installed for the plugin to load.");
		Bukkit.getPluginManager().disablePlugin(plugin);
	}
	
	
	}
	



}
	


