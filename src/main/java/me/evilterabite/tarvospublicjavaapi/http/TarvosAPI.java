package me.evilterabite.tarvospublicjavaapi.http;

import me.evilterabite.tarvospublicjavaapi.TarvosPublicJavaAPI;
import me.evilterabite.tarvospublicjavaapi.libraries.TarvosPlayer;
import org.json.JSONArray;

public class TarvosAPI {
    public static TarvosPlayer getPlayer(String token) {
        JSONArray array = new JSONArray(TarvosPublicJavaAPI.connect(token));
        int id = array.getJSONObject(0).getInt("id");
        String name = array.getJSONObject(0).getString("name");
        String uuid = array.getJSONObject(0).getString("uuid");
        String rank = array.getJSONObject(0).getString("playerRank");
        double balance = array.getJSONObject(0).getDouble("balance");
        String discord = array.getJSONObject(0).getString("discord");
        String clan = array.getJSONObject(0).getString("clan");
        String clanRank = array.getJSONObject(0).getString("clanRank");
        int lastOnline = array.getJSONObject(0).getInt("lastOnline");
        int playTime = array.getJSONObject(0).getInt("playTime");

        if (clanRank.equals("")) {
            clanRank = "Not Set";
        }
        if(clan.equals("")) {
            clan = "Not in Clan";
            clanRank = "Not in Clan";
        }
        return new TarvosPlayer(id,name,uuid,rank,balance,discord,clan,clanRank,lastOnline,playTime);
    }
}