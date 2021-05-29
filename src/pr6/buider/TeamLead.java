package pr6.buider;

public class TeamLead {
    private WorkerBuilder workerBuilder;

    public void setWorkerBuilder(WorkerBuilder wb){
        workerBuilder = wb;
    }

    public Worker getWorker(){
        return workerBuilder.getWorker();
    }

    public void constructWorker(){
        workerBuilder.createWorker();
        workerBuilder.buildExperience();
        workerBuilder.buildModel();
    }
}
