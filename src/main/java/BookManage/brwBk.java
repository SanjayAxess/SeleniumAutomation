package BookManage;

public class brwBk {
    public  int id;
    public String title;
    public String author;
    public boolean isAvailable;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public brwBk(int bid, String btitle, String bauthor, boolean bisAvailable) {
        this.id = bid;
        this.title = btitle;
        this.author = bauthor;
        this.isAvailable = bisAvailable;

    }
}
