package pl.pingwit.lesson7;

import java.util.Arrays;

public class HouseCatalog {
    private String city;
    private String district;
    private House [] housesList;

    public HouseCatalog(String city, String district, House[] housesList) {
        this.city = city;
        this.district = district;
        this.housesList = housesList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public House[] getHousesList() {
        return housesList;
    }

    public void setHousesList(House[] housesList) {
        this.housesList = housesList;
    }

    @Override
    public String toString() {
        return "HouseCatalog{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", housesList=" + Arrays.toString(housesList) +
                '}';
    }
}
