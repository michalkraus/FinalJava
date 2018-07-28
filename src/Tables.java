import java.util.ArrayList;
import java.util.Arrays;

public class Tables {

    //Attribute
    protected ArrayList<int[]> rowTable = new ArrayList<int[]>();
    protected int [] drawnNumbersTable;




//DrawnNumbersTable Function

    protected void getDrawnNumbersTable (int xHowManyNumbers) {
        for (int i = 0; i < xHowManyNumbers; i++) {

            if(drawnNumbersTable[0] == 0){
                System.out.println("No Scores!");
                break;

            } else
            System.out.println(drawnNumbersTable[i]);
        }
    }


    protected int[] setDrawnNumbersTable (int[] scores) {
        this.drawnNumbersTable = scores;
        return scores;
    }


    protected int getSingleNumberFromDrawnNumbersTable (int index) {
        return drawnNumbersTable[index];
    }

    protected void setSingleDrawnNumebersTable (){

    }


    protected int [] clearDrawnNumbersTable (int xHowManyNumbers){
        return drawnNumbersTable = new int [xHowManyNumbers];
    }




//ArrayList Functions:

    //ArrayList.ADD function
    public void add (int index, int[] x) {
        rowTable.add(index, x);
        System.out.println("Index: " + index + " " + rowTable.get(index));
    }

    //ArrayList.GET function
    public int[] get (int index) {
        if (rowTable.isEmpty()) {
            System.out.println("No Scores yet! (scoreTable.isEmpty");
            return null;
        }
        else if (rowTable == null){
            System.out.println("No Scores yet! (scoreTable == null)");
            return null;
        }
        else {
            rowTable.get(index);
            return (rowTable.get(index));
        }
    }

    //ArrayList.CLEAR function
    public void clear () {
        this.rowTable.removeAll(rowTable);
    }




}//End of Table Class
