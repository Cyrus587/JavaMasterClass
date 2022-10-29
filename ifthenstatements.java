public class ifthenstatements {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000) {
            System.out.println("your score was 5000");
            //  System.out.println(" this is excuted"); becuase this is in the code block this will also exicute
        }else if (score < 1000 && score> 20){
            System.out.println(" you score was less than 1000");

        }else{
            System.out.println(" this was exicuted"); // this will be exicuted because it is outside code block... and in example it will be exicuted becase it is condition that is satisfied

        }
        if(gameOver ==true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("ytour final score was: " + finalScore);

        }
        boolean newgameOver = true;
        int newscore = 1000;
        int newlevelCompleted = 8;
        int newbonus = 200;
            if(gameOver ==true){
                int newfinalScore = newscore + (newlevelCompleted * newbonus);
                System.out.println("ytour final score was: " + newfinalScore);
        }

    }
}

