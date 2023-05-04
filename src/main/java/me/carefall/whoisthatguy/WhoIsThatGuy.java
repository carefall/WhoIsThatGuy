package me.carefall.whoisthatguy;

import static me.carefall.whoisthatguy.utils.Painter.paint;

import org.bukkit.plugin.java.JavaPlugin;

public class WhoIsThatGuy extends JavaPlugin {
	
	public void onEnable() {
		saveDefaultConfig();
		send("&aPlugin enabled!");
	}
	
	public void send(String text) {
		getServer().getConsoleSender().sendMessage("[WhoIsThatGuy] " + paint(text));
	}

	public void onDisable() {
		send("&cPlugin disabled!");
	}

}
