package src.main.logic;

public class QuaternaryOperations {

    public static int convertToDecimal(String quaternary) {
        return Integer.parseInt(quaternary, 4);
    }

    public static String convertToQuaternary(int decimal) {
        return Integer.toString(decimal, 4);
    }


    public static String addition (String firstQuaternary, String secondQuaternary) {
        //Convert Quaternary numbers into Decimals first
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Add the decimals
        int decimalSum = decimal1 + decimal2;

        //Convert the Decimal Sum to Quaternary and return it
        return convertToQuaternary(decimalSum);

    }

    public String subtraction(String firstQuaternary, String secondQuaternary) {
        //Convert Quaternary numbers into Decimals first
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Subtract the decimals
        int decimalDifference = decimal1 - decimal2;

        //Convert the Decimal Difference to Quaternary and return it
        return convertToQuaternary(decimalDifference);
    }
}
