package greenbag;

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

public class Collectionconcept {
	
	int[] a= {10,20,30};
	//int[] al=
	
	public void arrlist()
	{
		//ArrayList<Integer> al= new ArrayList<>();
		//LinkedList<Integer> al= new LinkedList<>();
		//HashSet<String> al= new HashSet<>();
		//LinkedHashSet<String> al= new LinkedHashSet<>();
		TreeSet<String> al= new TreeSet<>();
		al.add("sathish");
		al.add("kumar");
		al.add("A");
		al.add("B");
		al.add("B.tech");
		al.add("A");
		al.remove("B");
		//al.set(3, 18);
		
		Iterator it= al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

	
	public void map()
	{
		//HashMap <Integer,String> hp= new HashMap<>();
		//LinkedHashMap <Integer,String> hp= new LinkedHashMap<>();
		TreeMap <Integer,String> hp= new TreeMap<>();
		
		hp.put(1, "sathish");
		hp.put(1, "kumar");
		hp.put(4, "B.tech");
		hp.put(3, "sathish");
		hp.put(2, "R");
		
		hp.remove(3);
		
		System.out.println(hp.get(4));
		
		for(Map.Entry m:hp.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collectionconcept cp = new Collectionconcept();
		cp.map();
	}

}
