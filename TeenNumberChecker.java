public class TeenNumberChecker {

    public static boolean hasTeen(int start, int end, int number) {
        if (start >= 13) {
            return true;
        } else if (end <= 19) {
            return true;
        } else if (isTeen(number) == true) {
            return true;
        } else if (end <= 19 && isTeen(number)==true) {
            return true;
        }else if(start >= 13 && end <= 19){
            return true;
        }else if(start >=13 && isTeen(number) ==true){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }
    }
}

