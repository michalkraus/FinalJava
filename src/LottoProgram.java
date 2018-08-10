import java.util.Scanner;

public class LottoProgram {

    private final static int CUSTOMIZE_GAME = 1;
    private final static int GAME649 = 2;
    private final static int TABLE_SCORES = 3;
    private final static int QUIT = 0;

    Scanner scanner = new Scanner(System.in);
    protected int userChoice;


    //MAIN STARTS HERE
    public static void main (String [] args) {

        LottoProgram myProgram = new LottoProgram();
        myProgram.run();
    }

//RUN method
    public void run() {
        //int userChoice;
        do {
            System.out.println(menu());
            userChoice = getIntInput(scanner);

            switch (userChoice) {
                case LottoProgram.CUSTOMIZE_GAME:
                    customizeYourGame();
                    break;

                case LottoProgram.GAME649:
                    lottoGame649();
                    break;

                case LottoProgram.TABLE_SCORES:
                    tableScores();
                    break;

                case LottoProgram.QUIT:
                    System.out.println("Good Luck with Lotteries!");
                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");
            }
        } while (userChoice != 0);
    }



//1. Customize GAME
    public void customizeYourGame() {
        CustomizeGame customizeGame = new CustomizeGame();
        do {
            //Welcome TEXT and conditions to calibrate Customize Game.
            show("\n..**..CUSTOMIZE YOUR GAME..**..\n\n...Please build your own lottery...");

            show("\nHow Many numbers will you drawn?.....");
            customizeGame.gameXX.setHowManyNumbeers(getIntInput(scanner));

            show("How Many numbers would you like to have in the pool?.....");
            customizeGame.gameXX.setNumbersInPool(getIntInput(scanner));

            br();
            customizeGame.xNumbersInPool = customizeGame.gameXX.getNumbersInPool();

            if (customizeGame.gameXX.getNumbersInPool() <= customizeGame.gameXX.getHowManyNumbers()){
                show("You cannot have less or the same numbers in pool than you want to drawn! Try again");
                br();
            }
            else if ((customizeGame.gameXX.getHowManyNumbers() ==0) || (customizeGame.gameXX.getNumbersInPool() == 0)) {
                show("You cannot have variable 0");
                br();
            }
            else if ((customizeGame.gameXX.getHowManyNumbers() < 0) || (customizeGame.gameXX.getNumbersInPool() < 0)) {
                show("You cannot have negative variables!");
                br();
            }
        }while ((customizeGame.gameXX.getHowManyNumbers() >= customizeGame.gameXX.getNumbersInPool()) || (customizeGame.gameXX.getHowManyNumbers() ==0) || (customizeGame.gameXX.getNumbersInPool() == 0) || (customizeGame.gameXX.getHowManyNumbers() <0) || (customizeGame.gameXX.getNumbersInPool() <0));


        customizeGame.newCustomizeGame();
    }


//2. GAME 649
    public void lottoGame649(){
        show("\n..Welcome to 6/49 Game...\n");

        CustomizeGame game649 = new CustomizeGame();
        game649.gameXX.setNumbersInPool(49);
        game649.gameXX.setHowManyNumbeers(6);
        game649.xNumbersInPool = game649.gameXX.getNumbersInPool();

        show("\nYou will have numbers in pool: " + game649.gameXX.getNumbersInPool());
        show("\nYou will have and numbers drawn by computer: " + game649.gameXX.getHowManyNumbers());
        br();

        game649.newCustomizeGame();
    }

//    {Game649.main(null);} old IDEA how to play

//3. TABLE_SCORES
    public void tableScores() {
        System.out.println("\n Nothing here.");
 //       gameXX.getDrawnNumbersTable();
 //       table.add(0,gameXX.randomGeneratorTables.drawnNumbersTable);
        System.out.println("Done");
    }

//******************MENU******************
//MAIN MENU
    public static String menu() {
        br();
        String menu = "1. Customize Game \n";
        menu += "2. Game 6/49\n";
        menu += "3. Table Score\n";
        menu += "\n0. Quit\n";

        menu += "Please make a selection";
        return menu;
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

    static void show(String text) {
        System.out.print(text);
    }

    static void br () {
        System.out.print("\n");
    }

}//END OF CLASS - LottoProgram
