package org.example.codeClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;


public class StreamBasicsCodesChallenges {

//    https://www.w3resource.com/java-exercises/stream/index.php


//    public int sumOfAListStream() {
//        List<Integer> integers = asList(1, 2, 3, 4, 5);
//        Integer sum = integers.stream()
//                .collect(Collectors.summingInt(Integer::intValue));
//    }


//        public void findSumUsingStream(int[] array) {
//            return stream(array).sum();
//        }
//
//        public  void findSumUsingStream(Integer[] array) {
//                    .mapToInt(Integer::intValue)
//                    .sum();
//        }

        public void getRangeIntegerListStream(){
            List<Integer> integerList = asList(1, 2, 3, 4, 5);

            List<Integer> intStream = IntStream.iterate(integerList.get(0), integerList::get)
                    .limit(integerList.size() / 2)
                    .boxed()
                    .collect(Collectors.toList());
            System.out.println(intStream);
        }


        public void getAverageSumOfList(){
            List<Integer> arr = asList(1, 1, 2, 3, 1, 1);
            Double sum = arr.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
            System.out.println("jhhjkh" + sum);

        }


        public void convertStringToUppercase(){
            List<String> wordStringList = asList("RED", "grEEn", "white", "Orange", "pink");
            List<String> modifiedList =
                    wordStringList.stream()
                            .map(String::toUpperCase)
                            .collect(Collectors.toList());
            System.out.println("jhhjkh " + modifiedList);

        }



        public void SumsEvenAndOddStreams(){
            List < Integer > numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            int sumOfEvens = numbers.stream()
                    .filter(num -> num % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Sum of even numbers: " + sumOfEvens);

            int sumOfOdds = numbers.stream()
                    .filter(num -> num % 2 != 0)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Sum of odd numbers: " + sumOfOdds);
        }

    public void removeAllDuplicatesFromIntegerList(){
        List < Integer > nums = asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        List<Integer> dupsRemoved = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(dupsRemoved);
    }


    public void countStringsthatstartWith(){
        List < String > colors = asList("Red", "Green", "Blue", "Pink", "Brown");
        long totalCount = colors.stream().filter( s -> s.startsWith("B")).count();
        System.out.println(totalCount);

    }

    public void findMinMaxInteger(){
        List < Integer > nums = asList(1, 17, 54, 14, 14, 33, 45, -11);
        Integer maxValue = nums.stream().max(Comparator.comparing(Integer::intValue)).orElse(0);
        Integer minValue = nums.stream().min(Comparator.comparing(Integer::intValue)).orElse(0);
        System.out.println(maxValue);
    }

    public void sortStringListAlph(){
        List < String > colors = asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> sortedColors = colors.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedColors);

    }

    public void findSeccondSmallestLargestElement(){
        List < Integer > nums = asList(1, 17, 54, 14, 14, 33, 45, -11);
        Integer smallest = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println("dsada" + smallest);
        Integer largetst = nums.stream().distinct().sorted(
                (a,b) -> Integer.compare(b,a)
        ).skip(1).findFirst().orElse(null);

        System.out.println(largetst);
    }



    }
