package org.example.codeClasses;

public class PalidronString {

    public String isPalidronString(String input){
        String reversString = "";
        int inputLength = input.length();
        Boolean isBoolean = false;

        for(int i = inputLength -1; i >= 0; i--){
            reversString = reversString + input.charAt(i);
        }

        if(input.equals(reversString)){
            isBoolean = true;
        }

        if(isBoolean){
            System.out.println(" *** This is a Palidrone Test : **** ");
            System.out.println("String is a palidone");
            return input + " is a Palidone";
        } else {
            System.out.println(" *** This is a Palidrone Test : **** ");
            System.out.println("String isn't a palidone");
            return input + " isn't a Palidone";
        }
    }


}
