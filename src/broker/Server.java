package broker;

public class Server implements OperationsInterface{

	public int addIntegers(int paramIntOne, int paramIntTwo) {
		
		return (paramIntOne + paramIntTwo);
		
	}
	
	public int getLength(String str) {
		
		return str.length();
		
	}
}
