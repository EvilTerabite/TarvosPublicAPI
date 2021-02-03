package me.evilterabite.tarvospublicjavaapi.libraries;

public class TarvosPlayer {
    private final int id;
    private final String name;
    private final String uuid;
    private final String rank;
    private final double balance;
    private final String discord;
    private final String clan;
    private final String clanRank;
    private final int lastOnline;
    private final int playtime;

    public TarvosPlayer(int id, String name, String uuid, String rank, double balance, String discord, String clan, String clanRank, int lastOnline, int playtime) {
        this.id = id;
        this.name = name;
        this.uuid = uuid;
        this.rank = rank;
        this.balance = balance;
        this.discord = discord;
        this.clan = clan;
        this.clanRank = clanRank;
        this.lastOnline = lastOnline;
        this.playtime = playtime;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public String getRank() {
        return rank;
    }

    public double getBalance() {
        return balance;
    }

    public String getDiscord() {
        return discord;
    }

    public String getClan() {
        return clan;
    }

    public String getClanRank() {
        return clanRank;
    }

    public int getLastOnline() {
        return lastOnline;
    }

    public int getPlaytime() {
        return playtime;
    }
}
