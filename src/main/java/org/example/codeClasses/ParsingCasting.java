package org.example.codeClasses;

public class ParsingCasting {

    public int paraseStringToInt() {
        String str = "123";
        int value  = Integer.parseInt(str);
        System.out.println(value);
        return value;
    }

    public Integer parseStringToInteger(){
        String str = "123";
        Integer value = Integer.valueOf(str);
        System.out.println(value);
        return value;
    }

    public String parseIntToString(){
        int num = 9;
        String str = String.valueOf(num);
        System.out.println(str);
        return str;
    }

    public String parseIntegerToString(){
        Integer num = 9;
        String str = String.valueOf(num);
        System.out.println(str);
        return str;
    }

    public Integer parseCharToInteger(){
        char ch = '1';
        Integer result = Character.getNumericValue(ch);
        System.out.println(result);
        return result;
    }


    }
