package org.example.codeClasses;

public class Fabiacui {

    public void fabiacuici(int n, int firstTerm, int secondTerm){
        System.out.println("Fabianco till " + n + " terms.");

        for(int i = 1; i <=  n; ++i){
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }


    }

    public int fibSimpleAndImproved(int n){
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < n) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return num1;
    }


}
