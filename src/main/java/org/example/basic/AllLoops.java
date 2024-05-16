package org.example.basic;

public class AllLoops {


    public void forLoopDemo(String name){

        char[] nameChar = name.toCharArray();
        int nameCharSize = nameChar.length;

        for(int i = 0; i < nameCharSize; i++ ) {
            //It will cycle through and repeat a value with "i's" position
            System.out.println(i);
        }
    }

    public void doWhileLoop(){

        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);


    }



}
