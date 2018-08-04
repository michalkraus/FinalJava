import java.util.Scanner;

public class LottoProgram {

    private final static int CUSTOMIZE_GAME = 1;
    private final static int GAME649 = 2;
    private final static int TABLE_SCORES = 3;
    private final static int QUIT = 4;

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
        } while (userChoice != 4);
    }



//1. Customize GAME
    public void customizeYourGame() {
        CustomizeGame customizeGame = new CustomizeGame();
        customizeGame.newCustomizeGame();
    }

//2. GAME 649
    public void lottoGame649(){
        Game649.main(null);
    }

//3. TABLE_SCORES
    public void tableScores() {
        System.out.println("\n Nothing here.");
 //       gameXX.getDrawnNumbersTable();
 //       table.add(0,gameXX.randomGeneratorTables.drawnNumbersTable);
        System.out.println("Done");
    }

//******************MENUS******************
//MAIN MENU
    public static String menu() {
        String menu = "1. CUSTOMIZE_GAME\n";
        menu += "2. GAME649\n";
        menu += "3. TABLE_SCORES\n";
        menu += "4. Quit\n";

        menu += "Please make a selection";
        return menu;
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

//getInput only Integer
    public static int getIntInput(Scanner i) {
        try {
            return (Integer.parseInt(i.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Wrong Choice.\nPlease try again.");
            return getIntInput(i);
        }
    }



}//END OF CLASS - LottoProgram
