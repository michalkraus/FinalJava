package NonUsed;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    public static void main(String[] args) {

        double x;
        double z;
        double y;

        x = factorial(6);
        z = factorial(49);
        y = factorial(43);

        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

        double chance = z / (x*y);
        int chanceInt = (int)chance;
        System.out.println(chanceInt);

    }

    public static double factorial(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


}
