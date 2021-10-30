package dummy;

public class interfaceimplementation implements Interface1,Interface2
{

	public void login()
	{
		System.out.println("This is login method");
	}
	
	@Override
	public void mul() {
		
		System.out.println("This is multiply");	
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("This is divison");
	}
	@Override
	public void arthimetic() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i = new interfaceimplementation();
		Interface2 i1 = new interfaceimplementation();
		//i.login();
		i.mul();
		i1.mul();
		i.div();
	}

	

}
