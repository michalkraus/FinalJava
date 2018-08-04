import java.util.Scanner;

//Customize GAME:
public class CustomizeGame extends LottoProgram {
    //Attributes

    public int xNumbersInPool;
    public int xHowManyNumbers;

    int index = 0;
    int [] rowTable; //row table to display numbers from ArrayList

    Tables computerTable = new Tables();
    Tables playerTable = new Tables();

    protected RandomGenerator gameXX = new RandomGenerator(xNumbersInPool,xHowManyNumbers);
    protected PlayerNumbers playerNumbers = new PlayerNumbers(xNumbersInPool,xHowManyNumbers);


    public void newCustomizeGame() {

        int userChoiceCustomizeGame;
        this.index = 0;

        do {
            //Welcome TEXT and conditions to calibrate Customize Game.
            show("..**..CUSTOMIZE YOUR GAME..**..\nPlease build your own lottery...");

            show("How Many numbers will you drawn?");
            gameXX.setHowManyNumbeers(getIntInput(scanner));

            show("How Many numbers would you like to have in the pool");
            gameXX.setNumbersInPool(getIntInput(scanner));
            xNumbersInPool = gameXX.getNumbersInPool();

            if (gameXX.getNumbersInPool() <= gameXX.getHowManyNumbers()){
                show("You cannot have less or the same numbers in pool than you want to drawn! Try again");
            }
            else if ((gameXX.getHowManyNumbers() ==0) || (gameXX.getNumbersInPool() == 0)) {
                show("You cannot have variable 0");
            }

        }while ((gameXX.getHowManyNumbers() >= gameXX.getNumbersInPool()) || (gameXX.getHowManyNumbers() ==0) || (gameXX.getNumbersInPool() == 0) );

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

                        computerTable.add(index, gameXX.rgTable.drawnNumbersTable);
                        index++;
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

                        playerTable.add(index, playerNumbers.plTable.drawnNumbersTable);
                        index++;

                        show("Your Numbers are saved under index: " + i);
                    }


                    //playerTable.setNewDrawnNumbersTable(gameXX.howManyNumbers);
                    //playerTable.setSingleNumberInDrawnNumbersTable(gameXX.howManyNumbers, gameXX.numbersInPool);
                    break;

                case 3: //Show Scores - Computer
                    System.out.println("Show Scores - Computer");

                    System.out.println("Lottery with index 0");
                    computerTable.get(0);
                    rowTable = computerTable.get(0);
                    gameXX.rgTable.setDrawnNumbersTable(rowTable);
                    gameXX.getDrawnNumbersTable();

                    break;

                case 4: //Show Scores - Player
                    System.out.println("Show Scores - Player");

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
        String yesNo = scanner.next();
        System.out.println(yesNo);

        if((yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("Yes") || yesNo.equals("yes"))){
            computerTable.clear();
            gameXX.rgTable.clearDrawnNumbersTable(gameXX.howManyNumbers);
            //gameXX.randomGeneratorTables.setSingleDrawnNumebersTable();
            return index = 0;
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



}//End of the Class
