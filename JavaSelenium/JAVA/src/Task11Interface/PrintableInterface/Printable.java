package Task11Interface.PrintableInterface;

public interface Printable {
    void print();
}

class Document implements Printable{
    //@Override
    public void print() {
        System.out.println("Printing the Document...");
    }
}

class ImageFile extends Document implements Printable{
    @Override
    public void print() {
        super.print();
        System.out.println("Print the Imagefile");
    }

    public static void main(String[] args) {
        ImageFile imagefile=new ImageFile();
        imagefile.print();
    }
}
