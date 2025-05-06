package org.example.assessment;

import java.util.*;

public class AllMissingNumbers {

    public List<Integer> mergeTwoList() {
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list2);

        int count = 3;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100);
            list2.add(randomNumber);
        }

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100);
            list1.add(randomNumber);
        }

        System.out.println(list1);
        System.out.println(list2);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> allNumbers = new HashSet<>(set1);
        allNumbers.addAll(set2);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : allNumbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set1.contains(i) && !set2.contains(i)) {
                result.add(i);
            }
        }

        Collections.sort(result);
        System.out.println(result);
        return result;
    }


}
