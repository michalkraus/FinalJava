import java.util.Scanner;

public class PlayerNumbers {

    // Attributes
    protected int numbersInPool;
    protected int howManyNumbers;
    protected int yourNumber;

    protected Tables plTable = new Tables();
    Scanner scanner = new Scanner(System.in);


    //getInput only Integer
    public static int getIntInput(Scanner i) {
        try {
            return (Integer.parseInt(i.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Wrong Choice.\nPlease try again.");
            return getIntInput(i);
        }
    }


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


    //**//Table Methods**********
    public void getDrawnNumbersTable (int tableLength ) {
        plTable.getDrawnNumbersTable(tableLength);
    }

    public int [] clearDrawnNumbersTable(){
        return plTable.clearDrawnNumbersTable(howManyNumbers);

    }


    //**//Constructor
    public PlayerNumbers(int numbersInPool, int howManyNumbers){
    this.numbersInPool = numbersInPool;
    this.howManyNumbers = howManyNumbers;
    this.plTable.drawnNumbersTable = new int[howManyNumbers];
    }


    //**//typeYourNumbers
    public int typeYourNumbers (){ //int howManyNumbersYouWantToType, int howManyNumbersAreInPool) {

        //plTable.setNewDrawnNumbersTable(howManyNumbersYouWantToType);
        //plTable.setSingleNumberInDrawnNumbersTable(howManyNumbersYouWantToType, howManyNumbersAreInPool);
        int counter =0;
        plTable.drawnNumbersTable = new int[howManyNumbers];//New 1D [] Score with howManyNumbers index

            //index starts from 0.. so howManyNumbers-1 is the last index.
            while (plTable.drawnNumbersTable[howManyNumbers-1] == 0) {
//First Loop
                if (numbersInPool <= howManyNumbers){
                    System.out.println("You have much more numbers to be drawn, than is in the pool.");
                    break;
                }
                else {
                    System.out.print("Type your " + (counter+1) + " number:  ");
                    yourNumber = getIntInput(scanner);
                    for (int j = 0; j < howManyNumbers; j++) {
//Second Loop
                        if (plTable.drawnNumbersTable[j] == yourNumber) {
                            System.out.println(yourNumber + " number was chosen already. Try again.");
                            break;
                        }else if ((yourNumber > numbersInPool) || (yourNumber <=0)){
                            System.out.println("Your number is out of the Pool! Use Numbers from Pool of: " + numbersInPool);
                            break;
                        }else if (plTable.drawnNumbersTable[j] == 0) {
                            plTable.drawnNumbersTable[j] = yourNumber;
                            counter++;
                            break;
                        }

                    }//End of the Second Loop

                }
            } //End of the First - While LOOP
            return plTable.drawnNumbersTable[howManyNumbers-1];
        }



        public String toString () {
            return "";
        }


}