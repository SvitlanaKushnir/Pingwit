package pl.pingwit.lesson9;

import java.util.Arrays;

public class BankWarehouse {
    private final String cellName;
    private final DepositBox[] DepositBoxes;

    public BankWarehouse(String cellName, DepositBox[] DepositBoxes) {
        this.cellName = cellName;
        this.DepositBoxes = Arrays.copyOf(DepositBoxes, DepositBoxes.length);
    }

    public String getCellName() {
        return cellName;
    }

    public DepositBox[] getDepositBoxes() {
        return Arrays.copyOf(DepositBoxes, DepositBoxes.length);
    }
    int counter = 0;

    public DepositBox next() {

        if (counter < DepositBoxes.length - 1) {
            return DepositBoxes[counter++];
        } else {
            counter = 0;
            return DepositBoxes[DepositBoxes.length - 1];
        }
    }

        @Override
        public String toString () {
            return "BankWarehouse{" +
                    "cellName='" + cellName + '\'' +
                    ", DepositBoxes=" + Arrays.toString(DepositBoxes) +
                    '}';
        }
}