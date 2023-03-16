package com.ned.airdrop;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;



public class airdrop extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info(" _   _\n" +
                "| \\ | |\n" +
                "|  \\| |\n" +
                "| |\\  |\n" +
                "|_| \\_|\n" +
                "        \n" +
                "        \n" +
                " _____\n" +
                "| ____|\n" +
                "| |__  \n" +
                "|  __| \n" +
                "| |___ \n" +
                "|_____|\n" +
                "        \n" +
                "        \n" +
                " _____ \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n" +
                "        \n" +
                "        \n" +
                "Airdrop LOADED!!!!!"); 
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("airdrop")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be run by a player.");
                return true;
            }

            Player player = (Player) sender;

            if (args.length < 3) {
                player.sendMessage("Usage: /airdrop <x> <y> <z>");
                return true;
            }

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = Integer.parseInt(args[2]);

            ItemStack tool = new ItemStack(Material.NETHERITE_AXE, 1);
            player.getWorld().dropItemNaturally(player.getLocation(), tool);

            player.sendMessage("Tool created at " + x + ", " + y + ", " + z);
            return true;
        }

        return false;
    }
}
