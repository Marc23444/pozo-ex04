/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE

    -Create a scanner and multiple strings to hold the word types
    -Prompt for and then grab user input
        -Ask for a noun, verb, adjective and adverb and store them
        all in seperate variables
    -Finally print out the output and include all of the words that
    were prompted for using the + operator
    -Make sure this is done in one .println()!
 */

package example04;

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String noun, verb, adverb,adjective;

        System.out.println("Enter a noun:");
        noun = input.nextLine();

        System.out.println("Enter a verb:");
        verb = input.nextLine();

        System.out.println("Enter an adjective:");
        adjective = input.nextLine();

        System.out.println("Enter an adverb:");
        adverb = input.nextLine();

        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");

    }
}
