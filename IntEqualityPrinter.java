public class IntEqualityPrinter {

    public static void printEqual(int num_1,int  num_2,int  num_3 ){
        if (num_1 < 0)  {
            System.out.println("Invalid Value");
        } else if(num_2 < 0){
            System.out.println("Invalid Value");

        } else if  (num_3< 0){

            System.out.println("Invalid Value");
        }else if(num_1 == num_2 && num_1 ==num_3 && num_2== num_3) {
            System.out.println("All numbers are equal");
        }else if( num_1 ==num_2 || num_1 ==num_3|| num_2==num_3){
            System.out.println("Neither all are equal or different");

        }else{
            System.out.println("All numbers are different");
        }


    }
}
