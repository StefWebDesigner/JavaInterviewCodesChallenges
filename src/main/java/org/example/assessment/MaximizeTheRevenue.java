package org.example.assessment;

import java.util.Arrays;
import java.util.List;

public class MaximizeTheRevenue {

    // You have m number of customer waiting in line // 6
    //You want to make the highest profit by selling the highest value item to each person
    //Each time you give an item to a person, that same number is deducted by one
    //calcuate the higest revenue possible due to the circumstances
    public int maximizeTheRevenue() {
        List<Integer> prices = Arrays.asList(10, 10, 8, 9, 1);
        int m = 6;
        int maxValue = 0;
        int indexOfMaxValue = 0;
        int sum = 0;
        int index = 0;

        for(int i = 0; i < m; i++){
            while(index < prices.size()){
                if(prices.get(index) > maxValue){
                    maxValue = prices.get(index);
                    indexOfMaxValue = index;
                }
                ++index;
            }
            sum += maxValue;
            maxValue--;
            prices.set(indexOfMaxValue, maxValue);
            index = 0;
        }

        System.out.println(prices);

        System.out.println("sum = " + sum);
        return sum;

    }
}
