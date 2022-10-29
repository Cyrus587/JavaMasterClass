package com.company;

public class FloatDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue); // double can handle a larger range of numbers, but it takes up more space 64 bit comapred to 32 bit for int
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;  // good practice to put f after float value a floating point number is assumed to be a double if you do not put an f after it
        double myDoubleValue = 5.25d;
        float myFloatcast = (float)5.25;  //this is a way to do it but its not usually done

        int MyIntValueChallenge = 5 / 3;
        float myFloatValueChallenge = 5f / 3f;
        double MyDoubelValueChallenge = 5.00 / 3.00; // java will always assume the decimal number you input as a double without putting d or f
        System.out.println("MyIntValueChallenge = " + MyIntValueChallenge);
        System.out.println("MyFloatValueChallenge= " + myFloatValueChallenge); // when you run the code you will see that the float is smaller than the double
        System.out.println("MyDoubelValueChallenge= " + MyDoubelValueChallenge);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; // underscore can be used as a decimal

        System.out.println(pi);
        System.out.println(anotherNumber);

        double pounds = 280d;
        double converttokilo = pounds * 0.45359237d;
        System.out.println(converttokilo);
        // Big decimal used for currency most precise






    }
}
