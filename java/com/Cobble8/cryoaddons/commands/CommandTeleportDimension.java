package com.Cobble8.cryoaddons.commands;

import java.awt.List;
import java.util.ArrayList;

import com.Cobble8.cryoaddons.commands.util.CustomTeleporter;
import com.Cobble8.cryoaddons.util.Reference;
import com.google.common.collect.Lists;

import akka.util.Collections;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandTeleportDimension extends CommandBase {
		
	private final ArrayList<String> aliases = Lists.newArrayList(Reference.MOD_ID, "TP", "tp", "tpdim", "tpdimension", "teleport");
		
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
			
		if(args.length < 1) return;
			
		String s = args[0];
		int dimension;
			
		try
		{
			dimension = Integer.parseInt(s);
		} catch(NumberFormatException e)
		{
			sender.sendMessage(new TextComponentString(TextFormatting.RED + "Dimension not found"));
			return;
		}
			
		if(sender instanceof EntityPlayer)
			{
				CustomTeleporter.teleportToDimension((EntityPlayer)sender, dimension, 0, 100, 0);
			}
		}
		
		@Override
		public String getName() 
		{
			return "tpdimension";
		}
		
		@Override
		public String getUsage(ICommandSender sender)
		{
			return "tpdimension <id>";
		}
		
		@Override
		public ArrayList<String> getAliases() 
		{
			return aliases;
		}
		
		@Override
		public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
		{
			return true;
		}
		
		/*@Override
		public java.util.List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) 
		{
			return Collections.emptyList();
		}*/
	}

