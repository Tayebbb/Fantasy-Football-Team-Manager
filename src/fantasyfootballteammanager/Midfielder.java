package fantasyfootballteammanager;

public class Midfielder extends Player {
    Midfielder() {
    }

    @Override
    public void addPlayer() {
        if (FantasyFootballTeamManager.totalPlayers >= 11) {
            System.out.println("Cannot add more players. Team is full.");
            return;
        }
        System.out.print("Player Name you want to add: ");
        setPlayer(sc.nextLine());
        System.out.print("Assists:");
        assists = sc.nextInt();
        sc.nextLine();
        setPosition("Midfielder");
        calcPoints(assists);
        System.out.print("Player Points:" + getPoints());
        setTotalPoints(getPoints());
    }
}
