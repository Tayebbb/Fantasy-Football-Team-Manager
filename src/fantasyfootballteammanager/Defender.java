package fantasyfootballteammanager;

public class Defender extends Player {
    Defender() {
    }

    @Override
    public void addPlayer() {
        if (FantasyFootballTeamManager.totalPlayers >= 11) {
            System.out.println("Cannot add more players. Team is full.");
            return;
        }
        System.out.print("Player Name you want to add: ");
        setPlayer(sc.nextLine());
        System.out.print("Clean Tackles:");
        tackles = sc.nextInt();
        sc.nextLine();
        setPosition("Defender");
        calcPoints(tackles);
        System.out.print("Player Points:" + getPoints());
        setTotalPoints(getPoints());
    }
}
