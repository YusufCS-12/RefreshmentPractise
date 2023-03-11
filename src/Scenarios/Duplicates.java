package Scenarios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicates {
	
	public static void duplicateVariables (ArrayList<String> list) {
		
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j)) ) {
					set.add(list.get(i));
				}
					
			}
		}
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("2");
		list.add("2");
		list.add("5");
		list.add("3");
		list.add("3");
		list.add("1");
		list.add("1");
		list.add("5");
		list.add("9");
		list.add("9");
		
		duplicateVariables(list);
	}

}
