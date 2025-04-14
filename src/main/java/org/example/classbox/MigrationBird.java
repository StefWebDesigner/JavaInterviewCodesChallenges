package org.example.classbox;

import java.util.HashMap;
import java.util.Map;

public class MigrationBird {

    public int birdCount(){
        int[] arr = {1, 1, 2, 2, 3, 3, 3};
        int highestCountingType = -1;

        Map<Integer, Integer> birdCountTracker = new HashMap<>();

        for(int birdType : arr){
            if(!birdCountTracker.containsKey(birdType)){
                birdCountTracker.put(birdType, 1);
            } else {
                birdCountTracker.replace(birdType, birdCountTracker.get(birdType) + 1);
            }
        }

        int maxCountType = birdCountTracker.entrySet().stream().map(Map.Entry::getValue).max(Integer::compare).orElse(null);

        System.out.println(maxCountType);
        return maxCountType;
    }

}
