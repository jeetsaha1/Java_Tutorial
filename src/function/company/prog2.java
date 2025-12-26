package function.company;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

// 1. Create an arraylist and store the names of 10 students inside it. Print the names using fr-each loop
// 2. ,3. 4. Print current time using Date class, Calendar class, JAVA API.
// 5. Create a set in Java,try to store duplicate elements and verify that only one instance is stored.
public class prog2 {
    public static void main(String[] args) {
        //1.
//        ArrayList<String> l1 = new ArrayList<>(10);
//        l1.add("Jeet");
//        l1.add("Jeet2");
//        l1.add("Jeet3");
//        l1.add("Jeet4");
//        l1.add("Jeet5");
//        l1.add("Jeet6");
//        l1.add("Jeet7");
//        l1.add("Jeet8");
//        for(String ele: l1){
//            System.out.println(ele);
//        }

        // 2. Using Date Class
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // 3. Using Calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) +" : " +  c.get(Calendar.MINUTE) +" : " +  c.get(Calendar.SECOND));

        // 4. Java API
        LocalTime dt = LocalTime.now();
        System.out.println(dt);

        // 5 .
        ArrayList<String> list1 = new ArrayList<>(10);
        list1.add("Jeet");
        list1.add("Jeet");
        list1.add("Jeet");
        list1.add("Jeet");
        list1.add("Avirupa");
        list1.add("Avirupa");
        list1.add("Dona");
        list1.add("Dona");
        list1.add("Arya");
        list1.add("Arya");

        System.out.println(list1);
        Set <String> s1 = new HashSet<>(list1);
        System.out.println(s1);
    }

}
