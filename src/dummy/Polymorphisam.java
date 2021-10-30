package dummy;

public class Polymorphisam 
{
	
	public void add(int a , int b)
	{
		int c= a+b;
		System.out.println("This is inheritance method :" +c);
	}
	
	public void add(int a , int b ,int c)
	{
		int d= a+b+c;
		System.out.println(d);
	}
	
	public void add(double a , int b)
	{
		double c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphisam p = new Polymorphisam();
		p.add(2.32,3);
	}

}
