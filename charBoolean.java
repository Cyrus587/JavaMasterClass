package com.company;

public class charBoolean {
    public static void main(String[] args) {

            char myChar = 'D'; //can only store single charectors store the last charector used by a user
                              // char has 16 bits
            char myUnicodeChar = '\u0044';// unicode is used each leter is assigned a numeric value see unicode table
                                         // to make a unicode charector we need to have the back slash and the u part to it
            System.out.println(myChar);
            System.out.println(myUnicodeChar);
            char myCopyrightChar = '\u00A9';  //use the table to see what unicode character  the number corisponds to under the learn java tabe unicode table

            System.out.println(myCopyrightChar);
            boolean myTrueBooleanValue = true;   //true false yes no or 1 or 0 d
            boolean myFalseBooleanValue = false;

            boolean isCustomerOverTwentyOne = true; // variable name is a question tells what the variable name is tracking
        }
    }

