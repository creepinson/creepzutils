package me.creepz.utils.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_11_R1.EntityPlayer;
import net.minecraft.server.v1_11_R1.PacketPlayOutNamedEntitySpawn;

public class TagUtils {

	public static void setPlayerTag(Player player, String text){
		
		String oldName = player.getName();
		EntityPlayer changingName = ((CraftPlayer)player).getHandle();
		
		
	changingName.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
	
	for(Player playersinworld : Bukkit.getOnlinePlayers()){
		
		if(playersinworld!=player){
			
			((CraftPlayer)playersinworld).getHandle().playerConnection.sendPacket(new PacketPlayOutNamedEntitySpawn(changingName));
			
		}
		
	}
	

	
	}
	
	
	
}
