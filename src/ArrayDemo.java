import java.util.Arrays;
public class ArrayDemo {

    public static void main(String[] args) {

        arraySort();
        System.out.println("\n\n");

        winnerChecker();

    }

    public static void winnerChecker(){

        int[] a = {1,2,3,4,5};
        int[] b = {8,1,3,9,4};
        int winnerCounter;

        winnerCounter=0;
        System.out.print("Theses numbers win: ");
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]) {
                    winnerCounter++;
                    System.out.print(a[i] + ", ");
                }
            }

        }
        System.out.print("Total of " + winnerCounter + " numbers on this ticket. Congrats.");
    }



    public static void arraySort(){ // initializing unsorted int array
         int iArr[] = {2, 1, 9, 6, 4};

    // let us print all the elements available in list
         for (int number : iArr) {
         System.out.println("Number = " + number);
         }

    // sorting array
         Arrays.sort(iArr);

    // let us print all the elements available in list
         System.out.println("The sorted int array is:");

         for (int number : iArr) {
         System.out.println("Number = " + number);
         }
         System.out.println(iArr[0] + " " + iArr[1]+ " " + iArr[2]+ " " + iArr[3] + " " + iArr[4]);
    }
}