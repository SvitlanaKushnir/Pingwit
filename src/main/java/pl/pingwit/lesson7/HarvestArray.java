package pl.pingwit.lesson7;

import java.math.BigDecimal;

public class HarvestArray {
    public static void main(String[] args) {
        Harvest harvest1 = new Harvest(1L,"First Field","Rye",new BigDecimal("123.25"));
        Harvest harvest2 = new Harvest(2L,"First Field","Wheat",new BigDecimal("111.75"));
        Harvest harvest3 = new Harvest(3L,"Second Field","Strawberry",new BigDecimal("122.35"));
        Harvest harvest4 = new Harvest(4L,"Third Field","Potato",new BigDecimal("300.95"));
        Harvest harvest5 = new Harvest(5L,"Fourth Field","Potato",new BigDecimal("300.88"));
        Harvest harvest6 = new Harvest(6L,"Fifth Field","Strawberry",new BigDecimal("775.11"));

        Harvest[] harvests = {harvest1, harvest2, harvest3, harvest4, harvest5, harvest6};
        for (Harvest harvest : harvests) {
            System.out.println(harvest);
        }
    }
}
