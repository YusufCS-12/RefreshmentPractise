package Factory;

public class Client {
	
	public static void main(String[] args) {
	
		Cokgen cokgen = CokgenFactory.getTypes(3);
		System.out.println(cokgen.getTypes());
		
		Cokgen cokgen2 = CokgenFactory.getTypes(4);
		System.out.println(cokgen2.getTypes());
	}
	
	

}
