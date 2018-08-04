import java.util.Scanner;

//Customize GAME:
public class CustomizeGame  {
    //Attributes
    Scanner scanner = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);

    public int xNumbersInPool;
    public int xHowManyNumbers;

    int indexComputer = 0;
    int indexPlayer = 0;
    int [] lineTableComputer; //row table to display numbers from ArrayList
    int [] lineTablePlayer; //row table to display numbers from ArrayList


    Tables computerTable = new Tables();
    Tables playerTable = new Tables();

    protected RandomGenerator gameXX = new RandomGenerator(xNumbersInPool,xHowManyNumbers);
    protected PlayerNumbers playerNumbers = new PlayerNumbers(xNumbersInPool,xHowManyNumbers);

    public void newCustomizeGame() {

        int userChoiceCustomizeGame;
        this.indexComputer = 0;
        this.indexPlayer = 0;


        do {
            System.out.println(customizeGameMenu());
            userChoiceCustomizeGame = getIntInput(scanner); //getIntInput(scanner,customizeGameMenu());


            switch (userChoiceCustomizeGame){

                case 1: //New Game - Computer Numbers
                    int howManyTimesPlay; //attribute How Many Times To Generate Numbers

                    System.out.println("How Many times would you like to play?");
                    howManyTimesPlay = getIntInput(scanner);

                    for(int i=0; i < howManyTimesPlay; i++){

                        gameXX.numberGenerator();

                        computerTable.add(indexComputer, gameXX.rgTable.drawnNumbersTable);
                        indexComputer++;
                    }

                    System.out.println("Thanks, done: " + howManyTimesPlay + " lotteries.\n");

                    break;

                case 2: //New Game - Player Numbers
                    System.out.println("Player Table");

                    int howManyTimesPlayerPlay; //attribute How Many Times To Generate Numbers
                    playerNumbers.setNumbersInPool(xNumbersInPool);

                    show("How Many numbers will you drawn?");
                    playerNumbers.setHowManyNumbeers(getIntInput(scanner));

                    System.out.println("How Many times would you like to play?");
                    howManyTimesPlayerPlay = getIntInput(scanner);

                    for(int i=0; i < howManyTimesPlayerPlay; i++){

                        playerNumbers.typeYourNumbers();

                        playerTable.add(indexPlayer, playerNumbers.plTable.drawnNumbersTable);
                        indexPlayer++;

                        show("Your Numbers are saved under index: " + i);
                    }


                    break;

                case 3: //Show Scores - Computer
                    System.out.println("Show Scores - Computer");

                    System.out.println("Lottery with index 0");
                    computerTable.get(0);
                    lineTableComputer = computerTable.get(0);
                    gameXX.rgTable.setDrawnNumbersTable(lineTableComputer);
                    gameXX.getDrawnNumbersTable();

                    break;

                case 4: //Show Scores - Player
                    System.out.println("Show Scores - Player");

                    System.out.println("Lottery with index 0");
                    playerTable.get(0);
                    lineTablePlayer = playerTable.get(0);
                    playerNumbers.plTable.setDrawnNumbersTable(lineTablePlayer);
                    playerNumbers.getDrawnNumbersTable();

                    break;


                case 5: //Clear Scores - Computer
                    System.out.println("Clear Scores - Computer");
                    clearScores ();

                    break;

                case 6: //Clear Scores - Player
                    System.out.println("Clear Scores - Player");

                    break;

                case 7: //Reset & Quit

                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");

            }

        } while (userChoiceCustomizeGame != 7);

    }






//Method to ClearScores
    public int clearScores () {
        System.out.println("Do you want to wipe the previous scores? Y/N");
        String yesNo = scannerStr.next();
        System.out.println(yesNo);

        if((yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("Yes") || yesNo.equals("yes"))){
            System.out.println("Wiped!");
            computerTable.clear();
            gameXX.rgTable.clearDrawnNumbersTable(gameXX.howManyNumbers);
            //gameXX.randomGeneratorTables.setSingleDrawnNumbersTable();
            return indexComputer = 0;
        }
        else {
            System.out.println("Nothing changed.");
            return 0;
        }
    }

/**************************************************************/
    // Method to SHOW text System.out.println() and br() is \n, and getInput only integers.
    static void show(String text) {
        System.out.println(text);
    }

    static void br () {
        System.out.println("\n");
    }

    static String empty () {
        return "";
    }


    //getInput only Integer
    public static int getIntInput(Scanner i) {
        try {
            return (Integer.parseInt(i.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Wrong Choice.\nPlease try again.");
            return getIntInput(i);
        }
    }

    //customizeGameMenu
    public static String customizeGameMenu() {
        String menu = "1. New Game - Computer Numbers\n";
        menu += "2. New Game - Player Numbers\n";
        menu += "3. Show Scores - Computer\n";
        menu += "4. Show Scores - Player\n";
        menu += "5. Clear Scores - Computer\n";
        menu += "6. Clear Scores - Player\n";
        menu += "7. Reset & Quit\n";


        menu += "Please make a selection";
        return menu;
    }


}//End of the Class
