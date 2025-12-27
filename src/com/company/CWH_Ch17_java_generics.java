package com.company;

import java.util.ArrayList;

class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


class Util {
    // A generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class CWH_Ch17_java_generics {
    public static void main(String[] args) {
        MyGenericClass<Integer> intObj = new MyGenericClass<>(100);
        System.out.println("Integer Value: " + intObj.getData());

        // Using the generic class with String
        MyGenericClass<String> strObj = new MyGenericClass<>("Hello Generics");
        System.out.println("String Value: " + strObj.getData());

        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"Java", "Generics", "Example"};

        Util.printArray(intArr);
        Util.printArray(strArr);

        Pair<Integer, String> p1 = new Pair<>(1, "One");
        Pair<String, String> p2 = new Pair<>("A", "Apple");

        System.out.println(p1.getKey() + " = " + p1.getValue());
        System.out.println(p2.getKey() + " = " + p2.getValue());
    }
}
