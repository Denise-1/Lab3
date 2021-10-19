// Denise Chen
// IS 147-04
// d189@umbc.edu
// 10/19/2021
// create a password with user's full name, random number,
// and print it then reverse it.

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        char lastLetter = (firstName.toUpperCase().charAt(firstName.length() - 1));     // gets last character of first name
        System.out.println(lastLetter);
        String letterStr = String.valueOf(lastLetter);      // creates character into a string

        System.out.println("Enter your last name and press enter: ");
        String lastName = input.nextLine();

        int randomNumber = (int)(Math.random() * 99 + 10);      // random number from 10-99

        System.out.println("Your password is: " + lastLetter + randomNumber + lastName);
        System.out.println("Your password after using concat: " + lastLetter + randomNumber + lastName.concat("****"));
        // ^ prints out last character of first name, random number, lastname, and stars

        StringBuilder stringPassword = new StringBuilder(letterStr + randomNumber + lastName.concat("****"));
        StringBuilder reverseString = stringPassword.reverse();     // reverses password with ****
        System.out.println("Your password after reverse: " + reverseString.toString());

    }
}




