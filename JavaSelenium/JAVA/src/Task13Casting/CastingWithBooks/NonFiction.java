package Task13Casting.CastingWithBooks;

public class NonFiction extends Book{

    public void read() {
        System.out.println("Reading a Non Fictional Story ");

    }

    public void subject(){
        System.out.println("Subject :Political/Bio-Graphy/History/Science");
    }

    public static void main(String[] args) {

        //Upcasting (Fiction --> Book)
        Book book=new Fiction();
        book.read();

        //Downcasting(Book --> Fiction)
        Fiction fiction=(Fiction) book;
        fiction.genre();

        System.out.println("-------------------------------------");

        //Non-fiction

        Book book2=new NonFiction();
        book2.read();

        NonFiction nonFiction=(NonFiction) book2;
        nonFiction.subject();
    }
}
