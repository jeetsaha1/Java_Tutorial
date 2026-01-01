package function.company;

/*
 Create a student attendance management system for a classroom.

 Student should have information like:
 1. Student ID
 2. Student name
 3. Course name
 4. Attendance percentage

 User should be able to:
 - Add new students
 - Mark attendance (present/absent)
 - View attendance of a student
 - Generate attendance report

 Assume that all students are enrolled in predefined courses.
*/


import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    String ID;
    String course;
    int totalClass = 0;
    int attendedClass = 0;

    Student(String name, String ID, String course){
        this.name = name;
        this.course = course;
        this.ID = ID;
        this.totalClass = 0;
        this.attendedClass = 0;
    }

    void markPresent(boolean present){
        totalClass++;
        if(present){
            attendedClass++;
        }
    }

    double generatePercentage(){
        if (totalClass == 0)
            return 0.0;
        return (attendedClass * 100.0)/totalClass;
    }

}




class StudentAttendance{
    ArrayList<Student> dataBase = new ArrayList<>();

    void addNewStudent(String name, String ID, String course){
        for(Student s: dataBase){
            if(s.ID.equalsIgnoreCase(ID)){
                System.out.println("The student is already registered");
                return;
            }
        }
        dataBase.add(new Student(name,ID,course));
        System.out.println("The Registration is done successfully 👍");
    }

    void markAttendance(String ID, boolean present){
        for (Student s : dataBase){
            if(s.ID.equalsIgnoreCase(ID)){
                s.markPresent(present);
                System.out.println("Present is marked");
                return;
            }
        }
        System.out.println(("Student not found"));
    }

    void viewAttendance(String ID){
        for (Student s : dataBase){
            if(s.ID.equalsIgnoreCase(ID)){
                System.out.println("===================================");
                System.out.println("Name : " + s.name);
                System.out.println("ID : " + s.ID);
                System.out.println("Course : " + s.course);
                System.out.println("Attendance : " + s.generatePercentage());
                System.out.println("===================================");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    void GenerateReport(){
        System.out.println("\n============Attendance Report===============\n");
        for (Student s : dataBase){
            System.out.println(s.name + " | " + s.ID + " | " + s.course + " | " + s.generatePercentage() + " % " );
        }
    }



}

public class StudentAttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAttendance system = new StudentAttendance();
//        int ch = -1;
        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    system.addNewStudent(name, id, course);
                    break;
                case 2:
                    System.out.println("Enter the ID : ");
                    id = sc.nextLine();
                    System.out.println("Present : (True / false) ");
                    boolean present = sc.nextBoolean();
                    system.markAttendance(id,present);
                    break;
                case 3:
                    System.out.println("Enter the ID : ");
                    id = sc.nextLine();
                    system.viewAttendance(id);
                    break;
                case 4:
                    system.GenerateReport();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
