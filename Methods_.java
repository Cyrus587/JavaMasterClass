public class Methods_ {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;
        //can take all of this code out becuase it is defined in the line 36 in the calculate score method just need to be define once.
        caclulateScore(true, 50, 8, 100);
        caclulateScore(false, 7, 190, 7);


        // you have two options you can either, hard code in the variables or make the variables parameters and call the method you cretaed with your desired values
        if (score == 5000) {
            System.out.println("your score was 5000");
            //  System.out.println(" this is excuted"); becuase this is in the code block this will also exicute
        } else if (score < 1000 && score > 20) {
            System.out.println(" you score was less than 1000");

        } else {
            System.out.println(" this was exicuted"); // this will be exicuted because it is outside code block... and in example it will be exicuted becase it is condition that is satisfied

        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("ytour final score was: " + finalScore);

        }
        boolean newgameOver = true;
        int newscore = 1000;
        int newlevelCompleted = 8;
        int newbonus = 200;
        if (gameOver == true) {
            int newfinalScore = newscore + (newlevelCompleted * newbonus);
            System.out.println("ytour final score was: " + newfinalScore);
        }

    }

    public static int caclulateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
       /* becuase  you have defined the variables in the params you do not need to redine them in the scope you can just call
         the method and with the correct params*/
        int highscore = caclulateScore(true, 1000, 5, 100);   //stack over flow error here but you can assign a variable to a method call then call that variable
        caclulateScore(true, 1000, 5, 100);  //calling the method
        System.out.println(" the highscore is: " + highscore);

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("ytour final score was: " + finalScore);
            return finalScore;  /*if you just had return here you would get an error becuase
                                    it needs to return in both instances so you make an else statement*/
        } else {
            return -1;  //instance that game over is false

        }
    }
}

