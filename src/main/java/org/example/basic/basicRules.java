package org.example.basic;

public class basicRules {


    public static void main(String[] args) {

        //Creating the object instance

        //puja isn't using a paramater constructor so you don't need to add anything ot the constructor
        Student puja = new Student();
        //Taking a class that is already made in the class
        puja.setAge(14);
        //Calling that call that was set by the object Puja
        puja.getAge();

        //Student here hrequires the name to be added or it will throw an error
        StudentWithParamaterConstructor student = new StudentWithParamaterConstructor("Stefan");


        MathCalculations mathCalculations = new MathCalculations();
        int num1 = 1;
        int num2 = 2;

        //Adding it with a paramateized argument
        int mathResult =  mathCalculations.additionFunction(num1,num2);
        //Using a method with "This"
        int miltipleCalResult = mathCalculations.multiplyFunction(num1, num2);

        System.out.println("Addition method  result : " + mathResult);
        System.out.println("The results of the multiple calcuations is " + miltipleCalResult);


        //Calling the object for all loops
        AllLoops allLoops = new AllLoops();

        String name = "Street";
        allLoops.forLoopDemo(name);

        allLoops.doWhileLoop();








    }




}
