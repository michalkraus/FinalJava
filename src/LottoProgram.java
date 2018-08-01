import java.lang.reflect.Method;
import java.util.Scanner;

public class LottoProgram {

    private final static int CUSTOMIZE_GAME = 1;
    private final static int GAME649 = 2;
    private final static int TABLE_SCORES = 3;
    private final static int QUIT = 4;

    public int xMaxNumber;
    public int xHowManyNumbers;

    protected RandomGenerator gameXX = new RandomGenerator(xMaxNumber,xHowManyNumbers);
    protected ScoreTable table = new ScoreTable();


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
            userChoice = scanner.nextInt(); //getIntInput(scanner,menu());

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
        System.out.println("\n This is your table Scores from the last draw:");
        gameXX.getDrawnNumbersTable();
        table.add(0,gameXX.randomGeneratorTables.drawnNumbersTable);
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
        String menu = "1. New Game\n";
        menu += "2. Player Table\n";
        menu += "3. Show Scores\n";
        menu += "4. Clear Scores\n";
        menu += "5. Reset & Quit\n";

        menu += "Please make a selection";
        return menu;
    }

//getInput only Integer - Menu
//    public static int getIntInput(Scanner i, String m) {
//        System.out.println(m);
//        try {
//            return (Integer.parseInt(i.nextLine()));
//        } catch (NumberFormatException e) {
//            System.out.println("Wrong Choice.\nPlease try again.");
//            return getIntInput(i,m);
//
//        }
//    }

    //Reset Scanner
    public Scanner resetScanner (){
        return scanner = new Scanner(System.in);
    }


}//END OF CLASS - LottoProgram
