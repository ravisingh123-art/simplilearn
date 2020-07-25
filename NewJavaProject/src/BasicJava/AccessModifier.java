package BasicJava;

public class AccessModifier {
	
	private int pws = 10;
	public char abc;
	static String stat = "";
	final String lang = "My World";

	
	public void methodPublic(int args1[])
	{
		System.out.println("Setting pws to :" +args1);
		methodPublic(args1);
	}
	
	private void methodPrivate(int args1){
		pws = args1;

	}
	
	protected void  methodProtected(){
		System.out.println("The currect value of pws is :" +pws);
	}
	static void  methodStatic(){
		stat = "Simplilearn";
		System.out.println("The currect value of pws is :" +stat);
	}
}
