public class Is_Even_number_challange {
    public static void main(String args[]) {
        loopIsEvenNumber(2);
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void loopIsEvenNumber(int num) {
        num = 4;
        int finish_number = 20;
        int even_numbers_found = 0;
        while (num <= finish_number) {
            num++;// this means that the first number that you start with will be 3 and not 2


            if (!isEvenNumber(num)) { // we can do this by bypassing the odd numbers from reading this sequence  so we can print out all are even number down here becuase we are sure that it will be exicuted
                continue; //By pass print statement starts on the next number and goes through the code again
            }
            even_numbers_found++;
            if(even_numbers_found >=5){ //this will cause the number of variables printed to just be five

                break;

            }
            System.out.println("the next number in the sequence is " + num);

        }
        System.out.println(" total number of even numbers = "+ even_numbers_found);
    }
}

