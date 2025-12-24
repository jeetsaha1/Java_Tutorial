package function.company;

// Chapter 14

import java.util.Scanner;



public class pror1 {
    static class CustomException extends Exception{
        public CustomException(){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) throws CustomException {
        // Write a java program that prints "haha" during arithmatic Exception and "Hehe" during Illegal argument exception.
//        try{
//            int a = 666;
//            System.out.println(a);
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("He he");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Ha ha");
//        }


        // Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 3 print "Error".
        // Modify this question to throw a custom exception to max retries are reached.
        // Modify the question and give a method inside the program that throws an error
        int [] marks = new int[3];
        marks[0] = 34;
        marks[1] = 7;
        marks[2] = 345;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag  && i<marks.length){
            try{
                System.out.println("Enter the index of the array marks: ");
                int index = sc.nextInt();
                System.out.println("The value of the pointed index: " + marks[index]) ;
                flag = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                i++;
                System.out.println("Invalid index");
            }
        }

        if (i >= 3){
//            System.out.println("Error");
            throw new CustomException();
        }


    }
}
