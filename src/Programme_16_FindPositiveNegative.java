package Programme;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */


public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //declaration scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        findingNumberIsPositiveNegativeOrZero(number);
        //scanner close
        scanner.close();

    }

    //finding the number is positive, negative or zero
    public static void findingNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a Postitive number ");
        } else if (number < 0) {
            System.out.println(number + " is Negative number ");
        } else {
            System.out.println(number + " is Zero ");

        }


    }

}

