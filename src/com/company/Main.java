package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    int intOperandA = 5;
        int intOperandB = 8;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 2.5;
        double doubleOperandB = 10.3;
        double doubleSum = 0.8;
        double doubleProduct = 19.2;
        double doubleDifference = 15.4;
        double doubleQuotient = 2.7;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of "  + intOperandA + " " + intOperandB +  "  is " + intSum);
        System.out.println("The difference using ints of "  + intOperandA + " " + intOperandB +  "  is " + intDifference);
        System.out.println("The Product using ints of "  + intOperandA + " " + intOperandB +  "  is " + intProduct);
        System.out.println("The Quotient using ints of "  + intOperandA + " " + intOperandB +  "  is " + intQuotient);
        System.out.println("The Modulo using ints of "  + intOperandA + " " + intOperandB +  "  is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println();
        System.out.println("The sum using Doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleSum);
        System.out.println("The difference using Doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleDifference);
        System.out.println("The product using Doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleProduct);
        System.out.println("The quotient using Doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleQuotient);



        double myLunchCost = 12.50;
        boolean isRaining = False;
        double gasPrice = 4.19;
        int favoriteNumber = 24;
        int shoSize = 10;
        String birthMonth = "October";
        String fullName = "Kenneth Paul Wagner";
    }
}
