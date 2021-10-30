package dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class collectionconcept {
	
	// String[] AL ={"sathish","kumar","BTECH","sathish"}
	public void listconcept()
	{
		//ArrayList<String> AL = new ArrayList<>();
		LinkedList<String> AL = new LinkedList<>();
		AL.add("Sathish");
		AL.add("kumar");
		AL.add("R");
		//AL.add(1);
		AL.add("B.tech");
		AL.add("Sathish");
		AL.remove(3);
		AL.set(2, "BTECH");
		
		Iterator b = AL.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}

	public void setconcept()
	{
		//ArrayList<String> AL = new ArrayList<>();
		//HashSet<String> AL = new HashSet<>();
		//LinkedHashSet<String> AL = new LinkedHashSet<>();
		TreeSet<String> AL = new TreeSet<>();
		AL.add("Sathish");
		AL.add("kumar");
		AL.add("apple");
		//AL.add(" ");
	//	AL.add(1);
		AL.add("b.tech");
		AL.add("Sathish");
	//	AL.remove(4);
		//AL.set(2, "BTECH");
		
		Iterator b = AL.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}
	
	public void mapconcept()
	{
		HashMap<Integer,String> HM = new HashMap<>();
		HM.put(1, "sathish");
		HM.put(3, "kumar");
		HM.put(2, "sathish");
		HM.put(5, "R");
		HM.put(6, "Remove");
		HM.put(1, "B.tech");
		
		HM.remove(6);
		
	
		
	/*	int size =HM.size();
		
		for(int i=1;i<=size;i++)
		{
			System.out.println(HM.get(i));
		}*/
		
		for(Map.Entry m:HM.entrySet())
		{
			System.out.println(m.getKey() + " "+ m.getValue() );
		}
		
		
	}
	
	public void mapstringconcept()
	{
		//HashMap<String,String> HM = new HashMap<>();
		//LinkedHashMap<String,String> HM = new LinkedHashMap<>();
		TreeMap<String,String> HM = new TreeMap<>();
		HM.put("nname", "sathish");
		HM.put("lastn", "kumar");
		HM.put("dupli", "sathish");
		HM.put("intial", "R");
		HM.put("rem", "Remove");
		HM.put("edu", "B.tech");
		HM.put("nname", "duplicatekey");
		
		HM.remove("rem");
		
	
		
	/*	int size =HM.size();
		
		for(int i=1;i<=size;i++)
		{
			System.out.println(HM.get(i));
		}*/
		
		for(Map.Entry m:HM.entrySet())
		{
			System.out.println(m.getKey() + " "+ m.getValue() );
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectionconcept c= new collectionconcept();
		c.mapstringconcept();
	}

}
