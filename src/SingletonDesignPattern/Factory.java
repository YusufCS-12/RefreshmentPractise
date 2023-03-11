package SingletonDesignPattern;

public class Factory {
	
	abstract class Hayvan{
		public abstract String sesCýkar();
		
		public void deneme() {
			
		}
	}
	
	class Kedi extends Hayvan{

		@Override
		public String sesCýkar() {
			return "Miyav";
		}
		
		
	}
	
	class Kopek extends Hayvan{

		@Override
		public String sesCýkar() {
			return "HavHav";
		}
		
	}
	
	public static void main(String[] args) {
		
		Hayvan hayvan;
		
//		if()
	}

}
