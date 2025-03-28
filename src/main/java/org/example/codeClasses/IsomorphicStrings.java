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
            if (!mapA.containsKey(a.charAt(i))) {
                mapA.put(a.charAt(i), i);
            }

            if (!mapB.containsKey(b.charAt(i))) {
                mapB.put(b.charAt(i), i);
            }

            if (!mapA.get(a.charAt(i)).equals(mapB.get(b.charAt(i)))) {
                return false;
            }
        }
        return true;










    }

}
