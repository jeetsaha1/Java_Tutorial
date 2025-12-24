package com.company;

import java.util.HashSet;

public class CWH_Ch15_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(4);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(1);
        System.out.println(myHashSet);
    }
}
