package com.company;

public class ifthen_statement {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
        //control flow statement exicute code that checks if a condidtion is true or false conditional logic
        boolean isAlien = false;
        if (isAlien == false) {  // this opens up the conditional statement if it is = to false then print these two statements if this was true then it wont run the code
                                //but if you put a semi colin here then if you put true the statement would still run becuase its not testing anymore its just running the code
                                // put brackets around the conditional statement (variable == true/false){

            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        } // code block is between the open bracket from false and ends at this bracket on this line.
    }
}

