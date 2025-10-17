public class Assign {

    private String name;
    private int id;
    private String Pass;

    public Assign(String name){
        this.name = name;

    }
    public Assign(int id, String Pass){
        this.Pass=Pass;
        this.id=id;
    }
    public void gtt(){

    }
    public String displayName(){
        gtt();
        if(name != null){
            System.out.println("Name has been assigned");
        }
        return name;
    }
//    public String setVar(String name){
//
//        return name;
//    }
static void main() {
    Assign as = new Assign("Wayne");
    String nm = as.displayName();
    System.out.println(nm);
}
}
