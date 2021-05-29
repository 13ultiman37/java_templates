package pr6.buider;

class Worker {
    private String buildingModel = "";
    private String experience = "";

    public void setBuildingModel(String buildingModel) {
        this.buildingModel = buildingModel;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "buildingModel='" + buildingModel + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
