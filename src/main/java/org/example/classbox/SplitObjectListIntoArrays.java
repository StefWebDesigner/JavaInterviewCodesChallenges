package org.example.classbox;

import java.util.ArrayList;
import java.util.List;

public class SplitObjectListIntoArrays {

   public void splitObjectListIntoArrays() {

       Object[] arr = {'c', 'h', '1', '2', '3', 4, 5, 6, '@', '$'};

       List<Integer> integerList = new ArrayList<>();
       List<Character> characterList = new ArrayList<>();
       List<Character> symbolList = new ArrayList<>();

       for (Object obj : arr) {
           if (obj instanceof Integer) {
               integerList.add((Integer) obj);
           } else if (obj instanceof Character && Character.isDigit((Character) obj)) {
               Character item = (Character) obj;
               Integer element = Character.getNumericValue(item);

               integerList.add(element);
           } else if (obj instanceof Character && Character.isAlphabetic((Character) obj)) {
               characterList.add((Character) obj);
           } else {
               symbolList.add((Character) obj);
           }
       }

       System.out.println(characterList);
       System.out.println(integerList);
       System.out.println(symbolList);
   }
}


