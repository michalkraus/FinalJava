import java.util.*;

public class RandomGenerator {

    // Attributes
    protected int numbersInPool;
    protected int howManyNumbers;

    protected int randomNumber;
    Tables randomGeneratorTables = new Tables();

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



//**//Table Methods**********
    public void getDrawnNumbersTable () {
        randomGeneratorTables.getDrawnNumbersTable(howManyNumbers);
    }

    public int [] clearDrawnNumbersTable(){
       return randomGeneratorTables.clearDrawnNumbersTable(howManyNumbers);
    }



//**//Constructor
    public RandomGenerator(int numbersInPool, int howManyNumbers){
            this.numbersInPool = numbersInPool;
            this.howManyNumbers = howManyNumbers;
            this.randomGeneratorTables.drawnNumbersTable = new int[howManyNumbers];
        }



//**//Generator
        public int numberGenerator () {

            randomGeneratorTables.drawnNumbersTable = new int[howManyNumbers]; //New 1D [] Score with howManyNumbers index
            Random random = new Random();//Random() Run

            //index starts from 0.. so howManyNumbers-1 is the last index.
            while (randomGeneratorTables.drawnNumbersTable[howManyNumbers-1] == 0) {
//First Loop
                if (numbersInPool <= howManyNumbers){
                    System.out.println("You cannot have drawn numbers than is in the pool!");
                    break;
                }
                else {
                    randomNumber = random.nextInt(numbersInPool) + 1;
                    for (int j = 0; j < howManyNumbers; j++) {
//Second Loop
                        if (randomGeneratorTables.drawnNumbersTable[j] == randomNumber) {
                            break;
                        } else if (randomGeneratorTables.drawnNumbersTable[j] == 0) {
                            randomGeneratorTables.drawnNumbersTable[j] = randomNumber;
                            break;
                        }

                    }//End of the Second Loop
                }
            } //End of the First - While LOOP
            return randomGeneratorTables.drawnNumbersTable[howManyNumbers-1];
        }



        public String toString () {
            return "" + randomNumber;
        }


}//End of RandomGenerator Class