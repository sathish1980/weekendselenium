package yellowbag;

public class Provisionshop {
	
	// 1. method with return type
	// 1. method without return type
	// 1. method with parameter
	// 1. method without parameter
	// syntax accessmodifier returntype method name
	
	//data type
 // integer - int = 10 digit eg int a= 10	
// String -String ="sathish kumar" eg String a= "sathish";
//chararcter - char = 's' eg char a='s';
//boolean - boolean = true /false eg boolean a= true;
//float - float =1.2f e.g float f= 1.2f
//double - double = 1.23 e.g double a= 1.23

	//access modifier dataypt variablename = varaizble value
	int a= 1234567890;
	static String sat="sathish kumar";
	
	public void method1(int a , int b)
	{
		
		int d= method2(a,b) ;
	//	int e=d+a+b;
		int e=method2(a,b)+a+b;
		System.out.println("method1: " +e);
		System.out.println(sat);
	}
	
	public int method2(int a, int b)
	{
		//String sat="kumar";
		int c=b-a;
		System.out.println(sat);
		//System.out.print("method 2");
		return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("sathish kumar R");
	System.out.print("B.Tech");
	System.out.print("IT");
	Provisionshop pr = new Provisionshop();
	pr.method1(3,9);
	//pr.method2();
	}

}

