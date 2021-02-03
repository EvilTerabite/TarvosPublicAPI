package me.evilterabite.tarvospublicjavaapi.util;

import org.bukkit.Bukkit;

public class Console {
    public static void sendMessage(String message) {
        Bukkit.getServer().getConsoleSender().sendMessage(message);
    }
}
