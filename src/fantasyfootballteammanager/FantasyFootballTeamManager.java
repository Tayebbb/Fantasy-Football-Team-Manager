package fantasyfootballteammanager;

import java.util.Scanner;

public class FantasyFootballTeamManager {
    static Scanner sc = new Scanner(System.in);
    static String teamName, username;
    public static Player[] new_p = new Player[11];
    static int totalPlayers = 0;

    public static void main(String[] args) {
        int x, y;
        System.out.println("Welcome to Fantasy Football!");
        System.out.print("Enter Username: ");
        username = sc.nextLine();
        System.out.print("Enter Team Name: ");
        teamName = sc.nextLine();

        while (true) {
            System.out.print("\n\nNow, let's choose your next step\n1)Add Player 2)Remove Player 3)Show Details 4)Compare 5)Exit Application\nEnter: ");
            y = sc.nextInt();

            if (y == 1) {
                System.out.println("\nGreat " + username + "! Now, let's add players to your team!");
                System.out.print("\n1)Forward 2)Midfielder 3)Defender 4)GoalKeeper\nChoose which position you want to add: ");
                x = sc.nextInt();

                if (x == 1) {
                    new_p[totalPlayers] = new Forward();
                } else if (x == 2) {
                    new_p[totalPlayers] = new Midfielder();
                } else if (x == 3) {
                    new_p[totalPlayers] = new Defender();
                } else if (x == 4) {
                    new_p[totalPlayers] = new Goalkeeper();
                }

                new_p[totalPlayers].addPlayer();
                totalPlayers++;

            } else if (y == 2) {
                System.out.println("\nTeam Details:");
                for (int i = 0; i < totalPlayers; i++) {
                    new_p[i].showDetails(i);
                }
                new_p[totalPlayers - 1].removePlayer();

            } else if (y == 3) {
                System.out.println("Team Name: " + teamName);
                System.out.println("Team Manager: " + username);
                System.out.println("Total Fantasy Points:" + new_p[0].getTotalPoints());
                System.out.println("Player Details:");
                for (int i = 0; i < totalPlayers; i++) {
                    new_p[i].showDetails(i);
                }

            } else if (y == 4) {
                for (int i = 0; i < totalPlayers; i++) {
                    System.out.println("Player " + (i + 1) + ": " + new_p[i].getPlayer());
                }
                System.out.print("Choose 2 Player Serials to compare:");
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                new_p[a - 1].compare(new_p[b - 1]);
                System.out.println("Among " + new_p[a - 1].getPlayer() + " and " + new_p[b - 1].getPlayer() + " The better player is: ");
                Player better = (new_p[a - 1].compare(new_p[b - 1]));
                System.out.println(better.getPlayer());

            } else if (y == 5) {
                System.out.println("It was nice having you!");
                System.exit(0);
            }
        }
    }
}
