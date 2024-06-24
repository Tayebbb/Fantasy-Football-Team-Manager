package fantasyfootballteammanager;

import java.util.Scanner;

public abstract class Player extends Entity {
    private String position, player;
    private int points;
    private static int totalPoints = 0;
    static Scanner sc = new Scanner(System.in);

    public Player() {
    }

    public void removePlayer() {
        int i;
        System.out.println("Choose Serial Number of Player you want to remove: ");
        i = sc.nextInt();
        for (int j = i - 1; j < FantasyFootballTeamManager.totalPlayers - 1; j++) {
            FantasyFootballTeamManager.new_p[j] = FantasyFootballTeamManager.new_p[j + 1];
        }
        FantasyFootballTeamManager.new_p[FantasyFootballTeamManager.totalPlayers - 1] = null;
        FantasyFootballTeamManager.totalPlayers--;
        System.out.println("Player removed successfully.");
    }

    @Override
    public void showDetails(int index) {
        if (FantasyFootballTeamManager.totalPlayers == 0) {
            System.out.println("No Players Added");
        } else {
            System.out.println("\nPlayer " + (index + 1) + ":" + player + " Position: " + position + " Points: " + points);
        }
    }

    public Player compare(Player p) {
        if (this.points < p.points) {
            return p;
        } else {
            return this;
        }
    }

    public String getPosition() {
        return position;
    }

    public String getPlayer() {
        return player;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlayer(String player) {
        return player;
    }

    public int getPoints() {
        return points;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int setTotalPoints(int points) {
        return totalPoints += points;
    }

    public void calcPoints(int a) {
        if (this.position.equals("Forward")) {
            this.points = a * 6;
        } else if (this.position.equals("Midfielder")) {
            this.points = a * 3;
        } else if (this.position.equals("Defender")) {
            this.points = a * 4;
        } else if (this.position.equals("GoalKeeper")) {
            this.points = a * 5;
        }
    }

    public abstract void addPlayer();
}
