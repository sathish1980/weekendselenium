package dummy;

public class Multilevelinheritance extends singleinheritance1
{
	
	public void mul(int a, int b)
	{
		int c= a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelinheritance M = new Multilevelinheritance();
		M.mul(3, 5);
		M.add(5, 6);
		M.sub(4, 9);
	}

}
