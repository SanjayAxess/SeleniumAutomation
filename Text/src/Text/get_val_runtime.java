package Text;

import java.util.Scanner;

public class get_val_runtime {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter value for a");
		a=console.nextInt();
		
		System.out.println("Enter value for b");
		b=console.nextInt();
		
		c=a+b;
		System.out.println("Total" +c);
	}

}
