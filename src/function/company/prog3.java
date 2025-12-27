package function.company;

                                /* *** Question *** */
// 1. Create Javadoc from a java program using and without using IntelliJ IDEA.
// 2. Create a class and add a method with deprecated annocation, what is its effects on program execution.
// 3. Suppress the generated warnings from 2
// 4. Create an Interface and generates an instance from it
// 5. Write a program to generate multiplication table of a given number and write it to a file.
// 6. Repeat 5 with numbers from 2-9 and save all these multiplication tables to a folder.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("Deprecated")
class MyClass{
    @Deprecated
    public void meth1(){
        System.out.println("This is meth1");
    }
}

interface MyDisp{
    public void display();
}

public class prog3 {

    // Answer 1. --> Tools --> Generate Javadoc --> Generate (After giving all the necessary info.)--> Ready👍
//    public void print(){
//        System.out.println("I am a function");
//    }

    // Answer 2. / 3. --> This is the testing for the class MyClass()
//    MyClass c = new MyClass();
//        c.meth1();
    
    // Answer 3.
    /*MyDisp i = new MyDisp() {
        @Override
        public void display() {
            System.out.println("I am display");
        }
    };

    i.display();*/
    public static void main(String[] args) throws IOException {

        File folder = new File("Multiplication");
        if(!folder.exists()){
            folder.mkdir();
        }

        for (int j = 2 ; j<= 9; j++){
            try{
                FileWriter fileWriter = new FileWriter("Multiplication/Table_" + j + ".txt");

                for (int i = 1; i < 10 ; i++) {
                    fileWriter.write(j + " * " + i + " = " +(j*i)+"\n");
                }
                fileWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("The table is written in that file");
    }
}
