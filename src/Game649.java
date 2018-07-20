import java.util.*;

public class Game649 {


    public static void main (String [] args) {
        //Attributes
        int [] assignTable;

        //New Table
        ScoreTable table = new ScoreTable();

        //Random Generator + 1row of array as scores
        RandomGenerator game649 = new RandomGenerator(49,6);

        System.out.println("\n...Welcome to the Lottery...");

        //Lottery number 1
        System.out.println("\nLet's start the Lottery Number 1.\nRemember you will never get the same number twice :)");
        game649.numberGenerator();

        System.out.println("\nnumberGenerator() did the job and saved all the random numbers to the score[0]\n" +
                            "getScores() will show your current numbers here: ");
        game649.getScores();

        System.out.println("\nNow it's time to add the score[0] object with all the numbers to the ScoreTable ArrayList<int[]>\n" +
                "if you don't know how it looks like, here you go, this is your Array[] with numbers inside the ArrayList: ");
        table.add(0,game649.scores);



        System.out.println("\nNow I need to get my \"ugly\" Table index[0] out and assign it to the new int[]value\n" +
                "and used that new int[]value to setScores");
        table.get(0);
        assignTable = table.get(0);
        game649.setScores(assignTable);


        //Lottery number 2
        System.out.println("This is Lottery Number 2: ");
        game649.numberGenerator();
        table.add(1,game649.scores);
        assignTable = table.get(1);
        game649.setScores(assignTable);

        //Lottery number 3
        System.out.println("This is Lottery Number 3: ");
        game649.numberGenerator();
        table.add(2,game649.scores);
        assignTable = table.get(2);
        game649.setScores(assignTable);

        System.out.println("We've had 3 lotteries already");
        System.out.println("here we have a results:");

        System.out.println("\n\nLottery 1: ");
        table.get(0);
        assignTable = table.get(0);
        game649.setScores(assignTable);
        game649.getScores();

        System.out.println("\nLottery 2: ");
        table.get(1);
        assignTable = table.get(1);
        game649.setScores(assignTable);
        game649.getScores();

        System.out.println("\nLottery 3: ");
        table.get(2);
        assignTable = table.get(2);
        game649.setScores(assignTable);
        game649.getScores();

        System.out.println("\nIf you ask, you can get a single number from the scores, example: this index 3(position4)" +
                "of Lottery 3...: " + game649.getNumberFromScores(3));

        System.out.println("\n\nand again Lottery 1 if you don't believe :P :");
        table.get(0);
        assignTable = table.get(0);
        game649.setScores(assignTable);
        game649.getScores();


        System.out.println("\n...Thank you!...");
    }//End of Main Method

//Loop to print [index 0-howManyNumbers]
//        System.out.println("\nScores from Current selected from Array: ");
//        for (int z=0; z < game649.getHowManyNumbers(); z++){
//            System.out.println(game649.scores[z]);
//        }

}
