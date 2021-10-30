package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyconcept 
{
	arrayconcept a= new arrayconcept();
	Properties p = new Properties();
	
	public void prop()
	{
		File F= new File("C:\\Users\\sathishkumar\\eclipse-workspace\\weekend\\src\\input\\env.properties");
		try {
			FileInputStream fs = new FileInputStream(F);
			try {
				p.load(fs);
				System.out.println(p.getProperty("username"));
				System.out.println(p.getProperty("password"));
				System.out.println(p.getProperty("dob"));
				p.setProperty("address","No:19/9 tvk strret,chenai");
				System.out.println(p.getProperty("address"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		propertyconcept p = new propertyconcept();
		p.prop();
	}

}
