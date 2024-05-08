package org.example.codeClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemos {


    public void workingWithMaps(){
        System.out.println("---- Working with Maps ----");
        Map<String, String> map = new HashMap<>();
        map.put("England", "UK");
        map.put("Spain", "Barcelona");

        List<String> allKeys = new ArrayList<>();
        List<String> allValues = new ArrayList<>();

        for(Map.Entry<String, String> entry : map.entrySet()){
            allKeys.add(entry.getKey());
            allValues.add(entry.getValue());
        }

        System.out.println("*** Getting the Keys *** ");
        System.out.println(allKeys);

        System.out.println("*** Getting the value *** ");
        System.out.println(allValues);
    }

    public void mapsWithStreams(){
        System.out.println("*** Working with maps and streams ");





    }




}
