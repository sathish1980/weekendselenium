package dummy;

public class singleinheritance1 extends singleinheritance
{

	
	public void sub(int a,int b)
	{
		int c= b-a;
		System.out.println(c);
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleinheritance1 s = new singleinheritance1();
		s.sub(3, 10);
		s.add(4, 7);
		
	}

}
