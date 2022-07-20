import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] number = {scanner.nextInt(), scanner.nextInt()};

    public static void main(String[] args) {
/*
*
* Create a Method that takes an array of two numbers and checks if the first number is the square root  of the second number.
If it is the square root then return true else return false.
For Example:
// [2, 4] -> true
// [3, 9] -> true
// [3, 5] -> false
*
*
* */

        System.out.println(Arrays.toString(number) + " -> " + getBol());


    }

    public static boolean getBol() {

        boolean b;

        if (number[0]*number[0] == number[1]) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }


}
