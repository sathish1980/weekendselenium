package dummy;

public class arrayconcept {

	int[] a= {10,20,30,10,20};
	
	public void sum()
	{
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		int arsize=a.length;
		for(int i=arsize-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayconcept a= new arrayconcept();
		a.sum();
	}

}
