package com.company;
import java.util.*;
public class CWH_Ch15_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(4);
        l1.add(3);
        l2.add(12);
        l2.add(23);
        l2.add(45);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        for (int i = 0; i< l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
