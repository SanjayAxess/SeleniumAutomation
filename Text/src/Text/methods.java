package Text;

public class methods {
	//This method is used for adding 2 numbers
	void addition() {
	int a=10;
	int b=20;
	int c= a+b;
	System.out.println("Result :" +c);
}
	// This method developed by Dinesh
	void sub(int a, int b) {
		int c=a-b;
		System.out.println("Result :" +c);
}
	void str(String a, String b, String c) {
		System.out.println("Result :" + a+b+c);	
	} 
	int add(int a,int b) {
		int c=a+b;
		System.out.println("Result :" + c);
		return c;
	}
	
	
	public static void main(String[] args) {
	methods caller = new methods();	
	caller.addition();
	caller.sub(10,20);
	caller.str("x ","y ","z ");
	caller.add(10, 40);
}
}