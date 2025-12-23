package com.company;

public class CWH_Ch14_TryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try{
            System.out.println("Welcome to Video number 82.");
            // Nested try - catch
            try{
                System.out.println(marks[9]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry the index doesn't exists");
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
