package org.example.codeClasses;

import org.example.models.Employee;
import org.example.models.Orders;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class StreamExampleStuff {

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

    public Integer findHighestNumber(){
        List<Integer> masterList = Arrays.asList(100, 1000, 400000, 1900);
        Integer result = masterList.stream().filter(nums -> nums==1000)
                .findFirst()
                .orElse(null);
        System.out.println(result);
        return result;
    }

    public Employee findHighestPaidEmployee(){
        List<Employee> employees = new ArrayList<>();
        Employee one = new Employee("Alice", 50000);
        Employee two = new Employee("Bob", 75000);
        Employee three = new Employee("Charlie", 60000);

        employees.add(one);
        employees.add(two);
        employees.add(three);

        Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSalary));

        System.out.println(max.get().getName());
        return max.get();

    }

    public Employee findHighestPaidEmployeeSortedingWay(){
        List<Employee> employees = new ArrayList<>();
        Employee one = new Employee("Alice", 50000);
        Employee two = new Employee("Bob", 75000);
        Employee three = new Employee("Charlie", 60000);

        employees.add(one);
        employees.add(two);
        employees.add(three);

        Optional<Employee> employee = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst();

        System.out.println(employee.get().getName());
        return employee.orElse(null);

    }

    public Integer findHighestValueMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 3);
        map.put("Jack", 1);


        Optional<Integer> maxValue = map.entrySet().stream()
                .map(Map.Entry::getValue).max(Integer::compare);

        System.out.println(maxValue);

        return maxValue.get();
    }


    public Map.Entry<String, Integer> findHighestEntryValueSetMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 3);
        map.put("Jack", 1);

        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());


        return maxEntry.get();
    }

    public Map<String, Integer> splitingWordsToMap(){
        String word = "monkey=1,dflufy=2,joyboy=3,joyboy=3";
        Stream<String> stringStream = Arrays.stream(word.split(","));
        Map<String, Integer> map = stringStream.map(s -> s.split("="))
                .collect(Collectors.toMap(
                        //Key mapper
                        parts -> parts[0],
                        //Value Mapper
                        parts -> Integer.parseInt(parts[1]),
                        //Merging function to handle duplcate
                        (existingValue, newValue) -> existingValue + newValue
                ));
        System.out.println(map.toString());
        return map;
    }

    //***** PRACTICE THIS *****
    public Map<Character, Integer> stringToMap(){
        String word = "mmmooobbkkeeeyy";
        Stream<Character> characterStream = word.chars().mapToObj(c -> (char) c);
        Map<Character, Integer> map = characterStream
                .collect(Collectors.toMap(
                        //Key mapper
                        parts -> parts,
                        //Value Mapper
                        parts -> 1,
                        //Merging function to handle duplcate
                        (existingValue, newValue) -> existingValue + 1
                ));

        System.out.println(map);
        return map;
    }

    public int findingHighestValue(int[] nums) {
        int mostCommonNumber = Arrays.stream(nums).max().getAsInt();
        System.out.println(mostCommonNumber);
        return mostCommonNumber;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int maxElement = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(maxElement);
        return maxElement;

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
