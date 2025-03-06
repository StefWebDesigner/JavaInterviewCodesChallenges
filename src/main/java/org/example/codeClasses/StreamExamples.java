package org.example.codeClasses;

import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamExamples {

    public List<Orders> basicStreamByFiltering(List<Orders> allOrders){
        //Return orders total balances above 50$

        List<Orders> filteredOrders = new ArrayList<>();

        filteredOrders = allOrders.stream().filter(order -> order.getTotalPrice() > 50.00)
                .sorted(comparing(Orders::getTotalPrice))
                .collect(Collectors.toList());


        // prints it out - not the information
        System.out.println("Basic stream with sorting included : " + Arrays.toString(filteredOrders.toArray()));

        // prints it out - not the information
        filteredOrders.forEach(System.out::println);

        return filteredOrders;
    }

    public List<Double> basicFilterStreamByDouble(List<Orders> orders){

        List<Double> filteredOrders = orders.stream().filter(o -> o.getStatus()
                        .equals("Incomplete"))
                .map(Orders::getTotalPrice)
                .collect(Collectors.toList());

        Collections.sort(filteredOrders);

        System.out.println("Filtering out everything for only doubles based on status condition : " + Arrays.toString(filteredOrders.toArray()));
        return filteredOrders;
    }

    //Can use allMatch / anyMatch / nonMatch
    public Boolean matchWithStreams(List<Orders> orders){
        Boolean allOrders = orders.stream().filter(o -> o.getTotalPrice() == 50.00).allMatch(o -> o.getStatus().equals("Complete"));
        System.out.println("Match with streams : " + allOrders);
        return allOrders;
    }

    public List<Orders> allOrdersWithCompleteStatus(List<Orders> orders) {
        List<Orders> filterOrders = orders.stream().filter(o -> o.getStatus().equals("Incomplete"))
                .sorted(comparing(Orders::getId))
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(filterOrders.toArray()));
        return filterOrders;
    }

    public List<String> allNamesWithPurchaseAbove50(List<Orders> orders) {
        List<String> filteredList = orders.stream()
                .filter(o -> o.getTotalPrice() == 50.00)
                .map(Orders::getCustomerName)
                .collect(Collectors.toList());

        System.out.println("Practice two" + Arrays.toString(filteredList.toArray()));
        return filteredList;
    }


}
