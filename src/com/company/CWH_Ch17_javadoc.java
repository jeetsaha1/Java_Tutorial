package com.company;
/**
 * This class is to demonstrate what Javadoc is and how it is used in the java industry.<br>
 * <i><b>This is very important</b></i>
 * @author Jeet Saha
 * @version 2.0
 * @see <a href = "file:///C:/Users/Windows/IdeaProjects/Java%20Tutorial/com/company/package-summary.html">Java Docs</a>
 * @since 2002
 */

public class CWH_Ch17_javadoc {
    /**
     * @param a This is the first no. to add
     * @param b This is the first no. to add
     * @return Sum of the two numbers
     * @throws Exception if i is 0
     * @depricated This msg is depricated, please use + operator
   */
    public void print(int a, int b){
        System.out.println("The  sum is : " + (a+b));
    }


    public static void main(String[] args) {

    }
}
