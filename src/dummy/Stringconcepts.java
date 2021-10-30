package dummy;

public class Stringconcepts {
	
	public void strn()
	{
		String s= "Sathishkumar";
		String s1= " sathish kumar ";
		int a=10;
		int b=20;
		System.out.println(s.charAt(4));
		char c= s.charAt(4);
		if(c=='i')
		{
			System.out.println("we got the value");
		}
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s+s1);
		System.out.println(s.concat(s1));
		System.out.println(s.contains("h"));
		System.out.println(s1.contains("h"));
		System.out.println(s.startsWith("sath"));
		System.out.println(s.endsWith("sath"));
		System.out.println(s.indexOf("h",5));
		if(s.contains("h")==true || s1.contains("h")==true)
		{
			System.out.println("identified");
		}
		
		System.out.println(s.length());
		int tol=s.length();

		char[] C1=s.toCharArray();
		int ar_tol=C1.length;
		for(int i=0;i<ar_tol;i++)
		{
			if(C1[i]=='h')
			{
				System.out.println(i);
			}
		}
		
		System.out.println(s.isEmpty());
		//System.out.println(s.replace('h', 'H'));
		System.out.println(s.replaceAll("hi", "H"));
		System.out.println(s);
		System.out.println(s.split("h"));
		String[] splitstrung =s.split("h");
		System.out.println(s1.split("\\s"));
		
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,10));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringconcepts s = new Stringconcepts();
		s.strn();
	}

}
