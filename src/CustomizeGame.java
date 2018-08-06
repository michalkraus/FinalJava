//Customize GAME
import java.util.Scanner;

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

                        show("Your Numbers are saved under index: " + indexPlayer);
                        br();
                    }
                    System.out.println("Thanks, done: " + howManyTimesPlayerPlay + " lotteries.\n");

                    break;

                case 3: //Show Scores - Computer
                    showScoresComputer();

                    br();
                    break;

                case 4: //Show Scores - Player
                    showScoresPlayer();

                    br();
                    break;

                case 5: //Clear Scores - Computer
                    System.out.println("Clear Scores - Computer");
                    clearScoresComputer ();

                    break;

                case 6: //Clear Scores - Player
                    System.out.println("Clear Scores - Player");
                    clearScoresPlayer ();

                    break;

                case 7: //Reset & Quit

                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");

            }

        } while (userChoiceCustomizeGame != 7);

    }
/***********************Methods********************************/
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



/************Scores Methods*****************************/
//Method to ClearScoresComputer
public int clearScoresComputer () {
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

//Method to ClearScoresPlayer
    public int clearScoresPlayer () {
        System.out.println("Do you want to wipe the previous scores? Y/N");
        String yesNo = scannerStr.next();
        System.out.println(yesNo);

        if((yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("Yes") || yesNo.equals("yes"))){
            System.out.println("Wiped!");
            playerTable.clear();
            playerNumbers.plTable.clearDrawnNumbersTable(playerNumbers.howManyNumbers);
            //gameXX.randomGeneratorTables.setSingleDrawnNumbersTable();
            return indexPlayer = 0;
        }
        else {
            System.out.println("Nothing changed.");
            return 0;
        }
    }

//showScores - computer
    public void showScoresComputer(){
        System.out.println("Show Scores - Computer");
        show("Computer has " + computerTable.checkIndex() + " lines with numbers");

        for (int i=0; i<computerTable.checkIndex();i++){
            System.out.print("Index " + i + " numbers: ");
            computerTable.get(i);
            lineTableComputer = computerTable.get(i);
            gameXX.rgTable.setDrawnNumbersTable(lineTableComputer);
            gameXX.getDrawnNumbersTable();
        }
    }
//showScores - player
    public void showScoresPlayer(){
        System.out.println("Show Scores - Player");
        br();
        show("You have " + playerTable.checkIndex() + " lines with numbers");
        br();
        for (int i=0; i<playerTable.checkIndex();i++){
            System.out.print("Index " + i + " numbers: ");
            playerTable.get(i);
            lineTablePlayer = playerTable.get(i);
            playerNumbers.plTable.setDrawnNumbersTable(lineTablePlayer);
            playerNumbers.getDrawnNumbersTable(lineTablePlayer.length);
        }

    }








}//End of the Class
