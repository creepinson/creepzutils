package me.creepz.utils.command;

import org.apache.commons.lang.Validate;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import me.creepz.utils.api.TagUtils;
import net.md_5.bungee.api.ChatColor;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class CreepzCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player)sender;

		if(sender instanceof ConsoleCommandSender){
			
			sender.sendMessage(ChatColor.RED + "You cannot send this command from the console!");
			
			
		}
		
		if(sender instanceof Player){
			 PermissionUser user = PermissionsEx.getUser((Player) sender);
		
		TagUtils.setPlayerTag(player, user.getPrefix() + sender.getName());
				  }
		
		
	
		
		
		
		
		return false;
	

		}
	
	}
	

