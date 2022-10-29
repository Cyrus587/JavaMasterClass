package com.company;

public class primitive_type_review {
    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string"; //sting is not a primitive type

        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more."; // here we can append more by adding it to the original variable
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019"; // this is adding the unicode charector for the copy right symbol you can add to the string
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95"; //have to caste 49.5 to int for this to work is reading as text right now
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString); // if the first type is a string and you are adding an int it wil just convrt the 50 to a string and append it to the end of 10 thus we get 1050
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString); //the same senario happens in this example
        //strings in java are imutable cant change a string once it is created
        //String buffer can be changed

    }
}
