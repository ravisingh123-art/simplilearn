package BasicJava;

public class ImplicitAndExplicit {

	public static void main(String[] args) {
		// Implicite Type Casting
		int i = 10;
		long l = i;
		float f = l;
		
		System.out.println("Interger"+i);

		System.out.println("Long"+l);

		System.out.println("Float"+f);
		
		// Explicite Type Casting
		double d = 10.20;
		f = (float) d;
		l = (long) f;
		i = (int) l;
		
		System.out.println("Float"+d);
		
		System.out.println("Long"+f);
		
		System.out.println("Integer"+l);
		
	}

}
