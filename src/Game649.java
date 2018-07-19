import java.util.*;

public class Game649 {

    public static void main (String [] args) {
//        //Score Table
//        ScoreTable scoreTableGame649 = new ScoreTable();


        //Random Generator + 1row of array as scores
        RandomGenerator game649 = new RandomGenerator(49,6);
        game649.numberGenerator();

        System.out.println("\nScores from Array: ");
        for (int z=0; z < game649.getHowManyNumbers(); z++){
            System.out.println(game649.scores[z]);
        }



    }



    /* To dziala tylko w main
            // Alternative Random
        res = rand();
        System.out.println(rand() + "\n");

        //Factorial
        System.out.println(res);
        System.out.println(factorial(res));



     */
//
//    // Metoda poza main -  Generator liczb od 0 do 49, wywolana potem jako rand();
//    public static int rand() {
//        double rand;
//        rand = Math.random() * 49;
//        int res = (int) rand;
//        return res;
//    }
//
//
//    //**//Factorial - Recursive Algorithms
//    public static int factorial(int i){
//        if (i == 1) {return 1;}
//        //System.out.println(factorial(i));
//        return i + factorial(i-1);
//    }
//

}
