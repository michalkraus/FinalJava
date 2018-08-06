import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tables {

//Attribute

    protected ArrayList<int[]> rowTable = new ArrayList<int[]>();
    protected int [] drawnNumbersTable;

    Scanner scanner = new Scanner(System.in);


//DrawnNumbersTable Function

    protected void getDrawnNumbersTable (int xhowManyNumbers) {
        for (int i = 0; i < xhowManyNumbers; i++) {

            if(drawnNumbersTable == null){
                System.out.println("No Scores!");
                break;

            } else
                if (drawnNumbersTable[i]>=10){
                    System.out.print(drawnNumbersTable[i] + ", ");
                }
                else System.out.print(" " + drawnNumbersTable[i] + ", ");
        }
        System.out.println("");
    }


    protected int[] setDrawnNumbersTable (int[] drawnNumbersTable) {
        this.drawnNumbersTable = drawnNumbersTable;
        return drawnNumbersTable;
    }


    protected int[] setNewDrawnNumbersTable (int x) {
        this.drawnNumbersTable = new int[x];
        return this.drawnNumbersTable;
    }


    protected int getSingleNumberFromDrawnNumbersTable (int index) {
        return drawnNumbersTable[index];
    }


    protected int [] clearDrawnNumbersTable (int xHowManyNumbers){
        return drawnNumbersTable = new int [xHowManyNumbers];
    }


    protected void showNumbersFromAllLines (int xhowManyNumbers) {
        for (int i=0; i<rowTable.size();i++){
            System.out.print("Line index " + i + " ");
            getDrawnNumbersTable(xhowManyNumbers);
        }
    }


    protected int setSingleLineOfNumbersInDrawnNumbersTable (int xhowManyNumbers, int xNumbersInPool){
        for (int i=0; i<xhowManyNumbers;i++){
            System.out.println("You have to set " + xhowManyNumbers + " numbers, from pool of: " + xNumbersInPool);
            System.out.println("This is, number: " + (i+1));
            drawnNumbersTable[i]=scanner.nextInt();
        }
        return drawnNumbersTable[xhowManyNumbers-1];
    }


//ArrayList Functions:

    //ArrayList.ADD function
    public void add (int index, int[] x) {
        rowTable.add(index, x);
        rowTable.get(index);
        setDrawnNumbersTable(rowTable.get(index));
        System.out.print("Index: " + index + ": "); getDrawnNumbersTable(drawnNumbersTable.length);
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
//ArrayList.SIZE - checkIndex function
    public int checkIndex() {
        return rowTable.size();
    }

//ArrayList.CLEAR function
    public void clear () {
        this.rowTable.removeAll(rowTable);
    }





}//End of Table Class
