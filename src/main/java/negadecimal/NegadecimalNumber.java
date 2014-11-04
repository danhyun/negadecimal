package negadecimal;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class NegadecimalNumber {

    private int decimal;

    public NegadecimalNumber(String s) {
        // convert string to decimal;
    }

    public NegadecimalNumber(int n) {
        decimal = n;
    }

    public NegadecimalNumber add(NegadecimalNumber ndn) {
        return null;
    }

    public NegadecimalNumber subtract(NegadecimalNumber ndn) {
        return null;
    }

    public NegadecimalNumber multiply(NegadecimalNumber ndn) {
        return null;
    }

    public NegadecimalNumber divide(NegadecimalNumber ndn) {
        return null;
    }

    public NegadecimalNumber remainder(NegadecimalNumber ndn) {
        return null;
    }

    public NegadecimalNumber negate() {
        return null;
    }

    public int decimalValue() {
        return decimal;
    }

    public boolean equals(NegadecimalNumber ndn) {
        return ndn != null && ndn.decimalValue() == this.decimalValue();
    }

    public String toString() {
        return null;
    }
}
