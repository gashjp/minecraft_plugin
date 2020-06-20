package saijo.test.minecraft.plugin.hoge;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("on enable");
	}

	@Override
	public void onDisable() {
		getLogger().info("on disable");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Use in game");
			return false;
		}

		if (cmd.getName().equalsIgnoreCase("ignite")) {
			if (args.length != 1) {
				return false;
			}
			Player target = Bukkit.getPlayerExact(args[0]);
			if (target == null) {
				sender.sendMessage(args[0] + " player not found");
				return true;
			}
			target.setFireTicks(1000);
			return true;
		}
		return true;
	}
}
