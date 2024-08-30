package src.main.logic;

public class QuaternaryOperations {

    public int convertToDecimal(String quaternary) {
        return Integer.parseInt(quaternary, 4);
    }

    public String convertToQuaternary(int decimal) {
        return Integer.toString(decimal, 4);
    }

}
