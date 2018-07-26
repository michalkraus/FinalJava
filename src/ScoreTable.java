import java.util.ArrayList;
import java.util.Arrays;

public class ScoreTable {

    //Attribute
    private ArrayList<int[]> scoreTable = new ArrayList<int[]>();

    //ArrayList.ADD function
    public void add (int index, int[] x) {
        scoreTable.add(index, x);
        System.out.println("Index: " + index + " " + scoreTable.get(index));
        }

    //ArrayList.GET function
    public int[] get (int index) {
        if (scoreTable.isEmpty()) {
            System.out.println("No Scores yet!");
            return null;

        } else {
            scoreTable.get(index);
            return (scoreTable.get(index));
        }
    }
}