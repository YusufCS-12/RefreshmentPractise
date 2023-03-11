package Scenarios;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		System.out.println("Before x => " +x);
		System.out.println("Before y => " +y);
		
		x = x + y ;
		y = x - y ;
		x = x - y ;
		
		System.out.println("After x => " +x);
		System.out.println("After x => " +y);
	}
	

	

}
