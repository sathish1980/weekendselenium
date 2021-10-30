package dummy;

public class Methodoverriding extends Polymorphisam
{

	public void add(int c, int d)
	{
		int e= c+d;
		System.out.println("This is in current class : "+e + " value");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding m= new Methodoverriding();
		m.add(2, 3);
		Polymorphisam p = new Polymorphisam();
		p.add(5, 8);
		m.add(2.3, 5);
	}

}
