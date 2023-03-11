package Scenarios;

public class AsalSayý {
	
	public static boolean asalMý (int number ) {
		
		boolean sonuc = true;
		
		for (int i = 2; i < number; i++) {
			
			if(number % i == 0)
				 sonuc = false;
		}
		return sonuc;
	}
	
	public static void main(String[] args) {
		
		System.out.println(asalMý(20));
	}

}
