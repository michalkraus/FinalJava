package NonUsed;

public class help {

    /*
    Different method header
    public static TYPE name (parameters){ statements}

    Method what to return
    public static TYPE name (parameters) {
    statement
    return data; //  I can return only one data type
    }

    Capture the value at the method call
    variable = name (parameter);

     */



    // Mathematic operators

    /*
    method header	example	summary
< any > abs(< any > x)	int x = Math.abs(-2);	returns the absolute value of x
double pow(double base, double exp)	double x = Math.pow(10,2);	returns the result of base to the power exp
double sqrt(double x)	double x = Math.sqrt(25.0);	returns the square root of x
double random()	double x = Math.random();	returns a randomly generated number between 0 and 1

     */


    /*  Recursive Algorithms

        Factorial

        public static int factorial(int n){
        if (n == 1) {return 1;}
        return n * factorial(n-1);
        }

     */





    /*
        Creating an Array
        type [] name = new type [length];

        Access:
        name [index]

        Modifying
        name[index] = value;

        char[] a = {'a', 'b', 'c', 'd'};

        Arrays + For Loops examples
        for (int i = 0; i < 7; i++) {
        System.out.println(scores[i]);

        for (int i =0; i < 10; i++){
        Score[i] = scanner.nextInt();
        }

        for (int i =0; i < scores.length; i++){
        sum += scores[i];
        }




These functions do not come included by default, so if you want to use them you have to include the following import statement.

import java.util.Arrays;
Here is a table of some of the most useful array methods:

method	                    example	                                    description
toString(array)	            Arrays.toString(a)	                        returns a String representation of the array using square brackets and commas like so: [value, value, value]
equals(array1,              array2)	Arrays.equal(a, b) OR a.equals(b)	returns true if the two arrays contain the same elements in the same order
fill(array, value)	        Arrays.fill(a, 10)	                        fills every index of the array with a copy of the given value
copyOf(array, newLength)	Arrays.copyOf(a, 10)	                    creates a new array object with the given length and fills it with values in the same order as the original array. If there are left over indexes those are filled with the data type's zero value
sort(array)	                Arrays.sort(a)	                            arranges the values in the array in sorted order from smallest to largest
binarySearch(array, value)	Arrays.binarySearch(a, 100)	                returns the index of th given value in a sorted array. Will return a negative number if the value doesn't exist in the array.


***
int a[] = new int[5]; // [0, 0, 0, 0, 0]
a[0] = 10;            // [10, 0, 0, 0, 0]
int b[] = a;          // [10, 0, 0, 0, 0]
b[0] = 5;             // [5, 0, 0, 0, 0]
System.out.println("a = " + Arrays.toString(a));
System.out.println("b = " + Arrays.toString(b));
The two printlns at the end of this code would produce the following output:

a = [5, 0, 0, 0, 0]
b = [5, 0, 0, 0, 0]


****


to create a new variable "b" that stores an array of the exact same values as a different array "a", but without affecting the original array?
b = Arrays.copyOf(a, a.length);





2D arrays,
Declaring a 2D Array:

type [][] name = new type [row][col];
dataType[][] name = new dataType[numOfArrays][capacityOfEachArray];

name [row][col]
myGrid [1][3] =7;
      0 1 2 3 5
0[]->[][][][][]
1[]->[][][][7][]
2[]->[][][][][]


This method will traverse all the elements within the first row, then all the elements within the second row etc...

int[][] a = new int[3][3];
int count = 0;
for (int row = 0; row < a.length; row++) {
    for (int col = 0; col < a[row].length; col++) {
        a[row][col] = count;
        count++;
    }
}


*******************************************************
ArrayList<DataType> name = new ArrayList<DataType>(); // cannot be <int>

*Wrapper Classes instead (A simple object that contains a primitive
so you can use primitive types in data structures like ArrayLists)
int =>Integer
char => Character
double=> Double
boolean => Boolean

example:
ArrayList<Integer> name = new ArrayList<Integer>();

ArrayList Methods:

add(value) myList.add("hello")
add (index, value) myList.add (0, "hello")
clear() myList.clear()
indexOf (value) myList.indexOf("hello")
get (index) myList.get(0)
remove (index) myList.remove(0)
set (index, value) myList.set(0, "goodbye")
size() myList.size(0)
toString() myList.toString()



Creating an ArrayList
ArrayLists are their own data type and then you specify what type of data they store in a parameter during construction.

ArrayList<dataType> name = new ArrayList<dataType>();
You do not need to specify a capacity for an ArrayList because the structure will grow and shrink automatically. In fact, the ArrayList has a size variable that it maintains for you, so you'll always have an easy way to check how many elements are stored in the list.

The data type for an ArrayList that stores Objects is pretty straight forward:

ArrayList<String> name = new ArrayList<String>();
However, ArrayLists require that you give them an object as a data type- so how do you store primitives? You have to pass them in as an object.

Wrapper Classes
A wrapper class is the way that Java allows you to use primitives when an object is required. They are the simplest possible "wrapper" around a primitive data type to make it into an object.

primitive	wrapper class
int	Integer
boolean	Boolean
double	Double
char	Character
That means to make an ArrayList of ints you would use the "Integer" wrapper class like so:

ArrayList<Integer> name = new ArrayList<Integer>();
Java is smart enough to automatically convert between wrapper classes and their primitives when you are working with the data explicitly, so other than this change you can use the keyword "int" as you would normally.

Storing Data with an ArrayList
Once you have created your ArrayList you'll likely want to fill it up with data as you have been doing with arrays. Unlike the array, where you directly access each element using the square bracket notation, ArrayLists provide methods to access elements like so:

dataType variable = name.get(index); // equivalent of name[index]
name.set(value, index);              // equivalent of name[index] = value;
These methods function exactly as you would expect based on how we used arrays. ArrayLists have 0 based indexes, just like arrays, and when you set a value it will override whatever value was stored there before.

To know how many elements are currently stored in an ArrayList you use the .size() method like so:

list.size(); // equivalent to list.length


     */
}
