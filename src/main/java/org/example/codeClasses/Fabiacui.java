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

}
