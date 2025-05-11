package org.example.classbox.medium;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringNonRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 2){
            return -1;
        }

        int start = 0;
        int end = 0;
        boolean startLock = false;
        String result = "";
        Map<Character, Integer> tracker = new HashMap<>();
        int counter = 0;
        List<String> temp = new ArrayList<>();

         for (int i = 0; i < s.length(); i++) {
            if(i == 0 ){
                startLock = true;
                start = i;
            }
            if(i == s.length()){
                end = s.length();
                startLock = false;
                end = counter;
                temp.add(s.substring(start, end));
            }
            if(startLock == false){
                startLock = true;
            }
            if(!tracker.containsKey(s.charAt(i))){
                if(startLock){
                    counter++;
                }
                tracker.put(s.charAt(i), 1);
            } else {
                startLock = false;
                end = start + counter;
                temp.add(s.substring(start, end));
                start = end + 1;
                //reset variables
                end = 0;
                counter = 0;
                tracker.clear();
                //Add the variable currently being monitored
                tracker.put(s.charAt(i), 1);
                counter++;
            }
        }

         result = temp.stream().max(Comparator.comparingInt(String::length)).orElse(null);

        return result.length();

    }
}
