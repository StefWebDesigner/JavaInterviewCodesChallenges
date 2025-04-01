package org.example;

import org.example.classbox.MajorityElement;
import org.example.classbox.RemoveDuplicates;
import org.example.classbox.RemoveElement;
import org.example.codeClasses.*;
import org.example.practiceDemos.OutputReviewChallenges;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

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

        BubbleSortingArrayList bubbleSortingArrayList = new BubbleSortingArrayList();
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(100);
        listOfIntegers.add(7);
        listOfIntegers.add(50);
        listOfIntegers.add(2);
        listOfIntegers.add(5);

        bubbleSortingArrayList.arrayListSort(listOfIntegers);

        LowestMaxListSumClass lowestMaxListSumClass = new LowestMaxListSumClass();
        lowestMaxListSumClass.miniMaxSum2(listOfIntegers);

//        System.out.println("List off account :");
//        List<String> listOfAccounts = new ArrayList<>();
//        listOfAccounts.add("03 10103538 2222 1233 6160 0142"); //1
//        listOfAccounts.add("03 10103538 2222 1233 6160 0141"); //1
//        listOfAccounts.add("30 10103538 2222 1233 6160 0141"); //2
//        listOfAccounts.add("30 10103538 2222 1233 6160 0142"); //2
//        listOfAccounts.add("30 10103538 2222 1233 6160 0141");
//        listOfAccounts.add("30 10103538 2222 1233 6160 0142");
////        --- slipe here
//        listOfAccounts.add("30 10103538 2222 1233 6160 0144"); //1
//        listOfAccounts.add("03 10103538 2222 1233 6160 0142"); //1
//        listOfAccounts.add("30 10103538 2222 1233 6160 0145"); //1
//        listOfAccounts.add("30 10103538 2222 1233 6160 0146");//1
//        listOfAccounts.add("30 10103538 2222 1233 6160 0143");//1

//      This is importing a file in the code challenge

        //*** BANK ACCOUNT CODE CHALLENGE & ACCESSING OI FILES
//        BufferedReader reader =
//                new BufferedReader(new FileReader("src/main/java/input"));
//
//        System.out.println("Reading the file using readLine() method:");
//        String contentLine = reader.readLine();
//        while (contentLine != null) {
//            contentLine = reader.readLine();
//        }
//
//        ExtractingFromFile extractingFromFile = new ExtractingFromFile();
//        List<String> convertedFile =  extractingFromFile.extractFile("src/main/java/input");

//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.bankAccountClassChallenge(convertedFile);

        PalidronString palidronString = new PalidronString();

        palidronString.maxiumPalidoneUsingKChanges("43435", 3);

        QuickSortInt quickSortInt = new QuickSortInt();
        int a[] = {10, 7, 8, 9, 1, 5};
        int nx = a.length;
        int l = 0;
        quickSortInt.sort(a, l, nx - 1);

        String[] strings = {"banana", "apple", "cherry", "date", "fig"};
        System.out.println("Unsorted array: " + Arrays.toString(strings));

        QuickSortString quickSortString = new QuickSortString();
        quickSortString.quickSort(strings, 0, strings.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(strings));


//        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OutputReviewChallenges outputReviewChallenges = new OutputReviewChallenges();


        Anagram anagram = new Anagram();
        anagram.isAnagram("work", "work");

        Fabiacui fabiacui1 = new Fabiacui();
        fabiacui1.fabiacuici(4, 0, 1);

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        isomorphicStrings.isIsomorphic("worr", "work");

        PalidroneNumbers palidroneNumbers = new PalidroneNumbers();
        int[] arr77 = {1,1,2,3,1,1};
        palidroneNumbers.isPalidroneNumber(arr77);

//        outputReviewChallenges.isoString("worr", "wokk");

        UsingSets usingSets = new UsingSets();
        usingSets.creatingSets();

        outputReviewChallenges.mostRepeatingCharacterStreams();
        PracticeCode practiceCode = new PracticeCode();
//        practiceCode.removeElement(arr77, 3);

        RemoveElement element = new RemoveElement();
        element.removeElement(arr77, 2);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(arr77);

        MajorityElement majorityElement = new MajorityElement();
        majorityElement.majorityElement(arr77);

    }





}