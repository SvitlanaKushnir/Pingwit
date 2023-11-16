package pl.pingwit.lesson11.task2;

import java.math.BigDecimal;
import java.util.Objects;

public class Receipt {
    private final String message;
    private final BigDecimal amount;

    public Receipt(String message, BigDecimal amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return message.equals(receipt.message) && amount.equals(receipt.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, amount);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }
}
