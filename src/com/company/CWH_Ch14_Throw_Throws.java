package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return  "This is negative error exception";
    }

    @Override
    public String getMessage(){
        return "This is negative error exception";
    }
}

public class CWH_Ch14_Throw_Throws {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }

        return Math.PI * r*r;
    }


    public static int division(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        try{
//            int c = division(6,0);
//            System.out.println(c);
            System.out.println(area(-5));
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
