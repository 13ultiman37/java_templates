package pr6.buider;

public abstract class WorkerBuilder {
    protected Worker worker;

    public Worker getWorker(){
        return worker;
    }

    public void createWorker(){
        worker = new Worker();
    }

    public abstract void buildModel();
    public abstract void buildExperience();
}
