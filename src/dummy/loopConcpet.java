package dummy;

public class loopConcpet {

	final int a =10 ;
	public void forloop() throws ArithmeticException,NullPointerException
	{
	 try
	 {
		 
		// a=a+1;
		/*for(int i=2;i<10;i++)
		{
			System.out.println(i);
		}*/
		
		int i=10;
		/*while(i<9)
		{
			System.out.println(i);
			i=i+1;
		}*/
		
		
		do
		{
			//int k=i/0;
			//throw new ArithmeticException("you ar out");
			throw new NullPointerException("you ar out");
			//System.out.println("error block");
			//System.out.println(k);
			
		}while(i<9);
		
	 }
		catch(Exception ad)
		{
			System.out.println(ad);
		}
		finally
		{
			try {
				finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The is finally block");	
		}
	}
	
	public void forreverse()
	{
		for(int j=10;j>0;j--)
		{
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopConcpet l = new loopConcpet();
		l.forloop();
		l.forreverse();
	}

}
