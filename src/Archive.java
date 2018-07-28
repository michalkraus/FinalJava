/*
// RandomGenerator copy

//import java.util.*;
//
//public class RandomGenerator extends Tables {
//
//    // Attributes
//    private int numbersInPool;
//    private int howManyNumbers;
//
//    public int [] scores;
//    private int randomNumber;
//
//
//
////**///NumbersInPool****************************************
//public int setNumbersInPool(int numbersInPool) {
//        this.numbersInPool = numbersInPool;
//        return numbersInPool;
//        }
//
//public int getNumbersInPool() {return numbersInPool;}
//
////**//How Many Numbers***********************************
//public int setHowManyNumbeers(int howManyNumbers) {
//        this.howManyNumbers = howManyNumbers;
//        return howManyNumbers;
//        }
//
//public int getHowManyNumbers() {return howManyNumbers;}
//
//
////**//Scores***********************************
//public void getScores () {
//        for (int i = 0; i < howManyNumbers; i++) {
//
////            if(scores[0] == 0){
////                System.out.println("No Scores!");
////                break;
////
////            } else
//        System.out.println(scores[i]);
//        }
//        }
//
//public int[] setScores (int[] scores) {
//        this.scores = scores;
//        return scores;
//        }
//
//public int getNumberFromScores (int index) {
//        return scores[index];
//        }
//
//public int [] clearGeneratorScores(){
//        return scores = new int [howManyNumbers];
//        }
//
////**//Constructor
//public RandomGenerator(int numbersInPool, int howManyNumbers){
//        this.numbersInPool = numbersInPool;
//        this.howManyNumbers = howManyNumbers;
//        this.scores = new int[howManyNumbers];
//        }
//
//
////**//Generator
//public int numberGenerator () {
//
//        scores = new int[howManyNumbers]; //New 1D [] Score with howManyNumbers index
//        Random random = new Random();//Random() Run
//
//        //index starts from 0.. so howManyNumbers-1 is the last index.
//        while (scores[howManyNumbers-1] == 0) {
////First Loop
//        if (numbersInPool <= howManyNumbers){
//        System.out.println("You cannot have have drawn numbers than is in the pool!");
//        break;
//        }
//        else {
//        randomNumber = random.nextInt(numbersInPool) + 1;
//        for (int j = 0; j < howManyNumbers; j++) {
////Second Loop
//        if (scores[j] == randomNumber) {
//        break;
//        } else if (scores[j] == 0) {
//        scores[j] = randomNumber;
//        break;
//        }
//
//        }//End of the Second Loop
//        }
//        } //End of the First - While LOOP
//        return scores[howManyNumbers-1];
//        }
//
//
//
//public String toString () {
//        return "" + randomNumber;
//        }
//
//
//        }//End of RandomGenerator Class














































//Customize GAME from CusotmizeGame class:
    public void customizeYourGame() {
        CustomizeGame customGame = new CustomizeGame();
        customGame.newCustomizeGame();


//        int userChoice;
//        int index = 0;
//
//        do {
//            System.out.println(customizeGameMenu());
//            userChoice = scanner.nextInt();
//            System.out.println("CUSTOMIZE YOUR GAME:");
//
//            switch (userChoice){
//
//                case 1: //New Game
//                    int howManyTimesPlay;
//                    System.out.println("How Many numbers will you drawn?");
//                    gameXX.setHowManyNumbeers(scanner.nextInt());
//                    System.out.println("How Many numbers would you like to have in the pool");
//                    gameXX.setNumbersInPool(scanner.nextInt());
//
//                    System.out.println("How Many times would you like to play?");
//                    howManyTimesPlay = scanner.nextInt();
//
//                    for(int i=0; i < howManyTimesPlay; i++){
//                        gameXX.numberGenerator();
//                        //gameXX.getScores();
//                        table.add(index, gameXX.scores);
//                        index++;
//                     }
//
//                     System.out.println("Thanks, done: " + howManyTimesPlay + " lotteries.\n");
//                     break;
//
//
//                case 2: //Scores
//
//                     break;
//
////                case 3:
////                    break;
//                case 4: //Quit
//                    break;
//
//                default:
//                    System.out.println("Wrong Choice.\nPlease try again.");
//
//            }
//
//        } while (userChoice != 4);
    }




//****************
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ScoreTable{
//
//    private ArrayList<Integer> scoreTable = new ArrayList<Integer>();
//
//
//
//    //** scoreTable****************************************
//    public ArrayList<Integer> setScoreTable (ArrayList<Integer> scoreTable) {
//        this.scoreTable = scoreTable;
//        return scoreTable;
//    }
//
//    public ArrayList<Integer> getScoreTable() {return scoreTable;}
//
//    //ADD
//    public int add (int x) {
//        scoreTable.add(x);
//        return scoreTable.get(x);
//    }
//
//    //GET
//    public int get (int x) {
//        scoreTable.get(x);
//        return scoreTable.get(x);
//    }
//
//    //SIZE
//    public int size () {
//        return scoreTable.size();
//    }
//
//
//
//}
//
//

//*******************************************************
//import java.util.Random;
//
//public class Archive {
//
//    public class RandomGenerator {
//
//        // Attributes
//        private int randomNumber;
//        private int maxNumber;
//
//
//        // Methods
////    public void setRandomNumber(int randomNumber) {
////        this.randomNumber = randomNumber;
////    }
////
////    public int getRandomNumber() {
////        return randomNumber;
////
////    }
//
//        // Max Number
//        public int setNumbersInPool(int maxNumber) {
//            this.maxNumber = maxNumber;
//            return maxNumber;
//        }
//
//        public int getNumbersInPool() {
//            return maxNumber;
//        }
//
//        //Constructor
//        public RandomGenerator(int maxNumber) {
//            this.maxNumber = maxNumber;
//        }
//
//
//        // Generator
//        public int randomNumber49() {
//            //   this.maxNumber = maxNumber;
//            //   this.randomNumber = randomNumber;
//            Random random = new Random();
//            return randomNumber = random.nextInt(maxNumber) + 1;
//
//        }
//
//        public String toString() {
//            return "" + randomNumber;
//        }
//
//    }
//
//
//
//}




    /* To dziala tylko w main
            // Alternative Random
        res = rand();
        System.out.println(rand() + "\n");

        //Factorial
        System.out.println(res);
//        System.out.println(factorial(res));
//
//
//
//     */
////
////    // Metoda poza main -  Generator liczb od 0 do 49, wywolana potem jako rand();
////    public static int rand() {
////        double rand;
////        rand = Math.random() * 49;
////        int res = (int) rand;
////        return res;
////    }
////
////
////    //**//Factorial - Recursive Algorithms
////    public static int factorial(int i){
////        if (i == 1) {return 1;}
////        //System.out.println(factorial(i));
////        return i + factorial(i-1);
////    }
////
//
//
////



//        ArrayList<int[]> arl = new ArrayList<int[]>();
//
//        int a1[] = {1, 2, 3};
//        arl.add(0, a1);
//        System.out.println("Arraylist contains:" + arl.get(0)[0]);

//        // List of String arrays
//        List<String[]> list = new ArrayList<String[]>();
//
//        String[] arr1 = { "a", "b", "c" };
//        String[] arr2 = { "1", "2", "3", "4" };
//        list.add(arr1);
//        list.add(arr2);
//        // printing list of String arrays in the ArrayList
//        for (String[] strArr : list) {
//            System.out.println(Arrays.toString(strArr));