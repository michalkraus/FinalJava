import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // initializing unsorted int array
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