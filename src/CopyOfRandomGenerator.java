//import java.util.Random;
//import java.util.ArrayList;
//
//public class RandomGenerator {
//
//    // Attributes
//    private int maxNumber;
//    private int howManyNumbers;
//
//    public int [] scores;
//    private int randomNumber;
//
//
//
//    //**// Max Number****************************************
//    public int setMaxNumber(int maxNumber) {
//        this.maxNumber = maxNumber;
//        return maxNumber;
//    }
//
//    public int getMaxNumber() {return maxNumber;}
//
//
//    //**//How Many Numbers***********************************
//    public int setHowManyNumbeers(int howManyNumbers) {
//        this.howManyNumbers = howManyNumbers;
//        return howManyNumbers;
//    }
//
//    public int getHowManyNumbers() {return howManyNumbers;}
//
//
//    //**//Scores***********************************
//    public void getScores () {
//        for (int i = 0; i < howManyNumbers; i++) {
//            System.out.println(scores[i]);
//        }
//    }
//
//    //**//Constructor
//    public RandomGenerator(int maxNumber, int howManyNumbers){
//        this.maxNumber = maxNumber;
//        this.howManyNumbers = howManyNumbers;
//        this.scores = scores;
//    }
//
//
//    //**//Generator
//    public int numberGenerator () {
//
//        scores = new int[howManyNumbers]; //New 1D [] Score with howManyNumbers index
//        Random random = new Random();//Random() Run
//
//        System.out.println("\nHow many Numbers I will generate: " + howManyNumbers);
//        System.out.println("What is my Table length: " + scores.length);
//
//
//        //index starts from 0.. so howManyNumbers-1 is the last index.
//        for (int i = 0; i < howManyNumbers; i++) {
//            System.out.println("\nJestem w pierwsym loop");
//
//            if (scores[howManyNumbers-1] == 0) {
//                System.out.println("Spelniam warunek wchodze do 2 loopa");
//
//                randomNumber = random.nextInt(maxNumber) + 1;
//                System.out.println("Losowa liczba to: " + randomNumber);
//
//                for (int j = 0; j < howManyNumbers; j++) {
//                    System.out.println("Jestem w 2 loopie");
//                    if (scores[j] == 0) {
//                        System.out.println("Spelniam warunek i daje wartosc wartosc");
//                        scores[j] = randomNumber;
//                        System.out.println("Wyciagagam wartosc" + scores[j]);
//                        break;
//                    }
//                }
//            }
//            else { System.out.println("Wyjebalo"); break; }
//            System.out.println(scores[howManyNumbers-1]);
//        }  //End of the 1st FOR LOOP
//        return scores[0];
//    }
//
//    public String toString () {
//        return "" + randomNumber;
//    }
//
//
//}
