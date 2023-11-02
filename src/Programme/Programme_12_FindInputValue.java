package Programme;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any charcter: ");
        char ch = scanner.next().charAt(0);
        //object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //scanner close
        scanner.close();
    }

    //Find the input value is Alphabet,Digit,and Symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is An Alphabet. ");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit. ");
        } else {
            System.out.println(ch + " is a Symbol. ");

        }

    }
}


