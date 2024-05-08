package org.example.codeClasses;

import org.example.models.CustomerDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        CustomerDTO c1 = new CustomerDTO("Stefan", 1, "iPhone", 1000.00);
        CustomerDTO c2 = new CustomerDTO("Puja", 2, "Samsung", 500.00);
        CustomerDTO c3 = new CustomerDTO("Ona", 3, "Cricket", 100.00);

        List<CustomerDTO> listOfClients = new ArrayList<>();
        listOfClients.add(c1);
        listOfClients.add(c2);
        listOfClients.add(c3);

        //Make a map with the Id / Price
        Map<Integer, Double> idPriceMap = new HashMap<>();

        listOfClients.stream().map(entry -> idPriceMap.put(entry.getId(), entry.getProductPrice())).collect(Collectors.toList());
        System.out.println("idPriceMap : ");
        System.out.println(idPriceMap);

        // Make a filter out products that are more then 100 dollars
        List<Integer> listOfCustomerIdWithOver500$Purchases = idPriceMap.entrySet().stream().filter(c -> c.getValue() >= 500.00).map(result -> result.getKey()).collect(Collectors.toList());
        System.out.println("This is the list of Customers id who have purchased an products over 500$ : " + listOfCustomerIdWithOver500$Purchases);

    }






}
