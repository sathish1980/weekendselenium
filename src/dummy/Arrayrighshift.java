package dummy;

public class Arrayrighshift 
{

	int[] dummy_array = {0,0,0,1,2,3};
	int[] new_array ;
	int s ;
	public void array_Shift()
	{
		try
		{
			int arr_size=dummy_array.length;
			for(int i=0;i<arr_size;i++)
			{
				new_array= new int [arr_size];
				if (dummy_array[i]==0)
				{
					for(int j=arr_size-1;j>0;j--)
					{
						s=new_array[j];
					}
				}
				else
				{
					for(int j=0;j<arr_size;j++)
					{
						s=new_array[j];
					}
				}
			}
			System.out.println(new_array.toString());
			
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayrighshift A= new Arrayrighshift();
		A.array_Shift();
	}

}
