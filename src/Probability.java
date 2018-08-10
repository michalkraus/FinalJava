public class Probability {
//Attributes

    // Attributes
    protected int numbersInPool;
    protected int howManyNumbers;
    protected int chanceInt;


//**//NumbersInPool****************************************
    public int setNumbersInPool(int numbersInPool) {
        this.numbersInPool = numbersInPool;
        return numbersInPool;
    }

    public int getNumbersInPool() {
        return numbersInPool;
    }

//**//How Many Numbers***********************************
    public int setHowManyNumbeers(int howManyNumbers) {
        this.howManyNumbers = howManyNumbers;
        return howManyNumbers;
    }

    public int getHowManyNumbers() {
        return howManyNumbers;
    }


//**//Constructor
    public Probability(int numbersInPool, int howManyNumbers){
        this.numbersInPool = numbersInPool;
        this.howManyNumbers = howManyNumbers;
    }


    public void factorialCalculator () {

        double xx = factorial(howManyNumbers);
        double zz = factorial(numbersInPool);
        double yy = factorial(((int)numbersInPool-(int)howManyNumbers));

        double chance = zz / (xx*yy);

        chanceInt = (int)chance;

        System.out.println("Your chance to have " + (int)howManyNumbers + " numbers is 1: " + chanceInt);
    }


    public double factorial(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


    public String toString () {
        return "";
    }
}

