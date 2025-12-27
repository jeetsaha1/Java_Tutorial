package com.company;
/*


Definition:
Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time.
They are like local classes except that they do not have a name. Use them if you need to use a local class only once.

*/


interface DemoAno{
    void meth1();
    void meth2();
}

class AnnoyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
}

public class CWH_Ch17_Anonymous {
    public static void main(String[] args) {
        AnnoyDemo obj = new AnnoyDemo();
        obj.meth1();




        //Anonymous class
        DemoAno obj2 = new DemoAno(){
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };

        obj2.meth1();
    }
}
