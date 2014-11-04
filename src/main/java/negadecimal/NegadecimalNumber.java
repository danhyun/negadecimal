package negadecimal;

public class NegadecimalNumber {

    private int decimal;
    private static final int BASE = -10;

    public NegadecimalNumber(String s) {
        String reversed = new StringBuffer(s).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            decimal += (Integer.parseInt(reversed.charAt(i) + "") * Math.pow(BASE, i));
        }
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

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof NegadecimalNumber
                && ((NegadecimalNumber) o).decimalValue() == decimal;
    }

    public String negadecimalValue() {
        String value = "";
        int quotient = decimal;
        while (quotient != 0) {
            int remainder = quotient % BASE;
            quotient = quotient / BASE;

            if (remainder < 0) {
                remainder += -1 * BASE;
                quotient += 1;
            }

            value = remainder + value;
        }
        return value;
    }

    public String toString() {
        return this.negadecimalValue();
    }
}
