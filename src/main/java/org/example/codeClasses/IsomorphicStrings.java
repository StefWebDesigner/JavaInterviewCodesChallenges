package org.example.codeClasses;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsomorphicStrings {

    public Boolean isIsomorphic(String a, String b) {
        if (a.length() != b.length()){
            return false;
        }

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < a.length(); ++i) {
            char element1 = a.charAt(i);
            char element2 = b.charAt(i);

            if (!mapA.containsKey(element1)) {
                mapA.put(element1, i);
            }

            if (!mapB.containsKey(element2)) {
                mapB.put(element2, i);
            }

            if (!mapA.get(element1).equals(mapB.get(element2))) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("Iso - true");
        return true;










    }

}
