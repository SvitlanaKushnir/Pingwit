package pl.pingwit.lesson9;

import java.util.Arrays;

public final class DepositBox {
    private final int cellNumber;
    private final String password;
    private final String[] valuables;

    public DepositBox(int cellNumber, String password, String[] valuables) {
        this.cellNumber = cellNumber;
        this.password = password;
        this.valuables = Arrays.copyOf(valuables, valuables.length);
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public String getPassword() {
        return password;
    }

    public String[] getValuables() {
        return Arrays.copyOf(valuables, valuables.length);
    }

    public String[] extractValuables(String password) {
        String[] emptyArray = {};
        if (password.equals(getPassword())) {
            return getValuables();
        } else {
            return emptyArray;
        }
    }

    @Override
    public String toString() {
        return "depositBox{" +
                "cellNumber=" + cellNumber +
                ", password='" + password + '\'' +
                ", valuables=" + Arrays.toString(valuables) +
                '}';
    }
}

