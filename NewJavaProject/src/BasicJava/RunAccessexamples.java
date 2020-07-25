package BasicJava;

public class RunAccessexamples {

	public static void main(String args[]){
		System.out.println("Currect value of start is" +AccessModifier.stat);
		AccessModifier.methodStatic();
		
		AccessModifier s1 = new AccessModifier();
		s1.abc = 'x';
		
		System.out.println("The current value of pbl is : "+ s1.abc);
		s1.methodPublic(1);
		s1.methodProtected();

		
	}

}
