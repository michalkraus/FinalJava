/*
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
//                    gameXX.setMaxNumber(scanner.nextInt());
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
//        public int setMaxNumber(int maxNumber) {
//            this.maxNumber = maxNumber;
//            return maxNumber;
//        }
//
//        public int getMaxNumber() {
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