package greenbag;

public class Conditions 
{

	public void method(int age)
	{
		if(age>=18)
		{
			System.out.println("you are eligible");	
			if(age>60)
			{
				System.out.println("you are eligible for senior citizen");
				if(age>80)
				{
					System.out.println("you are eligible for super senior citizen");
				}
			}
		}
		else if(age>15)
		{
			int var=18-age;
			System.out.println("you have to wait for "+var+" more years" );	
		}
		else if(age>10)
		{
			int var=18-age;
			System.out.println("you have to wait for "+var+" more years" );	
		}
		else
		{
			System.out.println("You are not eligible");
		}
	}
	
	
	public void switchcondition(String gender)
	{
		switch(gender.toUpperCase()) 
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		default:
			System.out.println("You are transgender");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c= new Conditions(); // instatation
		c.switchcondition("f");
	}

}
