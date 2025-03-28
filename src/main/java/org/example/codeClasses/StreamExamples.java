package org.example.codeClasses;

import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class StreamExamples {

    public List<Orders> basicStreamByFiltering(List<Orders> allOrders){
        //Return orders total balances above 50$

        List<Orders> filteredOrders = new ArrayList<>();

        filteredOrders = allOrders.stream().filter(order -> order.getTotalPrice() > 50.00)
                .sorted(Comparator.comparing(Orders::getTotalPrice))
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

    public void retirveMatch(){
        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

//        assertEquals("978-0134685991", optionalIsbn.get())
    }

    public void streamsStrings (){
        String str = "apple,banana,orange";
        String result = Arrays.stream(str.split(","))
                .filter(s -> s.startsWith("b"))
                .findFirst()
                .orElse("Not found");
    }

    public void streamToMap(){
        String data = "apple=1,banana=2,orange=3,apple=4";
        Stream<String> stringStream = Arrays.stream(data.split(","));

        Map<String, Integer> map = stringStream.map(s -> s.split("="))
                .collect(Collectors.toMap(
                        parts -> parts[0], // Key mapper
                        parts -> Integer.parseInt(parts[1]), // Value mapper
                        (existingValue, newValue) -> newValue // Merge function to handle duplicate keys
                ));
        System.out.println(map);
    }

    public void givenStringStream_whenConvertingToMapWithMerge_thenExpectedMapIsGenerated() {
        Stream<String> stringStream = Stream.of("one", "two", "three", "two");

        Map<String, String> mergedMap = stringStream.collect(
                Collectors.toMap(s -> s, s -> s, (s1, s2) -> s1 + ", " + s2)
        );

        // Define the expected map
        Map<String, String> expectedMap = Map.of(
                "one", "one",
                "two", "two, two",
                "three", "three"
        );
    }

    public void givenStringStream_whenConvertingToMapWithStreamReduce_thenExpectedMapIsGenerated() {
        Stream<String> stringStream = Stream.of("one", "two", "three", "two");

        Map<String, String> resultMap = stringStream.reduce(
                new HashMap<>(), (map, element) -> {
                    map.put(element, element);
                    return map;
                },
                (map1, map2) -> {
                    map1.putAll(map2);
                    return map1;
                }
        );

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("one", "one");
        expectedMap.put("two", "two");
        expectedMap.put("three", "three");

    }

        public  void LoggingExample() {
            Map<String, Integer> data = new HashMap<>();
            data.put("User1", 200);
            data.put("User2", 300);
            data.put("User3", 150);

            data.forEach((user, score) -> System.out.println(user + " scored: " + score));
        }




    }
