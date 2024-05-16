package org.example.basic;

public class MathCalculations {

    public int additionFunction(int numA, int numB){
        int sum = numA + numB;
        return sum;
    }

    public int multiplyFunction(int numA, int numB){

        //This in this case doesn't need a new object and can access the method directly because its in the same class
        int sum = this.additionFunction(numA, numB);

        int sumMultiplied = sum * 2;
        return sumMultiplied;

    }


}
