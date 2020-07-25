package BasicJava;

import java.util.Scanner;


public class ConvertDoubletofloat {
	public static void main(String args[]){
		System.out.println("Enter value :");
		Scanner s1 = new Scanner(System.in); 
		String input =s1.nextLine();
		float f = Float.parseFloat(input);
		System.out.println("Converted String to int" );
	}

}
