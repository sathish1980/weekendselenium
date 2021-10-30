package dummy;

public class loginclass extends Abstractionclass
{
	
	public loginclass(int a, int b)
	{
		System.out.println("This is constructor" + (a+b));
	}
	public void login()
	{
		System.out.println("Abstract methoid implementation");
	}
	
	public void div()
	{
		System.out.println("This is division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginclass l = new loginclass(2,3);
		//#Abstraction
		Abstractionclass c=new loginclass(5,6);
		c.login();
		
		c.adduser("sathish", "100");
		l.div();
	}

	

}
