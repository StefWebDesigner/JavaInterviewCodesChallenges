package org.example.classbox.SeralizationClasses;

import java.io.Serializable;

public class Emp implements Serializable {
    private static final long serialVersionUID = 1L;
    transient int a;
    public static int b;
    String name;
    int age;

    public Emp(int a, String name, int age, int b) {
        this.a = a;
        this.name = name;
        this.age = age;
        this.b = b;
    }
}
