import javax.swing.*;
import java.util.*;

//Customize GAME:
public class CustomizeGame extends LottoProgram {

    public void newCustomizeGame() {

        int [] rowTable; //row table to display numbers from ArrayList
        int userChoice;
        int index = 0;

        do {
            show(customizeGameMenu());

            userChoice = scanner.nextInt();


            show("CUSTOMIZE YOUR GAME:");
            switch (userChoice){

                case 1: //New Game
                    int howManyTimesPlay; //attribute How Many Times To Generate Numbers

                    show("How Many numbers will you drawn?");
                    gameXX.setHowManyNumbeers(scanner.nextInt());

                    show("How Many numbers would you like to have in the pool");
                    gameXX.setMaxNumber(scanner.nextInt());

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
                        br();

                        show("Lottery with index 1");
                        table.get(1);
                        rowTable = table.get(1);
                        gameXX.setScores(rowTable);
                        gameXX.getScores();

                    break;



                case 4: //Quit
                    break;

                default:
                    System.out.println("Wrong Choice.\nPlease try again.");

            }

        } while (userChoice != 4);
    }

    static void show (String text) {
        System.out.println(text);
    }

    static void br () {
        System.out.println("\n");
    }

}
