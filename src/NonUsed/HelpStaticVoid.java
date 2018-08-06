package NonUsed;

public class HelpStaticVoid {

        //Tu sie zaczyna Main method
        public static void main(String args[]){

            // 1a. CLASSNAME name = NEW CLASSNAME();  - to create a new object
            // 1b.  name.method(value);
            HelpStaticVoid n = new HelpStaticVoid();        //1a
            System.out.println(n.cubeNonStatic(5));      //1b


            //2. przywolanie metody cubieStatic
            //2. bezposrednio cubeStatic();
            System.out.println(cubeStatic(10));


            //3.static void - (VOID nie daje return)
            newFunction(15);


            //


        } //Koniec Main Method


        /* Poza MAIN method
         */

        //1.NON STATIC INT "return" (ale bez void to musi byc Return)
        public int cubeNonStatic(int x){
            return x*x*x;
        }

        //2.STATIC INT "return" belongs to the class
        public static int cubeStatic(int x){
            return x*x*x;
        }


        //3. Static VOID (cannot be return!)
        public static void newFunction(int x){
            System.out.println(x*x*x);
        }




}
