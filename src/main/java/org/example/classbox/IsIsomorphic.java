package org.example.classbox;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    //Where the position of the words have to be the same
    public Boolean isIsomorphic2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {

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
//
//    public Boolean isIsomorphic(String wordOne, String wordTwo) {
//        if (wordOne.length() != wordTwo.length()) {
//            System.out.println("false");
//            return false;
//        } else {
//            Map<Character, Integer> aMap = new HashMap<>();
//            Map<Character, Integer> bMap = new HashMap<>();
//
//            Integer index = 0;
//            for (char a : wordOne.toCharArray()) {
//                for (char b : wordTwo.toCharArray()) {
//                    char elementA = a;
//                    char elementB = b;
//
//                    if (!aMap.containsKey(elementA)) {
//                        aMap.put(elementA, index);
//                    }
//
//                    if (!bMap.containsKey(elementB)) {
//                        bMap.put(elementB, index);
//                    }
//
//                    if (!aMap.get(a).equals(bMap.get(b))) {
//                        System.out.println("false");
//                        return false;
//                    }
//                    index++;
//                }
//
//            }
//            System.out.println("true");
//            return true;
//
//
//        }
//    }




}

