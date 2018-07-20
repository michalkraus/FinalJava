import java.util.*;
import java.util.ArrayList;

public class RandomGenerator {

    // Attributes
    private int maxNumber;
    private int howManyNumbers;

    public int [] scores;
    private int randomNumber;



//**// Max Number****************************************
    public int setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
        return maxNumber;
    }

    public int getMaxNumber() {return maxNumber;}


//**//How Many Numbers***********************************
    public int setHowManyNumbeers(int howManyNumbers) {
        this.howManyNumbers = howManyNumbers;
        return howManyNumbers;
    }

    public int getHowManyNumbers() {return howManyNumbers;}


//**//Scores***********************************
    public void getScores () {
        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println(scores[i]);
        }
    }

    public int getNumberFromScores (int index) {
            return scores[index];
    }

    public int[] setScores (int[] scores) {
        this.scores = scores;
        return scores;

    }


//**//Constructor
    public RandomGenerator(int maxNumber, int howManyNumbers){
            this.maxNumber = maxNumber;
            this.howManyNumbers = howManyNumbers;
            this.scores = scores;
        }


//**//Generator
        public int numberGenerator () {

            scores = new int[howManyNumbers]; //New 1D [] Score with howManyNumbers index
            Random random = new Random();//Random() Run

//            System.out.println("\nHow many Numbers I will generate: " + howManyNumbers);
//            System.out.println("What is my Table length: " + scores.length);


            //index starts from 0.. so howManyNumbers-1 is the last index.
            while (scores[howManyNumbers-1] == 0) {
//                System.out.println("\nJestem w pierwsym loop WHILE");

                    randomNumber = random.nextInt(maxNumber) + 1;
//                    System.out.println("Losowa liczba to: " + randomNumber);

                    for (int j = 0; j < howManyNumbers; j++) {
//                        System.out.println("Jestem w 2 loopie");
                        if (scores[j] == randomNumber){
                            break;
                        }
                        else if (scores[j] == 0) {
//                            System.out.println("Spelniam warunek i daje wartosc wartosc");
                            scores[j] = randomNumber;
//                            System.out.println("Wyciagagam wartosc" + scores[j]);
                            break;
                        }
                    }
                }
              //End of the While LOOP
            return scores[howManyNumbers-1];
        }

        public String toString () {
            return "" + randomNumber;
        }

}