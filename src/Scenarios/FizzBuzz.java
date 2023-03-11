package Scenarios;

import java.util.ArrayList;

public class FizzBuzz {
	
	public static void fizzBuzz( int number ) {
		
		if(number > 0 ) {
			
			ArrayList<String> list = new ArrayList<String>();
			
			for (int i = 1; i < number; i++) {
				
				if( i % 3 == 0  &  i % 5 != 0 )
					list.add("Fizz");
				else if(i % 3 != 0  &  i % 5 == 0) 
					list.add("Buzz");
				else if(i % 3 == 0  &  i % 5 == 0) 
					list.add("Buzz");
				else
					list.add(Integer.toString(i));
			}
			System.out.println(list);
			
		}
	}
	
	
	public static void main(String[] args) {
		fizzBuzz(46);
	}

}
