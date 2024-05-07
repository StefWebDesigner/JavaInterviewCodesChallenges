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

}
