package org.example;

import org.example.codeClasses.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Setting up the scanner input
        Scanner scanner = new Scanner(System.in);
        BubbleSortingNumbers bubbleSortingNumbers = new BubbleSortingNumbers();
        Triangle triangle = new Triangle();
        MapsDemos mapsDemos = new MapsDemos();
        OddEven oddEven = new OddEven();
        StringCodeChallenges stringCodeChallenges = new StringCodeChallenges();



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
//        Anagram anagram = new Anagram();
//        String inputOne = scanner.nextLine();
//        String inputTwo = scanner.nextLine();
//        anagram.isAnagram(inputOne, inputTwo);

        //Bubblesorting for Nunbers Ascending
        int [] arr = {1, 87, 2, 56, 9, 0};
        bubbleSortingNumbers.numberBubbleSortingAsc(arr);

        //Bubblesorting for Nunbers Descending
        int [] arr2 = {1, 87, 2, 56, 9, 0};
        bubbleSortingNumbers.numberBubbleSortingDesc(arr2);

        //Nuts and Bolts Code Challenge
        NutBoltMatch nutBoltMatch = new NutBoltMatch();
        char[] nuts = { '@', '#', '$', '%', '^', '&' };
        char[] bolts = { '$', '%', '&', '^', '@', '#' };
        int n = nuts.length;
        nutBoltMatch.nutBoltMatching(nuts, bolts, n);

        //MergeList Code Challenge
        Merging merging = new Merging();
        int[] firstArray = { 11,22,33,44,55,98,76,54,60};
        int[] secondArray = {66,77,88,99,22,67,21,90,80,70};
        merging.mergeList(firstArray, secondArray);

        //Fabiacui Code Challenge
        Fabiacui fabiacui = new Fabiacui();
        int k = 10;
        int firstTerm = 1;
        int secondTerm = 2;
        fabiacui.fabiacuici(k, firstTerm, secondTerm);

        //Regular Pascual's Triangle
        int triangleSize = 10;
        triangle.pascualTriangle(triangleSize);

        //Left Pascual's Triangle
        int triangleSizeTwo = 10;
        triangle.leftPascualTriangle(triangleSizeTwo);


        //Right Pascual's Triangle
        int triangleSizeThree = 10;
        triangle.rightPascualTriangle(triangleSizeTwo);


        //Revered Pascual's Triangle with numbers
        int triangleSizeFour = 10;
        triangle.printingReverseTriangleWithNumbers(triangleSizeFour);

        //Working with Maps
        mapsDemos.workingWithMaps();

        //Working with maps using Streams and list
        mapsDemos.mapsWithStreams();

        //Calcluate if odd or even
        int primeNum = 19;
        int notPrimeNum = 4;
        oddEven.isEvenOdd(notPrimeNum);

        //Takes only odd Intries and squeares them
        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        oddEven.isEvenOddWithStreams(listOfNumbers);

        //Working with Substrings
        stringCodeChallenges.workingWithSubstrings();

        //Encryption String Code Challenge
        String string = "something";
        int shifkey = 1;
        stringCodeChallenges.encryptionCodeChallenge(string, shifkey);


    }



}