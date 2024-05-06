package org.example;

import org.example.codeClasses.Anagram;
import org.example.codeClasses.PalidronString;
import org.example.codeClasses.SortingAlgorithms;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Setting up the scanner input
        Scanner scanner = new Scanner(System.in);

        // Palidrone String Test
//        PalidronString palidronString = new PalidronString();
//        System.out.println("Enter String For the Palidrone Calculator : ");
//        String input = scanner.nextLine();
//        palidronString.isPalidronString(input);

        //Bubble String Sorting Algorithm
//        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
//        System.out.println("Enter a String to be sorted : ");
//        String inputSorting = scanner.nextLine();
//        sortingAlgorithms.bubbleSorting(inputSorting);

        //Anagram String Code Challenge
        Anagram anagram = new Anagram();
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        anagram.isAnagram(inputOne, inputTwo);



    }

}