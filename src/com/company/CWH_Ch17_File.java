package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_Ch17_File {
    public static void main(String[] args) throws IOException {


        // Creating a file
         File myFile = new File("Sample.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create this file. ");
            throw new RuntimeException(e);
        }



        // Write into a file
        try{
            FileWriter fileWriter = new FileWriter("Sample.txt");
            fileWriter.write("This is the first file from Java course.\nNow close it...");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



        // Reading from the file
        try{
            File myFile2 = new File("Sample.txt");
            Scanner sc = new Scanner(myFile2);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



        // Deleting the file
        File myFile1 = new File("Sample.txt");
        if(myFile1.delete()){
            System.out.println("I have deleted " + myFile1);
        }
        else{
            System.out.println("Some error occurred while deleting the file");
        }

    }
}
