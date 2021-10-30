package greenbag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property {

	public void readdata() throws IOException
	{
		File f= new File("C:\\Users\\sathishkumar\\eclipse-workspace"
				+ "\\weekend\\propfolder\\env.properties");
		FileInputStream fs = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fs);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("dob"));
		System.out.println(Integer.parseInt(p.getProperty("dob"))+
				Integer.parseInt(p.getProperty("age")));
		p.setProperty("address", "no:19/9 ma sreet , chennai");
		System.out.println(p.getProperty("address"));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		property ps= new property();
		ps.readdata();
	}

}
