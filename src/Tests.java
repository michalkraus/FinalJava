import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    public static void main(String[] args) {

        ArrayList<int[]> arl=new ArrayList<int[]>();

        int a1[]={1,2,3};
        arl.add(0,a1);
        System.out.println("Arraylist contains:"+arl.get(0)[0]);


        //        // List of String arrays
//        List<String[]> list = new ArrayList<String[]>();
//
//        String[] arr1 = { "a", "b", "c" };
//        String[] arr2 = { "1", "2", "3", "4" };
//        list.add(arr1);
//        list.add(arr2);
//        // printing list of String arrays in the ArrayList
//        for (String[] strArr : list) {
//            System.out.println(Arrays.toString(strArr));
//        }
   }

}