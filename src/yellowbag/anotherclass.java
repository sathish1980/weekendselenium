package yellowbag;

public class anotherclass 
{

	Provisionshop p = new Provisionshop();
	
	public void exec()
	{
		int b=	p.a;
		System.out.println(b);
	}
	
	public void ifcond(int age)
	{
		if(age>18)
		{
			System.out.println("You are eligible for voterid");
			if(age>60)
			{
				System.out.println("You are eligible for senior citizen");
				if(age>80)
				{
					System.out.println("You are eligible for super senior citizen");
				}
				
			}
		}
		else if(age>15)
		{
			System.out.println("You will be eligible soon");
		}
		else if(age>10)
		{
			System.out.println("You will be eligible soon  right now you are greater than 10");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		
	}
	
	public void switchcond(String gender)
	{
		switch(gender.toUpperCase()) {
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		default:
			System.out.println("You are Transgender");
			break;
		
		}
		
	}
	
	public void lops()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		
		int i=40;
		while(i<40)
		{
			System.out.println(i);
			i++;
		}
		do
		{
			System.out.println(i);
			i++;
			
		}
		while(i<40);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anotherclass a= new anotherclass();
		a.lops();
	}

}
