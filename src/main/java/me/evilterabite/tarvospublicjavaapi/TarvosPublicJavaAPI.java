package me.evilterabite.tarvospublicjavaapi;

import me.evilterabite.tarvospublicjavaapi.util.Console;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public final class TarvosPublicJavaAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin Enable Logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String connect(String token) {
        String bearerToken = "Bearer {token}".replace("{token}", token);
        String url = "https://api.tarvos-gaming.com/api/v3/public/me/accounts";
        Console.sendMessage(ChatColor.YELLOW + "Connecting to Tarvos...");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
                .setHeader("Authorization", bearerToken)
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
        String response = null;
        try {
            response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        Console.sendMessage(ChatColor.GREEN + "Connection Successful!");

        return response;
    }
}
