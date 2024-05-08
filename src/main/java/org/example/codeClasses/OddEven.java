package org.example.codeClasses;

import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

    public Boolean isEvenOdd(Integer num){
        Boolean result = Boolean.FALSE;
        Boolean isPrime = Boolean.FALSE;

        if(num % 2 == 0){
            System.out.println("Number is even");
            result = Boolean.TRUE;
        } else {
            System.out.println("Number is odd");
        }

        for (int i = 2; i < num; i++ ){
            if((num % i) == 0){
                System.out.println("Number is not prime!");
                break;
            } else {
                System.out.println(" is Prime");
                isPrime = Boolean.TRUE;
            }
        }

        if (isPrime){
            System.out.println("isPrime result :  True ");
        } else {
            System.out.println("isPrime result :  False ");
        }

        return result;

    }

    public void isEvenOddWithStreams(List<Integer> numberList){
        List<Integer> oddAndSquared = numberList.stream().filter(n -> {
            System.out.println("filtering value " + n);
            return n % 2 !=0;
        }).map(n -> {
            System.out.println("mapping " + n);
            return n*n;
        }).collect(Collectors.toList());

        System.out.println(oddAndSquared);
    }


}
