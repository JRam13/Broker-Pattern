package broker;

public class Client {

	public static void main(String[] args) {
		
		ClientProxy cp = new ClientProxy();
		
		System.out.println("Calling AddIntegers on 10 and 20...");
		cp.addIntegers(10, 20);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Calling AddIntegers on 2600 and 17900...");
		cp.addIntegers(2600, 17900);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Calling GetLength on 'Java'...");
		cp.getLength("Java");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Calling GetLength on 'pneumonoultramicroscopicsilicovolcanoconiosis'...");
		cp.getLength("pneumonoultramicroscopicsilicovolcanoconiosis");
		
	}
		
}
