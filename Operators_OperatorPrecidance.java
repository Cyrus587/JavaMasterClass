package com.company;

public class Operators_OperatorPrecidance {

    public static void main(String[] args) {
        //operands are the numbers used in the operation 15 + 20 ... 15 and 20 are the operands
        // expression is the full 15 + 20 operands and operations

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2 // can change the result of  a variable by subtracting int form the variable previously define
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

    }
}

