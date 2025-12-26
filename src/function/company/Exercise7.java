package function.company;

/*
 Create a library management system which is capable of issuing books to the students.

 Book should have information like:
 1. Book name
 2. Book author
 3. Issued to
 4. Issued on

 User should be able to:
 - Add books
 - Issue books
 - Return issued books

 Assume that all the users are registered with their names in the central database.
*/


import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Exercise7 {

    static class Library{
        ArrayList<ArrayList<String>> books = new ArrayList<>(100);
        int bookCount = 0;
        int issuedBookCount = 0;


        public void add(ArrayList<String> book){
            for (ArrayList<String> b : books){
                if(b.get(0).equalsIgnoreCase(book.get(0)) && b.get(1).equalsIgnoreCase(book.get(1))){
                    System.out.println("This book already exists. Thank you. 🙏 ");
                    return;
                }
            }
            ArrayList<String> temp = new ArrayList<>();
            temp.add(book.get(0));
            temp.add(book.get(1));
            books.add(temp);
            bookCount ++;
            System.out.println("Your Book is added.👍");
        }

        public void issueBook(ArrayList<String>book){
            for (int i =0; i < books.size(); i++){
                if(books.get(i).get(0).equalsIgnoreCase(book.get(0)) && books.get(i).get(1).equalsIgnoreCase(book.get(1))){
                    books.remove(i);
                    bookCount --;
                    issuedBookCount++;
                    System.out.println("Your Book is issued.👍");
                    return;
                }
            }
            System.out.println("The is not available. Thank you 🙂");
        }


        public void returnBook(ArrayList<String>book){
            for (int i =0; i < books.size(); i++){
                if(books.get(i).get(0).equalsIgnoreCase(book.get(0)) && books.get(i).get(1).equalsIgnoreCase(book.get(1))){
                    System.out.println("This book is already in the library");
                    return;
                }
            }
            if(issuedBookCount <= 0){
                System.out.println("No issued books to return.");
                return;
            }
            books.addLast(book);
            bookCount++;
            issuedBookCount--;
            System.out.println("You issued book is returned. Thank You... 😊");
        }

        public void showBook(){
            System.out.println("Available books: ⬇️");
            System.out.println(books);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int ch = -1;
        while (ch != 5){
            System.out.println("_____Library_____\n1.Show book\n2.Add book\n3.Issue book\n4.Return book\n5. Exit\n Enter your choice 👍: ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    lib.showBook();
                    break;
                case 2:
                    System.out.println("Enter the book name: ");
                    String book_name = sc.nextLine();
                    System.out.println("Enter the Author: ");
                    String book_author = sc.nextLine();
                    ArrayList<String> book = new ArrayList<>();
                    book.add(book_name);
                    book.add(book_author);
                    lib.add(book);
                    break;
                case 3:
                    System.out.println("Enter the book name: ");
                    String issuedBookName = sc.nextLine();
                    System.out.println("Enter the Author: ");
                    String issuedBookAuthor = sc.nextLine();
                    ArrayList<String> book1 = new ArrayList<>();
                    book1.add(issuedBookName);
                    book1.add(issuedBookAuthor);
                    lib.issueBook(book1);
                    break;
                case 4:
                    System.out.println("Enter the book name: ");
                    String issuedBookName1 = sc.nextLine();
                    System.out.println("Enter the Author: ");
                    String issuedBookAuthor1 = sc.nextLine();
                    ArrayList<String> book2 = new ArrayList<>();
                    book2.add(issuedBookName1);
                    book2.add(issuedBookAuthor1);
                    lib.returnBook(book2);
                    break;
                case 5:
                    System.out.println("Thanks for visiting...\nThank You 😊😊");
                    break;
                default:
                    System.out.println("You choose invalid choice, Try again...❌");
            }
        }
    }
}
