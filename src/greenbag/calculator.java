package greenbag;

public class calculator implements interface1,interface2
{

	int a=10;
	int[] b= {1,4,3,2,5};
	String[] c= {"sathish","kumar","R"};
	
	
	public void arrayconcept()
	{
		int siz=b.length;
		for(int i=0;i<siz;i++) {
			
			if(b[i]==4)
			{
				System.out.println("the given"
						+ " value is present in the "
						+ "following position: "+i);
			}
		}
	}
	public void sub()
	{
		//int a=10;
		int b1=20;
		int c=b1-a;
		System.out.println(c);
		System.out.println(b[1]);
	}
	public void add()
	{
		int a=10;
		int b=20;
		int c=b+a;
		System.out.println(c);
	}

	@Override
	public void div() {
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=b*a;
		System.out.println(c);
	}
	@Override
	public void actual() {
		System.out.println("actual value");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 c= new calculator();
		interface2 c2= new calculator();
		calculator c1= new calculator();
		c1.sub();
		c.mul();
		c.div();
		c.actual();
		c2.actual();
		c1.arrayconcept();
		
	}
	
	
}
