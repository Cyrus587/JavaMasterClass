public class Ifelse_ifthencontrolexpressions {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 999;
        int levelCompleted = 5;
        int bonus = 100;
        if ( score ==4000) {
            System.out.println("your score whas 4000"); //from the beginning paran to the end of the paren here is the code block
        } else if (score < 1000) { // adding another condition to the if between the else multiple else statements
            System.out.println(" your score was less than 1000");

        }else{
            System.out.print(" this is the case that the score does not equal 4000"); // print this if first condition not satisfied   // Cannot create a variable inside the code block and access it out side the code block after it but the reverse is true create a variable on the outside is accesible inside a code block.

        } // Cannot create a variable in
//        if(score < 5000 && score >1000) {
//            System.out.println("This was was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//
//        }

        if(gameOver== true) {
            int finalScore = score + (levelCompleted * bonus); // these two lines of code are to be exicuted if the if statement is true //variables inside code blacks is called scope

            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8         //comment out multipe lines using tab or  comment tab code comment
        // bonus set to 200
        // But make sure the first printout above still displays as well

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(newGameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // print out a second score on screen with the following
        // score set to 1000
        //level completed set to 8
        // bonus set to 200
        // but make sure the first print out above displays as well
       boolean game_over = true;
        int score_test = 1000;
        int level_Completed = 8;
        int bonus_set = 200;
        if (game_over){
            int calculate_total = score_test + bonus_set;
            System.out.print(" total score is " + calculate_total);
        }



        // if then else statement

        // order is if.... else if ( this condition is exicuted if the statement is //false)... else ( code to be exicuted other wise) but if you do not have multiple else //statements just use if then else

        //will be true or false 

	








    }
}



