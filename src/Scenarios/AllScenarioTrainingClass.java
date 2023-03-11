package Scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AllScenarioTrainingClass {
	
	public static  boolean asalKontrol(int sayý) {
		
		boolean sonuc = true;
		for (int i = 2; i < sayý; i++) {
			
			if(sayý % i == 0)
				sonuc = false;
		}
		return sonuc;
	}

	public static void maxValue(List<Integer> list) {
		
		int biggest = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > biggest )
				biggest = list.get(i);
		}
		System.out.println(list);
		System.out.println("En Büyük Sayý : " + " " +biggest);
	}
	
	public static void minValue(List<Integer> list) {
		
		int smallest = 0;
		
		for (int i = 0; i > list.size(); i++) {
			if(list.get(i) < smallest )
				smallest = list.get(i);
		}
		System.out.println("En Küçük Sayý : " + " " +smallest);
	}
	
	public static void perfectNumber(int sayý) {
		
		int sum = 0;
		
		for (int i = 1; i < sayý; i++) {
			if(sayý % i == 0)
				sum +=i;
		}
		if(sum == sayý)
			System.out.println("Bu sayý mükemmel bir sayýdýr");
		else
			System.out.println("Bu sayý mükemmel bir sayý deðildir");
	}
	
	public static void fizzBuzz( int number) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 1; i < number; i++) {
			if(i % 3 == 0 && i % 5 != 0)
				list.add("Fizz");
			else if(i % 3 != 0 && i % 5 == 0)
				list.add("Buzz");
			else if(i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");
			else
				list.add(Integer.toString(i));
		}
		
		System.out.println(list);
		
	}
	
	public static void bracketCheck(String str) {
		
		if(!str.isEmpty() && str !=null) {
			
			while(str.contains("()") || str.contains("[]") || str.contains("{}")){
				str = str.replace("()", "");
				str = str.replace("[]", "");
				str = str.replace("{}", "");
			}
			if(str.isEmpty())
				System.out.println("Correct");
			else
				System.out.println(" Not Correct");
		}
	}
	
	public static void main(String[] args) {
		
		int x= 10;
		int y= 5;
		
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println(asalKontrol(17));
		System.out.println(asalKontrol(14));
		
		perfectNumber(6);
		perfectNumber(9);
		
		fizzBuzz(19);
		
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(50));
		}
		
		maxValue(list);
		
		bracketCheck("{[()]}");
		bracketCheck("{[()]");
	}
}
