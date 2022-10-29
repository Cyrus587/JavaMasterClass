public class the_while_and_Do_while_loop {
    public static void main(String[] args) {
        int count = 1; //if this variable = 6 then the count never enters the while loop and it will run continuesly
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }
        int num = 1;
        while (true) {
            if (num == 6) {   //this is the same way to write the for loop just using a while loop
                break;
            }
            System.out.println("count value is using while true while loop " + num);
            num++;
        }
        count = 1; //if this is 6 then it will print at least once but then continue to print becuase it enters the while loop and it has already ran once now the value is not six so it will continue to run
        do {
            System.out.println("count value using the do while loop was " + count);  //this will always exicute at least one time
            count++;
            if (count > 100) { // if you put the value at 6 but you also put this if statment the code will break at 100
                break;
            }
        } while (count != 6);


        for (int i = 1; i != 6; i++) { //the same is true here if i = 6 then the code will not be exicuted and it will loop forever
            System.out.println("Count value is using for loop " + i);

        }
    }

}












