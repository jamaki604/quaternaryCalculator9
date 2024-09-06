package bsu.edu.v2_quaternarycalculator9;

public class QuaternaryOperations {

    public static int convertToDecimal(String quaternary) {
        return Integer.parseInt(quaternary, 4);
    }

    public static String convertToQuaternary(int decimal) {
        return Integer.toString(decimal, 4);
    }


    public static String addition (String firstQuaternary, String secondQuaternary) {
        //Convert quaternary numbers into decimal
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Add the decimals
        int decimalSum = decimal1 + decimal2;

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(decimalSum);

    }

    public static String subtraction(String firstQuaternary, String secondQuaternary) {
        //Convert quaternary numbers into decimal
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Subtract the decimals
        int decimalDifference = decimal1 - decimal2;

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(decimalDifference);
    }

    public static String multiplication(String firstQuaternary, String secondQuaternary) {
        //Convert quaternary numbers into decimal
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Multiply the decimals
        int decimalProduct = decimal1 * decimal2;

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(decimalProduct);
    }

    public static String division(String firstQuaternary, String secondQuaternary) {
        //Convert quaternary numbers into decimal
        int decimal1 = convertToDecimal(firstQuaternary);
        int decimal2 = convertToDecimal(secondQuaternary);

        //Divide the decimals
        int decimalQuotient = decimal1 / decimal2;

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(decimalQuotient);
    }

    public static String squareRoot(String firstQuaternary) {
        //Convert quaternary number into decimal
        int decimal = convertToDecimal(firstQuaternary);

        //Square root the decimal
        int sqrtDecimal = (int)Math.sqrt(decimal);

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(sqrtDecimal);
    }
    public static String square(String firstQuaternary) {
        //Convert quaternary numbers into decimal
        int decimal = convertToDecimal(firstQuaternary);

        //Square the decimal
        int squaredDecimal = decimal * decimal;

        //Convert decimal product back to quaternary and return
        return convertToQuaternary(squaredDecimal);
    }

    public static boolean validQuaternary(String quaternaryNumber){
        return quaternaryNumber.matches("[0-3]+");
    }

}
