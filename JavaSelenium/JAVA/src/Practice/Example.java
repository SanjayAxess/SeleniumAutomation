package Practice;

public class Example {
    public int a = 10;       // accessible everywhere
    protected int b = 20;    // same package + subclasses
    int c = 30;              // same package only (default)
    private int d = 40;      // same class only

    public void show() {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
    }
}
