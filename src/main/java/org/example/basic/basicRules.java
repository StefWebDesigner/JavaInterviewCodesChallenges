package org.example.basic;

public class basicRules {


    public static void main(String[] args) {

        //Creating the object instance
        Student puja = new Student("Puja");
        //Taking a class that is already made in the class
        puja.setAge(14);
        //Calling that call that was set by the object Puja
        puja.getAge();


        MathCalculations mathCalculations = new MathCalculations();
        int mathResult =  mathCalculations.additionFunction(1,2);

        System.out.println("Addition method  result : " + mathResult);








    }




}
