package OOPS.AccessModifiers;

public class Share {
    private void sharingMethod()
    {
        System.out.println("This Method is Shared");
    }

    public static void main(String[] args) {
        Share sh=new Share();
        sh.sharingMethod();
    }
}
