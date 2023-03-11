package Scenarios;

public class PerfectNumber {
	
	public static void perfectNumber(int number) {
		
		if(number > 1 ) {
			
			int sum = 0;
			
			for (int i = 1; i < number; i++) {
				
				if(number % i == 0)
					sum += i;
			}
			
			if(number == sum )
				System.out.println("This number is perfect number");
			else
				System.out.println("This number is not perfect number");
		}
		
	}
	
	public static void main(String[] args) {
		
		perfectNumber(6);
		perfectNumber(18);
	}
		
		

}
