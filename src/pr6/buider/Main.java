package pr6.buider;

public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead();
        teamLead.setWorkerBuilder(new Model1Builder());
        teamLead.constructWorker();
        System.out.println(teamLead.getWorker());
    }

}
