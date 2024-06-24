package fantasyfootballteammanager;

public class Forward extends Player {
    Forward() {
    }

    @Override
    public void addPlayer() {
        if (FantasyFootballTeamManager.totalPlayers >= 11) {
            System.out.println("Cannot add more players. Team is full.");
            return;
        }
        System.out.print("Player Name you want to add: ");
        setPlayer(sc.nextLine());
        System.out.print("Goals Scored:");
        goalsScored = sc.nextInt();
        sc.nextLine();
        setPosition("Forward");
        calcPoints(goalsScored);
        System.out.print("Player Points:" + getPoints());
        setTotalPoints(getPoints());
    }
}
