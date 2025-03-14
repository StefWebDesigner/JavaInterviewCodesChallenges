package org.example.codeClasses;

import java.util.*;

public class BankAccount {

    // You want to print out the each group of the accout details & print out the accounts strings & the amount detected each time
    public void bankAccountClassChallenge(List<String> masterAccountList){
        Integer t = 0;
        Integer n1 = 0;
        Integer n2 = 0;
        Integer counter = 0;

        for(String element : masterAccountList){
            if(counter == 0){
                Integer newT = Integer.valueOf(masterAccountList.get(counter));
                t = newT;
                counter++;
                System.out.println("T produced : " + t);
            } else if(counter == 1){
                Integer newN1 = Integer.valueOf(masterAccountList.get(counter));
                n1 = newN1;
                counter++;
                System.out.println("n1 produced : " + n1);
            } else if(counter == 2){
                Integer newN2 = Integer.valueOf(masterAccountList.get(counter));
                n2 = newN2;
                counter++;
                System.out.println("n2 produced : " + n2);
            }
        }

        //REMOVE THE EXTRA UNNEEDED INFORMATION
        //This is the case because when you remove an element from the array, there is
        //a new         masterAccountList.remove(0);
        masterAccountList.remove(0);
        masterAccountList.remove(0);
        masterAccountList.remove(0);

        System.out.println("the master accoutn list : " + Arrays.toString(masterAccountList.toArray()));


        Integer masterAccountListSize = masterAccountList.size();
        List<String> accountGroup1 = masterAccountList.subList(0, n1);
        List<String> accountGroup2 = masterAccountList.subList(n1, masterAccountListSize);

        Map<String, Integer> tracker = new HashMap<>();
        Map<String, Integer> tracker2 = new HashMap<>();
        Integer quantity = 1;

        for(String element : accountGroup1){
            if(!tracker.containsKey(element)){
                tracker.put(element, quantity);
            } else {
                tracker.replace(element, tracker.get(element) + 1);
            }
        }

        for(String element : accountGroup2){
            if(!tracker2.containsKey(element)){
                tracker2.put(element, quantity);
            } else {
                tracker2.replace(element, tracker2.get(element) + 1);
            }
        }

        Collections.sort(accountGroup1);
        Collections.sort(accountGroup2);

        System.out.println("********************");
        System.out.println("Number of accounts for 1 : " + n1);
        for(Map.Entry<String, Integer> entry : tracker.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("********************");

        System.out.println("Number of accounts for 2 : " + n2);
        for(Map.Entry<String, Integer> entry : tracker2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("********************");


    }



}
