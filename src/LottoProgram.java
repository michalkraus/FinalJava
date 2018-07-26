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

    protected Scanner scanner = new Scanner(System.in);


//MAIN STARTS HERE
    public static void main (String [] args) {

        LottoProgram myProgram = new LottoProgram();
        myProgram.run();
    }

//RUN method
    public void run() {
        int userChoice;
        do {
            System.out.println(menu());
            userChoice = scanner.nextInt();

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
        CustomizeGame customGame = new CustomizeGame();
        customGame.newCustomizeGame();
    }

//2. GAME 649
    public void lottoGame649(){
        Game649.main(null);
    }

//3. TABLE_SCORES
    public void tableScores() {
        System.out.println("\n This is your table Scores from the last draw:");
        gameXX.getScores();
        table.add(0,gameXX.scores);
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
        menu += "2. Scores\n";
        menu += "4. Quit\n";

        menu += "Please make a selection";
        return menu;
    }






}//END OF CLASS - LottoProgram
