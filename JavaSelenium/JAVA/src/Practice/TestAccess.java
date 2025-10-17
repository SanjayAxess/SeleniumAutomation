package Practice;

public class TestAccess {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.a); // ✅ works (public)
        // System.out.println(obj.b); // ❌ error if different package
        // System.out.println(obj.c); // ❌ error if different package
        // System.out.println(obj.d); // ❌ error, private
    }
}
