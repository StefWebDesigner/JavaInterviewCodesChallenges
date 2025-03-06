package org.example.codeClasses;

import java.util.HashMap;
import java.util.Map;

public class NutBoltMatch {

    public void nutBoltMatching(char [] nuts, char [] bolts, int n){
        Map<Character, Integer> hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            hash.put(nuts[i], i );
        }

        for(int i = 0; i  < n; i++){
            if(hash.containsKey(bolts[i])){
                nuts[i] = bolts[i];
            }
        }

        System.out.println("Matching nuts and bolts are ");

        System.out.println("matched nuts and bolts are-");
        for (char nut : nuts) {
            System.out.print(nut + " ");
        }
        System.out.println();
        for (char bolt : bolts) {
            System.out.print(bolt + " ");
        }


    }

    public void nutsBolts(char[] nuts, char[] bolts){

        Map<Character, Integer> mappy = new HashMap<>();
        Integer counter = 0;

        for(Character element : nuts){
            mappy.put(element, counter);
            counter++;
        }

        counter = 0;

        for(Map.Entry<Character, Integer> entry : mappy.entrySet()){
            if(mappy.containsKey(bolts[counter])){
                nuts[counter] = bolts[counter];
                counter++;
            }
        }

        System.out.println("Nuts : ");
        System.out.println (Arrays.toString(nuts) + " " );
        System.out.println("Bolts : ");
        System.out.println(Arrays.toString(bolts) + " " );


    }




}
