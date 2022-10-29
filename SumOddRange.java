public class SumOddRange {
    public static void main(String args[]){
        sumOdd(1,25);
    }
    public static boolean isOdd(int number) {
        if (number < 0 || number % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void sumOdd(int start, int end) {
        int num = 0;
        int sum =0;
        for (start=0; start >= end; start++) {
            isOdd(num);
             += num;
        }
        System.out.println("the next number in the sequence is" + num);
    }
}
