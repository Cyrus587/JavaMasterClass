package com.company;

import java.util.Scanner;

public class Ternery_Examples {

    //variable x = (expression) ? value if true: value if false
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);


        //other examples
            /*const age = 19;
            if(age >= 18) {
               const canVote = true;
            } else {
               const canVote = false;
            }
             */
            /* const age = 19;
               const canVote = (age >= 18) ? true : false;

             */
    }
}






