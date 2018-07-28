import java.util.*;

public class RandomGenerator extends Tables {

    // Attributes
    private int numbersInPool;
    private int howManyNumbers;

    public int [] scores;
    private int randomNumber;



//**//NumbersInPool****************************************
    public int setNumbersInPool(int numbersInPool) {
        this.numbersInPool = numbersInPool;
        return numbersInPool;
    }

    public int getNumbersInPool() {return numbersInPool;}

//**//How Many Numbers***********************************
    public int setHowManyNumbeers(int howManyNumbers) {
        this.howManyNumbers = howManyNumbers;
        return howManyNumbers;
    }

    public int getHowManyNumbers() {return howManyNumbers;}


//**//Scores***********************************
    public void getScores () {
        for (int i = 0; i < howManyNumbers; i++) {

//            if(scores[0] == 0){
//                System.out.println("No Scores!");
//                break;
//
//            } else
            System.out.println(scores[i]);
        }
    }

    public int[] setScores (int[] scores) {
        this.scores = scores;
        return scores;
    }

    public int getNumberFromScores (int index) {
        return scores[index];
    }

    public int [] clearGeneratorScores(){
        return scores = new int [howManyNumbers];
    }

//**//Constructor
    public RandomGenerator(int numbersInPool, int howManyNumbers){
            this.numbersInPool = numbersInPool;
            this.howManyNumbers = howManyNumbers;
            this.scores = new int[howManyNumbers];
        }


//**//Generator
        public int numberGenerator () {

            scores = new int[howManyNumbers]; //New 1D [] Score with howManyNumbers index
            Random random = new Random();//Random() Run

            //index starts from 0.. so howManyNumbers-1 is the last index.
            while (scores[howManyNumbers-1] == 0) {
//First Loop
                if (numbersInPool <= howManyNumbers){
                    System.out.println("You cannot have have drawn numbers than is in the pool!");
                    break;
                }
                else {
                    randomNumber = random.nextInt(numbersInPool) + 1;
                    for (int j = 0; j < howManyNumbers; j++) {
//Second Loop
                        if (scores[j] == randomNumber) {
                            break;
                        } else if (scores[j] == 0) {
                            scores[j] = randomNumber;
                            break;
                        }

                    }//End of the Second Loop
                }
            } //End of the First - While LOOP
            return scores[howManyNumbers-1];
        }



        public String toString () {
            return "" + randomNumber;
        }


}//End of RandomGenerator Class