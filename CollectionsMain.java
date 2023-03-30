package basics;

import java.util.*;

public class CollectionsMain {

	public static void main(String[] args) {
		
		//ArrayList Example Question - 1st Question
		ArrayList<String> al = new ArrayList<String>();
		al.add("Steve");
		al.add("Justin");
		al.add("Ajeet");
		al.add("John");
		al.add("Arnold");
		al.add("Chaitanya");
		
		System.out.println("The Initial ArrayLIst is: "+al);
		List<String> al2 = al.subList(1, 4);
		
		System.out.println("The Sublist from Initial Arraylist is: "+al2);
		
		
		//TreeMap Example Question - 2nd Question
		TreeMap<String, String> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put("Key1", "Jack");
		tm.put("Key2", "Rick");
		tm.put("Key3", "Kate");
		tm.put("Key4", "Tom");
		tm.put("Key5", "Steve");
		
		
		for(Map.Entry<String, String> entry : tm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
