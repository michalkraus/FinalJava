//Customize GAME:
public class CustomizeGame extends LottoProgram {

    int index = 0;
    int [] rowTable; //row table to display numbers from ArrayList

    public void newCustomizeGame() {


        int userChoiceCustomizeGame;
        this.index = 0;

        do {
            //Welcome TEXT
            show("..**..CUSTOMIZE YOUR GAME..**..\nPlease build your own lottery...");

            show("How Many numbers will you drawn?");
            gameXX.setHowManyNumbeers(scanner.nextInt());

            show("How Many numbers would you like to have in the pool");
            gameXX.setNumbersInPool(scanner.nextInt());

            if (gameXX.getNumbersInPool() < gameXX.getHowManyNumbers()){
                show("You cannot have less numbers in pool than you want to drawn! Try again");
            }
        }while (gameXX.getHowManyNumbers() > gameXX.getNumbersInPool());

        do {
            show(customizeGameMenu());
            userChoiceCustomizeGame = scanner.nextInt();

            switch (userChoiceCustomizeGame){

                case 1: //New Game
                    clearScores();
                    int howManyTimesPlay; //attribute How Many Times To Generate Numbers

                    show("How Many times would you like to play?");
                    howManyTimesPlay = scanner.nextInt();

                    for(int i=0; i < howManyTimesPlay; i++){

                        gameXX.numberGenerator();

                        table.add(index, gameXX.scores);
                        index++;
                    }

                    show("Thanks, done: " + howManyTimesPlay + " lotteries.\n");
                    break;

                case 2: //Scores
                    show("Scores from previous lotteries:");

                    show("Lottery with index 0");
                    table.get(0);
                    rowTable = table.get(0);
                    gameXX.setScores(rowTable);
                    gameXX.getScores();
                    break;
//
//                    show("Lottery with index 1");
//                    table.get(1);
//                    rowTable = table.get(1);
//                    gameXX.setScores(rowTable);
//                    gameXX.getScores();


                case 3: //Clear Scores
                    show("Scores cleared");
                    clearScores ();
                    break;

                case 4: //Reset & Quit
                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");

            }

        } while (userChoiceCustomizeGame != 4);
    }

// Method to SHOW text System.out.println() and br() is \n
    static void show (String text) {
        System.out.println(text);
    }

    static void br () {
        System.out.println("\n");
    }


//Method to ClearScores
    public int clearScores () {
        show("Do you want to generate a new game, and wipe the previous scores? Y/N");
        String yesNo = scanner.next();
        show(yesNo);

        if((yesNo.equals("Y") || yesNo.equals("y") || yesNo.equals("Yes") || yesNo.equals("yes"))){
            table.clear();
            gameXX.clearGeneratorScores();
            return index = 0;
        }
        else {
            show("Nothing changed.");
            return 0;
        }
    }


}
