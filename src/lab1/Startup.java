package lab1;

/**
 *
 * @author schra_000
 */
public class Startup {
    public static void main(String[] args) {
        Team team = new Team();
        TeamMemberObserver tmo1 = new TeamMemberObserver();
        team.addListener(tmo1);
        team.setTeamColor("Blue");
    }
}
