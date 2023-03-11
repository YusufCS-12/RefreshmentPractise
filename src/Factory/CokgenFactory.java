package Factory;

public class CokgenFactory {
	
	public static Cokgen getTypes(int kenar) {
	
		Cokgen cokgen = null;
		
		switch (kenar) {
		case 3:
			cokgen = new Ucgen();
			break;
		case 4:
			cokgen = new Kare();

		default:
			break;
		}
		return cokgen;
			}

}
