package fantasyfootballteammanager;

public abstract class Entity {
    static int goalsScored = 0;
    static int cleanSheets = 0;
    static int assists = 0;
    static int tackles = 0;

    public abstract void showDetails(int i);
}
