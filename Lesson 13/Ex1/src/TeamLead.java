public class TeamLead {
    private int numTeamLead;

    public TeamLead(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }

    private void employ() {
        System.out.println(numTeamLead + " teamlead");
    }
}