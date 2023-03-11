package Scenarios;

public class BracketCheck {
	
	public static void bracketCheck(String str) {
		
		if(!str.isEmpty() && str != null)  {
			
			while(str.contains("()") || str.contains("[]") || str.contains("{}") ) {
				
				str = str.replace("()", "");
				str = str.replace("{}", "");
				str = str.replace("[]", "");
			}	
				if(str.isEmpty())
					System.out.println("CORRECT");
				else
					System.out.println("NOT CORRECT");
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		bracketCheck("{[()]}");
		bracketCheck("{[()}");
	}

}
