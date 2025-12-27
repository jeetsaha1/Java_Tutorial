package com.company;

@FunctionalInterface
interface DemoAno1{
    void meth1(int a);
}

class HarryFunc implements DemoAno1{
    @Override
    public void meth1(int a) {
        System.out.println("I am method 1" + a);
    }
}

public class CWH_Ch17_Lambda {
    public static void main(String[] args) {
        DemoAno1 obj = new HarryFunc();
        obj.meth1(7);

        // Lambda Expression
        DemoAno1 obj2 = (a)->{
            System.out.println("I am method2" + a);
        };

        obj2.meth1(6);

    }
}
