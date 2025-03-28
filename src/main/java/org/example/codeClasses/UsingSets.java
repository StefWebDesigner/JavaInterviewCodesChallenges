package org.example.codeClasses;

import java.util.*;

public class UsingSets {

    public void creatingSets(){
        List<String> list = Arrays.asList("a", "b", "c",  "b",  "b",  "b", "c", "c");

        //IT converst the list to a set
        Set<String> s = new HashSet<>(list);

        System.out.println("Creating sets" + s);

    }

}
