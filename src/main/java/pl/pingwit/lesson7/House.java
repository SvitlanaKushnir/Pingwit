package pl.pingwit.lesson7;

public class House {
    private String type;
    private int floorAmount;
    private int residentAmount;
    private boolean centralHeating;

    public House(String type, int floorAmount, int residentAmount, boolean centralHeating) {
        this.type = type;
        this.floorAmount = floorAmount;
        this.residentAmount = residentAmount;
        this.centralHeating = centralHeating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

    public void setFloorAmount(int floorAmount) {
        this.floorAmount = floorAmount;
    }

    public int getResidentAmount() {
        return residentAmount;
    }

    public void setResidentAmount(int residentAmount) {
        this.residentAmount = residentAmount;
    }

    public boolean isCentralHeating() {
        return centralHeating;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", floorAmount=" + floorAmount +
                ", residentAmount=" + residentAmount +
                ", centralHeating=" + centralHeating +
                '}';
    }
}
