package com.company;
import java.util.*;
public class CWH_Ch15_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(4);
        l1.add(3);
        l2.add(12);
        l2.add(23);
        l2.add(45);
        l1.addLast(345);
        l1.addFirst(234);
//        System.out.println(l1.contains(27));
//        System.out.println(l1.indexOf(6));
//        System.out.println(l1.lastIndexOf(6));
        for (int i = 0; i< l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
