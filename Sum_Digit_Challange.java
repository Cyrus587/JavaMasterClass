public class Sum_Digit_Challange {
    public static void main(String args[]) {
        System.out.println(" the sum of the digits in the number 125 is" + checknumber (125));
        System.out.println("the sum of the digits in the number -125" + checknumber(1-25));

    }

    public static int checknumber(int number) {

        if (number <= 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) { // what to keep looping while the number is greater than zero
            int digit = number % 10;
            sum += digit;
            //drop least significant digit
            number /= 10;
        }
        return sum;
    }
}



