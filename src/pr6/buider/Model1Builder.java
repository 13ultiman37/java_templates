package pr6.buider;

public class Model1Builder extends WorkerBuilder {
    @Override
    public void buildModel() {
        worker.setBuildingModel("Model1");
    }

    @Override
    public void buildExperience(){
        worker.setExperience("High");
    }
}
