/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marcelino Pozo-Joseph
 */
/*
    PSEUDOCODE GOES HERE
    Basically write out step by step what ur codes doing.
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
