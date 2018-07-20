import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreTable {

    //Attribute
    private ArrayList<int[]> scoreTable = new ArrayList<int[]>();

    //ArrayList.ADD function
    public void add (int index, int[] x) {
        scoreTable.add(index, x);
        System.out.println(scoreTable.get(index));
        }

    //ArrayList.GET function
    public int[] get (int index) {
        scoreTable.get(index);
        return (scoreTable.get(index));
    }
}