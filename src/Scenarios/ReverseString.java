package Scenarios;

public class ReverseString {
	
	public static void reverseString(String str) {
		
		String reverseStr = "";		
		for (int i = str.length()-1; i >= 0; i--) {
			
			reverseStr = reverseStr + str.charAt(i);
			
		}
		System.out.println(reverseStr);
	}
	
	public static void main(String[] args) {
		
		reverseString("Fenerbah�e Cumhuriyeti");
		
		StringBuffer str2 = new StringBuffer();
		str2.append("Fenerbah�em Benim Biricik Sevgilim");
		
		System.out.println(str2.reverse());
	}

	
}
