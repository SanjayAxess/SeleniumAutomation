package Task8Constructor.DefaultConstrucor.BookClass;

public class Book {
    String title;
    String author;
    double price;

    public Book(){
        title="Unknown";
        author="Unknown";
        price=0.0;
        displayDetails();
    }

    public void displayDetails(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Book book=new Book();
    }
}
