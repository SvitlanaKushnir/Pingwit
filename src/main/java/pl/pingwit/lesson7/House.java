package pl.pingwit.lesson7;

public class House {
    private String type;
    private int floorAmount;
    private int residentAmount;
    private boolean isHeatingOn;  // название поля не в полной мере отражает его содержание.
    // можно интерпретировать как "центральное ли отопление в доме?". больше подошло бы isHeatingOn или подобное


    public House(String type, int floorAmount, int residentAmount, boolean isHeatingOn) {
        this.type = type;
        this.floorAmount = floorAmount;
        this.residentAmount = residentAmount;
        this.isHeatingOn = isHeatingOn;
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

    public boolean isHeatingOn() {
        return isHeatingOn;
    }

    public void setHeatingOn(boolean heatingOn) {
        isHeatingOn = heatingOn;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", floorAmount=" + floorAmount +
                ", residentAmount=" + residentAmount +
                ", isHeatingOn=" + isHeatingOn +
                '}';
    }
}
