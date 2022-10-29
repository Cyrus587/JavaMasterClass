public class Method_Overloading {
    // can write out the code manually or you can write the code as variable and just print the variable an example
    // of this is here
    public static void main(String[] args) {
        int newScore = calculateScore("Tim,", 500);
        System.out.println(" new score = " + newScore);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("PLayer " + playerName + "scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unamed PLayer " + score + "scored " + score);
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("");
        return 0;

    }


}
//when to methods are created with the same name but different number of parameters this is called method overloading
//when methods are named the same thing but have different argument types
//has to be different types or different number of parameters
//methods do the same thing but have different parameter numbers or types
//the return  of the separete methods can be different they can be different in this case you look at line 11-32
//challange



