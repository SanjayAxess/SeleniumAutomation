package BookManage;

import java.util.HashMap;
import java.util.Set;

public class Library {
    public String name;
    public String borrowed;
    public  int id;
    public  String title;
    public  String author;
    public static boolean isAvailable;
    static boolean found = false;
    static Integer bookKey = null;


    static HashMap<Integer, Library> bk = new HashMap<>();
    static HashMap<Integer, Member> mb = new HashMap<>();
    static HashMap<Integer, Library> bw = new HashMap<Integer, Library>();




    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Library(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;

    }


    public static class books {
       public static void book1(String searchBook) {


           System.out.println("\n==============================");
            for (Library book : bk.values()) {
                System.out.println(book.id + "  Title: " + book.title + "  Author: " + book.author + "  Availability: " + book.isAvailable);
                if (book.getTitle().equalsIgnoreCase(searchBook)) { // ignore case if needed
                    System.out.println(searchBook + " found!");
                    try {
                        if (!book.isAvailable()) {
                            throw new BookNotAvailableException("The book is currently not available.");
                        }
                        System.out.println("The book is available for borrowing.");
                    } catch (BookNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;  // stop after finding the book
                }
            }
           System.out.println("==============================\n");
        }
    }
    public static class members{
    public static void member(String searchName){

        System.out.println("\n==============================");
        for (Member mem:mb.values()){

            if (mem.getName().equalsIgnoreCase(searchName)) { // ignore case if needed
                System.out.println(searchName+" is a Member of Library");
                found = true;


            }
            System.out.println("Member ID : "+mem.id+" Name : "+mem.name);
        }
                try {
                    if (!found) {
                        throw new MemberNotFoundException(searchName+" is not a Member of Library");
                    }
                } catch (MemberNotFoundException e) {
                    System.out.println(e.getMessage());
                }
        System.out.println("==============================\n");

    }}
    public class brw{
         static void brwed(String bname,String brbook, boolean bb){
             for (Member mem:mb.values()){



                 for (Integer key : bk.keySet()) {
                     Library book = bk.get(key);
                     if (book.getTitle().equalsIgnoreCase(brbook)) {
                         bookKey = key;
                         break;
                     }
                 }

                 if (mem.getName().equalsIgnoreCase(bname)) {
                     System.out.println("\n==============================");
                     System.out.println("Welcome "+bname);
                     found = true;
                     for (Library book : bk.values()) {


                         if (book.getTitle().equalsIgnoreCase(brbook)) {


                             System.out.println(brbook + " found!");
                                 if (!book.isAvailable()) {
                                     throw new BookNotAvailableException("The book is currently not available.");
                                 }else {
                                     System.out.println("Would you like to Borrow: "+bb);
                                     if (bb){

                                         System.out.println("Book you Borrowed: [ Book id: "+book.id + "  Title: " + book.title + "  Author: " + book.author +" ]");
                                         mem.bbook = book.title;
                                         bw.put(bookKey, book);
                                         bk.values().remove(book);
//                                         System.out.println("Borrowed book: " + book.title);
//                                         System.out.println("bw map now contains: " + bw.values());
                                     }else {
                                         System.out.println("How can I assist you");
                                     }
                                     System.out.println("==============================\n");
                                 }
                             break;
                         }
                     }


                 }
             }

        }
        static void rtwed(String rtname,String rtbook){
            for (Member mem:mb.values()){

                if (mem.getName().equalsIgnoreCase(rtname)) {
                    System.out.println("\n==============================");
                    System.out.println("Welcome "+rtname);
                    found = true;
                    for (Library book : bw.values()) {
                        System.out.println("Returning book: [ Book id: " +book.id + "  Title: " + book.title + "  Author: " + book.author+" ]");
                                bk.put(bookKey, book);
                                bw.values().remove(book);
                                mem.bbook = "";
                                System.out.println("Book has been Returned");




                            break;

                    }

                    System.out.println("==============================\n");
                }

            }

        }

    }

    static void main(){
        bk.put(1, new Library(101, "HarryPotter", "Jk.Rowling", true));
        bk.put(3, new Library(103, "One Piece", "Oda", false));
        bk.put(2, new Library(102, "Pride and Prejudice", "Jane Austen", true));

        mb.put(100, new Member(101, "Murali",""));
        mb.put(101, new Member(102, "Vijay",""));

//       books.book1("One Piece");
//       members.member("Murali");
       brw.brwed("Vijay","HarryPotter",true );
       brw.rtwed("vijay","HarryPotter");



    }




}
