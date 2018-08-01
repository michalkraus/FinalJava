//Customize GAME:
public class CustomizeGame extends LottoProgram {

    int index = 0;
    int [] rowTable; //row table to display numbers from ArrayList

    Tables playerNumbers = new Tables();

    public void newCustomizeGame() {

        int userChoiceCustomizeGame;
        this.index = 0;

        do {
            //Welcome TEXT
            System.out.println("..**..CUSTOMIZE YOUR GAME..**..\nPlease build your own lottery...");
            show("chuj");

            System.out.println("\"How Many numbers will you drawn?");
            gameXX.setHowManyNumbeers(scanner.nextInt());

            System.out.println("How Many numbers would you like to have in the pool");
            gameXX.setNumbersInPool(scanner.nextInt());

            if (gameXX.getNumbersInPool() == gameXX.getHowManyNumbers()){
                System.out.println("You cannot have less or the same numbers in pool than you want to drawn! Try again");
            }
            else if ((gameXX.getHowManyNumbers() ==0) || (gameXX.getNumbersInPool() == 0)) {
                System.out.println("You cannot have variable 0");
            }

        }while ((gameXX.getHowManyNumbers() >= gameXX.getNumbersInPool()) || (gameXX.getHowManyNumbers() ==0) || (gameXX.getNumbersInPool() == 0) );

        do {
            System.out.println(customizeGameMenu());
            userChoiceCustomizeGame = scanner.nextInt(); //getIntInput(scanner,customizeGameMenu());


            switch (userChoiceCustomizeGame){

                case 1: //New Game
                    int howManyTimesPlay; //attribute How Many Times To Generate Numbers

                    System.out.println("How Many times would you like to play?");
                    howManyTimesPlay = scanner.nextInt();

                    for(int i=0; i < howManyTimesPlay; i++){

                        gameXX.numberGenerator();

                        table.add(index, gameXX.randomGeneratorTables.drawnNumbersTable);
                        index++;
                    }

                    System.out.println("Thanks, done: " + howManyTimesPlay + " lotteries.\n");
                    break;

                case 2: //Player Table
                    System.out.println("Player Table");
                    playerNumbers.setNewDrawnNumbersTable(gameXX.howManyNumbers);
                    playerNumbers.setNewDrawnNumbersTable(gameXX.howManyNumbers);
                    playerNumbers.setSingleNumberInDrawnNumbersTable(gameXX.howManyNumbers, gameXX.numbersInPool);
                    break;

                case 3: //Scores
                    System.out.println("Scores from previous lotteries:");

                    System.out.println("Lottery with index 0");
                    table.get(0);
                    rowTable = table.get(0);
                    gameXX.randomGeneratorTables.setDrawnNumbersTable(rowTable);
                    gameXX.getDrawnNumbersTable();
                    break;
//
//                    show("Lottery with index 1");
//                    table.get(1);
//                    rowTable = table.get(1);
//                    gameXX.setScores(rowTable);
//                    gameXX.getScores();


                case 4: //Clear Scores
                    System.out.println("Scores cleared");
                    clearScores ();
                    break;

                case 5: //Reset & Quit
                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");

            }

        } while (userChoiceCustomizeGame != 5);

    }




// Method to SHOW text System.out.println() and br() is \n
    static void show(String text) {
        System.out.println(text);
    }

    static void br () {
        System.out.println("\n");
    }

    static String empty () {
        return "";
    }


//Method to ClearScores
    public int clearScores () {
        System.out.println("Do you want to generate a new game, and wipe the previous scores? Y/N");
        String yesNo = scanner.next();
        System.out.println(yesNo);

        if((yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("Yes") || yesNo.equals("yes"))){
            table.clear();
            gameXX.randomGeneratorTables.clearDrawnNumbersTable(gameXX.howManyNumbers);
            //gameXX.randomGeneratorTables.setSingleDrawnNumebersTable();
            return index = 0;
        }
        else {
            System.out.println("Nothing changed.");
            return 0;
        }
    }


}
