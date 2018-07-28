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
            System.out.println("No Scores yet! (scoreTable.isEmpty");
            return null;
        } else if (scoreTable == null){
            System.out.println("No Scores yet! (scoreTable == null)");
            return null;
        }
        else {
            scoreTable.get(index);
            return (scoreTable.get(index));
        }
    }

    //ArrayList.CLEAR function
    public void clear () {
        this.scoreTable.removeAll(scoreTable);
    }



}