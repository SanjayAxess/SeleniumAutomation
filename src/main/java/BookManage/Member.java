package BookManage;

public class Member {
    public int id;
    public String name;
    public String bbook;



    public Member(int id, String name, String bbook){
        this.id=id;
        this.name= name;
        this.bbook =bbook;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getBbook() {
        return bbook;
    }
    public String toString() {
        return
                "Id=" + id +
                ", Name='" + name
                ;
    }
}
