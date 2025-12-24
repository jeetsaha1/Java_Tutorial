package com.company;
import java.util.*;
public class CWH_Ch15_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.add(6);
        arr.add(77);
        arr.add(69);
        arr.add(86);
        arr.addFirst(878);
        arr.addLast(8976);
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());

    }
}
