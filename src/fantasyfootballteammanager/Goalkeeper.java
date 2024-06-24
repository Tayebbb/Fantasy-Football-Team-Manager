package fantasyfootballteammanager;

public class Goalkeeper extends Player {
    Goalkeeper() {
    }

    @Override
    public void addPlayer() {
        if (FantasyFootballTeamManager.totalPlayers >= 11) {
            System.out.println("Cannot add more players. Team is full.");
            return;
        }
        System.out.print("Player Name you want to add: ");
        setPlayer(sc.nextLine());
        System.out.print("Clean Sheets:");
        cleanSheets = sc.nextInt();
        sc.nextLine();
        setPosition("GoalKeeper");
        calcPoints(cleanSheets);
        System.out.print("Player Points:" + getPoints());
        setTotalPoints(getPoints());
    }
}
