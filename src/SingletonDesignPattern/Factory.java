package SingletonDesignPattern;

public class Factory {
	
	abstract class Hayvan{
		public abstract String sesC�kar();
		
		public void deneme() {
			
		}
	}
	
	class Kedi extends Hayvan{

		@Override
		public String sesC�kar() {
			return "Miyav";
		}
		
		
	}
	
	class Kopek extends Hayvan{

		@Override
		public String sesC�kar() {
			return "HavHav";
		}
		
	}
	
	public static void main(String[] args) {
		
		Hayvan hayvan;
		
//		if()
	}

}
