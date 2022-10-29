package com.company;

public class ByteShortLongInt {

    public static void main(String[] args) {
        // write your code here
        int myvalue = 1000;
        int myMinIntegerValue = Integer.MIN_VALUE;
        int myMaxIntegerValue = Integer.MAX_VALUE;
        System.out.println("the min integer value " + myMinIntegerValue);  //integer is a wrapper class can tell you then min and max of a data type
        System.out.println("the max integer value " + myMaxIntegerValue);
        System.out.println("Busted Max value = " + (myMaxIntegerValue + 1)); //this should not be possible this makes the max value negative becuase it is a stack overflow and it is becuase it cannot go higher it makes the number negative
        System.out.println("Busted Min value =  " + (myMinIntegerValue - 1));  //causes a stack overflow same this as above but makes it positive "underflow"
        // int max = 2147483648; //this number is too big write like 247_483_648

        byte myMinVal = Byte.MIN_VALUE;  //this is a smaller data type small range
        byte myMaxVal = Byte.MAX_VALUE;
        System.out.println("the min byte value " + myMinVal);
        System.out.println("the max byte value " + myMaxVal);
        //byte = 8 bit
        short myMinValshort = Short.MIN_VALUE;  //this is a smaller data type small range
        short myMaxValshort = Short.MAX_VALUE;
        System.out.println("the min short value " + myMinValshort);
        System.out.println("the max short value " + myMaxValshort);
        //short = 16
        //int = 32

        long myLongValue = 100L; //have to put an L at the end of the number //if you dont put the L we will get an error becuase it will interperete the number as an int and if the number is too big then it will cause an error cause it can't read as an int

        long myMinValLong = Long.MIN_VALUE;  //this is a smaller data type small range
        long myMaxValLong = Long.MAX_VALUE;
        System.out.println("the min long  value " + myMinValLong);
        long biglongliteral = 2_147_483_647_234L;
        System.out.println(biglongliteral);
        int myTotal = (myMinIntegerValue / 2);
        byte myNewByteValue = (byte) (myMinVal / 2); // this is called type casting
        // can just cast whatever type you need

       //this is the challange
        byte mybytetest = 2;
        short myshorttest = 16;
        long mylongtest =  50000L;
        int inttest = 50;
        long calculation = 5000 + 10 * (mybytetest + myshorttest + inttest);
       // short shorttotal = (1000 + 10 * (mybytetest+ myshorttest +inttest)); will cause an error becuase you need to type cast
        System.out.println(calculation);




    }
}




